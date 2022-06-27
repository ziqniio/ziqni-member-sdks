/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gamification.client.configuration;

import com.ziqni.gamification.client.ApiClient;
import com.ziqni.gamification.client.util.CoreClientObjectMapper;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.http.HttpClient;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Properties;

public abstract class ApiRestClientFactory {

    public static ApiClient apiClient = null;

    /**
     * Remove certificate validation
     * @return SSLContext to use
     */
    private static SSLContext trustAllCerts(){

        final Properties props = System.getProperties(); props.setProperty("jdk.internal.httpclient.disableHostnameVerification", Boolean.TRUE.toString());
        SSLContext sslContext;

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    @Override
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };

        try {
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new SecureRandom());
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new RuntimeException(e);
        }

        return sslContext;
    }

    private static void load() {

        var builder= HttpClient.newBuilder().sslContext(trustAllCerts());

        ApiRestClientFactory.apiClient = com.ziqni.gamification.client.Configuration.getDefaultApiClient()
                .setHttpClientBuilder(builder)
                .setBasePath(ApiClientConfig.getGamificationClientServerBasePath())
                .setHost(ApiClientConfig.getGamificationClientServerHost())
                .setPort(ApiClientConfig.getGamificationClientServerPort())
                .setScheme(ApiClientConfig.getGamificationClientServerScheme())
                .setObjectMapper(new CoreClientObjectMapper().serializingObjectMapper())
                .setRequestInterceptor(b ->
                        b.header("Authorization", "Bearer " + ApiClientConfig.getAccessTokenString())
                );
    }

    public static ApiClient getApiClient(){
        if(ApiRestClientFactory.apiClient == null){
            ApiRestClientFactory.load();
            assert ApiRestClientFactory.apiClient != null;
        }

        return ApiRestClientFactory.apiClient;
    }
}
