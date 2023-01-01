import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TextToImageRequestBody
void main() {
  final instance = TextToImageRequestBodyBuilder();
  // TODO add properties to the builder and call build()

  group(TextToImageRequestBody, () {
    // How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
    // num cfgScale (default value: 7)
    test('to test the property `cfgScale`', () async {
      // TODO
    });

    // String clipGuidancePreset (default value: 'NONE')
    test('to test the property `clipGuidancePreset`', () async {
      // TODO
    });

    // Height of the image (note: `height * width` must be <= 1 Megapixel)
    // int height (default value: 512)
    test('to test the property `height`', () async {
      // TODO
    });

    // Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
    // String sampler
    test('to test the property `sampler`', () async {
      // TODO
    });

    // Number of images to generate
    // int samples (default value: 1)
    test('to test the property `samples`', () async {
      // TODO
    });

    // Random noise seed (omit this option or use `0` for a random seed)
    // int seed
    test('to test the property `seed`', () async {
      // TODO
    });

    // Number of diffusion steps to run
    // int steps (default value: 50)
    test('to test the property `steps`', () async {
      // TODO
    });

    // BuiltList<TextPrompt> textPrompts
    test('to test the property `textPrompts`', () async {
      // TODO
    });

    // Width of the image (note: `height * width` must be <= 1 Megapixel)
    // int width (default value: 512)
    test('to test the property `width`', () async {
      // TODO
    });

  });
}
