//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/organization_membership.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'account_response_body.g.dart';

/// AccountResponseBody
///
/// Properties:
/// * [email] - The user's email
/// * [id] - The user's ID
/// * [organizations] - The user's organizations
/// * [profilePicture] - The user's profile picture
abstract class AccountResponseBody implements Built<AccountResponseBody, AccountResponseBodyBuilder> {
    /// The user's email
    @BuiltValueField(wireName: r'email')
    String get email;

    /// The user's ID
    @BuiltValueField(wireName: r'id')
    String get id;

    /// The user's organizations
    @BuiltValueField(wireName: r'organizations')
    BuiltList<OrganizationMembership> get organizations;

    /// The user's profile picture
    @BuiltValueField(wireName: r'profile_picture')
    String? get profilePicture;

    AccountResponseBody._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(AccountResponseBodyBuilder b) => b;

    factory AccountResponseBody([void updates(AccountResponseBodyBuilder b)]) = _$AccountResponseBody;

    @BuiltValueSerializer(custom: true)
    static Serializer<AccountResponseBody> get serializer => _$AccountResponseBodySerializer();
}

class _$AccountResponseBodySerializer implements StructuredSerializer<AccountResponseBody> {
    @override
    final Iterable<Type> types = const [AccountResponseBody, _$AccountResponseBody];

    @override
    final String wireName = r'AccountResponseBody';

    @override
    Iterable<Object?> serialize(Serializers serializers, AccountResponseBody object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'email')
            ..add(serializers.serialize(object.email,
                specifiedType: const FullType(String)));
        result
            ..add(r'id')
            ..add(serializers.serialize(object.id,
                specifiedType: const FullType(String)));
        result
            ..add(r'organizations')
            ..add(serializers.serialize(object.organizations,
                specifiedType: const FullType(BuiltList, [FullType(OrganizationMembership)])));
        if (object.profilePicture != null) {
            result
                ..add(r'profile_picture')
                ..add(serializers.serialize(object.profilePicture,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    AccountResponseBody deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AccountResponseBodyBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'email':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.email = valueDes;
                    break;
                case r'id':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.id = valueDes;
                    break;
                case r'organizations':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(OrganizationMembership)])) as BuiltList<OrganizationMembership>;
                    result.organizations.replace(valueDes);
                    break;
                case r'profile_picture':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.profilePicture = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

