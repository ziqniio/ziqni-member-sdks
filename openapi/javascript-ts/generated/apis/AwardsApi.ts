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
    AwardRequest,
    AwardRequestFromJSON,
    AwardRequestToJSON,
    AwardResponse,
    AwardResponseFromJSON,
    AwardResponseToJSON,
    ClaimAwardRequest,
    ClaimAwardRequestFromJSON,
    ClaimAwardRequestToJSON,
} from '../models';

export interface ClaimAwardsRequest {
    claimAwardRequest: ClaimAwardRequest;
}

export interface GetAwardsRequest {
    awardRequest: AwardRequest;
}

/**
 * 
 */
export class AwardsApi extends runtime.BaseAPI {

    /**
     * This operation enables a member to claim awards.
     * Claim awards.
     */
    async claimAwardsRaw(requestParameters: ClaimAwardsRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<AwardResponse>> {
        if (requestParameters.claimAwardRequest === null || requestParameters.claimAwardRequest === undefined) {
            throw new runtime.RequiredError('claimAwardRequest','Required parameter requestParameters.claimAwardRequest was null or undefined when calling claimAwards.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth2", []);
        }

        const response = await this.request({
            path: `/awards-claim`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ClaimAwardRequestToJSON(requestParameters.claimAwardRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => AwardResponseFromJSON(jsonValue));
    }

    /**
     * This operation enables a member to claim awards.
     * Claim awards.
     */
    async claimAwards(requestParameters: ClaimAwardsRequest, initOverrides?: RequestInit): Promise<AwardResponse> {
        const response = await this.claimAwardsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * This operation supports retrieval of awards for one or many entities.
     * Get awards.
     */
    async getAwardsRaw(requestParameters: GetAwardsRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<AwardResponse>> {
        if (requestParameters.awardRequest === null || requestParameters.awardRequest === undefined) {
            throw new runtime.RequiredError('awardRequest','Required parameter requestParameters.awardRequest was null or undefined when calling getAwards.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth2", ["ViewAwards"]);
        }

        const response = await this.request({
            path: `/awards`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: AwardRequestToJSON(requestParameters.awardRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => AwardResponseFromJSON(jsonValue));
    }

    /**
     * This operation supports retrieval of awards for one or many entities.
     * Get awards.
     */
    async getAwards(requestParameters: GetAwardsRequest, initOverrides?: RequestInit): Promise<AwardResponse> {
        const response = await this.getAwardsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
