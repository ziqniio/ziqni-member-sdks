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
    instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
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

  describe('MessageAllOf', function() {
    it('should create an instance of MessageAllOf', function() {
      // uncomment below and update the code to test MessageAllOf
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be.a(@ZiqniTechGamificationApiClient.MessageAllOf);
    });

    it('should have the property eventRefType (base name: "eventRefType")', function() {
      // uncomment below and update the code to test the property eventRefType
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property eventRefId (base name: "eventRefId")', function() {
      // uncomment below and update the code to test the property eventRefId
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property messageType (base name: "messageType")', function() {
      // uncomment below and update the code to test the property messageType
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property subject (base name: "subject")', function() {
      // uncomment below and update the code to test the property subject
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property body (base name: "body")', function() {
      // uncomment below and update the code to test the property body
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property prize (base name: "prize")', function() {
      // uncomment below and update the code to test the property prize
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property expiry (base name: "expiry")', function() {
      // uncomment below and update the code to test the property expiry
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property memberId (base name: "memberId")', function() {
      // uncomment below and update the code to test the property memberId
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property translations (base name: "translations")', function() {
      // uncomment below and update the code to test the property translations
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

    it('should have the property translatableFields (base name: "translatableFields")', function() {
      // uncomment below and update the code to test the property translatableFields
      //var instance = new @ZiqniTechGamificationApiClient.MessageAllOf();
      //expect(instance).to.be();
    });

  });

}));
