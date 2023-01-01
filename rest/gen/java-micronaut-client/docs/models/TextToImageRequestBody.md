

# TextToImageRequestBody

The class is defined in **[TextToImageRequestBody.java](../../src/main/java/org/openapitools/model/TextToImageRequestBody.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | `BigDecimal` | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) |  [optional property]
**clipGuidancePreset** | [**ClipGuidancePresetEnum**](#ClipGuidancePresetEnum) |  |  [optional property]
**height** | `Integer` | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional property]
**sampler** | [**SamplerEnum**](#SamplerEnum) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. |  [optional property]
**samples** | `Integer` | Number of images to generate |  [optional property]
**seed** | `Integer` | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) |  [optional property]
**steps** | `Integer` | Number of diffusion steps to run |  [optional property]
**textPrompts** | [`List&lt;TextPrompt&gt;`](TextPrompt.md) |  | 
**width** | `Integer` | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional property]


## ClipGuidancePresetEnum

Name | Value
---- | -----
FAST_BLUE | `"FAST_BLUE"`
FAST_GREEN | `"FAST_GREEN"`
NONE | `"NONE"`
SIMPLE | `"SIMPLE"`
SLOW | `"SLOW"`
SLOWER | `"SLOWER"`
SLOWEST | `"SLOWEST"`


## SamplerEnum

Name | Value
---- | -----
DDIM | `"DDIM"`
DDPM | `"DDPM"`
K_DPMPP_2M | `"K_DPMPP_2M"`
K_DPMPP_2S_ANCESTRAL | `"K_DPMPP_2S_ANCESTRAL"`
K_DPM_2 | `"K_DPM_2"`
K_DPM_2_ANCESTRAL | `"K_DPM_2_ANCESTRAL"`
K_EULER | `"K_EULER"`
K_EULER_ANCESTRAL | `"K_EULER_ANCESTRAL"`
K_HEUN | `"K_HEUN"`
K_LMS | `"K_LMS"`







