# AccountResponseBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **String** | The user&#39;s email | 
**Id** | **String** | The user&#39;s ID | 
**Organizations** | [**OrganizationMembership[]**](OrganizationMembership.md) | The user&#39;s organizations | 
**ProfilePicture** | **String** | The user&#39;s profile picture | [optional] 

## Examples

- Prepare the resource
```powershell
$AccountResponseBody = Initialize-PSOpenAPIToolsAccountResponseBody  -Email example@stability.ai `
 -Id user-1234 `
 -Organizations [{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;},{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;},{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;}] `
 -ProfilePicture https://api.stability.ai/example.png
```

- Convert the resource to JSON
```powershell
$AccountResponseBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

