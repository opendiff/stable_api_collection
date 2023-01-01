# \V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaGenerationImageToImage**](V1alphaGenerationApi.md#V1alphaGenerationImageToImage) | **Post** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**V1alphaGenerationMasking**](V1alphaGenerationApi.md#V1alphaGenerationMasking) | **Post** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**V1alphaGenerationTextToImage**](V1alphaGenerationApi.md#V1alphaGenerationTextToImage) | **Post** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## V1alphaGenerationImageToImage

> V1alphaGenerationImageToImage(ctx, engineId).Accept(accept).InitImage(initImage).Options(options).Organization(organization).Execute()

image-to-image



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    engineId := "stable-diffusion-512-v2-0" // string |  
    accept := "application/json" // string |  
    initImage := os.NewFile(1234, "some_file") // *os.File | Initial image to use for the image-to-image generation
    options := TODO // ImageToImageOptions | 
    organization := "org-123456" // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.V1alphaGenerationApi.V1alphaGenerationImageToImage(context.Background(), engineId).Accept(accept).InitImage(initImage).Options(options).Organization(organization).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `V1alphaGenerationApi.V1alphaGenerationImageToImage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string** |   | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1alphaGenerationImageToImageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **accept** | **string** |   | 
 **initImage** | ***os.File** | Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md) |  | 
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | 

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1alphaGenerationMasking

> V1alphaGenerationMasking(ctx, engineId).Accept(accept).InitImage(initImage).Options(options).Organization(organization).MaskImage(maskImage).Execute()

image-to-image/masking



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    engineId := "stable-diffusion-512-v2-0" // string |  
    accept := "application/json" // string |  
    initImage := os.NewFile(1234, "some_file") // *os.File | Initial image to use for the image-to-image generation
    options := TODO // MaskingOptions | 
    organization := "org-123456" // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
    maskImage := os.NewFile(1234, "some_file") // *os.File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.V1alphaGenerationApi.V1alphaGenerationMasking(context.Background(), engineId).Accept(accept).InitImage(initImage).Options(options).Organization(organization).MaskImage(maskImage).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `V1alphaGenerationApi.V1alphaGenerationMasking``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string** |   | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1alphaGenerationMaskingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **accept** | **string** |   | 
 **initImage** | ***os.File** | Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md) |  | 
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | 
 **maskImage** | ***os.File** | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | 

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## V1alphaGenerationTextToImage

> V1alphaGenerationTextToImage(ctx, engineId).Accept(accept).TextToImageRequestBody(textToImageRequestBody).Organization(organization).Execute()

text-to-image



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    engineId := "stable-diffusion-512-v2-0" // string |  
    accept := "application/json" // string |  
    textToImageRequestBody := *openapiclient.NewTextToImageRequestBody([]openapiclient.TextPrompt{*openapiclient.NewTextPrompt("jum")}) // TextToImageRequestBody | 
    organization := "org-123456" // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.V1alphaGenerationApi.V1alphaGenerationTextToImage(context.Background(), engineId).Accept(accept).TextToImageRequestBody(textToImageRequestBody).Organization(organization).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `V1alphaGenerationApi.V1alphaGenerationTextToImage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string** |   | 

### Other Parameters

Other parameters are passed through a pointer to a apiV1alphaGenerationTextToImageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **accept** | **string** |   | 
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  | 
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | 

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

