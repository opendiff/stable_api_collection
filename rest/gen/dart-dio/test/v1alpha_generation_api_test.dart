import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for V1alphaGenerationApi
void main() {
  final instance = Openapi().getV1alphaGenerationApi();

  group(V1alphaGenerationApi, () {
    // image-to-image
    //
    // Generate big fancy pictures from small fancy pictures
    //
    //Future v1alphaGenerationImageToImage(String engineId, String accept, MultipartFile initImage, ImageToImageOptions options, { String organization }) async
    test('test v1alphaGenerationImageToImage', () async {
      // TODO
    });

    // image-to-image/masking
    //
    // Paint fancy things into fancy pictures
    //
    //Future v1alphaGenerationMasking(String engineId, String accept, MultipartFile initImage, MaskingOptions options, { String organization, MultipartFile maskImage }) async
    test('test v1alphaGenerationMasking', () async {
      // TODO
    });

    // text-to-image
    //
    // Generate an image from text
    //
    //Future v1alphaGenerationTextToImage(String engineId, String accept, TextToImageRequestBody textToImageRequestBody, { String organization }) async
    test('test v1alphaGenerationTextToImage', () async {
      // TODO
    });

  });
}
