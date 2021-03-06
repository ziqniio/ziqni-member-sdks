package com.ziqni.member.sdk.util;

import com.ziqni.member.sdk.ApiClientFactoryWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiClientFactoryUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApiClientFactoryUtil.class);

    public static void initApiClientFactory() throws Exception {
        ApiClientFactoryWs.initialise();

        while (ApiClientFactoryWs.getStreamingClient() == null) {
            Thread.sleep(500);
            logger.info("Waiting for the streaming client to initialize");
        }

        final var started = ApiClientFactoryWs.getStreamingClient().start();
        while (!ApiClientFactoryWs.getStreamingClient().isConnected()) {
            Thread.sleep(500);
            logger.info("Waiting for the streaming client start");
            if(ApiClientFactoryWs.getStreamingClient().isFailure())
                throw new RuntimeException("Streaming client dead");
        }
    }

}
