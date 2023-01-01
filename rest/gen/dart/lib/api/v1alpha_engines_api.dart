//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class V1alphaEnginesApi {
  V1alphaEnginesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// list
  ///
  /// List all engines available to your organization/user
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<Response> v1alphaEnginesListEnginesWithHttpInfo({ String? organization, }) async {
    // ignore: prefer_const_declarations
    final path = r'/v1alpha/engines/list';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (organization != null) {
      headerParams[r'Organization'] = parameterToString(organization);
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// list
  ///
  /// List all engines available to your organization/user
  ///
  /// Parameters:
  ///
  /// * [String] organization:
  ///   Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  Future<ListEnginesResponseBody?> v1alphaEnginesListEngines({ String? organization, }) async {
    final response = await v1alphaEnginesListEnginesWithHttpInfo( organization: organization, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListEnginesResponseBody',) as ListEnginesResponseBody;
    
    }
    return null;
  }
}
