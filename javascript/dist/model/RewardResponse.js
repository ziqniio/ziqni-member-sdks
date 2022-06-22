/**
 * Ziqni Gamification Cloud API
 * This is the gamification cloud for Ziqni
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */
import ApiClient from '../ApiClient';
import Error from './Error';
import ResponseMeta from './ResponseMeta';
import Reward from './Reward';
/**
 * The RewardResponse model module.
 * @module model/RewardResponse
 * @version 0.0.1
 */

class RewardResponse {
  /**
   * Constructs a new <code>RewardResponse</code>.
   * @alias module:model/RewardResponse
   */
  constructor() {
    RewardResponse.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>RewardResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RewardResponse} obj Optional instance to populate.
   * @return {module:model/RewardResponse} The populated <code>RewardResponse</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RewardResponse();

      if (data.hasOwnProperty('meta')) {
        obj['meta'] = ResponseMeta.constructFromObject(data['meta']);
      }

      if (data.hasOwnProperty('data')) {
        obj['data'] = ApiClient.convertToType(data['data'], [Reward]);
      }

      if (data.hasOwnProperty('errors')) {
        obj['errors'] = ApiClient.convertToType(data['errors'], [Error]);
      }
    }

    return obj;
  }

}
/**
 * @member {module:model/ResponseMeta} meta
 */


RewardResponse.prototype['meta'] = undefined;
/**
 * @member {Array.<module:model/Reward>} data
 */

RewardResponse.prototype['data'] = undefined;
/**
 * @member {Array.<module:model/Error>} errors
 */

RewardResponse.prototype['errors'] = undefined;
export default RewardResponse;