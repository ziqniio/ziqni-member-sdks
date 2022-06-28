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
import ApiClient from "../ApiClient";
import MemberOptinRequest from '../model/MemberOptinRequest';
import MemberRequest from '../model/MemberRequest';
import MemberResponse from '../model/MemberResponse';
import MemberSessionRequest from '../model/MemberSessionRequest';
import MemberSessionResponse from '../model/MemberSessionResponse';
/**
* Members service.
* @module api/MembersApi
* @version 0.0.1
*/

export default class MembersApi {
  /**
  * Constructs a new MembersApi. 
  * @alias module:api/MembersApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the getMember operation.
   * @callback module:api/MembersApi~getMemberCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get member information by member reference id
   * Returns member information for the provided member reference id
   * @param {module:model/MemberRequest} memberRequest 
   * @param {module:api/MembersApi~getMemberCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberResponse}
   */


  getMember(memberRequest, callback) {
    let postBody = memberRequest; // verify the required parameter 'memberRequest' is set

    if (memberRequest === undefined || memberRequest === null) {
      throw new Error("Missing the required parameter 'memberRequest' when calling getMember");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = MemberResponse;
    return this.apiClient.callApi('/member-info', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMemberOptinInfo operation.
   * @callback module:api/MembersApi~getMemberOptinInfoCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get member optin information
   * Returns a list of member optin information
   * @param {module:model/MemberOptinRequest} memberOptinRequest 
   * @param {module:api/MembersApi~getMemberOptinInfoCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberResponse}
   */


  getMemberOptinInfo(memberOptinRequest, callback) {
    let postBody = memberOptinRequest; // verify the required parameter 'memberOptinRequest' is set

    if (memberOptinRequest === undefined || memberOptinRequest === null) {
      throw new Error("Missing the required parameter 'memberOptinRequest' when calling getMemberOptinInfo");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = MemberResponse;
    return this.apiClient.callApi('/member-manage-optin', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }
  /**
   * Callback function to receive the result of the getMemberSession operation.
   * @callback module:api/MembersApi~getMemberSessionCallback
   * @param {String} error Error message, if any.
   * @param {module:model/MemberSessionResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get member session by member reference id
   * Returns member's active session information.
   * @param {module:model/MemberSessionRequest} memberSessionRequest 
   * @param {module:api/MembersApi~getMemberSessionCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/MemberSessionResponse}
   */


  getMemberSession(memberSessionRequest, callback) {
    let postBody = memberSessionRequest; // verify the required parameter 'memberSessionRequest' is set

    if (memberSessionRequest === undefined || memberSessionRequest === null) {
      throw new Error("Missing the required parameter 'memberSessionRequest' when calling getMemberSession");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = ['OAuth2'];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = MemberSessionResponse;
    return this.apiClient.callApi('/member-session', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}