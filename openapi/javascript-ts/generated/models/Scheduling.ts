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
    ScheduleType,
    ScheduleTypeFromJSON,
    ScheduleTypeFromJSONTyped,
    ScheduleTypeToJSON,
} from './';

/**
 * 
 * @export
 * @interface Scheduling
 */
export interface Scheduling {
    /**
     * 
     * @type {ScheduleType}
     * @memberof Scheduling
     */
    scheduleType: ScheduleType;
    /**
     * A value indicating how many times it will be issued
     * @type {number}
     * @memberof Scheduling
     */
    scheduleOccurrencesLimit: number;
    /**
     * 
     * @type {Array<number>}
     * @memberof Scheduling
     */
    every: Array<number>;
    /**
     * The start date and time of a schedule. ISO8601 timestamp
     * @type {Date}
     * @memberof Scheduling
     */
    startDate: Date;
    /**
     * The end date and time of a schedule. ISO8601 timestamp
     * @type {Date}
     * @memberof Scheduling
     */
    endDate?: Date;
    /**
     * Additional constraints
     * @type {Array<string>}
     * @memberof Scheduling
     */
    constraints: Array<string>;
}

export function SchedulingFromJSON(json: any): Scheduling {
    return SchedulingFromJSONTyped(json, false);
}

export function SchedulingFromJSONTyped(json: any, ignoreDiscriminator: boolean): Scheduling {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'scheduleType': ScheduleTypeFromJSON(json['scheduleType']),
        'scheduleOccurrencesLimit': json['scheduleOccurrencesLimit'],
        'every': json['every'],
        'startDate': (new Date(json['startDate'])),
        'endDate': !exists(json, 'endDate') ? undefined : (new Date(json['endDate'])),
        'constraints': json['constraints'],
    };
}

export function SchedulingToJSON(value?: Scheduling | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'scheduleType': ScheduleTypeToJSON(value.scheduleType),
        'scheduleOccurrencesLimit': value.scheduleOccurrencesLimit,
        'every': value.every,
        'startDate': (value.startDate.toISOString()),
        'endDate': value.endDate === undefined ? undefined : (value.endDate.toISOString()),
        'constraints': value.constraints,
    };
}

