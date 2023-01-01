# OpenapiClient::V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**v1alpha_engines_list_engines**](V1alphaEnginesApi.md#v1alpha_engines_list_engines) | **GET** /v1alpha/engines/list | list |


## v1alpha_engines_list_engines

> <ListEnginesResponseBody> v1alpha_engines_list_engines(opts)

list

List all engines available to your organization/user

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: api_key_header_Authorization
  config.api_key['api_key_header_Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['api_key_header_Authorization'] = 'Bearer'
end

api_instance = OpenapiClient::V1alphaEnginesApi.new
opts = {
  organization: 'org-123456' # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
}

begin
  # list
  result = api_instance.v1alpha_engines_list_engines(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaEnginesApi->v1alpha_engines_list_engines: #{e}"
end
```

#### Using the v1alpha_engines_list_engines_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListEnginesResponseBody>, Integer, Hash)> v1alpha_engines_list_engines_with_http_info(opts)

```ruby
begin
  # list
  data, status_code, headers = api_instance.v1alpha_engines_list_engines_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListEnginesResponseBody>
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaEnginesApi->v1alpha_engines_list_engines_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

