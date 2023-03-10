// Code generated by gRPC proto compiler.  DO NOT EDIT!
// source: generation.proto

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import "Generation.pbrpc.h"
#import "Generation.pbobjc.h"
#import <ProtoRPC/ProtoRPCLegacy.h>
#import <RxLibrary/GRXWriter+Immediate.h>

#import "Tensors.pbobjc.h"

@implementation GenerationService

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-designated-initializers"

// Designated initializer
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [super initWithHost:host
                 packageName:@"gooseai"
                 serviceName:@"GenerationService"
                 callOptions:callOptions];
}

- (instancetype)initWithHost:(NSString *)host {
  return [super initWithHost:host
                 packageName:@"gooseai"
                 serviceName:@"GenerationService"];
}

#pragma clang diagnostic pop

// Override superclass initializer to disallow different package and service names.
- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName {
  return [self initWithHost:host];
}

- (instancetype)initWithHost:(NSString *)host
                 packageName:(NSString *)packageName
                 serviceName:(NSString *)serviceName
                 callOptions:(GRPCCallOptions *)callOptions {
  return [self initWithHost:host callOptions:callOptions];
}

#pragma mark - Class Methods

+ (instancetype)serviceWithHost:(NSString *)host {
  return [[self alloc] initWithHost:host];
}

+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [[self alloc] initWithHost:host callOptions:callOptions];
}

#pragma mark - Method Implementations

#pragma mark Generate(Request) returns (stream Answer)

- (void)generateWithRequest:(Request *)request eventHandler:(void(^)(BOOL done, Answer *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToGenerateWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToGenerateWithRequest:(Request *)request eventHandler:(void(^)(BOOL done, Answer *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"Generate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[Answer class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)generateWithMessage:(Request *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"Generate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[Answer class]];
}

#pragma mark ChainGenerate(ChainRequest) returns (stream Answer)

- (void)chainGenerateWithRequest:(ChainRequest *)request eventHandler:(void(^)(BOOL done, Answer *_Nullable response, NSError *_Nullable error))eventHandler{
  [[self RPCToChainGenerateWithRequest:request eventHandler:eventHandler] start];
}
// Returns a not-yet-started RPC object.
- (GRPCProtoCall *)RPCToChainGenerateWithRequest:(ChainRequest *)request eventHandler:(void(^)(BOOL done, Answer *_Nullable response, NSError *_Nullable error))eventHandler{
  return [self RPCToMethod:@"ChainGenerate"
            requestsWriter:[GRXWriter writerWithValue:request]
             responseClass:[Answer class]
        responsesWriteable:[GRXWriteable writeableWithEventHandler:eventHandler]];
}
- (GRPCUnaryProtoCall *)chainGenerateWithMessage:(ChainRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions {
  return [self RPCToMethod:@"ChainGenerate"
                   message:message
           responseHandler:handler
               callOptions:callOptions
             responseClass:[Answer class]];
}

@end
#endif
