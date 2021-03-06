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

import ApiClient from '../ApiClient';

/**
 * The FileRequest model module.
 * @module model/FileRequest
 * @version 0.0.1
 */
class FileRequest {
    /**
     * Constructs a new <code>FileRequest</code>.
     * @alias module:model/FileRequest
     * @param memberRefId {String} 
     */
    constructor(memberRefId) { 
        
        FileRequest.initialize(this, memberRefId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, memberRefId) { 
        obj['memberRefId'] = memberRefId;
    }

    /**
     * Constructs a <code>FileRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FileRequest} obj Optional instance to populate.
     * @return {module:model/FileRequest} The populated <code>FileRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FileRequest();

            if (data.hasOwnProperty('memberRefId')) {
                obj['memberRefId'] = ApiClient.convertToType(data['memberRefId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} memberRefId
 */
FileRequest.prototype['memberRefId'] = undefined;






export default FileRequest;

