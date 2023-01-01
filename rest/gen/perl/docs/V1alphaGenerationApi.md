# WWW::OpenAPIClient::V1alphaGenerationApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::V1alphaGenerationApi;
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_generation_image_to_image**](V1alphaGenerationApi.md#v1alpha_generation_image_to_image) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alpha_generation_masking**](V1alphaGenerationApi.md#v1alpha_generation_masking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alpha_generation_text_to_image**](V1alphaGenerationApi.md#v1alpha_generation_text_to_image) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alpha_generation_image_to_image**
> v1alpha_generation_image_to_image(engine_id => $engine_id, accept => $accept, init_image => $init_image, options => $options, organization => $organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaGenerationApi;
my $api_instance = WWW::OpenAPIClient::V1alphaGenerationApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $engine_id = stable-diffusion-512-v2-0; # string |  
my $accept = application/json; # string |  
my $init_image = "/path/to/file"; # string | Initial image to use for the image-to-image generation
my $options = new WWW::OpenAPIClient.ImageToImageOptions(); # ImageToImageOptions | 
my $organization = org-123456; # string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

eval {
    $api_instance->v1alpha_generation_image_to_image(engine_id => $engine_id, accept => $accept, init_image => $init_image, options => $options, organization => $organization);
};
if ($@) {
    warn "Exception when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   | 
 **accept** | **string**|   | 
 **init_image** | **string****string**| Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | 
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_masking**
> v1alpha_generation_masking(engine_id => $engine_id, accept => $accept, init_image => $init_image, options => $options, organization => $organization, mask_image => $mask_image)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaGenerationApi;
my $api_instance = WWW::OpenAPIClient::V1alphaGenerationApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $engine_id = stable-diffusion-512-v2-0; # string |  
my $accept = application/json; # string |  
my $init_image = "/path/to/file"; # string | Initial image to use for the image-to-image generation
my $options = new WWW::OpenAPIClient.MaskingOptions(); # MaskingOptions | 
my $organization = org-123456; # string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
my $mask_image = "/path/to/file"; # string | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)

eval {
    $api_instance->v1alpha_generation_masking(engine_id => $engine_id, accept => $accept, init_image => $init_image, options => $options, organization => $organization, mask_image => $mask_image);
};
if ($@) {
    warn "Exception when calling V1alphaGenerationApi->v1alpha_generation_masking: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   | 
 **accept** | **string**|   | 
 **init_image** | **string****string**| Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md)|  | 
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **mask_image** | **string****string**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_text_to_image**
> v1alpha_generation_text_to_image(engine_id => $engine_id, accept => $accept, text_to_image_request_body => $text_to_image_request_body, organization => $organization)

text-to-image

Generate an image from text

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaGenerationApi;
my $api_instance = WWW::OpenAPIClient::V1alphaGenerationApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $engine_id = stable-diffusion-512-v2-0; # string |  
my $accept = application/json; # string |  
my $text_to_image_request_body = WWW::OpenAPIClient::Object::TextToImageRequestBody->new(); # TextToImageRequestBody | 
my $organization = org-123456; # string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

eval {
    $api_instance->v1alpha_generation_text_to_image(engine_id => $engine_id, accept => $accept, text_to_image_request_body => $text_to_image_request_body, organization => $organization);
};
if ($@) {
    warn "Exception when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   | 
 **accept** | **string**|   | 
 **text_to_image_request_body** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | 
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

