# .V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list


# **v1alphaEnginesListEngines**
> ListEnginesResponseBody v1alphaEnginesListEngines()

List all engines available to your organization/user

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .V1alphaEnginesApi(configuration);

let body:.V1alphaEnginesApiV1alphaEnginesListEnginesRequest = {
  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
  organization: "org-123456",
};

apiInstance.v1alphaEnginesListEngines(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**string**] | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | (optional) defaults to undefined


### Return type

**ListEnginesResponseBody**

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


