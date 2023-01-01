//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/engine.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_engines_response_body.g.dart';

/// ListEnginesResponseBody
///
/// Properties:
/// * [engines] - The engines available to your user/organization
abstract class ListEnginesResponseBody implements Built<ListEnginesResponseBody, ListEnginesResponseBodyBuilder> {
    /// The engines available to your user/organization
    @BuiltValueField(wireName: r'engines')
    BuiltList<Engine> get engines;

    ListEnginesResponseBody._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(ListEnginesResponseBodyBuilder b) => b;

    factory ListEnginesResponseBody([void updates(ListEnginesResponseBodyBuilder b)]) = _$ListEnginesResponseBody;

    @BuiltValueSerializer(custom: true)
    static Serializer<ListEnginesResponseBody> get serializer => _$ListEnginesResponseBodySerializer();
}

class _$ListEnginesResponseBodySerializer implements StructuredSerializer<ListEnginesResponseBody> {
    @override
    final Iterable<Type> types = const [ListEnginesResponseBody, _$ListEnginesResponseBody];

    @override
    final String wireName = r'ListEnginesResponseBody';

    @override
    Iterable<Object?> serialize(Serializers serializers, ListEnginesResponseBody object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'engines')
            ..add(serializers.serialize(object.engines,
                specifiedType: const FullType(BuiltList, [FullType(Engine)])));
        return result;
    }

    @override
    ListEnginesResponseBody deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = ListEnginesResponseBodyBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'engines':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(Engine)])) as BuiltList<Engine>;
                    result.engines.replace(valueDes);
                    break;
            }
        }
        return result.build();
    }
}

