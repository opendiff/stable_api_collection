# OpenapiClient::TextToImageRequestBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cfg_scale** | **Float** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional][default to 7] |
| **clip_guidance_preset** | **String** |  | [optional][default to &#39;NONE&#39;] |
| **height** | **Integer** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional][default to 512] |
| **sampler** | **String** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] |
| **samples** | **Integer** | Number of images to generate | [optional][default to 1] |
| **seed** | **Integer** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] |
| **steps** | **Integer** | Number of diffusion steps to run | [optional][default to 50] |
| **text_prompts** | [**Array&lt;TextPrompt&gt;**](TextPrompt.md) |  |  |
| **width** | **Integer** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional][default to 512] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TextToImageRequestBody.new(
  cfg_scale: 7,
  clip_guidance_preset: FAST_BLUE,
  height: 512,
  sampler: K_DPM_2_ANCESTRAL,
  samples: 1,
  seed: 0,
  steps: 75,
  text_prompts: [{&quot;text&quot;:&quot;A lighthouse on a cliff&quot;,&quot;weight&quot;:1}],
  width: 512
)
```

