//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/image_to_image_options.dart';
import 'package:openapi/src/model/masking_options.dart';
import 'package:openapi/src/model/text_to_image_request_body.dart';

class V1alphaGenerationApi {

  final Dio _dio;

  final Serializers _serializers;

  const V1alphaGenerationApi(this._dio, this._serializers);

  /// image-to-image
  /// Generate big fancy pictures from small fancy pictures
  ///
  /// Parameters:
  /// * [engineId] -  
  /// * [accept] -  
  /// * [initImage] - Initial image to use for the image-to-image generation
  /// * [options] 
  /// * [organization] - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioError] if API call or serialization fails
  Future<Response<void>> v1alphaGenerationImageToImage({ 
    required String engineId,
    required String accept,
    required MultipartFile initImage,
    required ImageToImageOptions options,
    String? organization,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/v1alpha/generation/{engine_id}/image-to-image'.replaceAll('{' r'engine_id' '}', engineId.toString());
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        r'Accept': accept,
        if (organization != null) r'Organization': organization,
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'apiKey',
            'name': 'api_key_header_Authorization',
            'keyName': 'Authorization',
            'where': 'header',
          },
        ],
        ...?extra,
      },
      contentType: 'multipart/form-data',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        r'init_image': initImage,
        r'options': encodeFormParameter(_serializers, options, const FullType(ImageToImageOptions)),
      });

    } catch(error, stackTrace) {
      throw DioError(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioErrorType.other,
        error: error,
      )..stackTrace = stackTrace;
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// image-to-image/masking
  /// Paint fancy things into fancy pictures
  ///
  /// Parameters:
  /// * [engineId] -  
  /// * [accept] -  
  /// * [initImage] - Initial image to use for the image-to-image generation
  /// * [options] 
  /// * [organization] - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  /// * [maskImage] - Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioError] if API call or serialization fails
  Future<Response<void>> v1alphaGenerationMasking({ 
    required String engineId,
    required String accept,
    required MultipartFile initImage,
    required MaskingOptions options,
    String? organization,
    MultipartFile? maskImage,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/v1alpha/generation/{engine_id}/image-to-image/masking'.replaceAll('{' r'engine_id' '}', engineId.toString());
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        r'Accept': accept,
        if (organization != null) r'Organization': organization,
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'apiKey',
            'name': 'api_key_header_Authorization',
            'keyName': 'Authorization',
            'where': 'header',
          },
        ],
        ...?extra,
      },
      contentType: 'multipart/form-data',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        r'init_image': initImage,
        if (maskImage != null) r'mask_image': maskImage,
        r'options': encodeFormParameter(_serializers, options, const FullType(MaskingOptions)),
      });

    } catch(error, stackTrace) {
      throw DioError(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioErrorType.other,
        error: error,
      )..stackTrace = stackTrace;
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// text-to-image
  /// Generate an image from text
  ///
  /// Parameters:
  /// * [engineId] -  
  /// * [accept] -  
  /// * [textToImageRequestBody] 
  /// * [organization] - Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioError] if API call or serialization fails
  Future<Response<void>> v1alphaGenerationTextToImage({ 
    required String engineId,
    required String accept,
    required TextToImageRequestBody textToImageRequestBody,
    String? organization,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/v1alpha/generation/{engine_id}/text-to-image'.replaceAll('{' r'engine_id' '}', engineId.toString());
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        r'Accept': accept,
        if (organization != null) r'Organization': organization,
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'apiKey',
            'name': 'api_key_header_Authorization',
            'keyName': 'Authorization',
            'where': 'header',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(TextToImageRequestBody);
      _bodyData = _serializers.serialize(textToImageRequestBody, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioError(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioErrorType.other,
        error: error,
      )..stackTrace = stackTrace;
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

}
