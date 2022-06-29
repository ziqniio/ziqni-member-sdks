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

import com.ziqni.admin.client.model.MemberTokenRequest;
import com.ziqni.gamification.client.ApiClientFactoryWsWs;
import com.ziqni.gamification.client.ApiException;
import com.ziqni.gamification.client.configuration.ApiClientConfig;
import com.ziqni.gamification.client.data.LoadAchievementsData;
import com.ziqni.gamification.client.util.ApiClientFactoryWsUtil;
import com.ziqni.gamification.client.util.TestMemberTokenLoader;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static com.ziqni.gamification.client.util.TestMemberTokenLoader.TEST_MEMBER_TOKEN;
import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for AchievementsApi
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AchievementsApiTest implements tests.utils.CompleteableFutureTestWrapper{

    private AchievementsApiWs api;
    private LoadAchievementsData loadAchievementsData;

    @BeforeAll
    public void start() throws Exception {
        TestMemberTokenLoader testMemberTokenLoader = new TestMemberTokenLoader();
        MemberTokenRequest tokenRequest = new MemberTokenRequest()
                .apiKey(testMemberTokenLoader.getApiKey())
                .expires(60)
                .isReferenceId(true)
                .member(TEST_MEMBER_TOKEN)
                .resource("ziqni-gapi");

        ApiClientConfig.setIdentityAuthorization(testMemberTokenLoader.setMemberTokenRequest(tokenRequest));

        this.api = ApiClientFactoryWsWs.getAchievementsApi();
        this.loadAchievementsData = new LoadAchievementsData();
        ApiClientFactoryWsUtil.initApiClientFactoryWs();
    }

    @AfterAll
    public  void stop(){
        ApiClientFactoryWsWs.getStreamingClient().stop();
    }

    /**
     * Get achievements by member reference id
     *
     * Returns a list of achievements for the provided member ref id and applied filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAchievementsTest() throws Exception {

        var response = api.getAchievements(loadAchievementsData.getRequest()).join();

        assertNotNull(response);
        assertNotNull(response.getData());
        assertNotNull(response.getErrors());
        assertTrue(response.getErrors().isEmpty(), "Should have no errors");
        assertFalse(response.getData().isEmpty(), "Should have results");


    }

}
