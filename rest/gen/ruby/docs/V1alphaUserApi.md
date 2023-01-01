# OpenapiClient::V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**v1alpha_user_account**](V1alphaUserApi.md#v1alpha_user_account) | **GET** /v1alpha/user/account | account |
| [**v1alpha_user_balance**](V1alphaUserApi.md#v1alpha_user_balance) | **GET** /v1alpha/user/balance | balance |


## v1alpha_user_account

> <AccountResponseBody> v1alpha_user_account

account

Get information about the account associated with the provided API key

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

api_instance = OpenapiClient::V1alphaUserApi.new

begin
  # account
  result = api_instance.v1alpha_user_account
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaUserApi->v1alpha_user_account: #{e}"
end
```

#### Using the v1alpha_user_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AccountResponseBody>, Integer, Hash)> v1alpha_user_account_with_http_info

```ruby
begin
  # account
  data, status_code, headers = api_instance.v1alpha_user_account_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AccountResponseBody>
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaUserApi->v1alpha_user_account_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1alpha_user_balance

> <BalanceResponseBody> v1alpha_user_balance(opts)

balance

Get the credit balance of the account/organization associated with the API key

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

api_instance = OpenapiClient::V1alphaUserApi.new
opts = {
  organization: 'org-123456' # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
}

begin
  # balance
  result = api_instance.v1alpha_user_balance(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaUserApi->v1alpha_user_balance: #{e}"
end
```

#### Using the v1alpha_user_balance_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BalanceResponseBody>, Integer, Hash)> v1alpha_user_balance_with_http_info(opts)

```ruby
begin
  # balance
  data, status_code, headers = api_instance.v1alpha_user_balance_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BalanceResponseBody>
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaUserApi->v1alpha_user_balance_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

