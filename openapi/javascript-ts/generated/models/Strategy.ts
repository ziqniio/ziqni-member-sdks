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
    RankingStrategy,
    RankingStrategyFromJSON,
    RankingStrategyFromJSONTyped,
    RankingStrategyToJSON,
    ScoringStrategy,
    ScoringStrategyFromJSON,
    ScoringStrategyFromJSONTyped,
    ScoringStrategyToJSON,
    StrategyType,
    StrategyTypeFromJSON,
    StrategyTypeFromJSONTyped,
    StrategyTypeToJSON,
} from './';

/**
 * 
 * @export
 * @interface Strategy
 */
export interface Strategy {
    /**
     * 
     * @type {StrategyType}
     * @memberof Strategy
     */
    strategyType?: StrategyType;
    /**
     * 
     * @type {RankingStrategy}
     * @memberof Strategy
     */
    rankingStrategy?: RankingStrategy;
    /**
     * 
     * @type {ScoringStrategy}
     * @memberof Strategy
     */
    scoringStrategy?: ScoringStrategy;
}

export function StrategyFromJSON(json: any): Strategy {
    return StrategyFromJSONTyped(json, false);
}

export function StrategyFromJSONTyped(json: any, ignoreDiscriminator: boolean): Strategy {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'strategyType': !exists(json, 'strategyType') ? undefined : StrategyTypeFromJSON(json['strategyType']),
        'rankingStrategy': !exists(json, 'rankingStrategy') ? undefined : RankingStrategyFromJSON(json['rankingStrategy']),
        'scoringStrategy': !exists(json, 'scoringStrategy') ? undefined : ScoringStrategyFromJSON(json['scoringStrategy']),
    };
}

export function StrategyToJSON(value?: Strategy | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'strategyType': StrategyTypeToJSON(value.strategyType),
        'rankingStrategy': RankingStrategyToJSON(value.rankingStrategy),
        'scoringStrategy': ScoringStrategyToJSON(value.scoringStrategy),
    };
}

