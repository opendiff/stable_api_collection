/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * OpenAPI spec version: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPITextToImageRequestBody.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& Value)
{
	switch (Value)
	{
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::FastBlue:
		return TEXT("FAST_BLUE");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::FastGreen:
		return TEXT("FAST_GREEN");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::None:
		return TEXT("NONE");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Simple:
		return TEXT("SIMPLE");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slow:
		return TEXT("SLOW");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slower:
		return TEXT("SLOWER");
	case OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slowest:
		return TEXT("SLOWEST");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPITextToImageRequestBody::ClipGuidancePresetEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPITextToImageRequestBody::EnumToString(const OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& Value)
{
	static TMap<FString, OpenAPITextToImageRequestBody::ClipGuidancePresetEnum> StringToEnum = { 
		{ TEXT("FAST_BLUE"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::FastBlue },
		{ TEXT("FAST_GREEN"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::FastGreen },
		{ TEXT("NONE"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::None },
		{ TEXT("SIMPLE"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Simple },
		{ TEXT("SLOW"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slow },
		{ TEXT("SLOWER"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slower },
		{ TEXT("SLOWEST"), OpenAPITextToImageRequestBody::ClipGuidancePresetEnum::Slowest }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPITextToImageRequestBody::EnumFromString(const FString& EnumAsString, OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPITextToImageRequestBody::ClipGuidancePresetEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPITextToImageRequestBody::SamplerEnum& Value)
{
	switch (Value)
	{
	case OpenAPITextToImageRequestBody::SamplerEnum::Ddim:
		return TEXT("DDIM");
	case OpenAPITextToImageRequestBody::SamplerEnum::Ddpm:
		return TEXT("DDPM");
	case OpenAPITextToImageRequestBody::SamplerEnum::KDPMPP2M:
		return TEXT("K_DPMPP_2M");
	case OpenAPITextToImageRequestBody::SamplerEnum::KDPMPP2SANCESTRAL:
		return TEXT("K_DPMPP_2S_ANCESTRAL");
	case OpenAPITextToImageRequestBody::SamplerEnum::KDPM2:
		return TEXT("K_DPM_2");
	case OpenAPITextToImageRequestBody::SamplerEnum::KDPM2ANCESTRAL:
		return TEXT("K_DPM_2_ANCESTRAL");
	case OpenAPITextToImageRequestBody::SamplerEnum::KEuler:
		return TEXT("K_EULER");
	case OpenAPITextToImageRequestBody::SamplerEnum::KEulerAncestral:
		return TEXT("K_EULER_ANCESTRAL");
	case OpenAPITextToImageRequestBody::SamplerEnum::KHeun:
		return TEXT("K_HEUN");
	case OpenAPITextToImageRequestBody::SamplerEnum::KLms:
		return TEXT("K_LMS");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPITextToImageRequestBody::SamplerEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPITextToImageRequestBody::EnumToString(const OpenAPITextToImageRequestBody::SamplerEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPITextToImageRequestBody::SamplerEnum& Value)
{
	static TMap<FString, OpenAPITextToImageRequestBody::SamplerEnum> StringToEnum = { 
		{ TEXT("DDIM"), OpenAPITextToImageRequestBody::SamplerEnum::Ddim },
		{ TEXT("DDPM"), OpenAPITextToImageRequestBody::SamplerEnum::Ddpm },
		{ TEXT("K_DPMPP_2M"), OpenAPITextToImageRequestBody::SamplerEnum::KDPMPP2M },
		{ TEXT("K_DPMPP_2S_ANCESTRAL"), OpenAPITextToImageRequestBody::SamplerEnum::KDPMPP2SANCESTRAL },
		{ TEXT("K_DPM_2"), OpenAPITextToImageRequestBody::SamplerEnum::KDPM2 },
		{ TEXT("K_DPM_2_ANCESTRAL"), OpenAPITextToImageRequestBody::SamplerEnum::KDPM2ANCESTRAL },
		{ TEXT("K_EULER"), OpenAPITextToImageRequestBody::SamplerEnum::KEuler },
		{ TEXT("K_EULER_ANCESTRAL"), OpenAPITextToImageRequestBody::SamplerEnum::KEulerAncestral },
		{ TEXT("K_HEUN"), OpenAPITextToImageRequestBody::SamplerEnum::KHeun },
		{ TEXT("K_LMS"), OpenAPITextToImageRequestBody::SamplerEnum::KLms }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPITextToImageRequestBody::EnumFromString(const FString& EnumAsString, OpenAPITextToImageRequestBody::SamplerEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline FStringFormatArg ToStringFormatArg(const OpenAPITextToImageRequestBody::SamplerEnum& Value)
{
	return FStringFormatArg(ToString(Value));
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPITextToImageRequestBody::SamplerEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPITextToImageRequestBody::SamplerEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPITextToImageRequestBody::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (CfgScale.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cfg_scale")); WriteJsonValue(Writer, CfgScale.GetValue());
	}
	if (ClipGuidancePreset.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("clip_guidance_preset")); WriteJsonValue(Writer, ClipGuidancePreset.GetValue());
	}
	if (Height.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("height")); WriteJsonValue(Writer, Height.GetValue());
	}
	if (Sampler.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("sampler")); WriteJsonValue(Writer, Sampler.GetValue());
	}
	if (Samples.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("samples")); WriteJsonValue(Writer, Samples.GetValue());
	}
	if (Seed.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("seed")); WriteJsonValue(Writer, Seed.GetValue());
	}
	if (Steps.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("steps")); WriteJsonValue(Writer, Steps.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("text_prompts")); WriteJsonValue(Writer, TextPrompts);
	if (Width.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("width")); WriteJsonValue(Writer, Width.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPITextToImageRequestBody::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cfg_scale"), CfgScale);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("clip_guidance_preset"), ClipGuidancePreset);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("height"), Height);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("sampler"), Sampler);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("samples"), Samples);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("seed"), Seed);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("steps"), Steps);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text_prompts"), TextPrompts);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("width"), Width);

	return ParseSuccess;
}

}
