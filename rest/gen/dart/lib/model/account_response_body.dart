//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AccountResponseBody {
  /// Returns a new [AccountResponseBody] instance.
  AccountResponseBody({
    required this.email,
    required this.id,
    this.organizations = const [],
    this.profilePicture,
  });

  /// The user's email
  String email;

  /// The user's ID
  String id;

  /// The user's organizations
  List<OrganizationMembership> organizations;

  /// The user's profile picture
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? profilePicture;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AccountResponseBody &&
     other.email == email &&
     other.id == id &&
     other.organizations == organizations &&
     other.profilePicture == profilePicture;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (email.hashCode) +
    (id.hashCode) +
    (organizations.hashCode) +
    (profilePicture == null ? 0 : profilePicture!.hashCode);

  @override
  String toString() => 'AccountResponseBody[email=$email, id=$id, organizations=$organizations, profilePicture=$profilePicture]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'email'] = email;
      _json[r'id'] = id;
      _json[r'organizations'] = organizations;
    if (profilePicture != null) {
      _json[r'profile_picture'] = profilePicture;
    } else {
      _json[r'profile_picture'] = null;
    }
    return _json;
  }

  /// Returns a new [AccountResponseBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AccountResponseBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AccountResponseBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AccountResponseBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AccountResponseBody(
        email: mapValueOfType<String>(json, r'email')!,
        id: mapValueOfType<String>(json, r'id')!,
        organizations: OrganizationMembership.listFromJson(json[r'organizations'])!,
        profilePicture: mapValueOfType<String>(json, r'profile_picture'),
      );
    }
    return null;
  }

  static List<AccountResponseBody>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AccountResponseBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AccountResponseBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AccountResponseBody> mapFromJson(dynamic json) {
    final map = <String, AccountResponseBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AccountResponseBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AccountResponseBody-objects as value to a dart map
  static Map<String, List<AccountResponseBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AccountResponseBody>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AccountResponseBody.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'email',
    'id',
    'organizations',
  };
}

