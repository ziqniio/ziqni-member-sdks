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

/**
 * The type of message of the member
 * @export
 * @enum {string}
 */
export enum MessageType {
    Achievement = 'Achievement',
    Ticket = 'Ticket',
    Reward = 'Reward',
    Text = 'Text',
    Notification = 'Notification',
    InboxItem = 'InboxItem',
    NotificationInboxItem = 'NotificationInboxItem'
}

export function MessageTypeFromJSON(json: any): MessageType {
    return MessageTypeFromJSONTyped(json, false);
}

export function MessageTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageType {
    return json as MessageType;
}

export function MessageTypeToJSON(value?: MessageType | null): any {
    return value as any;
}

