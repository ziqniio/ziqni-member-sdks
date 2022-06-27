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
    ResponseMeta,
    ResponseMetaFromJSON,
    ResponseMetaFromJSONTyped,
    ResponseMetaToJSON,
} from './';

/**
 * 
 * @export
 * @interface MemberSessionResponse
 */
export interface MemberSessionResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof MemberSessionResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<object>}
     * @memberof MemberSessionResponse
     */
    data?: Array<object>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof MemberSessionResponse
     */
    errors?: Array<Error>;
}

export function MemberSessionResponseFromJSON(json: any): MemberSessionResponse {
    return MemberSessionResponseFromJSONTyped(json, false);
}

export function MemberSessionResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): MemberSessionResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : json['data'],
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function MemberSessionResponseToJSON(value?: MemberSessionResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'meta': ResponseMetaToJSON(value.meta),
        'data': value.data,
        'errors': value.errors,
    };
}

