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
    ContestStatus,
    ContestStatusFromJSON,
    ContestStatusFromJSONTyped,
    ContestStatusToJSON,
    RoundType,
    RoundTypeFromJSON,
    RoundTypeFromJSONTyped,
    RoundTypeToJSON,
    Strategy,
    StrategyFromJSON,
    StrategyFromJSONTyped,
    StrategyToJSON,
} from './';

/**
 * 
 * @export
 * @interface ContestAllOf
 */
export interface ContestAllOf {
    /**
     * 
     * @type {string}
     * @memberof ContestAllOf
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof ContestAllOf
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof ContestAllOf
     */
    termsAndConditions?: string;
    /**
     * A unique identifier of a Competition
     * @type {string}
     * @memberof ContestAllOf
     */
    competitionId?: string;
    /**
     * To what round does the contest belong
     * @type {number}
     * @memberof ContestAllOf
     */
    round?: number;
    /**
     * 
     * @type {RoundType}
     * @memberof ContestAllOf
     */
    roundType?: RoundType;
    /**
     * Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2
     * @type {number}
     * @memberof ContestAllOf
     */
    groupStage?: number;
    /**
     * The name of the group stages
     * @type {string}
     * @memberof ContestAllOf
     */
    groupStageLabel?: string;
    /**
     * Maximum number of entrants for the contest
     * @type {number}
     * @memberof ContestAllOf
     */
    maxNumberOfEntrants?: number;
    /**
     * Minimum number of entrants for the contest
     * @type {number}
     * @memberof ContestAllOf
     */
    minNumberOfEntrants?: number;
    /**
     * ISO8601 timestamp for when a Contest should start. All records are stored in UTC time zone
     * @type {Date}
     * @memberof ContestAllOf
     */
    scheduledStartDate?: Date;
    /**
     * ISO8601 timestamp for when a Contest should end. All records are stored in UTC time zone
     * @type {Date}
     * @memberof ContestAllOf
     */
    scheduledEndDate?: Date;
    /**
     * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
     * @type {Date}
     * @memberof ContestAllOf
     */
    readonly actualStartDate?: Date;
    /**
     * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
     * @type {Date}
     * @memberof ContestAllOf
     */
    readonly actualEndDate?: Date;
    /**
     * 
     * @type {Strategy}
     * @memberof ContestAllOf
     */
    strategies?: Strategy;
    /**
     * 
     * @type {ContestStatus}
     * @memberof ContestAllOf
     */
    status?: ContestStatus;
    /**
     * The code of the contest
     * @type {number}
     * @memberof ContestAllOf
     */
    readonly statusCode?: number;
    /**
     * Additional constraints
     * @type {Array<string>}
     * @memberof ContestAllOf
     */
    constraints?: Array<string>;
}

export function ContestAllOfFromJSON(json: any): ContestAllOf {
    return ContestAllOfFromJSONTyped(json, false);
}

export function ContestAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): ContestAllOf {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'termsAndConditions': !exists(json, 'termsAndConditions') ? undefined : json['termsAndConditions'],
        'competitionId': !exists(json, 'competitionId') ? undefined : json['competitionId'],
        'round': !exists(json, 'round') ? undefined : json['round'],
        'roundType': !exists(json, 'roundType') ? undefined : RoundTypeFromJSON(json['roundType']),
        'groupStage': !exists(json, 'groupStage') ? undefined : json['groupStage'],
        'groupStageLabel': !exists(json, 'groupStageLabel') ? undefined : json['groupStageLabel'],
        'maxNumberOfEntrants': !exists(json, 'maxNumberOfEntrants') ? undefined : json['maxNumberOfEntrants'],
        'minNumberOfEntrants': !exists(json, 'minNumberOfEntrants') ? undefined : json['minNumberOfEntrants'],
        'scheduledStartDate': !exists(json, 'scheduledStartDate') ? undefined : (new Date(json['scheduledStartDate'])),
        'scheduledEndDate': !exists(json, 'scheduledEndDate') ? undefined : (new Date(json['scheduledEndDate'])),
        'actualStartDate': !exists(json, 'actualStartDate') ? undefined : (new Date(json['actualStartDate'])),
        'actualEndDate': !exists(json, 'actualEndDate') ? undefined : (new Date(json['actualEndDate'])),
        'strategies': !exists(json, 'strategies') ? undefined : StrategyFromJSON(json['strategies']),
        'status': !exists(json, 'status') ? undefined : ContestStatusFromJSON(json['status']),
        'statusCode': !exists(json, 'statusCode') ? undefined : json['statusCode'],
        'constraints': !exists(json, 'constraints') ? undefined : json['constraints'],
    };
}

export function ContestAllOfToJSON(value?: ContestAllOf | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'description': value.description,
        'termsAndConditions': value.termsAndConditions,
        'competitionId': value.competitionId,
        'round': value.round,
        'roundType': RoundTypeToJSON(value.roundType),
        'groupStage': value.groupStage,
        'groupStageLabel': value.groupStageLabel,
        'maxNumberOfEntrants': value.maxNumberOfEntrants,
        'minNumberOfEntrants': value.minNumberOfEntrants,
        'scheduledStartDate': value.scheduledStartDate === undefined ? undefined : (value.scheduledStartDate.toISOString()),
        'scheduledEndDate': value.scheduledEndDate === undefined ? undefined : (value.scheduledEndDate.toISOString()),
        'strategies': StrategyToJSON(value.strategies),
        'status': ContestStatusToJSON(value.status),
        'constraints': value.constraints,
    };
}
