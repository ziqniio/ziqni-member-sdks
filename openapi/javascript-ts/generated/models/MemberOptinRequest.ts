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
 * @interface MemberOptinRequest
 */
export interface MemberOptinRequest {
    /**
     * 
     * @type {string}
     * @memberof MemberOptinRequest
     */
    entityId?: string;
    /**
     * 
     * @type {string}
     * @memberof MemberOptinRequest
     */
    entityType?: string;
    /**
     * 
     * @type {string}
     * @memberof MemberOptinRequest
     */
    action?: string;
}

export function MemberOptinRequestFromJSON(json: any): MemberOptinRequest {
    return MemberOptinRequestFromJSONTyped(json, false);
}

export function MemberOptinRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): MemberOptinRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'entityId': !exists(json, 'entityId') ? undefined : json['entityId'],
        'entityType': !exists(json, 'entityType') ? undefined : json['entityType'],
        'action': !exists(json, 'action') ? undefined : json['action'],
    };
}

export function MemberOptinRequestToJSON(value?: MemberOptinRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'entityId': value.entityId,
        'entityType': value.entityType,
        'action': value.action,
    };
}

