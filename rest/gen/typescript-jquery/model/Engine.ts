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

import * as models from './models';

export interface Engine {
    description: string;

    /**
     * Unique identifier for the engine
     */
    id: string;

    /**
     * Name of the engine
     */
    name: string;

    /**
     * The type of content this engine produces
     */
    type: Engine.TypeEnum;

}
export namespace Engine {
    export enum TypeEnum {
        Audio = <any> 'AUDIO',
        Classification = <any> 'CLASSIFICATION',
        Picture = <any> 'PICTURE',
        Storage = <any> 'STORAGE',
        Text = <any> 'TEXT',
        Video = <any> 'VIDEO'
    }
}
