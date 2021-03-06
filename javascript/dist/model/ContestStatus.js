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
 *
 */
import ApiClient from '../ApiClient';
/**
* Enum class ContestStatus.
* @enum {}
* @readonly
*/

export default class ContestStatus {
  /**
   * value: "Deleted"
   * @const
   */
  "Deleted" = "Deleted";
  /**
   * value: "NotStarted"
   * @const
   */

  "NotStarted" = "NotStarted";
  /**
   * value: "Active"
   * @const
   */

  "Active" = "Active";
  /**
   * value: "Finished"
   * @const
   */

  "Finished" = "Finished";
  /**
   * value: "Finalised"
   * @const
   */

  "Finalised" = "Finalised";
  /**
   * value: "Cancelled"
   * @const
   */

  "Cancelled" = "Cancelled";
  /**
  * Returns a <code>ContestStatus</code> enum value from a Javascript object name.
  * @param {Object} data The plain JavaScript object containing the name of the enum value.
  * @return {module:model/ContestStatus} The enum <code>ContestStatus</code> value.
  */

  static constructFromObject(object) {
    return object;
  }

}