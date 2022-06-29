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
    import com.ziqni.gamification.client.model.MemberOptinRequest;
    import com.ziqni.gamification.client.model.MemberRequest;
    import com.ziqni.gamification.client.model.MemberResponse;
    import com.ziqni.gamification.client.model.MemberSessionRequest;
    import com.ziqni.gamification.client.model.MemberSessionResponse;

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
    public class MembersApiWs {

    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public MembersApiWs(StreamingClient streamingClient, Duration readTimeout) {
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = readTimeout;
    }

    /**
    * Get member information by member reference id
    * Returns member information for the provided member reference id
        * @param memberRequest  (required)
        * @return CompletableFuture&lt;MemberResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<MemberResponse> getMember(MemberRequest memberRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",memberRequest);

        CompletableFuture<MemberResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getMember", request);
        return result;
    }
    /**
    * Get member optin information
    * Returns a list of member optin information
        * @param memberOptinRequest  (required)
        * @return CompletableFuture&lt;MemberResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<MemberResponse> getMemberOptinInfo(MemberOptinRequest memberOptinRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",memberOptinRequest);

        CompletableFuture<MemberResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getMemberOptinInfo", request);
        return result;
    }
    /**
    * Get member session by member reference id
    * Returns member&#39;s active session information.
        * @param memberSessionRequest  (required)
        * @return CompletableFuture&lt;MemberSessionResponse&gt;
    * @throws ApiException if fails to make API call
    */
    public CompletableFuture<MemberSessionResponse> getMemberSession(MemberSessionRequest memberSessionRequest) {
        var request = new HashMap<String, Object>();
    
        

    
        

    request.put("body",memberSessionRequest);

        CompletableFuture<MemberSessionResponse> result = this.streamingClient.sendWithApiCallback("/gapi/getMemberSession", request);
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
