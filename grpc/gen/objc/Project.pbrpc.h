// Code generated by gRPC proto compiler.  DO NOT EDIT!
// source: project.proto

#import <Foundation/Foundation.h>

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Project.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPCLegacy.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class CreateProjectRequest;
@class DeleteProjectRequest;
@class GetProjectRequest;
@class ListProjectRequest;
@class Project;
@class QueryAssetsRequest;
@class QueryAssetsResponse;
@class UpdateProjectRequest;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
  #import "Generation.pbobjc.h"
#endif

@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;
@class GRPCProtoCall;


NS_ASSUME_NONNULL_BEGIN

@protocol ProjectService2 <NSObject>

#pragma mark Create(CreateProjectRequest) returns (Project)

/**
 * Create a new project if it does not exist
 */
- (GRPCUnaryProtoCall *)createWithMessage:(CreateProjectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Update(UpdateProjectRequest) returns (Project)

/**
 * Update an existing project
 */
- (GRPCUnaryProtoCall *)updateWithMessage:(UpdateProjectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark List(ListProjectRequest) returns (stream Project)

/**
 * List all the projects for an organization
 */
- (GRPCUnaryProtoCall *)listWithMessage:(ListProjectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Get(GetProjectRequest) returns (Project)

/**
 * Get a project
 */
- (GRPCUnaryProtoCall *)getWithMessage:(GetProjectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark Delete(DeleteProjectRequest) returns (Project)

/**
 * Delete a project
 */
- (GRPCUnaryProtoCall *)deleteWithMessage:(DeleteProjectRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark QueryAssets(QueryAssetsRequest) returns (QueryAssetsResponse)

/**
 * Query the assets of a project, with additional filtering
 */
- (GRPCUnaryProtoCall *)queryAssetsWithMessage:(QueryAssetsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol ProjectService <NSObject>

#pragma mark Create(CreateProjectRequest) returns (Project)

/**
 * Create a new project if it does not exist
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)createWithRequest:(CreateProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;

/**
 * Create a new project if it does not exist
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToCreateWithRequest:(CreateProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Update(UpdateProjectRequest) returns (Project)

/**
 * Update an existing project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateWithRequest:(UpdateProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;

/**
 * Update an existing project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateWithRequest:(UpdateProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;


#pragma mark List(ListProjectRequest) returns (stream Project)

/**
 * List all the projects for an organization
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)listWithRequest:(ListProjectRequest *)request eventHandler:(void(^)(BOOL done, Project *_Nullable response, NSError *_Nullable error))eventHandler;

/**
 * List all the projects for an organization
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToListWithRequest:(ListProjectRequest *)request eventHandler:(void(^)(BOOL done, Project *_Nullable response, NSError *_Nullable error))eventHandler;


#pragma mark Get(GetProjectRequest) returns (Project)

/**
 * Get a project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getWithRequest:(GetProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;

/**
 * Get a project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetWithRequest:(GetProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;


#pragma mark Delete(DeleteProjectRequest) returns (Project)

/**
 * Delete a project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)deleteWithRequest:(DeleteProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;

/**
 * Delete a project
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToDeleteWithRequest:(DeleteProjectRequest *)request handler:(void(^)(Project *_Nullable response, NSError *_Nullable error))handler;


#pragma mark QueryAssets(QueryAssetsRequest) returns (QueryAssetsResponse)

/**
 * Query the assets of a project, with additional filtering
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)queryAssetsWithRequest:(QueryAssetsRequest *)request handler:(void(^)(QueryAssetsResponse *_Nullable response, NSError *_Nullable error))handler;

/**
 * Query the assets of a project, with additional filtering
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToQueryAssetsWithRequest:(QueryAssetsRequest *)request handler:(void(^)(QueryAssetsResponse *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface ProjectService : GRPCProtoService<ProjectService2, ProjectService>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

