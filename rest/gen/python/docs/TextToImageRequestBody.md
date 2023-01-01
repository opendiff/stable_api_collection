# TextToImageRequestBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text_prompts** | [**[TextPrompt]**](TextPrompt.md) |  | 
**cfg_scale** | **float** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional]  if omitted the server will use the default value of 7
**clip_guidance_preset** | **str** |  | [optional]  if omitted the server will use the default value of "NONE"
**height** | **int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional]  if omitted the server will use the default value of 512
**sampler** | **str** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**samples** | **int** | Number of images to generate | [optional]  if omitted the server will use the default value of 1
**seed** | **int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**steps** | **int** | Number of diffusion steps to run | [optional]  if omitted the server will use the default value of 50
**width** | **int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional]  if omitted the server will use the default value of 512
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


