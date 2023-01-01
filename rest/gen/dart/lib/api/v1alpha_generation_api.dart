//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class V1alphaGenerationApi {
  V1alphaGenerationApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// image-to-image
  ///
  /// Generate big fancy pictures from small fancy pictures
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [MultipartFile] initImage (required):
  ///   Initial image to use for the image-to-image generation
  ///
  /// * [ImageToImageOptions] options (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<Response> v1alphaGenerationImageToImageWithHttpInfo(String engineId, String accept, MultipartFile initImage, ImageToImageOptions options, { String? organization, }) async {
    // ignore: prefer_const_declarations
    final path = r'/v1alpha/generation/{engine_id}/image-to-image'
      .replaceAll('{engine_id}', engineId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    headerParams[r'Accept'] = parameterToString(accept);
    if (organization != null) {
      headerParams[r'Organization'] = parameterToString(organization);
    }

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (initImage != null) {
      hasFields = true;
      mp.fields[r'init_image'] = initImage.field;
      mp.files.add(initImage);
    }
    if (options != null) {
      hasFields = true;
      mp.fields[r'options'] = parameterToString(options);
    }
    if (hasFields) {
      postBody = mp;
    }

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// image-to-image
  ///
  /// Generate big fancy pictures from small fancy pictures
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [MultipartFile] initImage (required):
  ///   Initial image to use for the image-to-image generation
  ///
  /// * [ImageToImageOptions] options (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<void> v1alphaGenerationImageToImage(String engineId, String accept, MultipartFile initImage, ImageToImageOptions options, { String? organization, }) async {
    final response = await v1alphaGenerationImageToImageWithHttpInfo(engineId, accept, initImage, options,  organization: organization, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// image-to-image/masking
  ///
  /// Paint fancy things into fancy pictures
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [MultipartFile] initImage (required):
  ///   Initial image to use for the image-to-image generation
  ///
  /// * [MaskingOptions] options (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  ///
  /// * [MultipartFile] maskImage:
  ///   Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
  Future<Response> v1alphaGenerationMaskingWithHttpInfo(String engineId, String accept, MultipartFile initImage, MaskingOptions options, { String? organization, MultipartFile? maskImage, }) async {
    // ignore: prefer_const_declarations
    final path = r'/v1alpha/generation/{engine_id}/image-to-image/masking'
      .replaceAll('{engine_id}', engineId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    headerParams[r'Accept'] = parameterToString(accept);
    if (organization != null) {
      headerParams[r'Organization'] = parameterToString(organization);
    }

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (initImage != null) {
      hasFields = true;
      mp.fields[r'init_image'] = initImage.field;
      mp.files.add(initImage);
    }
    if (maskImage != null) {
      hasFields = true;
      mp.fields[r'mask_image'] = maskImage.field;
      mp.files.add(maskImage);
    }
    if (options != null) {
      hasFields = true;
      mp.fields[r'options'] = parameterToString(options);
    }
    if (hasFields) {
      postBody = mp;
    }

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// image-to-image/masking
  ///
  /// Paint fancy things into fancy pictures
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [MultipartFile] initImage (required):
  ///   Initial image to use for the image-to-image generation
  ///
  /// * [MaskingOptions] options (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  ///
  /// * [MultipartFile] maskImage:
  ///   Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
  Future<void> v1alphaGenerationMasking(String engineId, String accept, MultipartFile initImage, MaskingOptions options, { String? organization, MultipartFile? maskImage, }) async {
    final response = await v1alphaGenerationMaskingWithHttpInfo(engineId, accept, initImage, options,  organization: organization, maskImage: maskImage, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// text-to-image
  ///
  /// Generate an image from text
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [TextToImageRequestBody] textToImageRequestBody (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<Response> v1alphaGenerationTextToImageWithHttpInfo(String engineId, String accept, TextToImageRequestBody textToImageRequestBody, { String? organization, }) async {
    // ignore: prefer_const_declarations
    final path = r'/v1alpha/generation/{engine_id}/text-to-image'
      .replaceAll('{engine_id}', engineId);

    // ignore: prefer_final_locals
    Object? postBody = textToImageRequestBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    headerParams[r'Accept'] = parameterToString(accept);
    if (organization != null) {
      headerParams[r'Organization'] = parameterToString(organization);
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// text-to-image
  ///
  /// Generate an image from text
  ///
  /// Parameters:
  ///
  /// * [String] engineId (required):
  ///    
  ///
  /// * [String] accept (required):
  ///    
  ///
  /// * [TextToImageRequestBody] textToImageRequestBody (required):
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<void> v1alphaGenerationTextToImage(String engineId, String accept, TextToImageRequestBody textToImageRequestBody, { String? organization, }) async {
    final response = await v1alphaGenerationTextToImageWithHttpInfo(engineId, accept, textToImageRequestBody,  organization: organization, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
