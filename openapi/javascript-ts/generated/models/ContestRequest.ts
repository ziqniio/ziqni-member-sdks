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
    ContestFilter,
    ContestFilterFromJSON,
    ContestFilterFromJSONTyped,
    ContestFilterToJSON,
} from './';

/**
 * This is a request to get Contest
 * @export
 * @interface ContestRequest
 */
export interface ContestRequest {
    /**
     * 
     * @type {ContestFilter}
     * @memberof ContestRequest
     */
    contestFilter?: ContestFilter;
}

export function ContestRequestFromJSON(json: any): ContestRequest {
    return ContestRequestFromJSONTyped(json, false);
}

export function ContestRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContestRequest {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'contestFilter': !exists(json, 'contestFilter') ? undefined : ContestFilterFromJSON(json['contestFilter']),
    };
}

export function ContestRequestToJSON(value?: ContestRequest | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'contestFilter': ContestFilterToJSON(value.contestFilter),
    };
}

