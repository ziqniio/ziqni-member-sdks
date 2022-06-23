/*
 * Ziqni Gamification Cloud API
 * This is the gamification cloud for Ziqni
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ziqni.gamification.client.api;

import com.ziqni.gamification.client.StreamingClient;
import com.ziqni.gamification.client.ApiClient;
import com.ziqni.gamification.client.ApiException;
import com.ziqni.gamification.client.ApiResponse;
import com.ziqni.gamification.client.Pair;
    import com.ziqni.gamification.client.model.MessageRequest;
    import com.ziqni.gamification.client.model.MessageResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
    import java.util.*;

    import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class MessagesApi { //extends MessagesApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public MessagesApi(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
    this.apiClient = apiClient;
    this.memberVarObjectMapper = apiClient.getObjectMapper();
    this.streamingClient = streamingClient;
    this.memberVarReadTimeout = null;
    }

        // x-ws-exclude --> 
            /**
            * Get messages by member reference id
            * Returns a list of messages for the provided member ref id and applied filters.
                * @param messageRequest  (required)
                * @return CompletableFuture&lt;MessageResponse&gt;
            * @throws ApiException if fails to make API call
            */
            public CompletableFuture<MessageResponse> getMessages(MessageRequest messageRequest) {
                var request = new HashMap<String, Object>();
            
                        

            
                        
            request.put("messageRequest",messageRequest);

                CompletableFuture<MessageResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getMessages", request);
                return result;
            }
        }
