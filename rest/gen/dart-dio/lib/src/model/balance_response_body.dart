//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'balance_response_body.g.dart';

/// BalanceResponseBody
///
/// Properties:
/// * [credits] - The balance of the account/organization associated with the API key
abstract class BalanceResponseBody implements Built<BalanceResponseBody, BalanceResponseBodyBuilder> {
    /// The balance of the account/organization associated with the API key
    @BuiltValueField(wireName: r'credits')
    double get credits;

    BalanceResponseBody._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(BalanceResponseBodyBuilder b) => b;

    factory BalanceResponseBody([void updates(BalanceResponseBodyBuilder b)]) = _$BalanceResponseBody;

    @BuiltValueSerializer(custom: true)
    static Serializer<BalanceResponseBody> get serializer => _$BalanceResponseBodySerializer();
}

class _$BalanceResponseBodySerializer implements StructuredSerializer<BalanceResponseBody> {
    @override
    final Iterable<Type> types = const [BalanceResponseBody, _$BalanceResponseBody];

    @override
    final String wireName = r'BalanceResponseBody';

    @override
    Iterable<Object?> serialize(Serializers serializers, BalanceResponseBody object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'credits')
            ..add(serializers.serialize(object.credits,
                specifiedType: const FullType(double)));
        return result;
    }

    @override
    BalanceResponseBody deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BalanceResponseBodyBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'credits':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(double)) as double;
                    result.credits = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

