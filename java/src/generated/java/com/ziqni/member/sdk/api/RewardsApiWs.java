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

package com.ziqni.member.sdk.api;
import javax.ws.rs.core.GenericType;
import com.ziqni.member.sdk.streaming.StreamingClient;
import com.ziqni.member.sdk.streaming.EventHandler;
import com.ziqni.member.sdk.streaming.handlers.CallbackConsumer;
import com.ziqni.member.sdk.ApiException;
import org.springframework.messaging.simp.stomp.StompHeaders;
    import com.ziqni.member.sdk.model.RewardRequest;
    import com.ziqni.member.sdk.model.RewardResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ziqni.member.sdk.model.*;
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
import java.util.function.BiConsumer;
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class RewardsApiWs {

    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public RewardsApiWs(StreamingClient streamingClient, Duration readTimeout) {
    this.streamingClient = streamingClient;
    this.memberVarReadTimeout = readTimeout;
    }


            /**
            * Get rewards
            * This operation support retrieval of rewards for one or many entitites.
                * @param rewardRequest  (required)
                * @return CompletableFuture&lt;RewardResponse&gt;
            * @throws ApiException if fails to make API call
            */
            public CompletableFuture<RewardResponse> getRewards(RewardRequest rewardRequest) {
                var request = new HashMap<String, Object>();
            
                        

            
                        

            request.put("body",rewardRequest);

            CompletableFuture<RewardResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getRewards", request);
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
