/* tslint:disable */
/* eslint-disable */
/**
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


import * as runtime from '../runtime';
import {
    AchievementRequest,
    AchievementRequestFromJSON,
    AchievementRequestToJSON,
    AchievementResponse,
    AchievementResponseFromJSON,
    AchievementResponseToJSON,
} from '../models';

export interface GetAchievementsRequest {
    achievementRequest: AchievementRequest;
}

/**
 * 
 */
export class AchievementsApi extends runtime.BaseAPI {

    /**
     * Returns a list of achievements for the provided member ref id and applied filters.
     * Get achievements by member reference id
     */
    async getAchievementsRaw(requestParameters: GetAchievementsRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<AchievementResponse>> {
        if (requestParameters.achievementRequest === null || requestParameters.achievementRequest === undefined) {
            throw new runtime.RequiredError('achievementRequest','Required parameter requestParameters.achievementRequest was null or undefined when calling getAchievements.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth2", ["ViewAchievements"]);
        }

        const response = await this.request({
            path: `/achievements`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: AchievementRequestToJSON(requestParameters.achievementRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => AchievementResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of achievements for the provided member ref id and applied filters.
     * Get achievements by member reference id
     */
    async getAchievements(requestParameters: GetAchievementsRequest, initOverrides?: RequestInit): Promise<AchievementResponse> {
        const response = await this.getAchievementsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
