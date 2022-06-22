/*
 * Ziqni Gamification Cloud API
 * This is the gamification cloud for Ziqni
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
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
import com.ziqni.gamification.client.model.CompetitionRequest;
import com.ziqni.gamification.client.model.CompetitionResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class CompetitionsApiWs extends CompetitionsApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public CompetitionsApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * Get competitions by member reference id
        * Returns a list of competitions for the provided member ref id and applied filters.
            * @param competitionRequest  (required)
            * @return CompletableFuture&lt;CompetitionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CompetitionResponse> getCompetitions(CompetitionRequest competitionRequest) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("competitionRequest",competitionRequest);

        CompletableFuture<CompetitionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitions", request);
        return result;
        }
        }
