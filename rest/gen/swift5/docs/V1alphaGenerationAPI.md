# V1alphaGenerationAPI

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationAPI.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationAPI.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationAPI.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alphaGenerationImageToImage**
```swift
    open class func v1alphaGenerationImageToImage(engineId: String, accept: Accept_v1alphaGenerationImageToImage, initImage: URL, options: ImageToImageOptions, organization: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let engineId = "engineId_example" // String |  
let accept = "accept_example" // String |  
let initImage = URL(string: "https://example.com")! // URL | Initial image to use for the image-to-image generation
let options = TODO // ImageToImageOptions | 
let organization = "organization_example" // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

// image-to-image
V1alphaGenerationAPI.v1alphaGenerationImageToImage(engineId: engineId, accept: accept, initImage: initImage, options: options, organization: organization) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String** |   | 
 **accept** | **String** |   | 
 **initImage** | **URL** | Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md) |  | 
 **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

Void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationMasking**
```swift
    open class func v1alphaGenerationMasking(engineId: String, accept: Accept_v1alphaGenerationMasking, initImage: URL, options: MaskingOptions, organization: String? = nil, maskImage: URL? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let engineId = "engineId_example" // String |  
let accept = "accept_example" // String |  
let initImage = URL(string: "https://example.com")! // URL | Initial image to use for the image-to-image generation
let options = TODO // MaskingOptions | 
let organization = "organization_example" // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
let maskImage = URL(string: "https://example.com")! // URL | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)

// image-to-image/masking
V1alphaGenerationAPI.v1alphaGenerationMasking(engineId: engineId, accept: accept, initImage: initImage, options: options, organization: organization, maskImage: maskImage) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String** |   | 
 **accept** | **String** |   | 
 **initImage** | **URL** | Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md) |  | 
 **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **maskImage** | **URL** | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

Void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationTextToImage**
```swift
    open class func v1alphaGenerationTextToImage(engineId: String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

text-to-image

Generate an image from text

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let engineId = "engineId_example" // String |  
let accept = "accept_example" // String |  
let textToImageRequestBody = TextToImageRequestBody(cfgScale: 123, clipGuidancePreset: "clipGuidancePreset_example", height: 123, sampler: "sampler_example", samples: 123, seed: 123, steps: 123, textPrompts: [TextPrompt(text: "text_example", weight: 123)], width: 123) // TextToImageRequestBody | 
let organization = "organization_example" // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

// text-to-image
V1alphaGenerationAPI.v1alphaGenerationTextToImage(engineId: engineId, accept: accept, textToImageRequestBody: textToImageRequestBody, organization: organization) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String** |   | 
 **accept** | **String** |   | 
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  | 
 **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

Void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

