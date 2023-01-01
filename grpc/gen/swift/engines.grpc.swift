//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: engines.proto
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


/// Usage: instantiate `Gooseai_EnginesServiceClient`, then call methods of this protocol to make API calls.
internal protocol Gooseai_EnginesServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? { get }

  func listEngines(
    _ request: Gooseai_ListEnginesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Gooseai_ListEnginesRequest, Gooseai_Engines>
}

extension Gooseai_EnginesServiceClientProtocol {
  internal var serviceName: String {
    return "gooseai.EnginesService"
  }

  /// Unary call to ListEngines
  ///
  /// - Parameters:
  ///   - request: Request to send to ListEngines.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func listEngines(
    _ request: Gooseai_ListEnginesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Gooseai_ListEnginesRequest, Gooseai_Engines> {
    return self.makeUnaryCall(
      path: Gooseai_EnginesServiceClientMetadata.Methods.listEngines.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListEnginesInterceptors() ?? []
    )
  }
}

#if compiler(>=5.6)
@available(*, deprecated)
extension Gooseai_EnginesServiceClient: @unchecked Sendable {}
#endif // compiler(>=5.6)

@available(*, deprecated, renamed: "Gooseai_EnginesServiceNIOClient")
internal final class Gooseai_EnginesServiceClient: Gooseai_EnginesServiceClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the gooseai.EnginesService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Gooseai_EnginesServiceNIOClient: Gooseai_EnginesServiceClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the gooseai.EnginesService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#if compiler(>=5.6)
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Gooseai_EnginesServiceAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? { get }

  func makeListEnginesCall(
    _ request: Gooseai_ListEnginesRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Gooseai_ListEnginesRequest, Gooseai_Engines>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_EnginesServiceAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Gooseai_EnginesServiceClientMetadata.serviceDescriptor
  }

  internal var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeListEnginesCall(
    _ request: Gooseai_ListEnginesRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Gooseai_ListEnginesRequest, Gooseai_Engines> {
    return self.makeAsyncUnaryCall(
      path: Gooseai_EnginesServiceClientMetadata.Methods.listEngines.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListEnginesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_EnginesServiceAsyncClientProtocol {
  internal func listEngines(
    _ request: Gooseai_ListEnginesRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Gooseai_Engines {
    return try await self.performAsyncUnaryCall(
      path: Gooseai_EnginesServiceClientMetadata.Methods.listEngines.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeListEnginesInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Gooseai_EnginesServiceAsyncClient: Gooseai_EnginesServiceAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Gooseai_EnginesServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#endif // compiler(>=5.6)

internal protocol Gooseai_EnginesServiceClientInterceptorFactoryProtocol: GRPCSendable {

  /// - Returns: Interceptors to use when invoking 'listEngines'.
  func makeListEnginesInterceptors() -> [ClientInterceptor<Gooseai_ListEnginesRequest, Gooseai_Engines>]
}

internal enum Gooseai_EnginesServiceClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "EnginesService",
    fullName: "gooseai.EnginesService",
    methods: [
      Gooseai_EnginesServiceClientMetadata.Methods.listEngines,
    ]
  )

  internal enum Methods {
    internal static let listEngines = GRPCMethodDescriptor(
      name: "ListEngines",
      path: "/gooseai.EnginesService/ListEngines",
      type: GRPCCallType.unary
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Gooseai_EnginesServiceProvider: CallHandlerProvider {
  var interceptors: Gooseai_EnginesServiceServerInterceptorFactoryProtocol? { get }

  func listEngines(request: Gooseai_ListEnginesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Gooseai_Engines>
}

extension Gooseai_EnginesServiceProvider {
  internal var serviceName: Substring {
    return Gooseai_EnginesServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ListEngines":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_ListEnginesRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Engines>(),
        interceptors: self.interceptors?.makeListEnginesInterceptors() ?? [],
        userFunction: self.listEngines(request:context:)
      )

    default:
      return nil
    }
  }
}

#if compiler(>=5.6)

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Gooseai_EnginesServiceAsyncProvider: CallHandlerProvider {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Gooseai_EnginesServiceServerInterceptorFactoryProtocol? { get }

  @Sendable func listEngines(
    request: Gooseai_ListEnginesRequest,
    context: GRPCAsyncServerCallContext
  ) async throws -> Gooseai_Engines
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Gooseai_EnginesServiceAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Gooseai_EnginesServiceServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return Gooseai_EnginesServiceServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: Gooseai_EnginesServiceServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ListEngines":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Gooseai_ListEnginesRequest>(),
        responseSerializer: ProtobufSerializer<Gooseai_Engines>(),
        interceptors: self.interceptors?.makeListEnginesInterceptors() ?? [],
        wrapping: self.listEngines(request:context:)
      )

    default:
      return nil
    }
  }
}

#endif // compiler(>=5.6)

internal protocol Gooseai_EnginesServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'listEngines'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeListEnginesInterceptors() -> [ServerInterceptor<Gooseai_ListEnginesRequest, Gooseai_Engines>]
}

internal enum Gooseai_EnginesServiceServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "EnginesService",
    fullName: "gooseai.EnginesService",
    methods: [
      Gooseai_EnginesServiceServerMetadata.Methods.listEngines,
    ]
  )

  internal enum Methods {
    internal static let listEngines = GRPCMethodDescriptor(
      name: "ListEngines",
      path: "/gooseai.EnginesService/ListEngines",
      type: GRPCCallType.unary
    )
  }
}