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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    ImageToImageOptions,
    ImageToImageOptionsFromJSON,
    ImageToImageOptionsToJSON,
    MaskingOptions,
    MaskingOptionsFromJSON,
    MaskingOptionsToJSON,
    TextToImageRequestBody,
    TextToImageRequestBodyFromJSON,
    TextToImageRequestBodyToJSON,
} from '../models';

export interface V1alphaGenerationImageToImageRequest {
    engineId: string;
    accept: V1alphaGenerationImageToImageAcceptEnum;
    initImage: Blob;
    options: ImageToImageOptions;
    organization?: string;
}

export interface V1alphaGenerationMaskingRequest {
    engineId: string;
    accept: V1alphaGenerationMaskingAcceptEnum;
    initImage: Blob;
    options: MaskingOptions;
    organization?: string;
    maskImage?: Blob;
}

export interface V1alphaGenerationTextToImageRequest {
    engineId: string;
    accept: V1alphaGenerationTextToImageAcceptEnum;
    textToImageRequestBody: TextToImageRequestBody;
    organization?: string;
}


/**
 * Generate big fancy pictures from small fancy pictures
 * image-to-image
 */
function v1alphaGenerationImageToImageRaw<T>(requestParameters: V1alphaGenerationImageToImageRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.engineId === null || requestParameters.engineId === undefined) {
        throw new runtime.RequiredError('engineId','Required parameter requestParameters.engineId was null or undefined when calling v1alphaGenerationImageToImage.');
    }

    if (requestParameters.accept === null || requestParameters.accept === undefined) {
        throw new runtime.RequiredError('accept','Required parameter requestParameters.accept was null or undefined when calling v1alphaGenerationImageToImage.');
    }

    if (requestParameters.initImage === null || requestParameters.initImage === undefined) {
        throw new runtime.RequiredError('initImage','Required parameter requestParameters.initImage was null or undefined when calling v1alphaGenerationImageToImage.');
    }

    if (requestParameters.options === null || requestParameters.options === undefined) {
        throw new runtime.RequiredError('options','Required parameter requestParameters.options was null or undefined when calling v1alphaGenerationImageToImage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    if (requestParameters.accept !== undefined && requestParameters.accept !== null) {
        headerParameters['Accept'] = String(requestParameters.accept);
    }

    if (requestParameters.organization !== undefined && requestParameters.organization !== null) {
        headerParameters['Organization'] = String(requestParameters.organization);
    }


    const { meta = {} } = requestConfig;

    meta.authType = ['api_key', 'header'];
    const formData = new FormData();
    if (requestParameters.initImage !== undefined) {
        formData.append('init_image', requestParameters.initImage as any);
    }

    if (requestParameters.options !== undefined) {
        formData.append('options', requestParameters.options as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/v1alpha/generation/{engine_id}/image-to-image`.replace(`{${"engine_id"}}`, encodeURIComponent(String(requestParameters.engineId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
    }

    return config;
}

/**
* Generate big fancy pictures from small fancy pictures
* image-to-image
*/
export function v1alphaGenerationImageToImage<T>(requestParameters: V1alphaGenerationImageToImageRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return v1alphaGenerationImageToImageRaw(requestParameters, requestConfig);
}

/**
 * Paint fancy things into fancy pictures
 * image-to-image/masking
 */
function v1alphaGenerationMaskingRaw<T>(requestParameters: V1alphaGenerationMaskingRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.engineId === null || requestParameters.engineId === undefined) {
        throw new runtime.RequiredError('engineId','Required parameter requestParameters.engineId was null or undefined when calling v1alphaGenerationMasking.');
    }

    if (requestParameters.accept === null || requestParameters.accept === undefined) {
        throw new runtime.RequiredError('accept','Required parameter requestParameters.accept was null or undefined when calling v1alphaGenerationMasking.');
    }

    if (requestParameters.initImage === null || requestParameters.initImage === undefined) {
        throw new runtime.RequiredError('initImage','Required parameter requestParameters.initImage was null or undefined when calling v1alphaGenerationMasking.');
    }

    if (requestParameters.options === null || requestParameters.options === undefined) {
        throw new runtime.RequiredError('options','Required parameter requestParameters.options was null or undefined when calling v1alphaGenerationMasking.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    if (requestParameters.accept !== undefined && requestParameters.accept !== null) {
        headerParameters['Accept'] = String(requestParameters.accept);
    }

    if (requestParameters.organization !== undefined && requestParameters.organization !== null) {
        headerParameters['Organization'] = String(requestParameters.organization);
    }


    const { meta = {} } = requestConfig;

    meta.authType = ['api_key', 'header'];
    const formData = new FormData();
    if (requestParameters.initImage !== undefined) {
        formData.append('init_image', requestParameters.initImage as any);
    }

    if (requestParameters.maskImage !== undefined) {
        formData.append('mask_image', requestParameters.maskImage as any);
    }

    if (requestParameters.options !== undefined) {
        formData.append('options', requestParameters.options as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/v1alpha/generation/{engine_id}/image-to-image/masking`.replace(`{${"engine_id"}}`, encodeURIComponent(String(requestParameters.engineId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
    }

    return config;
}

/**
* Paint fancy things into fancy pictures
* image-to-image/masking
*/
export function v1alphaGenerationMasking<T>(requestParameters: V1alphaGenerationMaskingRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return v1alphaGenerationMaskingRaw(requestParameters, requestConfig);
}

/**
 * Generate an image from text
 * text-to-image
 */
function v1alphaGenerationTextToImageRaw<T>(requestParameters: V1alphaGenerationTextToImageRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.engineId === null || requestParameters.engineId === undefined) {
        throw new runtime.RequiredError('engineId','Required parameter requestParameters.engineId was null or undefined when calling v1alphaGenerationTextToImage.');
    }

    if (requestParameters.accept === null || requestParameters.accept === undefined) {
        throw new runtime.RequiredError('accept','Required parameter requestParameters.accept was null or undefined when calling v1alphaGenerationTextToImage.');
    }

    if (requestParameters.textToImageRequestBody === null || requestParameters.textToImageRequestBody === undefined) {
        throw new runtime.RequiredError('textToImageRequestBody','Required parameter requestParameters.textToImageRequestBody was null or undefined when calling v1alphaGenerationTextToImage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';

    if (requestParameters.accept !== undefined && requestParameters.accept !== null) {
        headerParameters['Accept'] = String(requestParameters.accept);
    }

    if (requestParameters.organization !== undefined && requestParameters.organization !== null) {
        headerParameters['Organization'] = String(requestParameters.organization);
    }


    const { meta = {} } = requestConfig;

    meta.authType = ['api_key', 'header'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/v1alpha/generation/{engine_id}/text-to-image`.replace(`{${"engine_id"}}`, encodeURIComponent(String(requestParameters.engineId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || TextToImageRequestBodyToJSON(requestParameters.textToImageRequestBody),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
    }

    return config;
}

/**
* Generate an image from text
* text-to-image
*/
export function v1alphaGenerationTextToImage<T>(requestParameters: V1alphaGenerationTextToImageRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return v1alphaGenerationTextToImageRaw(requestParameters, requestConfig);
}


/**
    * @export
    * @enum {string}
    */
export enum V1alphaGenerationImageToImageAcceptEnum {
    ImagePng = 'image/png',
    ApplicationJson = 'application/json'
}
/**
    * @export
    * @enum {string}
    */
export enum V1alphaGenerationMaskingAcceptEnum {
    ImagePng = 'image/png',
    ApplicationJson = 'application/json'
}
/**
    * @export
    * @enum {string}
    */
export enum V1alphaGenerationTextToImageAcceptEnum {
    ImagePng = 'image/png',
    ApplicationJson = 'application/json'
}
