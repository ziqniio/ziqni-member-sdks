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
import ContestRequest from '../model/ContestRequest';
import ContestResponse from '../model/ContestResponse';

/**
* Contests service.
* @module api/ContestsApi
* @version 0.0.1
*/
export default class ContestsApi {

    /**
    * Constructs a new ContestsApi. 
    * @alias module:api/ContestsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getContests operation.
     * @callback module:api/ContestsApi~getContestsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ContestResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get contests by member reference Id
     * Returns a list of contests for the provided member ref id and applied filters.
     * @param {module:model/ContestRequest} contestRequest 
     * @param {module:api/ContestsApi~getContestsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ContestResponse}
     */
    getContests(contestRequest, callback) {
      let postBody = contestRequest;
      // verify the required parameter 'contestRequest' is set
      if (contestRequest === undefined || contestRequest === null) {
        throw new Error("Missing the required parameter 'contestRequest' when calling getContests");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['OAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ContestResponse;
      return this.apiClient.callApi(
        '/gc/contests', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
