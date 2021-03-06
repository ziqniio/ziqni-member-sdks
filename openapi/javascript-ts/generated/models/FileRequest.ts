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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface FileRequest
 */
export interface FileRequest {
    /**
     * 
     * @type {string}
     * @memberof FileRequest
     */
    memberRefId: string;
}

export function FileRequestFromJSON(json: any): FileRequest {
    return FileRequestFromJSONTyped(json, false);
}

export function FileRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): FileRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'memberRefId': json['memberRefId'],
    };
}

export function FileRequestToJSON(value?: FileRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'memberRefId': value.memberRefId,
    };
}

