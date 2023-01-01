# TextPrompt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **string** |  | 
**Weight** | Pointer to **float32** | Weight of the prompt (use negative numbers for negative prompts) | [optional] 

## Methods

### NewTextPrompt

`func NewTextPrompt(text string, ) *TextPrompt`

NewTextPrompt instantiates a new TextPrompt object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTextPromptWithDefaults

`func NewTextPromptWithDefaults() *TextPrompt`

NewTextPromptWithDefaults instantiates a new TextPrompt object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetText

`func (o *TextPrompt) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *TextPrompt) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *TextPrompt) SetText(v string)`

SetText sets Text field to given value.


### GetWeight

`func (o *TextPrompt) GetWeight() float32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *TextPrompt) GetWeightOk() (*float32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *TextPrompt) SetWeight(v float32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *TextPrompt) HasWeight() bool`

HasWeight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


