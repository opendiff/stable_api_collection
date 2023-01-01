//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'text_prompt.g.dart';

/// Text prompt for image generation
///
/// Properties:
/// * [text] 
/// * [weight] - Weight of the prompt (use negative numbers for negative prompts)
abstract class TextPrompt implements Built<TextPrompt, TextPromptBuilder> {
    @BuiltValueField(wireName: r'text')
    String get text;

    /// Weight of the prompt (use negative numbers for negative prompts)
    @BuiltValueField(wireName: r'weight')
    double? get weight;

    TextPrompt._();

    @BuiltValueHook(initializeBuilder: true)
    static void _defaults(TextPromptBuilder b) => b;

    factory TextPrompt([void updates(TextPromptBuilder b)]) = _$TextPrompt;

    @BuiltValueSerializer(custom: true)
    static Serializer<TextPrompt> get serializer => _$TextPromptSerializer();
}

class _$TextPromptSerializer implements StructuredSerializer<TextPrompt> {
    @override
    final Iterable<Type> types = const [TextPrompt, _$TextPrompt];

    @override
    final String wireName = r'TextPrompt';

    @override
    Iterable<Object?> serialize(Serializers serializers, TextPrompt object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'text')
            ..add(serializers.serialize(object.text,
                specifiedType: const FullType(String)));
        if (object.weight != null) {
            result
                ..add(r'weight')
                ..add(serializers.serialize(object.weight,
                    specifiedType: const FullType(double)));
        }
        return result;
    }

    @override
    TextPrompt deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = TextPromptBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            
            switch (key) {
                case r'text':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    result.text = valueDes;
                    break;
                case r'weight':
                    final valueDes = serializers.deserialize(value,
                        specifiedType: const FullType(double)) as double;
                    result.weight = valueDes;
                    break;
            }
        }
        return result.build();
    }
}

