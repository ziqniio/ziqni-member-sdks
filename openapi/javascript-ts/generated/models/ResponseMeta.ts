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
 * Response metadata   
 * @export
 * @interface ResponseMeta
 */
export interface ResponseMeta {
    /**
     * 
     * @type {number}
     * @memberof ResponseMeta
     */
    totalRecordsFound: number;
    /**
     * 
     * @type {number}
     * @memberof ResponseMeta
     */
    skip: number;
    /**
     * 
     * @type {number}
     * @memberof ResponseMeta
     */
    limit: number;
    /**
     * 
     * @type {string}
     * @memberof ResponseMeta
     */
    objectType?: string;
}

export function ResponseMetaFromJSON(json: any): ResponseMeta {
    return ResponseMetaFromJSONTyped(json, false);
}

export function ResponseMetaFromJSONTyped(json: any, ignoreDiscriminator: boolean): ResponseMeta {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'totalRecordsFound': json['totalRecordsFound'],
        'skip': json['skip'],
        'limit': json['limit'],
        'objectType': !exists(json, 'objectType') ? undefined : json['objectType'],
    };
}

export function ResponseMetaToJSON(value?: ResponseMeta | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'totalRecordsFound': value.totalRecordsFound,
        'skip': value.skip,
        'limit': value.limit,
        'objectType': value.objectType,
    };
}

