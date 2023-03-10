//
// V1alphaGenerationAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class V1alphaGenerationAPI {

    /**
     * enum for parameter accept
     */
    public enum Accept_v1alphaGenerationImageToImage: String, CaseIterable {
        case imageSlashPng = "image/png"
        case applicationSlashJson = "application/json"
    }

    /**
     image-to-image
     
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter initImage: (form) Initial image to use for the image-to-image generation 
     - parameter options: (form)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func v1alphaGenerationImageToImage(engineId: String, accept: Accept_v1alphaGenerationImageToImage, initImage: URL, options: ImageToImageOptions, organization: String? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: Void?, _ error: Error?) -> Void)) -> RequestTask {
        return v1alphaGenerationImageToImageWithRequestBuilder(engineId: engineId, accept: accept, initImage: initImage, options: options, organization: organization).execute(apiResponseQueue) { result in
            switch result {
            case .success:
                completion((), nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     image-to-image
     - POST /v1alpha/generation/{engine_id}/image-to-image
     - Generate big fancy pictures from small fancy pictures
     - API Key:
       - type: apiKey Authorization 
       - name: api_key_header_Authorization
     - responseHeaders: [Content-Length(Int), Content-Type(String), Finish-Reason(String), Seed(Int)]
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter initImage: (form) Initial image to use for the image-to-image generation 
     - parameter options: (form)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - returns: RequestBuilder<Void> 
     */
    open class func v1alphaGenerationImageToImageWithRequestBuilder(engineId: String, accept: Accept_v1alphaGenerationImageToImage, initImage: URL, options: ImageToImageOptions, organization: String? = nil) -> RequestBuilder<Void> {
        var localVariablePath = "/v1alpha/generation/{engine_id}/image-to-image"
        let engineIdPreEscape = "\(APIHelper.mapValueToPathItem(engineId))"
        let engineIdPostEscape = engineIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{engine_id}", with: engineIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableFormParams: [String: Any?] = [
            "init_image": initImage.encodeToJSON(),
            "options": options.encodeToJSON(),
        ]

        let localVariableNonNullParameters = APIHelper.rejectNil(localVariableFormParams)
        let localVariableParameters = APIHelper.convertBoolToString(localVariableNonNullParameters)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "multipart/form-data",
            "Accept": accept.encodeToJSON(),
            "Organization": organization?.encodeToJSON(),
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     * enum for parameter accept
     */
    public enum Accept_v1alphaGenerationMasking: String, CaseIterable {
        case imageSlashPng = "image/png"
        case applicationSlashJson = "application/json"
    }

    /**
     image-to-image/masking
     
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter initImage: (form) Initial image to use for the image-to-image generation 
     - parameter options: (form)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - parameter maskImage: (form) Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func v1alphaGenerationMasking(engineId: String, accept: Accept_v1alphaGenerationMasking, initImage: URL, options: MaskingOptions, organization: String? = nil, maskImage: URL? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: Void?, _ error: Error?) -> Void)) -> RequestTask {
        return v1alphaGenerationMaskingWithRequestBuilder(engineId: engineId, accept: accept, initImage: initImage, options: options, organization: organization, maskImage: maskImage).execute(apiResponseQueue) { result in
            switch result {
            case .success:
                completion((), nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     image-to-image/masking
     - POST /v1alpha/generation/{engine_id}/image-to-image/masking
     - Paint fancy things into fancy pictures
     - API Key:
       - type: apiKey Authorization 
       - name: api_key_header_Authorization
     - responseHeaders: [Content-Length(Int), Content-Type(String), Finish-Reason(String), Seed(Int)]
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter initImage: (form) Initial image to use for the image-to-image generation 
     - parameter options: (form)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - parameter maskImage: (form) Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) (optional)
     - returns: RequestBuilder<Void> 
     */
    open class func v1alphaGenerationMaskingWithRequestBuilder(engineId: String, accept: Accept_v1alphaGenerationMasking, initImage: URL, options: MaskingOptions, organization: String? = nil, maskImage: URL? = nil) -> RequestBuilder<Void> {
        var localVariablePath = "/v1alpha/generation/{engine_id}/image-to-image/masking"
        let engineIdPreEscape = "\(APIHelper.mapValueToPathItem(engineId))"
        let engineIdPostEscape = engineIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{engine_id}", with: engineIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableFormParams: [String: Any?] = [
            "init_image": initImage.encodeToJSON(),
            "mask_image": maskImage?.encodeToJSON(),
            "options": options.encodeToJSON(),
        ]

        let localVariableNonNullParameters = APIHelper.rejectNil(localVariableFormParams)
        let localVariableParameters = APIHelper.convertBoolToString(localVariableNonNullParameters)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "multipart/form-data",
            "Accept": accept.encodeToJSON(),
            "Organization": organization?.encodeToJSON(),
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }

    /**
     * enum for parameter accept
     */
    public enum Accept_v1alphaGenerationTextToImage: String, CaseIterable {
        case imageSlashPng = "image/png"
        case applicationSlashJson = "application/json"
    }

    /**
     text-to-image
     
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter textToImageRequestBody: (body)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func v1alphaGenerationTextToImage(engineId: String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: String? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: Void?, _ error: Error?) -> Void)) -> RequestTask {
        return v1alphaGenerationTextToImageWithRequestBuilder(engineId: engineId, accept: accept, textToImageRequestBody: textToImageRequestBody, organization: organization).execute(apiResponseQueue) { result in
            switch result {
            case .success:
                completion((), nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     text-to-image
     - POST /v1alpha/generation/{engine_id}/text-to-image
     - Generate an image from text
     - API Key:
       - type: apiKey Authorization 
       - name: api_key_header_Authorization
     - responseHeaders: [Content-Length(Int), Content-Type(String), Finish-Reason(String), Seed(Int)]
     - parameter engineId: (path)   
     - parameter accept: (header)   
     - parameter textToImageRequestBody: (body)  
     - parameter organization: (header) Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
     - returns: RequestBuilder<Void> 
     */
    open class func v1alphaGenerationTextToImageWithRequestBuilder(engineId: String, accept: Accept_v1alphaGenerationTextToImage, textToImageRequestBody: TextToImageRequestBody, organization: String? = nil) -> RequestBuilder<Void> {
        var localVariablePath = "/v1alpha/generation/{engine_id}/text-to-image"
        let engineIdPreEscape = "\(APIHelper.mapValueToPathItem(engineId))"
        let engineIdPostEscape = engineIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{engine_id}", with: engineIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: textToImageRequestBody)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Accept": accept.encodeToJSON(),
            "Organization": organization?.encodeToJSON(),
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }
}
