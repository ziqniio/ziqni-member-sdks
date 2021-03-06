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
    Competition,
    CompetitionFromJSON,
    CompetitionFromJSONTyped,
    CompetitionToJSON,
    ResponseMeta,
    ResponseMetaFromJSON,
    ResponseMetaFromJSONTyped,
    ResponseMetaToJSON,
} from './';

/**
 * 
 * @export
 * @interface CompetitionResponse
 */
export interface CompetitionResponse {
    /**
     * 
     * @type {ResponseMeta}
     * @memberof CompetitionResponse
     */
    meta?: ResponseMeta;
    /**
     * 
     * @type {Array<Competition>}
     * @memberof CompetitionResponse
     */
    data?: Array<Competition>;
    /**
     * 
     * @type {Array<Error>}
     * @memberof CompetitionResponse
     */
    errors?: Array<Error>;
}

export function CompetitionResponseFromJSON(json: any): CompetitionResponse {
    return CompetitionResponseFromJSONTyped(json, false);
}

export function CompetitionResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CompetitionResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'meta': !exists(json, 'meta') ? undefined : ResponseMetaFromJSON(json['meta']),
        'data': !exists(json, 'data') ? undefined : ((json['data'] as Array<any>).map(CompetitionFromJSON)),
        'errors': !exists(json, 'errors') ? undefined : json['errors'],
    };
}

export function CompetitionResponseToJSON(value?: CompetitionResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'meta': ResponseMetaToJSON(value.meta),
        'data': value.data === undefined ? undefined : ((value.data as Array<any>).map(CompetitionToJSON)),
        'errors': value.errors,
    };
}

