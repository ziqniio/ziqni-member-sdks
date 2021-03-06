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
 * @interface FileResponse
 */
export interface FileResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof FileResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<any>}
     * @memberof FileResponse
     */
    data?: Array<any>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof FileResponse
     */
    errors?: Array<Error>;
}

export function FileResponseFromJSON(json: any): FileResponse {
    return FileResponseFromJSONTyped(json, false);
}

export function FileResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): FileResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : json['data'],
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function FileResponseToJSON(value?: FileResponse | null): any {
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

