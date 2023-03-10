/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * OpenAPI spec version: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class ModelError {
    /**
    * Is the error a server-side fault?
    */
    'fault': boolean;
    /**
    * ID is a unique identifier for this particular occurrence of the problem.
    */
    'id': string;
    /**
    * Message is a human-readable explanation specific to this occurrence of the problem.
    */
    'message': string;
    /**
    * Name is the name of this class of errors.
    */
    'name': string;
    /**
    * Is the error temporary?
    */
    'temporary': boolean;
    /**
    * Is the error a timeout?
    */
    'timeout': boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fault",
            "baseName": "fault",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "temporary",
            "baseName": "temporary",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "timeout",
            "baseName": "timeout",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ModelError.attributeTypeMap;
    }

    public constructor() {
    }
}

