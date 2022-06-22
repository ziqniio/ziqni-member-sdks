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
/**
 * The TokenRequest model module.
 * @module model/TokenRequest
 * @version 0.0.1
 */

class TokenRequest {
  /**
   * Constructs a new <code>TokenRequest</code>.
   * @alias module:model/TokenRequest
   * @param apiKey {String} The API key to use to generate this token.
   * @param member {String} The identifier used to find the member information. if this value is set to \"__PUBLIC__\" and isReferenceId is set to \"FALSE\" then a genral use, non-member specific token will be issued
   */
  constructor(apiKey, member) {
    TokenRequest.initialize(this, apiKey, member);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, apiKey, member) {
    obj['apiKey'] = apiKey;
    obj['member'] = member;
  }
  /**
   * Constructs a <code>TokenRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TokenRequest} obj Optional instance to populate.
   * @return {module:model/TokenRequest} The populated <code>TokenRequest</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new TokenRequest();

      if (data.hasOwnProperty('apiKey')) {
        obj['apiKey'] = ApiClient.convertToType(data['apiKey'], 'String');
      }

      if (data.hasOwnProperty('isReferenceId')) {
        obj['isReferenceId'] = ApiClient.convertToType(data['isReferenceId'], 'Boolean');
      }

      if (data.hasOwnProperty('origins')) {
        obj['origins'] = ApiClient.convertToType(data['origins'], ['String']);
      }

      if (data.hasOwnProperty('member')) {
        obj['member'] = ApiClient.convertToType(data['member'], 'String');
      }

      if (data.hasOwnProperty('expires')) {
        obj['expires'] = ApiClient.convertToType(data['expires'], 'Number');
      }
    }

    return obj;
  }

}
/**
 * The API key to use to generate this token.
 * @member {String} apiKey
 */


TokenRequest.prototype['apiKey'] = undefined;
/**
 * Default is FALSE, if set to TRUE then the meberId will be assumed to be client provided reference id, if set to false then the memberId will be assumed to be a ZIQNI generated identifier.
 * @member {Boolean} isReferenceId
 */

TokenRequest.prototype['isReferenceId'] = undefined;
/**
 * Allowed origins for the generated token. Leave empty to permit all origins, Alternative provide up to 3 allowed origin URIs like https://my-space.api.ziqni.io 
 * @member {Array.<String>} origins
 */

TokenRequest.prototype['origins'] = undefined;
/**
 * The identifier used to find the member information. if this value is set to \"__PUBLIC__\" and isReferenceId is set to \"FALSE\" then a genral use, non-member specific token will be issued
 * @member {String} member
 */

TokenRequest.prototype['member'] = undefined;
/**
 * The number of minutes this token will be valid for. If left blank the token will only be valid for 30 minutes
 * @member {Number} expires
 */

TokenRequest.prototype['expires'] = undefined;
export default TokenRequest;