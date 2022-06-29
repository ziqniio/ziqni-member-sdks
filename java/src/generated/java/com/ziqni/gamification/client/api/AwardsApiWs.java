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
import com.ziqni.gamification.client.StreamingClient;
import com.ziqni.gamification.client.ApiException;
    import com.ziqni.gamification.client.model.AwardRequest;
    import com.ziqni.gamification.client.model.AwardResponse;
    import com.ziqni.gamification.client.model.ClaimAwardRequest;

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
    public class AwardsApiWs {

    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public AwardsApiWs(StreamingClient streamingClient, Duration readTimeout) {
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = readTimeout;
    }

    /**
    * Claim awards.
    * This operation enables a member to claim awards.
        * @param claimAwardRequest  (required)
        * @return CompletableFuture&lt;AwardResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<AwardResponse> claimAwards(ClaimAwardRequest claimAwardRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",claimAwardRequest);

        CompletableFuture<AwardResponse> result = this.streamingClient.sendWithApiCallback("/gapi/claimAwards", request);
        return result;
    }
    /**
    * Get awards.
    * This operation supports retrieval of awards for one or many entities.
        * @param awardRequest  (required)
        * @return CompletableFuture&lt;AwardResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<AwardResponse> getAwards(AwardRequest awardRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",awardRequest);

        CompletableFuture<AwardResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getAwards", request);
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