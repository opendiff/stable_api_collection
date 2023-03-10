/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.V1alphaGenerationApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 * Version: 0.1
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license closed source
 * https://stability.ai/terms-of-use
 */

goog.provide('API.Client.V1alphaGenerationApi');

goog.require('API.Client.Error');
goog.require('API.Client.ImageToImageOptions');
goog.require('API.Client.MaskingOptions');
goog.require('API.Client.TextToImageRequestBody');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.V1alphaGenerationApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('V1alphaGenerationApiBasePath') ?
                   /** @type {!string} */ ($injector.get('V1alphaGenerationApiBasePath')) :
                   'https://api.stability.ai';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('V1alphaGenerationApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('V1alphaGenerationApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.V1alphaGenerationApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * image-to-image
 * Generate big fancy pictures from small fancy pictures
 * @param {!string} engineId  
 * @param {!string} accept  
 * @param {!Object} initImage Initial image to use for the image-to-image generation
 * @param {!API.Client.ImageToImageOptions} options 
 * @param {!string=} opt_organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.V1alphaGenerationApi.prototype.v1alphaGenerationImageToImage = function(engineId, accept, initImage, options, opt_organization, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1alpha/generation/{engine_id}/image-to-image'
      .replace('{' + 'engine_id' + '}', String(engineId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'engineId' is set
  if (!engineId) {
    throw new Error('Missing required parameter engineId when calling v1alphaGenerationImageToImage');
  }
  // verify required parameter 'accept' is set
  if (!accept) {
    throw new Error('Missing required parameter accept when calling v1alphaGenerationImageToImage');
  }
  // verify required parameter 'initImage' is set
  if (!initImage) {
    throw new Error('Missing required parameter initImage when calling v1alphaGenerationImageToImage');
  }
  // verify required parameter 'options' is set
  if (!options) {
    throw new Error('Missing required parameter options when calling v1alphaGenerationImageToImage');
  }
  headerParams['Accept'] = accept;

  headerParams['Organization'] = opt_organization;

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['init_image'] = initImage;

  formParams['options'] = options;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * image-to-image/masking
 * Paint fancy things into fancy pictures
 * @param {!string} engineId  
 * @param {!string} accept  
 * @param {!Object} initImage Initial image to use for the image-to-image generation
 * @param {!API.Client.MaskingOptions} options 
 * @param {!string=} opt_organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
 * @param {!Object=} opt_maskImage Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.)
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.V1alphaGenerationApi.prototype.v1alphaGenerationMasking = function(engineId, accept, initImage, options, opt_organization, opt_maskImage, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1alpha/generation/{engine_id}/image-to-image/masking'
      .replace('{' + 'engine_id' + '}', String(engineId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'engineId' is set
  if (!engineId) {
    throw new Error('Missing required parameter engineId when calling v1alphaGenerationMasking');
  }
  // verify required parameter 'accept' is set
  if (!accept) {
    throw new Error('Missing required parameter accept when calling v1alphaGenerationMasking');
  }
  // verify required parameter 'initImage' is set
  if (!initImage) {
    throw new Error('Missing required parameter initImage when calling v1alphaGenerationMasking');
  }
  // verify required parameter 'options' is set
  if (!options) {
    throw new Error('Missing required parameter options when calling v1alphaGenerationMasking');
  }
  headerParams['Accept'] = accept;

  headerParams['Organization'] = opt_organization;

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['init_image'] = initImage;

  formParams['mask_image'] = opt_maskImage;

  formParams['options'] = options;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * text-to-image
 * Generate an image from text
 * @param {!string} engineId  
 * @param {!string} accept  
 * @param {!TextToImageRequestBody} textToImageRequestBody 
 * @param {!string=} opt_organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.V1alphaGenerationApi.prototype.v1alphaGenerationTextToImage = function(engineId, accept, textToImageRequestBody, opt_organization, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1alpha/generation/{engine_id}/text-to-image'
      .replace('{' + 'engine_id' + '}', String(engineId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'engineId' is set
  if (!engineId) {
    throw new Error('Missing required parameter engineId when calling v1alphaGenerationTextToImage');
  }
  // verify required parameter 'accept' is set
  if (!accept) {
    throw new Error('Missing required parameter accept when calling v1alphaGenerationTextToImage');
  }
  // verify required parameter 'textToImageRequestBody' is set
  if (!textToImageRequestBody) {
    throw new Error('Missing required parameter textToImageRequestBody when calling v1alphaGenerationTextToImage');
  }
  headerParams['Accept'] = accept;

  headerParams['Organization'] = opt_organization;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: textToImageRequestBody,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
