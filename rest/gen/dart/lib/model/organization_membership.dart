//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrganizationMembership {
  /// Returns a new [OrganizationMembership] instance.
  OrganizationMembership({
    required this.id,
    required this.isDefault,
    required this.name,
    required this.role,
  });

  String id;

  bool isDefault;

  String name;

  String role;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrganizationMembership &&
     other.id == id &&
     other.isDefault == isDefault &&
     other.name == name &&
     other.role == role;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (isDefault.hashCode) +
    (name.hashCode) +
    (role.hashCode);

  @override
  String toString() => 'OrganizationMembership[id=$id, isDefault=$isDefault, name=$name, role=$role]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'id'] = id;
      _json[r'is_default'] = isDefault;
      _json[r'name'] = name;
      _json[r'role'] = role;
    return _json;
  }

  /// Returns a new [OrganizationMembership] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrganizationMembership? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OrganizationMembership[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OrganizationMembership[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OrganizationMembership(
        id: mapValueOfType<String>(json, r'id')!,
        isDefault: mapValueOfType<bool>(json, r'is_default')!,
        name: mapValueOfType<String>(json, r'name')!,
        role: mapValueOfType<String>(json, r'role')!,
      );
    }
    return null;
  }

  static List<OrganizationMembership>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrganizationMembership>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrganizationMembership.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrganizationMembership> mapFromJson(dynamic json) {
    final map = <String, OrganizationMembership>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrganizationMembership.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrganizationMembership-objects as value to a dart map
  static Map<String, List<OrganizationMembership>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrganizationMembership>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrganizationMembership.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'is_default',
    'name',
    'role',
  };
}

