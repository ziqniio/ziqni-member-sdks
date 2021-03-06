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
    RuleArgument,
    RuleArgumentFromJSON,
    RuleArgumentFromJSONTyped,
    RuleArgumentToJSON,
} from './';

/**
 * 
 * @export
 * @interface RuleRoutine
 */
export interface RuleRoutine {
    /**
     * A routine to execute if the conditional expressions in the matching group evaluted to true
     * @type {string}
     * @memberof RuleRoutine
     */
    routine?: string;
    /**
     * The arguments of the routine.
     * @type {Array<RuleArgument>}
     * @memberof RuleRoutine
     */
    arguments?: Array<RuleArgument>;
    /**
     * 
     * @type {number}
     * @memberof RuleRoutine
     */
    lineNumber?: number;
}

export function RuleRoutineFromJSON(json: any): RuleRoutine {
    return RuleRoutineFromJSONTyped(json, false);
}

export function RuleRoutineFromJSONTyped(json: any, ignoreDiscriminator: boolean): RuleRoutine {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'routine': !exists(json, 'routine') ? undefined : json['routine'],
        'arguments': !exists(json, 'arguments') ? undefined : ((json['arguments'] as Array<any>).map(RuleArgumentFromJSON)),
        'lineNumber': !exists(json, 'lineNumber') ? undefined : json['lineNumber'],
    };
}

export function RuleRoutineToJSON(value?: RuleRoutine | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'routine': value.routine,
        'arguments': value.arguments === undefined ? undefined : ((value.arguments as Array<any>).map(RuleArgumentToJSON)),
        'lineNumber': value.lineNumber,
    };
}

