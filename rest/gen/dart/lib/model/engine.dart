//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Engine {
  /// Returns a new [Engine] instance.
  Engine({
    required this.description,
    required this.id,
    required this.name,
    required this.type,
  });

  String description;

  /// Unique identifier for the engine
  String id;

  /// Name of the engine
  String name;

  /// The type of content this engine produces
  EngineTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Engine &&
     other.description == description &&
     other.id == id &&
     other.name == name &&
     other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description.hashCode) +
    (id.hashCode) +
    (name.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'Engine[description=$description, id=$id, name=$name, type=$type]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'description'] = description;
      _json[r'id'] = id;
      _json[r'name'] = name;
      _json[r'type'] = type;
    return _json;
  }

  /// Returns a new [Engine] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Engine? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Engine[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Engine[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Engine(
        description: mapValueOfType<String>(json, r'description')!,
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        type: EngineTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<Engine>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Engine>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Engine.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Engine> mapFromJson(dynamic json) {
    final map = <String, Engine>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Engine.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Engine-objects as value to a dart map
  static Map<String, List<Engine>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Engine>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Engine.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'description',
    'id',
    'name',
    'type',
  };
}

/// The type of content this engine produces
class EngineTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const EngineTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AUDIO = EngineTypeEnum._(r'AUDIO');
  static const CLASSIFICATION = EngineTypeEnum._(r'CLASSIFICATION');
  static const PICTURE = EngineTypeEnum._(r'PICTURE');
  static const STORAGE = EngineTypeEnum._(r'STORAGE');
  static const TEXT = EngineTypeEnum._(r'TEXT');
  static const VIDEO = EngineTypeEnum._(r'VIDEO');

  /// List of all possible values in this [enum][EngineTypeEnum].
  static const values = <EngineTypeEnum>[
    AUDIO,
    CLASSIFICATION,
    PICTURE,
    STORAGE,
    TEXT,
    VIDEO,
  ];

  static EngineTypeEnum? fromJson(dynamic value) => EngineTypeEnumTypeTransformer().decode(value);

  static List<EngineTypeEnum>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EngineTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EngineTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EngineTypeEnum] to String,
/// and [decode] dynamic data back to [EngineTypeEnum].
class EngineTypeEnumTypeTransformer {
  factory EngineTypeEnumTypeTransformer() => _instance ??= const EngineTypeEnumTypeTransformer._();

  const EngineTypeEnumTypeTransformer._();

  String encode(EngineTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a EngineTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EngineTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data.toString()) {
        case r'AUDIO': return EngineTypeEnum.AUDIO;
        case r'CLASSIFICATION': return EngineTypeEnum.CLASSIFICATION;
        case r'PICTURE': return EngineTypeEnum.PICTURE;
        case r'STORAGE': return EngineTypeEnum.STORAGE;
        case r'TEXT': return EngineTypeEnum.TEXT;
        case r'VIDEO': return EngineTypeEnum.VIDEO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [EngineTypeEnumTypeTransformer] instance.
  static EngineTypeEnumTypeTransformer? _instance;
}


