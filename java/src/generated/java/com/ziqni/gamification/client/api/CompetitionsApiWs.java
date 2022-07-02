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
import javax.ws.rs.core.GenericType;
import com.ziqni.gamification.client.streaming.StreamingClient;
import com.ziqni.gamification.client.ApiException;
    import com.ziqni.gamification.client.model.CompetitionRequest;
    import com.ziqni.gamification.client.model.CompetitionResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
    import java.util.*;
//asyncNative:true
import java.util.concurrent.CompletableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class CompetitionsApiWs {

    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public CompetitionsApiWs(StreamingClient streamingClient, Duration readTimeout) {
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = readTimeout;
    }

/**
*/
    /**
    * Get competitions by member reference id
    * Returns a list of competitions for the provided member ref id and applied filters.
        * @param competitionRequest  (required)
        * @return CompletableFuture&lt;CompetitionResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<CompetitionResponse> getCompetitions(CompetitionRequest competitionRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",competitionRequest);

        CompletableFuture<CompetitionResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getCompetitions", request);
        return result;
    }

    private ApiException getApiException(String operationId, HttpResponse<String> response) {
        String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
        return new ApiException(response.statusCode(), message, response.headers(), response.body());
    }

    private String formatExceptionMessage(String operationId, int statusCode, String body) {
        if (body == null || body.isEmpty()) {
            body = "[no body]";
        }
        return operationId + " call failed with: " + statusCode + " - " + body;
    }
}
