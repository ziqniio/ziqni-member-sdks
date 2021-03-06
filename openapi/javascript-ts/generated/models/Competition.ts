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
    CompetitionAllOf,
    CompetitionAllOfFromJSON,
    CompetitionAllOfFromJSONTyped,
    CompetitionAllOfToJSON,
    CompetitionStatus,
    CompetitionStatusFromJSON,
    CompetitionStatusFromJSONTyped,
    CompetitionStatusToJSON,
    CompetitionType,
    CompetitionTypeFromJSON,
    CompetitionTypeFromJSONTyped,
    CompetitionTypeToJSON,
    ModelDefault,
    ModelDefaultFromJSON,
    ModelDefaultFromJSONTyped,
    ModelDefaultToJSON,
    OptionalModelFields,
    OptionalModelFieldsFromJSON,
    OptionalModelFieldsFromJSONTyped,
    OptionalModelFieldsToJSON,
    ProductReduced,
    ProductReducedFromJSON,
    ProductReducedFromJSONTyped,
    ProductReducedToJSON,
} from './';

/**
 * 
 * @export
 * @interface Competition
 */
export interface Competition {
    /**
     * 
     * @type {CompetitionType}
     * @memberof Competition
     */
    competitionType?: CompetitionType;
    /**
     * Number of rounds to be played in a competition
     * @type {number}
     * @memberof Competition
     */
    numberOfRounds?: number;
    /**
     * Number of group stages
     * @type {number}
     * @memberof Competition
     */
    numberOfGroupStages?: number;
    /**
     * Maximum number of partiipants allowed in a competition
     * @type {number}
     * @memberof Competition
     */
    maxNumberOfEntrants?: number;
    /**
     * Maximum number of partiipants allowed in a competition
     * @type {number}
     * @memberof Competition
     */
    minNumberOfEntrants?: number;
    /**
     * 
     * @type {string}
     * @memberof Competition
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof Competition
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof Competition
     */
    termsAndConditions?: string;
    /**
     * 
     * @type {string}
     * @memberof Competition
     */
    entrantMemberType?: string;
    /**
     * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
     * @type {Date}
     * @memberof Competition
     */
    scheduledStartDate?: Date;
    /**
     * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
     * @type {Date}
     * @memberof Competition
     */
    scheduledEndDate?: Date;
    /**
     * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
     * @type {Date}
     * @memberof Competition
     */
    readonly actualStartDate?: Date;
    /**
     * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
     * @type {Date}
     * @memberof Competition
     */
    readonly actualEndDate?: Date;
    /**
     * 
     * @type {CompetitionStatus}
     * @memberof Competition
     */
    status?: CompetitionStatus;
    /**
     * The code of the competition
     * @type {number}
     * @memberof Competition
     */
    readonly statusCode?: number;
    /**
     * Additional constraints
     * @type {Set<string>}
     * @memberof Competition
     */
    constraints?: Set<string>;
    /**
     * 
     * @type {Array<ProductReduced>}
     * @memberof Competition
     */
    products?: Array<ProductReduced>;
    /**
     * Ziqni id of the model
     * @type {string}
     * @memberof Competition
     */
    id: string;
    /**
     * This is the space name which is linked to the account
     * @type {string}
     * @memberof Competition
     */
    spaceName?: string;
    /**
     * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
     * @type {Date}
     * @memberof Competition
     */
    created?: Date;
    /**
     * 
     * @type {{ [key: string]: object; }}
     * @memberof Competition
     */
    customFields?: { [key: string]: object; };
    /**
     * A list of id's used to tag models
     * @type {Array<string>}
     * @memberof Competition
     */
    tags?: Array<string>;
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof Competition
     */
    metadata?: { [key: string]: string; };
}

export function CompetitionFromJSON(json: any): Competition {
    return CompetitionFromJSONTyped(json, false);
}

export function CompetitionFromJSONTyped(json: any, ignoreDiscriminator: boolean): Competition {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'competitionType': !exists(json, 'competitionType') ? undefined : CompetitionTypeFromJSON(json['competitionType']),
        'numberOfRounds': !exists(json, 'numberOfRounds') ? undefined : json['numberOfRounds'],
        'numberOfGroupStages': !exists(json, 'numberOfGroupStages') ? undefined : json['numberOfGroupStages'],
        'maxNumberOfEntrants': !exists(json, 'maxNumberOfEntrants') ? undefined : json['maxNumberOfEntrants'],
        'minNumberOfEntrants': !exists(json, 'minNumberOfEntrants') ? undefined : json['minNumberOfEntrants'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'termsAndConditions': !exists(json, 'termsAndConditions') ? undefined : json['termsAndConditions'],
        'entrantMemberType': !exists(json, 'entrantMemberType') ? undefined : json['entrantMemberType'],
        'scheduledStartDate': !exists(json, 'scheduledStartDate') ? undefined : (new Date(json['scheduledStartDate'])),
        'scheduledEndDate': !exists(json, 'scheduledEndDate') ? undefined : (new Date(json['scheduledEndDate'])),
        'actualStartDate': !exists(json, 'actualStartDate') ? undefined : (new Date(json['actualStartDate'])),
        'actualEndDate': !exists(json, 'actualEndDate') ? undefined : (new Date(json['actualEndDate'])),
        'status': !exists(json, 'status') ? undefined : CompetitionStatusFromJSON(json['status']),
        'statusCode': !exists(json, 'statusCode') ? undefined : json['statusCode'],
        'constraints': !exists(json, 'constraints') ? undefined : json['constraints'],
        'products': !exists(json, 'products') ? undefined : ((json['products'] as Array<any>).map(ProductReducedFromJSON)),
        'id': json['id'],
        'spaceName': !exists(json, 'spaceName') ? undefined : json['spaceName'],
        'created': !exists(json, 'created') ? undefined : (new Date(json['created'])),
        'customFields': !exists(json, 'customFields') ? undefined : json['customFields'],
        'tags': !exists(json, 'tags') ? undefined : json['tags'],
        'metadata': !exists(json, 'metadata') ? undefined : json['metadata'],
    };
}

export function CompetitionToJSON(value?: Competition | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'competitionType': CompetitionTypeToJSON(value.competitionType),
        'numberOfRounds': value.numberOfRounds,
        'numberOfGroupStages': value.numberOfGroupStages,
        'maxNumberOfEntrants': value.maxNumberOfEntrants,
        'minNumberOfEntrants': value.minNumberOfEntrants,
        'name': value.name,
        'description': value.description,
        'termsAndConditions': value.termsAndConditions,
        'entrantMemberType': value.entrantMemberType,
        'scheduledStartDate': value.scheduledStartDate === undefined ? undefined : (value.scheduledStartDate.toISOString()),
        'scheduledEndDate': value.scheduledEndDate === undefined ? undefined : (value.scheduledEndDate.toISOString()),
        'status': CompetitionStatusToJSON(value.status),
        'constraints': value.constraints,
        'products': value.products === undefined ? undefined : ((value.products as Array<any>).map(ProductReducedToJSON)),
        'id': value.id,
        'spaceName': value.spaceName,
        'created': value.created === undefined ? undefined : (value.created.toISOString()),
        'customFields': value.customFields,
        'tags': value.tags,
        'metadata': value.metadata,
    };
}

