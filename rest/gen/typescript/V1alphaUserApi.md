# .V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


# **v1alphaUserAccount**
> AccountResponseBody v1alphaUserAccount()

Get information about the account associated with the provided API key

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaUserApi(configuration);

let body:any = {};

apiInstance.v1alphaUserAccount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AccountResponseBody**

### Authorization

[api_key_header_Authorization](README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **v1alphaUserBalance**
> BalanceResponseBody v1alphaUserBalance()

Get the credit balance of the account/organization associated with the API key

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaUserApi(configuration);

let body:.V1alphaUserApiV1alphaUserBalanceRequest = {
  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  organization: "org-123456",
};

apiInstance.v1alphaUserBalance(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**string**] | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | (optional) defaults to undefined


### Return type

**BalanceResponseBody**

### Authorization

[api_key_header_Authorization](README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


