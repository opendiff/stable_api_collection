// tslint:disable
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
 */

import type {
    TextPrompt,
} from './';

/**
 * @export
 * @interface TextToImageRequestBody
 */
export interface TextToImageRequestBody {
    /**
     * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    cfg_scale?: number;
    /**
     * @type {string}
     * @memberof TextToImageRequestBody
     */
    clip_guidance_preset?: TextToImageRequestBodyClipGuidancePresetEnum;
    /**
     * Height of the image (note: `height * width` must be <= 1 Megapixel)
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    height?: number;
    /**
     * Which sampler to use for the diffusion process. If this value is omitted we\'ll automatically select an appropriate sampler for you.
     * @type {string}
     * @memberof TextToImageRequestBody
     */
    sampler?: TextToImageRequestBodySamplerEnum;
    /**
     * Number of images to generate
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    samples?: number;
    /**
     * Random noise seed (omit this option or use `0` for a random seed)
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    seed?: number;
    /**
     * Number of diffusion steps to run
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    steps?: number;
    /**
     * @type {Array<TextPrompt>}
     * @memberof TextToImageRequestBody
     */
    text_prompts: Array<TextPrompt>;
    /**
     * Width of the image (note: `height * width` must be <= 1 Megapixel)
     * @type {number}
     * @memberof TextToImageRequestBody
     */
    width?: number;
}

/**
 * @export
 * @enum {string}
 */
export enum TextToImageRequestBodyClipGuidancePresetEnum {
    FastBlue = 'FAST_BLUE',
    FastGreen = 'FAST_GREEN',
    None = 'NONE',
    Simple = 'SIMPLE',
    Slow = 'SLOW',
    Slower = 'SLOWER',
    Slowest = 'SLOWEST'
}
/**
 * @export
 * @enum {string}
 */
export enum TextToImageRequestBodySamplerEnum {
    Ddim = 'DDIM',
    Ddpm = 'DDPM',
    KDpmpp2M = 'K_DPMPP_2M',
    KDpmpp2SAncestral = 'K_DPMPP_2S_ANCESTRAL',
    KDpm2 = 'K_DPM_2',
    KDpm2Ancestral = 'K_DPM_2_ANCESTRAL',
    KEuler = 'K_EULER',
    KEulerAncestral = 'K_EULER_ANCESTRAL',
    KHeun = 'K_HEUN',
    KLms = 'K_LMS'
}
