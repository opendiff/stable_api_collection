//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Error {
  /// Returns a new [Error] instance.
  Error({
    required this.fault,
    required this.id,
    required this.message,
    required this.name,
    required this.temporary,
    required this.timeout,
  });

  /// Is the error a server-side fault?
  bool fault;

  /// ID is a unique identifier for this particular occurrence of the problem.
  String id;

  /// Message is a human-readable explanation specific to this occurrence of the problem.
  String message;

  /// Name is the name of this class of errors.
  String name;

  /// Is the error temporary?
  bool temporary;

  /// Is the error a timeout?
  bool timeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Error &&
     other.fault == fault &&
     other.id == id &&
     other.message == message &&
     other.name == name &&
     other.temporary == temporary &&
     other.timeout == timeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fault.hashCode) +
    (id.hashCode) +
    (message.hashCode) +
    (name.hashCode) +
    (temporary.hashCode) +
    (timeout.hashCode);

  @override
  String toString() => 'Error[fault=$fault, id=$id, message=$message, name=$name, temporary=$temporary, timeout=$timeout]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'fault'] = fault;
      _json[r'id'] = id;
      _json[r'message'] = message;
      _json[r'name'] = name;
      _json[r'temporary'] = temporary;
      _json[r'timeout'] = timeout;
    return _json;
  }

  /// Returns a new [Error] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Error? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Error[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Error[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Error(
        fault: mapValueOfType<bool>(json, r'fault')!,
        id: mapValueOfType<String>(json, r'id')!,
        message: mapValueOfType<String>(json, r'message')!,
        name: mapValueOfType<String>(json, r'name')!,
        temporary: mapValueOfType<bool>(json, r'temporary')!,
        timeout: mapValueOfType<bool>(json, r'timeout')!,
      );
    }
    return null;
  }

  static List<Error>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Error>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Error.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Error> mapFromJson(dynamic json) {
    final map = <String, Error>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Error.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Error-objects as value to a dart map
  static Map<String, List<Error>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Error>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Error.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'fault',
    'id',
    'message',
    'name',
    'temporary',
    'timeout',
  };
}

