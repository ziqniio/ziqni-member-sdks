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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.@ZiqniTechGamificationApiClient);
  }
}(this, function(expect, @ZiqniTechGamificationApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new @ZiqniTechGamificationApiClient.QuerySortBy();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('QuerySortBy', function() {
    it('should create an instance of QuerySortBy', function() {
      // uncomment below and update the code to test QuerySortBy
      //var instance = new @ZiqniTechGamificationApiClient.QuerySortBy();
      //expect(instance).to.be.a(@ZiqniTechGamificationApiClient.QuerySortBy);
    });

    it('should have the property queryField (base name: "queryField")', function() {
      // uncomment below and update the code to test the property queryField
      //var instance = new @ZiqniTechGamificationApiClient.QuerySortBy();
      //expect(instance).to.be();
    });

    it('should have the property order (base name: "order")', function() {
      // uncomment below and update the code to test the property order
      //var instance = new @ZiqniTechGamificationApiClient.QuerySortBy();
      //expect(instance).to.be();
    });

  });

}));
