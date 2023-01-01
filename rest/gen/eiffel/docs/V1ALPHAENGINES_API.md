# V1ALPHAENGINES_API

All URIs are relative to *https://api.stability.ai*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_engines_list_engines**](V1ALPHAENGINES_API.md#v1alpha_engines_list_engines) | **Get** /v1alpha/engines/list | list


# **v1alpha_engines_list_engines**
> v1alpha_engines_list_engines (organization:  detachable STRING_32 ): detachable LIST_ENGINES_RESPONSE_BODY


list

List all engines available to your organization/user


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

[**LIST_ENGINES_RESPONSE_BODY**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

