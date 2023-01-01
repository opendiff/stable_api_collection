//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'organization_membership.g.dart';

/// OrganizationMembership
///
/// Properties:
/// * [id] 
/// * [isDefault] 
/// * [name] 
/// * [role] 
abstract class OrganizationMembership implements Built<OrganizationMembership, OrganizationMembershipBuilder> {
    @BuiltValueField(wireName: r'id')
    String get id;

    @BuiltValueField(wireName: r'is_default')
    bool get isDefault;

    @BuiltValueField(wireName: r'name')
    String get name;

    @BuiltValueField(wireName: r'role')
    String get role;

    OrganizationMembership._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(OrganizationMembershipBuilder b) => b;

    factory OrganizationMembership([void updates(OrganizationMembershipBuilder b)]) = _$OrganizationMembership;

    @BuiltValueSerializer(custom: true)
    static Serializer<OrganizationMembership> get serializer => _$OrganizationMembershipSerializer();
}

class _$OrganizationMembershipSerializer implements StructuredSerializer<OrganizationMembership> {
    @override
    final Iterable<Type> types = const [OrganizationMembership, _$OrganizationMembership];

    @override
    final String wireName = r'OrganizationMembership';

    @override
    Iterable<Object?> serialize(Serializers serializers, OrganizationMembership object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'id')
            ..add(serializers.serialize(object.id,
                specifiedType: const FullType(String)));
        result
            ..add(r'is_default')
            ..add(serializers.serialize(object.isDefault,
                specifiedType: const FullType(bool)));
        result
            ..add(r'name')
            ..add(serializers.serialize(object.name,
                specifiedType: const FullType(String)));
        result
            ..add(r'role')
            ..add(serializers.serialize(object.role,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    OrganizationMembership deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = OrganizationMembershipBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'id':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.id = valueDes;
                    break;
                case r'is_default':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    result.isDefault = valueDes;
                    break;
                case r'name':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.name = valueDes;
                    break;
                case r'role':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.role = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

