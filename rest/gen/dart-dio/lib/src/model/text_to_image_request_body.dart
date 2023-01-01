//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/text_prompt.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'text_to_image_request_body.g.dart';

/// TextToImageRequestBody
///
/// Properties:
/// * [cfgScale] - How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
/// * [clipGuidancePreset] 
/// * [height] - Height of the image (note: `height * width` must be <= 1 Megapixel)
/// * [sampler] - Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
/// * [samples] - Number of images to generate
/// * [seed] - Random noise seed (omit this option or use `0` for a random seed)
/// * [steps] - Number of diffusion steps to run
/// * [textPrompts] 
/// * [width] - Width of the image (note: `height * width` must be <= 1 Megapixel)
abstract class TextToImageRequestBody implements Built<TextToImageRequestBody, TextToImageRequestBodyBuilder> {
    /// How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
    @BuiltValueField(wireName: r'cfg_scale')
    num? get cfgScale;

    @BuiltValueField(wireName: r'clip_guidance_preset')
    TextToImageRequestBodyClipGuidancePresetEnum? get clipGuidancePreset;
    // enum clipGuidancePresetEnum {  FAST_BLUE,  FAST_GREEN,  NONE,  SIMPLE,  SLOW,  SLOWER,  SLOWEST,  };

    /// Height of the image (note: `height * width` must be <= 1 Megapixel)
    @BuiltValueField(wireName: r'height')
    int? get height;

    /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
    @BuiltValueField(wireName: r'sampler')
    TextToImageRequestBodySamplerEnum? get sampler;
    // enum samplerEnum {  DDIM,  DDPM,  K_DPMPP_2M,  K_DPMPP_2S_ANCESTRAL,  K_DPM_2,  K_DPM_2_ANCESTRAL,  K_EULER,  K_EULER_ANCESTRAL,  K_HEUN,  K_LMS,  };

    /// Number of images to generate
    @BuiltValueField(wireName: r'samples')
    int? get samples;

    /// Random noise seed (omit this option or use `0` for a random seed)
    @BuiltValueField(wireName: r'seed')
    int? get seed;

    /// Number of diffusion steps to run
    @BuiltValueField(wireName: r'steps')
    int? get steps;

    @BuiltValueField(wireName: r'text_prompts')
    BuiltList<TextPrompt> get textPrompts;

    /// Width of the image (note: `height * width` must be <= 1 Megapixel)
    @BuiltValueField(wireName: r'width')
    int? get width;

    TextToImageRequestBody._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(TextToImageRequestBodyBuilder b) => b
        ..cfgScale = 7
        ..clipGuidancePreset = const TextToImageRequestBodyClipGuidancePresetEnum._('NONE')
        ..height = 512
        ..samples = 1
        ..steps = 50
        ..width = 512;

    factory TextToImageRequestBody([void updates(TextToImageRequestBodyBuilder b)]) = _$TextToImageRequestBody;

    @BuiltValueSerializer(custom: true)
    static Serializer<TextToImageRequestBody> get serializer => _$TextToImageRequestBodySerializer();
}

class _$TextToImageRequestBodySerializer implements StructuredSerializer<TextToImageRequestBody> {
    @override
    final Iterable<Type> types = const [TextToImageRequestBody, _$TextToImageRequestBody];

    @override
    final String wireName = r'TextToImageRequestBody';

    @override
    Iterable<Object?> serialize(Serializers serializers, TextToImageRequestBody object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.cfgScale != null) {
            result
                ..add(r'cfg_scale')
                ..add(serializers.serialize(object.cfgScale,
                    specifiedType: const FullType(num)));
        }
        if (object.clipGuidancePreset != null) {
            result
                ..add(r'clip_guidance_preset')
                ..add(serializers.serialize(object.clipGuidancePreset,
                    specifiedType: const FullType(TextToImageRequestBodyClipGuidancePresetEnum)));
        }
        if (object.height != null) {
            result
                ..add(r'height')
                ..add(serializers.serialize(object.height,
                    specifiedType: const FullType(int)));
        }
        if (object.sampler != null) {
            result
                ..add(r'sampler')
                ..add(serializers.serialize(object.sampler,
                    specifiedType: const FullType(TextToImageRequestBodySamplerEnum)));
        }
        if (object.samples != null) {
            result
                ..add(r'samples')
                ..add(serializers.serialize(object.samples,
                    specifiedType: const FullType(int)));
        }
        if (object.seed != null) {
            result
                ..add(r'seed')
                ..add(serializers.serialize(object.seed,
                    specifiedType: const FullType(int)));
        }
        if (object.steps != null) {
            result
                ..add(r'steps')
                ..add(serializers.serialize(object.steps,
                    specifiedType: const FullType(int)));
        }
        result
            ..add(r'text_prompts')
            ..add(serializers.serialize(object.textPrompts,
                specifiedType: const FullType(BuiltList, [FullType(TextPrompt)])));
        if (object.width != null) {
            result
                ..add(r'width')
                ..add(serializers.serialize(object.width,
                    specifiedType: const FullType(int)));
        }
        return result;
    }

    @override
    TextToImageRequestBody deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = TextToImageRequestBodyBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'cfg_scale':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(num)) as num;
                    result.cfgScale = valueDes;
                    break;
                case r'clip_guidance_preset':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(TextToImageRequestBodyClipGuidancePresetEnum)) as TextToImageRequestBodyClipGuidancePresetEnum;
                    result.clipGuidancePreset = valueDes;
                    break;
                case r'height':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    result.height = valueDes;
                    break;
                case r'sampler':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(TextToImageRequestBodySamplerEnum)) as TextToImageRequestBodySamplerEnum;
                    result.sampler = valueDes;
                    break;
                case r'samples':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    result.samples = valueDes;
                    break;
                case r'seed':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    result.seed = valueDes;
                    break;
                case r'steps':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    result.steps = valueDes;
                    break;
                case r'text_prompts':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(TextPrompt)])) as BuiltList<TextPrompt>;
                    result.textPrompts.replace(valueDes);
                    break;
                case r'width':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    result.width = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

class TextToImageRequestBodyClipGuidancePresetEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'FAST_BLUE')
  static const TextToImageRequestBodyClipGuidancePresetEnum FAST_BLUE = _$textToImageRequestBodyClipGuidancePresetEnum_FAST_BLUE;
  @BuiltValueEnumConst(wireName: r'FAST_GREEN')
  static const TextToImageRequestBodyClipGuidancePresetEnum FAST_GREEN = _$textToImageRequestBodyClipGuidancePresetEnum_FAST_GREEN;
  @BuiltValueEnumConst(wireName: r'NONE')
  static const TextToImageRequestBodyClipGuidancePresetEnum NONE = _$textToImageRequestBodyClipGuidancePresetEnum_NONE;
  @BuiltValueEnumConst(wireName: r'SIMPLE')
  static const TextToImageRequestBodyClipGuidancePresetEnum SIMPLE = _$textToImageRequestBodyClipGuidancePresetEnum_SIMPLE;
  @BuiltValueEnumConst(wireName: r'SLOW')
  static const TextToImageRequestBodyClipGuidancePresetEnum SLOW = _$textToImageRequestBodyClipGuidancePresetEnum_SLOW;
  @BuiltValueEnumConst(wireName: r'SLOWER')
  static const TextToImageRequestBodyClipGuidancePresetEnum SLOWER = _$textToImageRequestBodyClipGuidancePresetEnum_SLOWER;
  @BuiltValueEnumConst(wireName: r'SLOWEST')
  static const TextToImageRequestBodyClipGuidancePresetEnum SLOWEST = _$textToImageRequestBodyClipGuidancePresetEnum_SLOWEST;

  static Serializer<TextToImageRequestBodyClipGuidancePresetEnum> get serializer => _$textToImageRequestBodyClipGuidancePresetEnumSerializer;

  const TextToImageRequestBodyClipGuidancePresetEnum._(String name): super(name);

  static BuiltSet<TextToImageRequestBodyClipGuidancePresetEnum> get values => _$textToImageRequestBodyClipGuidancePresetEnumValues;
  static TextToImageRequestBodyClipGuidancePresetEnum valueOf(String name) => _$textToImageRequestBodyClipGuidancePresetEnumValueOf(name);
}

class TextToImageRequestBodySamplerEnum extends EnumClass {

  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'DDIM')
  static const TextToImageRequestBodySamplerEnum DDIM = _$textToImageRequestBodySamplerEnum_DDIM;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'DDPM')
  static const TextToImageRequestBodySamplerEnum DDPM = _$textToImageRequestBodySamplerEnum_DDPM;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_DPMPP_2M')
  static const TextToImageRequestBodySamplerEnum kDPMPP2M = _$textToImageRequestBodySamplerEnum_kDPMPP2M;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_DPMPP_2S_ANCESTRAL')
  static const TextToImageRequestBodySamplerEnum kDPMPP2SANCESTRAL = _$textToImageRequestBodySamplerEnum_kDPMPP2SANCESTRAL;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_DPM_2')
  static const TextToImageRequestBodySamplerEnum kDPM2 = _$textToImageRequestBodySamplerEnum_kDPM2;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_DPM_2_ANCESTRAL')
  static const TextToImageRequestBodySamplerEnum kDPM2ANCESTRAL = _$textToImageRequestBodySamplerEnum_kDPM2ANCESTRAL;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_EULER')
  static const TextToImageRequestBodySamplerEnum K_EULER = _$textToImageRequestBodySamplerEnum_K_EULER;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_EULER_ANCESTRAL')
  static const TextToImageRequestBodySamplerEnum K_EULER_ANCESTRAL = _$textToImageRequestBodySamplerEnum_K_EULER_ANCESTRAL;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_HEUN')
  static const TextToImageRequestBodySamplerEnum K_HEUN = _$textToImageRequestBodySamplerEnum_K_HEUN;
  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  @BuiltValueEnumConst(wireName: r'K_LMS')
  static const TextToImageRequestBodySamplerEnum K_LMS = _$textToImageRequestBodySamplerEnum_K_LMS;

  static Serializer<TextToImageRequestBodySamplerEnum> get serializer => _$textToImageRequestBodySamplerEnumSerializer;

  const TextToImageRequestBodySamplerEnum._(String name): super(name);

  static BuiltSet<TextToImageRequestBodySamplerEnum> get values => _$textToImageRequestBodySamplerEnumValues;
  static TextToImageRequestBodySamplerEnum valueOf(String name) => _$textToImageRequestBodySamplerEnumValueOf(name);
}

