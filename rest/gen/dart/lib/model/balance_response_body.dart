//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BalanceResponseBody {
  /// Returns a new [BalanceResponseBody] instance.
  BalanceResponseBody({
    required this.credits,
  });

  /// The balance of the account/organization associated with the API key
  double credits;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BalanceResponseBody &&
     other.credits == credits;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (credits.hashCode);

  @override
  String toString() => 'BalanceResponseBody[credits=$credits]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'credits'] = credits;
    return _json;
  }

  /// Returns a new [BalanceResponseBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BalanceResponseBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BalanceResponseBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BalanceResponseBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BalanceResponseBody(
        credits: mapValueOfType<double>(json, r'credits')!,
      );
    }
    return null;
  }

  static List<BalanceResponseBody>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BalanceResponseBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BalanceResponseBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BalanceResponseBody> mapFromJson(dynamic json) {
    final map = <String, BalanceResponseBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BalanceResponseBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BalanceResponseBody-objects as value to a dart map
  static Map<String, List<BalanceResponseBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BalanceResponseBody>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BalanceResponseBody.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'credits',
  };
}

