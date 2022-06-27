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
    MessageRequest,
    MessageRequestFromJSON,
    MessageRequestToJSON,
    MessageResponse,
    MessageResponseFromJSON,
    MessageResponseToJSON,
} from '../models';

export interface GetMessagesRequest {
    messageRequest: MessageRequest;
}

/**
 * 
 */
export class MessagesApi extends runtime.BaseAPI {

    /**
     * Returns a list of messages for the provided member ref id and applied filters.
     * Get messages by member reference id
     */
    async getMessagesRaw(requestParameters: GetMessagesRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<MessageResponse>> {
        if (requestParameters.messageRequest === null || requestParameters.messageRequest === undefined) {
            throw new runtime.RequiredError('messageRequest','Required parameter requestParameters.messageRequest was null or undefined when calling getMessages.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("OAuth2", ["ViewMessages"]);
        }

        const response = await this.request({
            path: `/messages`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: MessageRequestToJSON(requestParameters.messageRequest),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MessageResponseFromJSON(jsonValue));
    }

    /**
     * Returns a list of messages for the provided member ref id and applied filters.
     * Get messages by member reference id
     */
    async getMessages(requestParameters: GetMessagesRequest, initOverrides?: RequestInit): Promise<MessageResponse> {
        const response = await this.getMessagesRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
