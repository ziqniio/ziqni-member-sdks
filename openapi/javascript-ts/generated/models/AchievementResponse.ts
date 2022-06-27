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
import {
    Achievement,
    AchievementFromJSON,
    AchievementFromJSONTyped,
    AchievementToJSON,
    ResponseMeta,
    ResponseMetaFromJSON,
    ResponseMetaFromJSONTyped,
    ResponseMetaToJSON,
} from './';

/**
 * 
 * @export
 * @interface AchievementResponse
 */
export interface AchievementResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof AchievementResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<Achievement>}
     * @memberof AchievementResponse
     */
    data?: Array<Achievement>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof AchievementResponse
     */
    errors?: Array<Error>;
}

export function AchievementResponseFromJSON(json: any): AchievementResponse {
    return AchievementResponseFromJSONTyped(json, false);
}

export function AchievementResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): AchievementResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : ((json['data'] as Array<any>).map(AchievementFromJSON)),
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function AchievementResponseToJSON(value?: AchievementResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'meta': ResponseMetaToJSON(value.meta),
        'data': value.data === undefined ? undefined : ((value.data as Array<any>).map(AchievementToJSON)),
        'errors': value.errors,
    };
}
