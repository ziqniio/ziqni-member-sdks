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
    instance = new @ZiqniTechGamificationApiClient.RuleExpression();
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

  describe('RuleExpression', function() {
    it('should create an instance of RuleExpression', function() {
      // uncomment below and update the code to test RuleExpression
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be.a(@ZiqniTechGamificationApiClient.RuleExpression);
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property mustMatchAll (base name: "mustMatchAll")', function() {
      // uncomment below and update the code to test the property mustMatchAll
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property mustEvaluateTo (base name: "mustEvaluateTo")', function() {
      // uncomment below and update the code to test the property mustEvaluateTo
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property scope (base name: "scope")', function() {
      // uncomment below and update the code to test the property scope
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property operand (base name: "operand")', function() {
      // uncomment below and update the code to test the property operand
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property operator (base name: "operator")', function() {
      // uncomment below and update the code to test the property operator
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property rules (base name: "rules")', function() {
      // uncomment below and update the code to test the property rules
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property then (base name: "then")', function() {
      // uncomment below and update the code to test the property then
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

    it('should have the property lineNumber (base name: "lineNumber")', function() {
      // uncomment below and update the code to test the property lineNumber
      //var instance = new @ZiqniTechGamificationApiClient.RuleExpression();
      //expect(instance).to.be();
    });

  });

}));
