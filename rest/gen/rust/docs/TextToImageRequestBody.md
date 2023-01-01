# TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfg_scale** | Option<**f32**> | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional][default to 7]
**clip_guidance_preset** | Option<**String**> |  | [optional][default to ClipGuidancePreset_NONE]
**height** | Option<**i32**> | Height of the image (note: `height * width` must be <= 1 Megapixel) | [optional][default to 512]
**sampler** | Option<**String**> | Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. | [optional]
**samples** | Option<**i32**> | Number of images to generate | [optional][default to 1]
**seed** | Option<**i32**> | Random noise seed (omit this option or use `0` for a random seed) | [optional]
**steps** | Option<**i32**> | Number of diffusion steps to run | [optional][default to 50]
**text_prompts** | [**Vec<crate::models::TextPrompt>**](TextPrompt.md) |  | 
**width** | Option<**i32**> | Width of the image (note: `height * width` must be <= 1 Megapixel) | [optional][default to 512]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


