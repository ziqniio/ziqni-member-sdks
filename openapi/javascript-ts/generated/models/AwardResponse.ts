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
    Award,
    AwardFromJSON,
    AwardFromJSONTyped,
    AwardToJSON,
    ResponseMeta,
    ResponseMetaFromJSON,
    ResponseMetaFromJSONTyped,
    ResponseMetaToJSON,
} from './';

/**
 * 
 * @export
 * @interface AwardResponse
 */
export interface AwardResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof AwardResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<Award>}
     * @memberof AwardResponse
     */
    data?: Array<Award>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof AwardResponse
     */
    errors?: Array<Error>;
}

export function AwardResponseFromJSON(json: any): AwardResponse {
    return AwardResponseFromJSONTyped(json, false);
}

export function AwardResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): AwardResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : ((json['data'] as Array<any>).map(AwardFromJSON)),
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function AwardResponseToJSON(value?: AwardResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'meta': ResponseMetaToJSON(value.meta),
        'data': value.data === undefined ? undefined : ((value.data as Array<any>).map(AwardToJSON)),
        'errors': value.errors,
    };
}

