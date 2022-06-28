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
import ProxyRequest from '../model/ProxyRequest';
import ProxyResponse from '../model/ProxyResponse';

/**
* Proxy service.
* @module api/ProxyApi
* @version 0.0.1
*/
export default class ProxyApi {

    /**
    * Constructs a new ProxyApi. 
    * @alias module:api/ProxyApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the proxy operation.
     * @callback module:api/ProxyApi~proxyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ProxyResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Proxy
     * Perform proxy operations.
     * @param {module:model/ProxyRequest} proxyRequest 
     * @param {module:api/ProxyApi~proxyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ProxyResponse}
     */
    proxy(proxyRequest, callback) {
      let postBody = proxyRequest;
      // verify the required parameter 'proxyRequest' is set
      if (proxyRequest === undefined || proxyRequest === null) {
        throw new Error("Missing the required parameter 'proxyRequest' when calling proxy");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ProxyResponse;
      return this.apiClient.callApi(
        '/proxy', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
