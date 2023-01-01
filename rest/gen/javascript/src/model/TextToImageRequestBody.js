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
import TextPrompt from './TextPrompt';

/**
 * The TextToImageRequestBody model module.
 * @module model/TextToImageRequestBody
 * @version 0.1
 */
class TextToImageRequestBody {
    /**
     * Constructs a new <code>TextToImageRequestBody</code>.
     * @alias module:model/TextToImageRequestBody
     * @param textPrompts {Array.<module:model/TextPrompt>} 
     */
    constructor(textPrompts) { 
        
        TextToImageRequestBody.initialize(this, textPrompts);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, textPrompts) { 
        obj['text_prompts'] = textPrompts;
    }

    /**
     * Constructs a <code>TextToImageRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TextToImageRequestBody} obj Optional instance to populate.
     * @return {module:model/TextToImageRequestBody} The populated <code>TextToImageRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TextToImageRequestBody();

            if (data.hasOwnProperty('cfg_scale')) {
                obj['cfg_scale'] = ApiClient.convertToType(data['cfg_scale'], 'Number');
            }
            if (data.hasOwnProperty('clip_guidance_preset')) {
                obj['clip_guidance_preset'] = ApiClient.convertToType(data['clip_guidance_preset'], 'String');
            }
            if (data.hasOwnProperty('height')) {
                obj['height'] = ApiClient.convertToType(data['height'], 'Number');
            }
            if (data.hasOwnProperty('sampler')) {
                obj['sampler'] = ApiClient.convertToType(data['sampler'], 'String');
            }
            if (data.hasOwnProperty('samples')) {
                obj['samples'] = ApiClient.convertToType(data['samples'], 'Number');
            }
            if (data.hasOwnProperty('seed')) {
                obj['seed'] = ApiClient.convertToType(data['seed'], 'Number');
            }
            if (data.hasOwnProperty('steps')) {
                obj['steps'] = ApiClient.convertToType(data['steps'], 'Number');
            }
            if (data.hasOwnProperty('text_prompts')) {
                obj['text_prompts'] = ApiClient.convertToType(data['text_prompts'], [TextPrompt]);
            }
            if (data.hasOwnProperty('width')) {
                obj['width'] = ApiClient.convertToType(data['width'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
 * @member {Number} cfg_scale
 * @default 7
 */
TextToImageRequestBody.prototype['cfg_scale'] = 7;

/**
 * @member {module:model/TextToImageRequestBody.ClipGuidancePresetEnum} clip_guidance_preset
 * @default 'NONE'
 */
TextToImageRequestBody.prototype['clip_guidance_preset'] = 'NONE';

/**
 * Height of the image (note: `height * width` must be <= 1 Megapixel)
 * @member {Number} height
 * @default 512
 */
TextToImageRequestBody.prototype['height'] = 512;

/**
 * Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
 * @member {module:model/TextToImageRequestBody.SamplerEnum} sampler
 */
TextToImageRequestBody.prototype['sampler'] = undefined;

/**
 * Number of images to generate
 * @member {Number} samples
 * @default 1
 */
TextToImageRequestBody.prototype['samples'] = 1;

/**
 * Random noise seed (omit this option or use `0` for a random seed)
 * @member {Number} seed
 */
TextToImageRequestBody.prototype['seed'] = undefined;

/**
 * Number of diffusion steps to run
 * @member {Number} steps
 * @default 50
 */
TextToImageRequestBody.prototype['steps'] = 50;

/**
 * @member {Array.<module:model/TextPrompt>} text_prompts
 */
TextToImageRequestBody.prototype['text_prompts'] = undefined;

/**
 * Width of the image (note: `height * width` must be <= 1 Megapixel)
 * @member {Number} width
 * @default 512
 */
TextToImageRequestBody.prototype['width'] = 512;





/**
 * Allowed values for the <code>clip_guidance_preset</code> property.
 * @enum {String}
 * @readonly
 */
TextToImageRequestBody['ClipGuidancePresetEnum'] = {

    /**
     * value: "FAST_BLUE"
     * @const
     */
    "FAST_BLUE": "FAST_BLUE",

    /**
     * value: "FAST_GREEN"
     * @const
     */
    "FAST_GREEN": "FAST_GREEN",

    /**
     * value: "NONE"
     * @const
     */
    "NONE": "NONE",

    /**
     * value: "SIMPLE"
     * @const
     */
    "SIMPLE": "SIMPLE",

    /**
     * value: "SLOW"
     * @const
     */
    "SLOW": "SLOW",

    /**
     * value: "SLOWER"
     * @const
     */
    "SLOWER": "SLOWER",

    /**
     * value: "SLOWEST"
     * @const
     */
    "SLOWEST": "SLOWEST"
};


/**
 * Allowed values for the <code>sampler</code> property.
 * @enum {String}
 * @readonly
 */
TextToImageRequestBody['SamplerEnum'] = {

    /**
     * value: "DDIM"
     * @const
     */
    "DDIM": "DDIM",

    /**
     * value: "DDPM"
     * @const
     */
    "DDPM": "DDPM",

    /**
     * value: "K_DPMPP_2M"
     * @const
     */
    "K_DPMPP_2M": "K_DPMPP_2M",

    /**
     * value: "K_DPMPP_2S_ANCESTRAL"
     * @const
     */
    "K_DPMPP_2S_ANCESTRAL": "K_DPMPP_2S_ANCESTRAL",

    /**
     * value: "K_DPM_2"
     * @const
     */
    "K_DPM_2": "K_DPM_2",

    /**
     * value: "K_DPM_2_ANCESTRAL"
     * @const
     */
    "K_DPM_2_ANCESTRAL": "K_DPM_2_ANCESTRAL",

    /**
     * value: "K_EULER"
     * @const
     */
    "K_EULER": "K_EULER",

    /**
     * value: "K_EULER_ANCESTRAL"
     * @const
     */
    "K_EULER_ANCESTRAL": "K_EULER_ANCESTRAL",

    /**
     * value: "K_HEUN"
     * @const
     */
    "K_HEUN": "K_HEUN",

    /**
     * value: "K_LMS"
     * @const
     */
    "K_LMS": "K_LMS"
};



export default TextToImageRequestBody;

