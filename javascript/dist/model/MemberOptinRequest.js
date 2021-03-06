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
 * The MemberOptinRequest model module.
 * @module model/MemberOptinRequest
 * @version 0.0.1
 */

class MemberOptinRequest {
  /**
   * Constructs a new <code>MemberOptinRequest</code>.
   * @alias module:model/MemberOptinRequest
   */
  constructor() {
    MemberOptinRequest.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj) {}
  /**
   * Constructs a <code>MemberOptinRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MemberOptinRequest} obj Optional instance to populate.
   * @return {module:model/MemberOptinRequest} The populated <code>MemberOptinRequest</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MemberOptinRequest();

      if (data.hasOwnProperty('entityId')) {
        obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
      }

      if (data.hasOwnProperty('entityType')) {
        obj['entityType'] = ApiClient.convertToType(data['entityType'], 'String');
      }

      if (data.hasOwnProperty('action')) {
        obj['action'] = ApiClient.convertToType(data['action'], 'String');
      }
    }

    return obj;
  }

}
/**
 * @member {String} entityId
 */


MemberOptinRequest.prototype['entityId'] = undefined;
/**
 * @member {String} entityType
 */

MemberOptinRequest.prototype['entityType'] = undefined;
/**
 * @member {String} action
 */

MemberOptinRequest.prototype['action'] = undefined;
export default MemberOptinRequest;