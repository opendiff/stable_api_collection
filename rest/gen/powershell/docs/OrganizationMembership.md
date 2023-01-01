# OrganizationMembership
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**IsDefault** | **Boolean** |  | 
**Name** | **String** |  | 
**Role** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$OrganizationMembership = Initialize-PSOpenAPIToolsOrganizationMembership  -Id org-123456 `
 -IsDefault false `
 -Name My Organization `
 -Role MEMBER
```

- Convert the resource to JSON
```powershell
$OrganizationMembership | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

