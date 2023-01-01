# TextToImageRequestBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CfgScale** | **Decimal** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**ClipGuidancePreset** | **String** |  | [optional] [default to "NONE"]
**Height** | **Int32** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**Sampler** | **String** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**Samples** | **Int32** | Number of images to generate | [optional] [default to 1]
**Seed** | **Int32** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**Steps** | **Int32** | Number of diffusion steps to run | [optional] [default to 50]
**TextPrompts** | [**TextPrompt[]**](TextPrompt.md) |  | 
**Width** | **Int32** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

## Examples

- Prepare the resource
```powershell
$TextToImageRequestBody = Initialize-PSOpenAPIToolsTextToImageRequestBody  -CfgScale 7 `
 -ClipGuidancePreset FAST_BLUE `
 -Height 512 `
 -Sampler K_DPM_2_ANCESTRAL `
 -Samples 1 `
 -Seed 0 `
 -Steps 75 `
 -TextPrompts [{&quot;text&quot;:&quot;A lighthouse on a cliff&quot;,&quot;weight&quot;:1}] `
 -Width 512
```

- Convert the resource to JSON
```powershell
$TextToImageRequestBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

