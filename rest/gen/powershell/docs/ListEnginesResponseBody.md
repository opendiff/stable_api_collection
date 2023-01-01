# ListEnginesResponseBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Engines** | [**Engine[]**](Engine.md) | The engines available to your user/organization | 

## Examples

- Prepare the resource
```powershell
$ListEnginesResponseBody = Initialize-PSOpenAPIToolsListEnginesResponseBody  -Engines [{&quot;description&quot;:&quot;Stability-AI Stable Diffusion v1.5&quot;,&quot;id&quot;:&quot;stable-diffusion-v1-5&quot;,&quot;name&quot;:&quot;Stable Diffusion v1.5&quot;,&quot;type&quot;:&quot;PICTURE&quot;},{&quot;description&quot;:&quot;Stability-AI Stable Diffusion v2.1&quot;,&quot;id&quot;:&quot;stable-diffusion-512-v2-1&quot;,&quot;name&quot;:&quot;Stable Diffusion v2.1&quot;,&quot;type&quot;:&quot;PICTURE&quot;},{&quot;description&quot;:&quot;Stability-AI Stable Diffusion 768 v2.1&quot;,&quot;id&quot;:&quot;stable-diffusion-768-v2-1&quot;,&quot;name&quot;:&quot;Stable Diffusion v2.1-768&quot;,&quot;type&quot;:&quot;PICTURE&quot;}]
```

- Convert the resource to JSON
```powershell
$ListEnginesResponseBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

