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
    Translation,
    TranslationFromJSON,
    TranslationFromJSONTyped,
    TranslationToJSON,
} from './';

/**
 * 
 * @export
 * @interface TranslationResponse
 */
export interface TranslationResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof TranslationResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<Translation>}
     * @memberof TranslationResponse
     */
    data?: Array<Translation>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof TranslationResponse
     */
    errors?: Array<Error>;
}

export function TranslationResponseFromJSON(json: any): TranslationResponse {
    return TranslationResponseFromJSONTyped(json, false);
}

export function TranslationResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): TranslationResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : ((json['data'] as Array<any>).map(TranslationFromJSON)),
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function TranslationResponseToJSON(value?: TranslationResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'meta': ResponseMetaToJSON(value.meta),
        'data': value.data === undefined ? undefined : ((value.data as Array<any>).map(TranslationToJSON)),
        'errors': value.errors,
    };
}
