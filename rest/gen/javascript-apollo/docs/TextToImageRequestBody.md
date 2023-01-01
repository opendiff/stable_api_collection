# StabilityAiRestApi.TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | **Number** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clipGuidancePreset** | **String** |  | [optional] [default to &#39;NONE&#39;]
**height** | **Number** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**sampler** | **String** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**samples** | **Number** | Number of images to generate | [optional] [default to 1]
**seed** | **Number** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**steps** | **Number** | Number of diffusion steps to run | [optional] [default to 50]
**textPrompts** | [**[TextPrompt]**](TextPrompt.md) |  | 
**width** | **Number** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]



## Enum: ClipGuidancePresetEnum


* `FAST_BLUE` (value: `"FAST_BLUE"`)

* `FAST_GREEN` (value: `"FAST_GREEN"`)

* `NONE` (value: `"NONE"`)

* `SIMPLE` (value: `"SIMPLE"`)

* `SLOW` (value: `"SLOW"`)

* `SLOWER` (value: `"SLOWER"`)

* `SLOWEST` (value: `"SLOWEST"`)





## Enum: SamplerEnum


* `DDIM` (value: `"DDIM"`)

* `DDPM` (value: `"DDPM"`)

* `K_DPMPP_2M` (value: `"K_DPMPP_2M"`)

* `K_DPMPP_2S_ANCESTRAL` (value: `"K_DPMPP_2S_ANCESTRAL"`)

* `K_DPM_2` (value: `"K_DPM_2"`)

* `K_DPM_2_ANCESTRAL` (value: `"K_DPM_2_ANCESTRAL"`)

* `K_EULER` (value: `"K_EULER"`)

* `K_EULER_ANCESTRAL` (value: `"K_EULER_ANCESTRAL"`)

* `K_HEUN` (value: `"K_HEUN"`)

* `K_LMS` (value: `"K_LMS"`)




