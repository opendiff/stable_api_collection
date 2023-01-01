/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Engine from './Engine';

/**
 * The ListEnginesResponseBody model module.
 * @module model/ListEnginesResponseBody
 * @version 0.1
 */
class ListEnginesResponseBody {
    /**
     * Constructs a new <code>ListEnginesResponseBody</code>.
     * @alias module:model/ListEnginesResponseBody
     * @param engines {Array.<module:model/Engine>} The engines available to your user/organization
     */
    constructor(engines) { 
        
        ListEnginesResponseBody.initialize(this, engines);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, engines) { 
        obj['engines'] = engines;
    }

    /**
     * Constructs a <code>ListEnginesResponseBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListEnginesResponseBody} obj Optional instance to populate.
     * @return {module:model/ListEnginesResponseBody} The populated <code>ListEnginesResponseBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListEnginesResponseBody();

            if (data.hasOwnProperty('engines')) {
                obj['engines'] = ApiClient.convertToType(data['engines'], [Engine]);
            }
        }
        return obj;
    }


}

/**
 * The engines available to your user/organization
 * @member {Array.<module:model/Engine>} engines
 */
ListEnginesResponseBody.prototype['engines'] = undefined;






export default ListEnginesResponseBody;
