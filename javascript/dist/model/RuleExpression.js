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
import RuleRoutine from './RuleRoutine';
/**
 * The RuleExpression model module.
 * @module model/RuleExpression
 * @version 0.0.1
 */

class RuleExpression {
  /**
   * Constructs a new <code>RuleExpression</code>.
   * A conditional expressions is an element that declares either a rule expression, condition or routine to be evaluated or executed
   * @alias module:model/RuleExpression
   * @param type {String} condition or expression or routine
   */
  constructor(type) {
    RuleExpression.initialize(this, type);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  static initialize(obj, type) {
    obj['type'] = type;
  }
  /**
   * Constructs a <code>RuleExpression</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RuleExpression} obj Optional instance to populate.
   * @return {module:model/RuleExpression} The populated <code>RuleExpression</code> instance.
   */


  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RuleExpression();

      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }

      if (data.hasOwnProperty('mustMatchAll')) {
        obj['mustMatchAll'] = ApiClient.convertToType(data['mustMatchAll'], 'Boolean');
      }

      if (data.hasOwnProperty('mustEvaluateTo')) {
        obj['mustEvaluateTo'] = ApiClient.convertToType(data['mustEvaluateTo'], 'Boolean');
      }

      if (data.hasOwnProperty('scope')) {
        obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
      }

      if (data.hasOwnProperty('operand')) {
        obj['operand'] = ApiClient.convertToType(data['operand'], 'String');
      }

      if (data.hasOwnProperty('operator')) {
        obj['operator'] = ApiClient.convertToType(data['operator'], 'String');
      }

      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }

      if (data.hasOwnProperty('rules')) {
        obj['rules'] = ApiClient.convertToType(data['rules'], [RuleExpression]);
      }

      if (data.hasOwnProperty('then')) {
        obj['then'] = ApiClient.convertToType(data['then'], [RuleRoutine]);
      }

      if (data.hasOwnProperty('lineNumber')) {
        obj['lineNumber'] = ApiClient.convertToType(data['lineNumber'], 'Number');
      }
    }

    return obj;
  }

}
/**
 * condition or expression or routine
 * @member {String} type
 */


RuleExpression.prototype['type'] = undefined;
/**
 * All expressions in the condition must either evaluate to TRUE or FALSE if set to TRUE
 * @member {Boolean} mustMatchAll
 */

RuleExpression.prototype['mustMatchAll'] = undefined;
/**
 * All the expressions of this condition must either evaluate to TRUE or FALSE
 * @member {Boolean} mustEvaluateTo
 */

RuleExpression.prototype['mustEvaluateTo'] = undefined;
/**
 * The scope of the operand used in the expression
 * @member {String} scope
 */

RuleExpression.prototype['scope'] = undefined;
/**
 * The order the rules have to be executed in.
 * @member {String} operand
 */

RuleExpression.prototype['operand'] = undefined;
/**
 * [ *.* ] or [ .* ] or [ == ] or [ > ] or [ >= ] or [ <=]  or [ < ] or [ <> ]
 * @member {String} operator
 */

RuleExpression.prototype['operator'] = undefined;
/**
 * The value associated with the expression
 * @member {String} value
 */

RuleExpression.prototype['value'] = undefined;
/**
 * @member {Array.<module:model/RuleExpression>} rules
 */

RuleExpression.prototype['rules'] = undefined;
/**
 * @member {Array.<module:model/RuleRoutine>} then
 */

RuleExpression.prototype['then'] = undefined;
/**
 * @member {Number} lineNumber
 */

RuleExpression.prototype['lineNumber'] = undefined;
export default RuleExpression;