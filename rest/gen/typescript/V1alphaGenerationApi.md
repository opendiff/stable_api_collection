# .V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alphaGenerationImageToImage**
> void v1alphaGenerationImageToImage()

Generate big fancy pictures from small fancy pictures

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaGenerationApi(configuration);

let body:.V1alphaGenerationApiV1alphaGenerationImageToImageRequest = {
  // string |  
  engineId: "stable-diffusion-512-v2-0",
  // 'image/png' | 'application/json' |  
  accept: "application/json",
  // HttpFile | Initial image to use for the image-to-image generation
  initImage: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // ImageToImageOptions
  options: {
    cfgScale: 7,
    clipGuidancePreset: "FAST_BLUE",
    height: 512,
    sampler: "K_DPM_2_ANCESTRAL",
    samples: 1,
    seed: 0,
    stepScheduleEnd: 0.01,
    stepScheduleStart: 0.4,
    steps: 75,
    textPrompts: [
      {
        text: "jum",
        weight: 0.80305135,
      },
    ],
    width: 512,
  },
  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  organization: "org-123456",
};

apiInstance.v1alphaGenerationImageToImage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | [**string**] |   | defaults to undefined
 **accept** | [**&#39;image/png&#39; | &#39;application/json&#39;**]**Array<&#39;image/png&#39; &#124; &#39;application/json&#39;>** |   | defaults to undefined
 **initImage** | [**HttpFile**] | Initial image to use for the image-to-image generation | defaults to undefined
 **options** | **ImageToImageOptions** |  | defaults to undefined
 **organization** | [**string**] | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[api_key_header_Authorization](README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **v1alphaGenerationMasking**
> void v1alphaGenerationMasking()

Paint fancy things into fancy pictures

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaGenerationApi(configuration);

let body:.V1alphaGenerationApiV1alphaGenerationMaskingRequest = {
  // string |  
  engineId: "stable-diffusion-512-v2-0",
  // 'image/png' | 'application/json' |  
  accept: "application/json",
  // HttpFile | Initial image to use for the image-to-image generation
  initImage: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // MaskingOptions
  options: {
    cfgScale: 7,
    clipGuidancePreset: "FAST_BLUE",
    height: 512,
    maskSource: "INIT_IMAGE_ALPHA",
    sampler: "K_DPM_2_ANCESTRAL",
    samples: 1,
    seed: 0,
    steps: 75,
    textPrompts: [
      {
        text: "jum",
        weight: 0.80305135,
      },
    ],
    width: 512,
  },
  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  organization: "org-123456",
  // HttpFile | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)
  maskImage: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.v1alphaGenerationMasking(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | [**string**] |   | defaults to undefined
 **accept** | [**&#39;image/png&#39; | &#39;application/json&#39;**]**Array<&#39;image/png&#39; &#124; &#39;application/json&#39;>** |   | defaults to undefined
 **initImage** | [**HttpFile**] | Initial image to use for the image-to-image generation | defaults to undefined
 **options** | **MaskingOptions** |  | defaults to undefined
 **organization** | [**string**] | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | (optional) defaults to undefined
 **maskImage** | [**HttpFile**] | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | (optional) defaults to undefined


### Return type

**void**

### Authorization

[api_key_header_Authorization](README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **v1alphaGenerationTextToImage**
> void v1alphaGenerationTextToImage(textToImageRequestBody)

Generate an image from text

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaGenerationApi(configuration);

let body:.V1alphaGenerationApiV1alphaGenerationTextToImageRequest = {
  // string |  
  engineId: "stable-diffusion-512-v2-0",
  // 'image/png' | 'application/json' |  
  accept: "application/json",
  // TextToImageRequestBody
  textToImageRequestBody: {
    cfgScale: 7,
    clipGuidancePreset: "FAST_BLUE",
    height: 512,
    sampler: "K_DPM_2_ANCESTRAL",
    samples: 1,
    seed: 0,
    steps: 75,
    textPrompts: [
      {
        text: "jum",
        weight: 0.80305135,
      },
    ],
    width: 512,
  },
  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  organization: "org-123456",
};

apiInstance.v1alphaGenerationTextToImage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **textToImageRequestBody** | **TextToImageRequestBody**|  |
 **engineId** | [**string**] |   | defaults to undefined
 **accept** | [**&#39;image/png&#39; | &#39;application/json&#39;**]**Array<&#39;image/png&#39; &#124; &#39;application/json&#39;>** |   | defaults to undefined
 **organization** | [**string**] | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | (optional) defaults to undefined


### Return type

**void**

### Authorization

[api_key_header_Authorization](README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


