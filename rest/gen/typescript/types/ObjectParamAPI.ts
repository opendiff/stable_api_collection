import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { AccountResponseBody } from '../models/AccountResponseBody';
import { BalanceResponseBody } from '../models/BalanceResponseBody';
import { Engine } from '../models/Engine';
import { ListEnginesResponseBody } from '../models/ListEnginesResponseBody';
import { ModelError } from '../models/ModelError';
import { OrganizationMembership } from '../models/OrganizationMembership';
import { TextPrompt } from '../models/TextPrompt';
import { TextToImageRequestBody } from '../models/TextToImageRequestBody';

import { ObservableV1alphaEnginesApi } from "./ObservableAPI";
import { V1alphaEnginesApiRequestFactory, V1alphaEnginesApiResponseProcessor} from "../apis/V1alphaEnginesApi";

export interface V1alphaEnginesApiV1alphaEnginesListEnginesRequest {
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @type string
     * @memberof V1alphaEnginesApiv1alphaEnginesListEngines
     */
    organization?: string
}

export class ObjectV1alphaEnginesApi {
    private api: ObservableV1alphaEnginesApi

    public constructor(configuration: Configuration, requestFactory?: V1alphaEnginesApiRequestFactory, responseProcessor?: V1alphaEnginesApiResponseProcessor) {
        this.api = new ObservableV1alphaEnginesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List all engines available to your organization/user
     * list
     * @param param the request object
     */
    public v1alphaEnginesListEngines(param: V1alphaEnginesApiV1alphaEnginesListEnginesRequest = {}, options?: Configuration): Promise<ListEnginesResponseBody> {
        return this.api.v1alphaEnginesListEngines(param.organization,  options).toPromise();
    }

}

import { ObservableV1alphaGenerationApi } from "./ObservableAPI";
import { V1alphaGenerationApiRequestFactory, V1alphaGenerationApiResponseProcessor} from "../apis/V1alphaGenerationApi";

export interface V1alphaGenerationApiV1alphaGenerationImageToImageRequest {
    /**
     *  
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationImageToImage
     */
    engineId: string
    /**
     *  
     * @type &#39;image/png&#39; | &#39;application/json&#39;
     * @memberof V1alphaGenerationApiv1alphaGenerationImageToImage
     */
    accept: 'image/png' | 'application/json'
    /**
     * Initial image to use for the image-to-image generation
     * @type HttpFile
     * @memberof V1alphaGenerationApiv1alphaGenerationImageToImage
     */
    initImage: HttpFile
    /**
     * 
     * @type ImageToImageOptions
     * @memberof V1alphaGenerationApiv1alphaGenerationImageToImage
     */
    options: ImageToImageOptions
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationImageToImage
     */
    organization?: string
}

export interface V1alphaGenerationApiV1alphaGenerationMaskingRequest {
    /**
     *  
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    engineId: string
    /**
     *  
     * @type &#39;image/png&#39; | &#39;application/json&#39;
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    accept: 'image/png' | 'application/json'
    /**
     * Initial image to use for the image-to-image generation
     * @type HttpFile
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    initImage: HttpFile
    /**
     * 
     * @type MaskingOptions
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    options: MaskingOptions
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    organization?: string
    /**
     * Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.)
     * @type HttpFile
     * @memberof V1alphaGenerationApiv1alphaGenerationMasking
     */
    maskImage?: HttpFile
}

export interface V1alphaGenerationApiV1alphaGenerationTextToImageRequest {
    /**
     *  
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationTextToImage
     */
    engineId: string
    /**
     *  
     * @type &#39;image/png&#39; | &#39;application/json&#39;
     * @memberof V1alphaGenerationApiv1alphaGenerationTextToImage
     */
    accept: 'image/png' | 'application/json'
    /**
     * 
     * @type TextToImageRequestBody
     * @memberof V1alphaGenerationApiv1alphaGenerationTextToImage
     */
    textToImageRequestBody: TextToImageRequestBody
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @type string
     * @memberof V1alphaGenerationApiv1alphaGenerationTextToImage
     */
    organization?: string
}

export class ObjectV1alphaGenerationApi {
    private api: ObservableV1alphaGenerationApi

    public constructor(configuration: Configuration, requestFactory?: V1alphaGenerationApiRequestFactory, responseProcessor?: V1alphaGenerationApiResponseProcessor) {
        this.api = new ObservableV1alphaGenerationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generate big fancy pictures from small fancy pictures
     * image-to-image
     * @param param the request object
     */
    public v1alphaGenerationImageToImage(param: V1alphaGenerationApiV1alphaGenerationImageToImageRequest, options?: Configuration): Promise<void> {
        return this.api.v1alphaGenerationImageToImage(param.engineId, param.accept, param.initImage, param.options, param.organization,  options).toPromise();
    }

    /**
     * Paint fancy things into fancy pictures
     * image-to-image/masking
     * @param param the request object
     */
    public v1alphaGenerationMasking(param: V1alphaGenerationApiV1alphaGenerationMaskingRequest, options?: Configuration): Promise<void> {
        return this.api.v1alphaGenerationMasking(param.engineId, param.accept, param.initImage, param.options, param.organization, param.maskImage,  options).toPromise();
    }

    /**
     * Generate an image from text
     * text-to-image
     * @param param the request object
     */
    public v1alphaGenerationTextToImage(param: V1alphaGenerationApiV1alphaGenerationTextToImageRequest, options?: Configuration): Promise<void> {
        return this.api.v1alphaGenerationTextToImage(param.engineId, param.accept, param.textToImageRequestBody, param.organization,  options).toPromise();
    }

}

import { ObservableV1alphaUserApi } from "./ObservableAPI";
import { V1alphaUserApiRequestFactory, V1alphaUserApiResponseProcessor} from "../apis/V1alphaUserApi";

export interface V1alphaUserApiV1alphaUserAccountRequest {
}

export interface V1alphaUserApiV1alphaUserBalanceRequest {
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @type string
     * @memberof V1alphaUserApiv1alphaUserBalance
     */
    organization?: string
}

export class ObjectV1alphaUserApi {
    private api: ObservableV1alphaUserApi

    public constructor(configuration: Configuration, requestFactory?: V1alphaUserApiRequestFactory, responseProcessor?: V1alphaUserApiResponseProcessor) {
        this.api = new ObservableV1alphaUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get information about the account associated with the provided API key
     * account
     * @param param the request object
     */
    public v1alphaUserAccount(param: V1alphaUserApiV1alphaUserAccountRequest = {}, options?: Configuration): Promise<AccountResponseBody> {
        return this.api.v1alphaUserAccount( options).toPromise();
    }

    /**
     * Get the credit balance of the account/organization associated with the API key
     * balance
     * @param param the request object
     */
    public v1alphaUserBalance(param: V1alphaUserApiV1alphaUserBalanceRequest = {}, options?: Configuration): Promise<BalanceResponseBody> {
        return this.api.v1alphaUserBalance(param.organization,  options).toPromise();
    }

}
