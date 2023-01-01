

# TextToImageRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfgScale** | **BigDecimal** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) |  [optional] |
|**clipGuidancePreset** | [**ClipGuidancePresetEnum**](#ClipGuidancePresetEnum) |  |  [optional] |
|**height** | **Integer** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional] |
|**sampler** | [**SamplerEnum**](#SamplerEnum) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. |  [optional] |
|**samples** | **Integer** | Number of images to generate |  [optional] |
|**seed** | **Integer** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) |  [optional] |
|**steps** | **Integer** | Number of diffusion steps to run |  [optional] |
|**textPrompts** | [**List&lt;TextPrompt&gt;**](TextPrompt.md) |  |  |
|**width** | **Integer** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional] |



## Enum: ClipGuidancePresetEnum

| Name | Value |
|---- | -----|
| FAST_BLUE | &quot;FAST_BLUE&quot; |
| FAST_GREEN | &quot;FAST_GREEN&quot; |
| NONE | &quot;NONE&quot; |
| SIMPLE | &quot;SIMPLE&quot; |
| SLOW | &quot;SLOW&quot; |
| SLOWER | &quot;SLOWER&quot; |
| SLOWEST | &quot;SLOWEST&quot; |



## Enum: SamplerEnum

| Name | Value |
|---- | -----|
| DDIM | &quot;DDIM&quot; |
| DDPM | &quot;DDPM&quot; |
| K_DPMPP_2M | &quot;K_DPMPP_2M&quot; |
| K_DPMPP_2S_ANCESTRAL | &quot;K_DPMPP_2S_ANCESTRAL&quot; |
| K_DPM_2 | &quot;K_DPM_2&quot; |
| K_DPM_2_ANCESTRAL | &quot;K_DPM_2_ANCESTRAL&quot; |
| K_EULER | &quot;K_EULER&quot; |
| K_EULER_ANCESTRAL | &quot;K_EULER_ANCESTRAL&quot; |
| K_HEUN | &quot;K_HEUN&quot; |
| K_LMS | &quot;K_LMS&quot; |



