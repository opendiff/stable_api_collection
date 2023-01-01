//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'error.g.dart';

/// Error
///
/// Properties:
/// * [fault] - Is the error a server-side fault?
/// * [id] - ID is a unique identifier for this particular occurrence of the problem.
/// * [message] - Message is a human-readable explanation specific to this occurrence of the problem.
/// * [name] - Name is the name of this class of errors.
/// * [temporary] - Is the error temporary?
/// * [timeout] - Is the error a timeout?
abstract class Error implements Built<Error, ErrorBuilder> {
    /// Is the error a server-side fault?
    @BuiltValueField(wireName: r'fault')
    bool get fault;

    /// ID is a unique identifier for this particular occurrence of the problem.
    @BuiltValueField(wireName: r'id')
    String get id;

    /// Message is a human-readable explanation specific to this occurrence of the problem.
    @BuiltValueField(wireName: r'message')
    String get message;

    /// Name is the name of this class of errors.
    @BuiltValueField(wireName: r'name')
    String get name;

    /// Is the error temporary?
    @BuiltValueField(wireName: r'temporary')
    bool get temporary;

    /// Is the error a timeout?
    @BuiltValueField(wireName: r'timeout')
    bool get timeout;

    Error._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(ErrorBuilder b) => b;

    factory Error([void updates(ErrorBuilder b)]) = _$Error;

    @BuiltValueSerializer(custom: true)
    static Serializer<Error> get serializer => _$ErrorSerializer();
}

class _$ErrorSerializer implements StructuredSerializer<Error> {
    @override
    final Iterable<Type> types = const [Error, _$Error];

    @override
    final String wireName = r'Error';

    @override
    Iterable<Object?> serialize(Serializers serializers, Error object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'fault')
            ..add(serializers.serialize(object.fault,
                specifiedType: const FullType(bool)));
        result
            ..add(r'id')
            ..add(serializers.serialize(object.id,
                specifiedType: const FullType(String)));
        result
            ..add(r'message')
            ..add(serializers.serialize(object.message,
                specifiedType: const FullType(String)));
        result
            ..add(r'name')
            ..add(serializers.serialize(object.name,
                specifiedType: const FullType(String)));
        result
            ..add(r'temporary')
            ..add(serializers.serialize(object.temporary,
                specifiedType: const FullType(bool)));
        result
            ..add(r'timeout')
            ..add(serializers.serialize(object.timeout,
                specifiedType: const FullType(bool)));
        return result;
    }

    @override
    Error deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = ErrorBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'fault':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    result.fault = valueDes;
                    break;
                case r'id':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.id = valueDes;
                    break;
                case r'message':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.message = valueDes;
                    break;
                case r'name':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.name = valueDes;
                    break;
                case r'temporary':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    result.temporary = valueDes;
                    break;
                case r'timeout':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    result.timeout = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

