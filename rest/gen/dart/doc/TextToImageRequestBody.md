# openapi.model.TextToImageRequestBody

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | **num** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clipGuidancePreset** | **String** |  | [optional] [default to 'NONE']
**height** | **int** | Height of the image (note: `height * width` must be <= 1 Megapixel) | [optional] [default to 512]
**sampler** | **String** | Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. | [optional] 
**samples** | **int** | Number of images to generate | [optional] [default to 1]
**seed** | **int** | Random noise seed (omit this option or use `0` for a random seed) | [optional] 
**steps** | **int** | Number of diffusion steps to run | [optional] [default to 50]
**textPrompts** | [**List<TextPrompt>**](TextPrompt.md) |  | [default to const []]
**width** | **int** | Width of the image (note: `height * width` must be <= 1 Megapixel) | [optional] [default to 512]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


