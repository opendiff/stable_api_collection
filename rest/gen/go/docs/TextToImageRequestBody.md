# TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CfgScale** | Pointer to **float32** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**ClipGuidancePreset** | Pointer to **string** |  | [optional] [default to "NONE"]
**Height** | Pointer to **int32** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**Sampler** | Pointer to **string** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**Samples** | Pointer to **int32** | Number of images to generate | [optional] [default to 1]
**Seed** | Pointer to **int32** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**Steps** | Pointer to **int32** | Number of diffusion steps to run | [optional] [default to 50]
**TextPrompts** | [**[]TextPrompt**](TextPrompt.md) |  | 
**Width** | Pointer to **int32** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

## Methods

### NewTextToImageRequestBody

`func NewTextToImageRequestBody(textPrompts []TextPrompt, ) *TextToImageRequestBody`

NewTextToImageRequestBody instantiates a new TextToImageRequestBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTextToImageRequestBodyWithDefaults

`func NewTextToImageRequestBodyWithDefaults() *TextToImageRequestBody`

NewTextToImageRequestBodyWithDefaults instantiates a new TextToImageRequestBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCfgScale

`func (o *TextToImageRequestBody) GetCfgScale() float32`

GetCfgScale returns the CfgScale field if non-nil, zero value otherwise.

### GetCfgScaleOk

`func (o *TextToImageRequestBody) GetCfgScaleOk() (*float32, bool)`

GetCfgScaleOk returns a tuple with the CfgScale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCfgScale

`func (o *TextToImageRequestBody) SetCfgScale(v float32)`

SetCfgScale sets CfgScale field to given value.

### HasCfgScale

`func (o *TextToImageRequestBody) HasCfgScale() bool`

HasCfgScale returns a boolean if a field has been set.

### GetClipGuidancePreset

`func (o *TextToImageRequestBody) GetClipGuidancePreset() string`

GetClipGuidancePreset returns the ClipGuidancePreset field if non-nil, zero value otherwise.

### GetClipGuidancePresetOk

`func (o *TextToImageRequestBody) GetClipGuidancePresetOk() (*string, bool)`

GetClipGuidancePresetOk returns a tuple with the ClipGuidancePreset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClipGuidancePreset

`func (o *TextToImageRequestBody) SetClipGuidancePreset(v string)`

SetClipGuidancePreset sets ClipGuidancePreset field to given value.

### HasClipGuidancePreset

`func (o *TextToImageRequestBody) HasClipGuidancePreset() bool`

HasClipGuidancePreset returns a boolean if a field has been set.

### GetHeight

`func (o *TextToImageRequestBody) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *TextToImageRequestBody) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *TextToImageRequestBody) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *TextToImageRequestBody) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### GetSampler

`func (o *TextToImageRequestBody) GetSampler() string`

GetSampler returns the Sampler field if non-nil, zero value otherwise.

### GetSamplerOk

`func (o *TextToImageRequestBody) GetSamplerOk() (*string, bool)`

GetSamplerOk returns a tuple with the Sampler field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSampler

`func (o *TextToImageRequestBody) SetSampler(v string)`

SetSampler sets Sampler field to given value.

### HasSampler

`func (o *TextToImageRequestBody) HasSampler() bool`

HasSampler returns a boolean if a field has been set.

### GetSamples

`func (o *TextToImageRequestBody) GetSamples() int32`

GetSamples returns the Samples field if non-nil, zero value otherwise.

### GetSamplesOk

`func (o *TextToImageRequestBody) GetSamplesOk() (*int32, bool)`

GetSamplesOk returns a tuple with the Samples field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSamples

`func (o *TextToImageRequestBody) SetSamples(v int32)`

SetSamples sets Samples field to given value.

### HasSamples

`func (o *TextToImageRequestBody) HasSamples() bool`

HasSamples returns a boolean if a field has been set.

### GetSeed

`func (o *TextToImageRequestBody) GetSeed() int32`

GetSeed returns the Seed field if non-nil, zero value otherwise.

### GetSeedOk

`func (o *TextToImageRequestBody) GetSeedOk() (*int32, bool)`

GetSeedOk returns a tuple with the Seed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeed

`func (o *TextToImageRequestBody) SetSeed(v int32)`

SetSeed sets Seed field to given value.

### HasSeed

`func (o *TextToImageRequestBody) HasSeed() bool`

HasSeed returns a boolean if a field has been set.

### GetSteps

`func (o *TextToImageRequestBody) GetSteps() int32`

GetSteps returns the Steps field if non-nil, zero value otherwise.

### GetStepsOk

`func (o *TextToImageRequestBody) GetStepsOk() (*int32, bool)`

GetStepsOk returns a tuple with the Steps field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSteps

`func (o *TextToImageRequestBody) SetSteps(v int32)`

SetSteps sets Steps field to given value.

### HasSteps

`func (o *TextToImageRequestBody) HasSteps() bool`

HasSteps returns a boolean if a field has been set.

### GetTextPrompts

`func (o *TextToImageRequestBody) GetTextPrompts() []TextPrompt`

GetTextPrompts returns the TextPrompts field if non-nil, zero value otherwise.

### GetTextPromptsOk

`func (o *TextToImageRequestBody) GetTextPromptsOk() (*[]TextPrompt, bool)`

GetTextPromptsOk returns a tuple with the TextPrompts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextPrompts

`func (o *TextToImageRequestBody) SetTextPrompts(v []TextPrompt)`

SetTextPrompts sets TextPrompts field to given value.


### GetWidth

`func (o *TextToImageRequestBody) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *TextToImageRequestBody) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *TextToImageRequestBody) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *TextToImageRequestBody) HasWidth() bool`

HasWidth returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


