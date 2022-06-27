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
 * 
 * @export
 * @interface RewardReduced
 */
export interface RewardReduced {
    /**
     * If used in the context of contest this will associate with the rank of the leaderboard
     * @type {string}
     * @memberof RewardReduced
     */
    rewardRank?: string;
    /**
     * The name of a reward
     * @type {string}
     * @memberof RewardReduced
     */
    name?: string;
    /**
     * Numerical value of the reward that will be issued based on the reward type
     * @type {number}
     * @memberof RewardReduced
     */
    rewardValue?: number;
    /**
     * Reward Type key
     * @type {string}
     * @memberof RewardReduced
     */
    rewardType?: string;
    /**
     * A unique id of the Reward Type
     * @type {string}
     * @memberof RewardReduced
     */
    rewardTypeId?: string;
}

export function RewardReducedFromJSON(json: any): RewardReduced {
    return RewardReducedFromJSONTyped(json, false);
}

export function RewardReducedFromJSONTyped(json: any, ignoreDiscriminator: boolean): RewardReduced {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'rewardRank': !exists(json, 'rewardRank') ? undefined : json['rewardRank'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'rewardValue': !exists(json, 'rewardValue') ? undefined : json['rewardValue'],
        'rewardType': !exists(json, 'rewardType') ? undefined : json['rewardType'],
        'rewardTypeId': !exists(json, 'rewardTypeId') ? undefined : json['rewardTypeId'],
    };
}

export function RewardReducedToJSON(value?: RewardReduced | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'rewardRank': value.rewardRank,
        'name': value.name,
        'rewardValue': value.rewardValue,
        'rewardType': value.rewardType,
        'rewardTypeId': value.rewardTypeId,
    };
}

