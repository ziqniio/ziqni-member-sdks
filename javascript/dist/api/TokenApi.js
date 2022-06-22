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
import ApiClient from "../ApiClient";
import TokenRequest from '../model/TokenRequest';
import TokenResponse from '../model/TokenResponse';
/**
* Token service.
* @module api/TokenApi
* @version 0.0.1
*/

export default class TokenApi {
  /**
  * Constructs a new TokenApi. 
  * @alias module:api/TokenApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  constructor(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;
  }
  /**
   * Callback function to receive the result of the getToken operation.
   * @callback module:api/TokenApi~getTokenCallback
   * @param {String} error Error message, if any.
   * @param {module:model/TokenResponse} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * Get Jwt Token
   * @param {module:model/TokenRequest} tokenRequest 
   * @param {module:api/TokenApi~getTokenCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/TokenResponse}
   */


  getToken(tokenRequest, callback) {
    let postBody = tokenRequest; // verify the required parameter 'tokenRequest' is set

    if (tokenRequest === undefined || tokenRequest === null) {
      throw new Error("Missing the required parameter 'tokenRequest' when calling getToken");
    }

    let pathParams = {};
    let queryParams = {};
    let headerParams = {};
    let formParams = {};
    let authNames = [];
    let contentTypes = ['application/json'];
    let accepts = ['application/json'];
    let returnType = TokenResponse;
    return this.apiClient.callApi('/gc/get-token', 'POST', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
  }

}