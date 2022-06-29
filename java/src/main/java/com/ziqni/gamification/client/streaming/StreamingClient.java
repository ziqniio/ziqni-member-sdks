/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gamification.client.streaming;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class StreamingClient {

    private static final int DEFAULT_RECONNECT_ATTEMPTS = 5;
    private static final int DEFAULT_RECONNECT_DELAY = 1000;

    private final ExecutorService websocketSendExecutor;

    public final LinkedBlockingDeque<Runnable> webSocketClientTasks;
    private final Map<String, Consumer<StreamingClient>> onStartHandlers = new HashMap<>();
    private final Map<String, Consumer<StreamingClient>> onStopHandlers = new HashMap<>();
    private final AtomicInteger connectionState = new AtomicInteger(WsClient.NotConnected);

    private final WsClient wsClient;

    public StreamingClient(String URL) throws ExecutionException, InterruptedException {

        this.webSocketClientTasks = new LinkedBlockingDeque<>();
        this.websocketSendExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, webSocketClientTasks);
        this.wsClient = new WsClient(URL, connectionState::set);
    }

    public void asyncWebSocketClient(Consumer<WsClient> consumer) {
        this.websocketSendExecutor.submit(() -> consumer.accept(this.wsClient) );
    }

    public <TOUT, TIN> CompletableFuture<TOUT> sendWithApiCallback(String destination, TIN payload){
        final var completableFuture = new CompletableFuture<TOUT>();

        this.websocketSendExecutor.submit(() -> {
            try {
                ApiCallbackEventHandler.submit(
                        destination,
                        payload,
                        completableFuture,
                        (stompHeaders, tPayload) -> this.websocketSendExecutor.submit(this.wsClient.prepareMessageToSend(stompHeaders,tPayload))
                );
            } catch (Throwable t){
                completableFuture.completeExceptionally(t);
            }
        });

        return completableFuture;
    }

    public void stop() {
        this.websocketSendExecutor.submit(this.wsClient::shutdown);
        this.websocketSendExecutor.shutdown();
    }

    public CompletableFuture<Boolean> start() {
        final var result = new CompletableFuture<Boolean>();
        this.websocketSendExecutor.submit( () -> {
            this.wsClient.startClient(result).thenApply(isConnected -> {
                if(isConnected()) {
                    this.wsClient.subscribe( ApiCallbackEventHandler.create() );
                    this.wsClient.subscribe( MessageEventHandler.create() );
                    executeOnStartHandlers();
                }
                return isConnected;
            });
        });
        return result;
    }

    public CompletableFuture<Boolean> reconnect(boolean force) {
        return reconnect(DEFAULT_RECONNECT_ATTEMPTS, DEFAULT_RECONNECT_DELAY, force);
    }

    public CompletableFuture<Boolean> reconnect(int maxRetryCount, long reconnectDelay, boolean force) {
        final var result = new CompletableFuture<Boolean>();
        this.websocketSendExecutor.submit( () ->
                this.wsClient.reconnect(result, 0, maxRetryCount, reconnectDelay, force)
        );
        return result;
    }

    public <T> void subscribe(EventHandler<T> eventHandler){
        this.websocketSendExecutor.submit( () ->
                this.wsClient.subscribe(eventHandler)
        );
    }

    public void addOnStopHandler(String key, Consumer<StreamingClient> consumer){
        this.onStopHandlers.compute( key, (k,v) -> consumer);
    }

    public void addOnStartHandler(String key, Consumer<StreamingClient> consumer){
        this.onStartHandlers.compute( key, (k,v) -> consumer);
    }

    public void executeOnStopHandlers() {
        this.onStopHandlers.forEach((k, v) ->
                v.accept(this)
        );
    }

    public void executeOnStartHandlers() {
        this.onStartHandlers.forEach((k, v) ->
                v.accept(this)
        );
    }


    /** Helper methods **/

    public boolean isConnected() {
        return connectionState.get() == WsClient.Connected &&
                !websocketSendExecutor.isShutdown() &&
                !websocketSendExecutor.isTerminated() ;
    }

    public boolean isNotConnected() {
        return connectionState.get() == WsClient.NotConnected;
    }

    public boolean isConnecting() {
        return connectionState.get() == WsClient.Connecting;
    }

    public boolean isDisconnecting() {
        return connectionState.get() == WsClient.Disconnecting;
    }

    public boolean isFailure() {
        return connectionState.get() == WsClient.SevereFailure;
    }
}
