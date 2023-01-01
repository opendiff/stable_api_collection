# # TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfg_scale** | **float** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clip_guidance_preset** | **string** |  | [optional] [default to 'NONE']
**height** | **int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**sampler** | **string** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional]
**samples** | **int** | Number of images to generate | [optional] [default to 1]
**seed** | **int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional]
**steps** | **int** | Number of diffusion steps to run | [optional] [default to 50]
**text_prompts** | [**\OpenAPI\Client\Model\TextPrompt[]**](TextPrompt.md) |  |
**width** | **int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
