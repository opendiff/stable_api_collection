//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: project.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


///
/// gRPC services
///
/// Usage: instantiate `Gooseai_ProjectServiceClient`, then call methods of this protocol to make API calls.
internal protocol Gooseai_ProjectServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? { get }

  func create(
    _ request: Gooseai_CreateProjectRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_CreateProjectRequest, Gooseai_Project>

  func update(
    _ request: Gooseai_UpdateProjectRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_UpdateProjectRequest, Gooseai_Project>

  func list(
    _ request: Gooseai_ListProjectRequest,
    callOptions: CallOptions?,
    handler: @escaping (Gooseai_Project) -> Void
  ) -> ServerStreamingCall<Gooseai_ListProjectRequest, Gooseai_Project>

  func get(
    _ request: Gooseai_GetProjectRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_GetProjectRequest, Gooseai_Project>

  func delete(
    _ request: Gooseai_DeleteProjectRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_DeleteProjectRequest, Gooseai_Project>

  func queryAssets(
    _ request: Gooseai_QueryAssetsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse>
}

extension Gooseai_ProjectServiceClientProtocol {
  internal var serviceName: String {
    return "gooseai.ProjectService"
  }

  /// Create a new project if it does not exist
  ///
  /// - Parameters:
  ///   - request: Request to send to Create.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func create(
    _ request: Gooseai_CreateProjectRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_CreateProjectRequest, Gooseai_Project> {
    return self.makeUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  /// Update an existing project
  ///
  /// - Parameters:
  ///   - request: Request to send to Update.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func update(
    _ request: Gooseai_UpdateProjectRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_UpdateProjectRequest, Gooseai_Project> {
    return self.makeUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.update.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateInterceptors() ?? []
    )
  }

  /// List all the projects for an organization
  ///
  /// - Parameters:
  ///   - request: Request to send to List.
  ///   - callOptions: Call options.
  ///   - handler: A closure called when each response is received from the server.
  /// - Returns: A `ServerStreamingCall` with futures for the metadata and status.
  internal func list(
    _ request: Gooseai_ListProjectRequest,
    callOptions: CallOptions? = nil,
    handler: @escaping (Gooseai_Project) -> Void
  ) -> ServerStreamingCall<Gooseai_ListProjectRequest, Gooseai_Project> {
    return self.makeServerStreamingCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.list.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListInterceptors() ?? [],
      handler: handler
    )
  }

  /// Get a project
  ///
  /// - Parameters:
  ///   - request: Request to send to Get.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func get(
    _ request: Gooseai_GetProjectRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_GetProjectRequest, Gooseai_Project> {
    return self.makeUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.get.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetInterceptors() ?? []
    )
  }

  /// Delete a project
  ///
  /// - Parameters:
  ///   - request: Request to send to Delete.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func delete(
    _ request: Gooseai_DeleteProjectRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_DeleteProjectRequest, Gooseai_Project> {
    return self.makeUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.delete.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteInterceptors() ?? []
    )
  }

  /// Query the assets of a project, with additional filtering
  ///
  /// - Parameters:
  ///   - request: Request to send to QueryAssets.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func queryAssets(
    _ request: Gooseai_QueryAssetsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse> {
    return self.makeUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.queryAssets.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAssetsInterceptors() ?? []
    )
  }
}

#if compiler(>=5.6)
@available(*, deprecated)
extension Gooseai_ProjectServiceClient: @unchecked Sendable {}
#endif // compiler(>=5.6)

@available(*, deprecated, renamed: "Gooseai_ProjectServiceNIOClient")
internal final class Gooseai_ProjectServiceClient: Gooseai_ProjectServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the gooseai.ProjectService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Gooseai_ProjectServiceNIOClient: Gooseai_ProjectServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the gooseai.ProjectService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#if compiler(>=5.6)
///
/// gRPC services
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Gooseai_ProjectServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? { get }

  func makeCreateCall(
    _ request: Gooseai_CreateProjectRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_CreateProjectRequest, Gooseai_Project>

  func makeUpdateCall(
    _ request: Gooseai_UpdateProjectRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_UpdateProjectRequest, Gooseai_Project>

  func makeListCall(
    _ request: Gooseai_ListProjectRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncServerStreamingCall<Gooseai_ListProjectRequest, Gooseai_Project>

  func makeGetCall(
    _ request: Gooseai_GetProjectRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_GetProjectRequest, Gooseai_Project>

  func makeDeleteCall(
    _ request: Gooseai_DeleteProjectRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_DeleteProjectRequest, Gooseai_Project>

  func makeQueryAssetsCall(
    _ request: Gooseai_QueryAssetsRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_ProjectServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Gooseai_ProjectServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeCreateCall(
    _ request: Gooseai_CreateProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_CreateProjectRequest, Gooseai_Project> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  internal func makeUpdateCall(
    _ request: Gooseai_UpdateProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_UpdateProjectRequest, Gooseai_Project> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.update.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateInterceptors() ?? []
    )
  }

  internal func makeListCall(
    _ request: Gooseai_ListProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncServerStreamingCall<Gooseai_ListProjectRequest, Gooseai_Project> {
    return self.makeAsyncServerStreamingCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.list.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListInterceptors() ?? []
    )
  }

  internal func makeGetCall(
    _ request: Gooseai_GetProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_GetProjectRequest, Gooseai_Project> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.get.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetInterceptors() ?? []
    )
  }

  internal func makeDeleteCall(
    _ request: Gooseai_DeleteProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_DeleteProjectRequest, Gooseai_Project> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.delete.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteInterceptors() ?? []
    )
  }

  internal func makeQueryAssetsCall(
    _ request: Gooseai_QueryAssetsRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.queryAssets.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAssetsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_ProjectServiceAsyncClientProtocol {
  internal func create(
    _ request: Gooseai_CreateProjectRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_Project {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.create.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateInterceptors() ?? []
    )
  }

  internal func update(
    _ request: Gooseai_UpdateProjectRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_Project {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.update.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateInterceptors() ?? []
    )
  }

  internal func list(
    _ request: Gooseai_ListProjectRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncResponseStream<Gooseai_Project> {
    return self.performAsyncServerStreamingCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.list.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListInterceptors() ?? []
    )
  }

  internal func get(
    _ request: Gooseai_GetProjectRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_Project {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.get.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetInterceptors() ?? []
    )
  }

  internal func delete(
    _ request: Gooseai_DeleteProjectRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_Project {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.delete.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteInterceptors() ?? []
    )
  }

  internal func queryAssets(
    _ request: Gooseai_QueryAssetsRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_QueryAssetsResponse {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_ProjectServiceClientMetadata.Methods.queryAssets.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeQueryAssetsInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Gooseai_ProjectServiceAsyncClient: Gooseai_ProjectServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_ProjectServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#endif // compiler(>=5.6)

internal protocol Gooseai_ProjectServiceClientInterceptorFactoryProtocol: GRPCSendable {

  /// - Returns: Interceptors to use when invoking 'create'.
  func makeCreateInterceptors() -> [ClientInterceptor<Gooseai_CreateProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when invoking 'update'.
  func makeUpdateInterceptors() -> [ClientInterceptor<Gooseai_UpdateProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when invoking 'list'.
  func makeListInterceptors() -> [ClientInterceptor<Gooseai_ListProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when invoking 'get'.
  func makeGetInterceptors() -> [ClientInterceptor<Gooseai_GetProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when invoking 'delete'.
  func makeDeleteInterceptors() -> [ClientInterceptor<Gooseai_DeleteProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when invoking 'queryAssets'.
  func makeQueryAssetsInterceptors() -> [ClientInterceptor<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse>]
}

internal enum Gooseai_ProjectServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "ProjectService",
    fullName: "gooseai.ProjectService",
    methods: [
      Gooseai_ProjectServiceClientMetadata.Methods.create,
      Gooseai_ProjectServiceClientMetadata.Methods.update,
      Gooseai_ProjectServiceClientMetadata.Methods.list,
      Gooseai_ProjectServiceClientMetadata.Methods.get,
      Gooseai_ProjectServiceClientMetadata.Methods.delete,
      Gooseai_ProjectServiceClientMetadata.Methods.queryAssets,
    ]
  )

  internal enum Methods {
    internal static let create = GRPCMethodDescriptor(
      name: "Create",
      path: "/gooseai.ProjectService/Create",
      type: GRPCCallType.unary
    )

    internal static let update = GRPCMethodDescriptor(
      name: "Update",
      path: "/gooseai.ProjectService/Update",
      type: GRPCCallType.unary
    )

    internal static let list = GRPCMethodDescriptor(
      name: "List",
      path: "/gooseai.ProjectService/List",
      type: GRPCCallType.serverStreaming
    )

    internal static let get = GRPCMethodDescriptor(
      name: "Get",
      path: "/gooseai.ProjectService/Get",
      type: GRPCCallType.unary
    )

    internal static let delete = GRPCMethodDescriptor(
      name: "Delete",
      path: "/gooseai.ProjectService/Delete",
      type: GRPCCallType.unary
    )

    internal static let queryAssets = GRPCMethodDescriptor(
      name: "QueryAssets",
      path: "/gooseai.ProjectService/QueryAssets",
      type: GRPCCallType.unary
    )
  }
}

///
/// gRPC services
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Gooseai_ProjectServiceProvider: CallHandlerProvider {
  var interceptors: Gooseai_ProjectServiceServerInterceptorFactoryProtocol? { get }

  /// Create a new project if it does not exist
  func create(request: Gooseai_CreateProjectRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_Project>

  /// Update an existing project
  func update(request: Gooseai_UpdateProjectRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_Project>

  /// List all the projects for an organization
  func list(request: Gooseai_ListProjectRequest, context: StreamingResponseCallContext<Gooseai_Project>) -> EventLoopFuture<GRPCStatus>

  /// Get a project
  func get(request: Gooseai_GetProjectRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_Project>

  /// Delete a project
  func delete(request: Gooseai_DeleteProjectRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_Project>

  /// Query the assets of a project, with additional filtering
  func queryAssets(request: Gooseai_QueryAssetsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_QueryAssetsResponse>
}

extension Gooseai_ProjectServiceProvider {
  internal var serviceName: Substring {
    return Gooseai_ProjectServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Create":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_CreateProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeCreateInterceptors() ?? [],
        userFunction: self.create(request:context:)
      )

    case "Update":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_UpdateProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeUpdateInterceptors() ?? [],
        userFunction: self.update(request:context:)
      )

    case "List":
      return ServerStreamingServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_ListProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeListInterceptors() ?? [],
        userFunction: self.list(request:context:)
      )

    case "Get":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_GetProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeGetInterceptors() ?? [],
        userFunction: self.get(request:context:)
      )

    case "Delete":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_DeleteProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeDeleteInterceptors() ?? [],
        userFunction: self.delete(request:context:)
      )

    case "QueryAssets":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_QueryAssetsRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_QueryAssetsResponse>(),
        interceptors: self.interceptors?.makeQueryAssetsInterceptors() ?? [],
        userFunction: self.queryAssets(request:context:)
      )

    default:
      return nil
    }
  }
}

#if compiler(>=5.6)

///
/// gRPC services
///
/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Gooseai_ProjectServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Gooseai_ProjectServiceServerInterceptorFactoryProtocol? { get }

  /// Create a new project if it does not exist
  @Sendable func create(
    request: Gooseai_CreateProjectRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_Project

  /// Update an existing project
  @Sendable func update(
    request: Gooseai_UpdateProjectRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_Project

  /// List all the projects for an organization
  @Sendable func list(
    request: Gooseai_ListProjectRequest,
    responseStream: GRPCAsyncResponseStreamWriter<Gooseai_Project>,
    context: GRPCAsyncServerCallContext
  ) async throws

  /// Get a project
  @Sendable func get(
    request: Gooseai_GetProjectRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_Project

  /// Delete a project
  @Sendable func delete(
    request: Gooseai_DeleteProjectRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_Project

  /// Query the assets of a project, with additional filtering
  @Sendable func queryAssets(
    request: Gooseai_QueryAssetsRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_QueryAssetsResponse
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_ProjectServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Gooseai_ProjectServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Gooseai_ProjectServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Gooseai_ProjectServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Create":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_CreateProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeCreateInterceptors() ?? [],
        wrapping: self.create(request:context:)
      )

    case "Update":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_UpdateProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeUpdateInterceptors() ?? [],
        wrapping: self.update(request:context:)
      )

    case "List":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_ListProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeListInterceptors() ?? [],
        wrapping: self.list(request:responseStream:context:)
      )

    case "Get":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_GetProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeGetInterceptors() ?? [],
        wrapping: self.get(request:context:)
      )

    case "Delete":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_DeleteProjectRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Project>(),
        interceptors: self.interceptors?.makeDeleteInterceptors() ?? [],
        wrapping: self.delete(request:context:)
      )

    case "QueryAssets":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_QueryAssetsRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_QueryAssetsResponse>(),
        interceptors: self.interceptors?.makeQueryAssetsInterceptors() ?? [],
        wrapping: self.queryAssets(request:context:)
      )

    default:
      return nil
    }
  }
}

#endif // compiler(>=5.6)

internal protocol Gooseai_ProjectServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'create'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateInterceptors() -> [ServerInterceptor<Gooseai_CreateProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when handling 'update'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateInterceptors() -> [ServerInterceptor<Gooseai_UpdateProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when handling 'list'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeListInterceptors() -> [ServerInterceptor<Gooseai_ListProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when handling 'get'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGetInterceptors() -> [ServerInterceptor<Gooseai_GetProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when handling 'delete'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteInterceptors() -> [ServerInterceptor<Gooseai_DeleteProjectRequest, Gooseai_Project>]

  /// - Returns: Interceptors to use when handling 'queryAssets'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeQueryAssetsInterceptors() -> [ServerInterceptor<Gooseai_QueryAssetsRequest, Gooseai_QueryAssetsResponse>]
}

internal enum Gooseai_ProjectServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "ProjectService",
    fullName: "gooseai.ProjectService",
    methods: [
      Gooseai_ProjectServiceServerMetadata.Methods.create,
      Gooseai_ProjectServiceServerMetadata.Methods.update,
      Gooseai_ProjectServiceServerMetadata.Methods.list,
      Gooseai_ProjectServiceServerMetadata.Methods.get,
      Gooseai_ProjectServiceServerMetadata.Methods.delete,
      Gooseai_ProjectServiceServerMetadata.Methods.queryAssets,
    ]
  )

  internal enum Methods {
    internal static let create = GRPCMethodDescriptor(
      name: "Create",
      path: "/gooseai.ProjectService/Create",
      type: GRPCCallType.unary
    )

    internal static let update = GRPCMethodDescriptor(
      name: "Update",
      path: "/gooseai.ProjectService/Update",
      type: GRPCCallType.unary
    )

    internal static let list = GRPCMethodDescriptor(
      name: "List",
      path: "/gooseai.ProjectService/List",
      type: GRPCCallType.serverStreaming
    )

    internal static let get = GRPCMethodDescriptor(
      name: "Get",
      path: "/gooseai.ProjectService/Get",
      type: GRPCCallType.unary
    )

    internal static let delete = GRPCMethodDescriptor(
      name: "Delete",
      path: "/gooseai.ProjectService/Delete",
      type: GRPCCallType.unary
    )

    internal static let queryAssets = GRPCMethodDescriptor(
      name: "QueryAssets",
      path: "/gooseai.ProjectService/QueryAssets",
      type: GRPCCallType.unary
    )
  }
}
