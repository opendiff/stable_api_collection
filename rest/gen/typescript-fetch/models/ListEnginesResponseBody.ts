/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import type { Engine } from './Engine';
import {
    EngineFromJSON,
    EngineFromJSONTyped,
    EngineToJSON,
} from './Engine';

/**
 * 
 * @export
 * @interface ListEnginesResponseBody
 */
export interface ListEnginesResponseBody {
    /**
     * The engines available to your user/organization
     * @type {Array<Engine>}
     * @memberof ListEnginesResponseBody
     */
    engines: Array<Engine>;
}

/**
 * Check if a given object implements the ListEnginesResponseBody interface.
 */
export function instanceOfListEnginesResponseBody(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "engines" in value;

    return isInstance;
}

export function ListEnginesResponseBodyFromJSON(json: any): ListEnginesResponseBody {
    return ListEnginesResponseBodyFromJSONTyped(json, false);
}

export function ListEnginesResponseBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListEnginesResponseBody {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'engines': ((json['engines'] as Array<any>).map(EngineFromJSON)),
    };
}

export function ListEnginesResponseBodyToJSON(value?: ListEnginesResponseBody | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'engines': ((value.engines as Array<any>).map(EngineToJSON)),
    };
}
