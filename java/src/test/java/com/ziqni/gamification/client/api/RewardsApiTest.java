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

import com.ziqni.gamification.client.ApiClientFactoryWs;
import com.ziqni.gamification.client.ApiException;
import com.ziqni.gamification.client.data.LoadRewardsData;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for RewardsApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RewardsApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private final RewardsApiWs api;
    private final LoadRewardsData loadRewardsData;

    public RewardsApiTest(){
        this.api = ApiClientFactoryWs.getRewardsApi();
        this.loadRewardsData = new LoadRewardsData();
    }
    
    /**
     * Get rewards
     *
     * This operation support retrieval of rewards for one or many entitites.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRewardsTest() throws ApiException {
        String competitionId = "M2aFXYEBl_GIktlkShBQ";
        var response = api.getRewards(loadRewardsData.getRequest(competitionId)).join();

        assertNotNull(response);
        assertNotNull(response.getData());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertFalse(response.getData().isEmpty(), "Should have results");
    }
    
}
