//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TextToImageRequestBody {
  /// Returns a new [TextToImageRequestBody] instance.
  TextToImageRequestBody({
    this.cfgScale = 7,
    this.clipGuidancePreset = const TextToImageRequestBodyClipGuidancePresetEnum._('NONE'),
    this.height = 512,
    this.sampler,
    this.samples = 1,
    this.seed,
    this.steps = 50,
    this.textPrompts = const [],
    this.width = 512,
  });

  /// How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
  ///
  /// Minimum value: 0
  /// Maximum value: 35
  num cfgScale;

  TextToImageRequestBodyClipGuidancePresetEnum clipGuidancePreset;

  /// Height of the image (note: `height * width` must be <= 1 Megapixel)
  ///
  /// Minimum value: 512
  /// Maximum value: 2048
  int height;

  /// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
  TextToImageRequestBodySamplerEnum? sampler;

  /// Number of images to generate
  ///
  /// Minimum value: 1
  /// Maximum value: 10
  int samples;

  /// Random noise seed (omit this option or use `0` for a random seed)
  ///
  /// Minimum value: 0
  /// Maximum value: 2147483647
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? seed;

  /// Number of diffusion steps to run
  ///
  /// Minimum value: 10
  /// Maximum value: 150
  int steps;

  List<TextPrompt> textPrompts;

  /// Width of the image (note: `height * width` must be <= 1 Megapixel)
  ///
  /// Minimum value: 512
  /// Maximum value: 2048
  int width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TextToImageRequestBody &&
     other.cfgScale == cfgScale &&
     other.clipGuidancePreset == clipGuidancePreset &&
     other.height == height &&
     other.sampler == sampler &&
     other.samples == samples &&
     other.seed == seed &&
     other.steps == steps &&
     other.textPrompts == textPrompts &&
     other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cfgScale.hashCode) +
    (clipGuidancePreset.hashCode) +
    (height.hashCode) +
    (sampler == null ? 0 : sampler!.hashCode) +
    (samples.hashCode) +
    (seed == null ? 0 : seed!.hashCode) +
    (steps.hashCode) +
    (textPrompts.hashCode) +
    (width.hashCode);

  @override
  String toString() => 'TextToImageRequestBody[cfgScale=$cfgScale, clipGuidancePreset=$clipGuidancePreset, height=$height, sampler=$sampler, samples=$samples, seed=$seed, steps=$steps, textPrompts=$textPrompts, width=$width]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'cfg_scale'] = cfgScale;
      _json[r'clip_guidance_preset'] = clipGuidancePreset;
      _json[r'height'] = height;
    if (sampler != null) {
      _json[r'sampler'] = sampler;
    } else {
      _json[r'sampler'] = null;
    }
      _json[r'samples'] = samples;
    if (seed != null) {
      _json[r'seed'] = seed;
    } else {
      _json[r'seed'] = null;
    }
      _json[r'steps'] = steps;
      _json[r'text_prompts'] = textPrompts;
      _json[r'width'] = width;
    return _json;
  }

  /// Returns a new [TextToImageRequestBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TextToImageRequestBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TextToImageRequestBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TextToImageRequestBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TextToImageRequestBody(
        cfgScale: json[r'cfg_scale'] == null
            ? 7
            : num.parse(json[r'cfg_scale'].toString()),
        clipGuidancePreset: TextToImageRequestBodyClipGuidancePresetEnum.fromJson(json[r'clip_guidance_preset']) ?? 'NONE',
        height: mapValueOfType<int>(json, r'height') ?? 512,
        sampler: TextToImageRequestBodySamplerEnum.fromJson(json[r'sampler']),
        samples: mapValueOfType<int>(json, r'samples') ?? 1,
        seed: mapValueOfType<int>(json, r'seed'),
        steps: mapValueOfType<int>(json, r'steps') ?? 50,
        textPrompts: TextPrompt.listFromJson(json[r'text_prompts'])!,
        width: mapValueOfType<int>(json, r'width') ?? 512,
      );
    }
    return null;
  }

  static List<TextToImageRequestBody>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TextToImageRequestBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TextToImageRequestBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TextToImageRequestBody> mapFromJson(dynamic json) {
    final map = <String, TextToImageRequestBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TextToImageRequestBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TextToImageRequestBody-objects as value to a dart map
  static Map<String, List<TextToImageRequestBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TextToImageRequestBody>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TextToImageRequestBody.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'text_prompts',
  };
}


class TextToImageRequestBodyClipGuidancePresetEnum {
  /// Instantiate a new enum with the provided [value].
  const TextToImageRequestBodyClipGuidancePresetEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FAST_BLUE = TextToImageRequestBodyClipGuidancePresetEnum._(r'FAST_BLUE');
  static const FAST_GREEN = TextToImageRequestBodyClipGuidancePresetEnum._(r'FAST_GREEN');
  static const NONE = TextToImageRequestBodyClipGuidancePresetEnum._(r'NONE');
  static const SIMPLE = TextToImageRequestBodyClipGuidancePresetEnum._(r'SIMPLE');
  static const SLOW = TextToImageRequestBodyClipGuidancePresetEnum._(r'SLOW');
  static const SLOWER = TextToImageRequestBodyClipGuidancePresetEnum._(r'SLOWER');
  static const SLOWEST = TextToImageRequestBodyClipGuidancePresetEnum._(r'SLOWEST');

  /// List of all possible values in this [enum][TextToImageRequestBodyClipGuidancePresetEnum].
  static const values = <TextToImageRequestBodyClipGuidancePresetEnum>[
    FAST_BLUE,
    FAST_GREEN,
    NONE,
    SIMPLE,
    SLOW,
    SLOWER,
    SLOWEST,
  ];

  static TextToImageRequestBodyClipGuidancePresetEnum? fromJson(dynamic value) => TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer().decode(value);

  static List<TextToImageRequestBodyClipGuidancePresetEnum>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TextToImageRequestBodyClipGuidancePresetEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TextToImageRequestBodyClipGuidancePresetEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TextToImageRequestBodyClipGuidancePresetEnum] to String,
/// and [decode] dynamic data back to [TextToImageRequestBodyClipGuidancePresetEnum].
class TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer {
  factory TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer() => _instance ??= const TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer._();

  const TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer._();

  String encode(TextToImageRequestBodyClipGuidancePresetEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TextToImageRequestBodyClipGuidancePresetEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TextToImageRequestBodyClipGuidancePresetEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data.toString()) {
        case r'FAST_BLUE': return TextToImageRequestBodyClipGuidancePresetEnum.FAST_BLUE;
        case r'FAST_GREEN': return TextToImageRequestBodyClipGuidancePresetEnum.FAST_GREEN;
        case r'NONE': return TextToImageRequestBodyClipGuidancePresetEnum.NONE;
        case r'SIMPLE': return TextToImageRequestBodyClipGuidancePresetEnum.SIMPLE;
        case r'SLOW': return TextToImageRequestBodyClipGuidancePresetEnum.SLOW;
        case r'SLOWER': return TextToImageRequestBodyClipGuidancePresetEnum.SLOWER;
        case r'SLOWEST': return TextToImageRequestBodyClipGuidancePresetEnum.SLOWEST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer] instance.
  static TextToImageRequestBodyClipGuidancePresetEnumTypeTransformer? _instance;
}


/// Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
class TextToImageRequestBodySamplerEnum {
  /// Instantiate a new enum with the provided [value].
  const TextToImageRequestBodySamplerEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DDIM = TextToImageRequestBodySamplerEnum._(r'DDIM');
  static const DDPM = TextToImageRequestBodySamplerEnum._(r'DDPM');
  static const kDPMPP2M = TextToImageRequestBodySamplerEnum._(r'K_DPMPP_2M');
  static const kDPMPP2SANCESTRAL = TextToImageRequestBodySamplerEnum._(r'K_DPMPP_2S_ANCESTRAL');
  static const kDPM2 = TextToImageRequestBodySamplerEnum._(r'K_DPM_2');
  static const kDPM2ANCESTRAL = TextToImageRequestBodySamplerEnum._(r'K_DPM_2_ANCESTRAL');
  static const K_EULER = TextToImageRequestBodySamplerEnum._(r'K_EULER');
  static const K_EULER_ANCESTRAL = TextToImageRequestBodySamplerEnum._(r'K_EULER_ANCESTRAL');
  static const K_HEUN = TextToImageRequestBodySamplerEnum._(r'K_HEUN');
  static const K_LMS = TextToImageRequestBodySamplerEnum._(r'K_LMS');

  /// List of all possible values in this [enum][TextToImageRequestBodySamplerEnum].
  static const values = <TextToImageRequestBodySamplerEnum>[
    DDIM,
    DDPM,
    kDPMPP2M,
    kDPMPP2SANCESTRAL,
    kDPM2,
    kDPM2ANCESTRAL,
    K_EULER,
    K_EULER_ANCESTRAL,
    K_HEUN,
    K_LMS,
  ];

  static TextToImageRequestBodySamplerEnum? fromJson(dynamic value) => TextToImageRequestBodySamplerEnumTypeTransformer().decode(value);

  static List<TextToImageRequestBodySamplerEnum>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TextToImageRequestBodySamplerEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TextToImageRequestBodySamplerEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TextToImageRequestBodySamplerEnum] to String,
/// and [decode] dynamic data back to [TextToImageRequestBodySamplerEnum].
class TextToImageRequestBodySamplerEnumTypeTransformer {
  factory TextToImageRequestBodySamplerEnumTypeTransformer() => _instance ??= const TextToImageRequestBodySamplerEnumTypeTransformer._();

  const TextToImageRequestBodySamplerEnumTypeTransformer._();

  String encode(TextToImageRequestBodySamplerEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TextToImageRequestBodySamplerEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TextToImageRequestBodySamplerEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data.toString()) {
        case r'DDIM': return TextToImageRequestBodySamplerEnum.DDIM;
        case r'DDPM': return TextToImageRequestBodySamplerEnum.DDPM;
        case r'K_DPMPP_2M': return TextToImageRequestBodySamplerEnum.kDPMPP2M;
        case r'K_DPMPP_2S_ANCESTRAL': return TextToImageRequestBodySamplerEnum.kDPMPP2SANCESTRAL;
        case r'K_DPM_2': return TextToImageRequestBodySamplerEnum.kDPM2;
        case r'K_DPM_2_ANCESTRAL': return TextToImageRequestBodySamplerEnum.kDPM2ANCESTRAL;
        case r'K_EULER': return TextToImageRequestBodySamplerEnum.K_EULER;
        case r'K_EULER_ANCESTRAL': return TextToImageRequestBodySamplerEnum.K_EULER_ANCESTRAL;
        case r'K_HEUN': return TextToImageRequestBodySamplerEnum.K_HEUN;
        case r'K_LMS': return TextToImageRequestBodySamplerEnum.K_LMS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TextToImageRequestBodySamplerEnumTypeTransformer] instance.
  static TextToImageRequestBodySamplerEnumTypeTransformer? _instance;
}


