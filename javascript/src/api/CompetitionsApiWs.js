/**
 * ZIQNI Member API
 * The ZIQNI Member-API is the primary resource used to build services and widgets for your members [customers, players, patients, etc]. The service is Stomp websokets with SOCK.js even though the system is decribed using OpenApi schema for convenience.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClientStomp', 'model/CompetitionRequest', 'model/CompetitionResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClientStomp'), require('../model/CompetitionRequest'), require('../model/CompetitionResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.ZiqniMemberApi) {
      root.ZiqniMemberApi = {};
    }
    root.ZiqniMemberApi.CompetitionsApi = factory(root.ZiqniMemberApi.ApiClientStomp, root.ZiqniMemberApi.CompetitionRequest, root.ZiqniMemberApi.CompetitionResponse);
  }
}(this, function(ApiClientStomp, CompetitionRequest, CompetitionResponse) {
  'use strict';

  /**
   * Competitions service.
   * @module api/CompetitionsApi
   * @version 1.0.0
   */

  /**
   * Constructs a new CompetitionsApi. 
   * @alias module:api/CompetitionsApi
   * @class
   * @param {module:ApiClientStomp} [apiClientStomp] Optional API client implementation to use,
   * default to {@link module:ApiClientStomp#instance} if unspecified.
   */
  var exports = function(apiClientStomp) {
    this.apiClientStomp = apiClientStomp || ApiClientStomp.instance;


    /**
     * Callback function to receive the result of the getCompetitions operation.
     * @callback module:api/CompetitionsApi~getCompetitionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CompetitionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get competitions by member reference id
     * Returns a list of competitions for the provided member ref id and applied filters.
     * @param {module:model/CompetitionRequest} competitionRequest 
     * @param {module:api/CompetitionsApi~getCompetitionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CompetitionResponse}
     */
    this.getCompetitions = function(competitionRequest, callback) {
      var postBody = competitionRequest;
      // verify the required parameter 'competitionRequest' is set
      if (competitionRequest === undefined || competitionRequest === null) {
        throw new Error("Missing the required parameter 'competitionRequest' when calling getCompetitions");
      }

      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };
      var destination = '/gapi/getCompetitions';

      var returnType = CompetitionResponse;
      return this.apiClientStomp.sendRpc(destination, callback, pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody, returnType);
    }
  };

  return exports;
}));
