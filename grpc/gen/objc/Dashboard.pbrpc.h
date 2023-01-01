// Code generated by gRPC proto compiler.  DO NOT EDIT!
// source: dashboard.proto

#import <Foundation/Foundation.h>

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#import "Dashboard.pbobjc.h"
#endif

#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
#import <ProtoRPC/ProtoService.h>
#import <ProtoRPC/ProtoRPCLegacy.h>
#import <RxLibrary/GRXWriteable.h>
#import <RxLibrary/GRXWriter.h>
#endif

@class APIKey;
@class APIKeyFindRequest;
@class APIKeyRequest;
@class AutoChargeIntent;
@class Charge;
@class Charges;
@class ClientSettings;
@class CreateAutoChargeIntentRequest;
@class CreateChargeRequest;
@class EmptyRequest;
@class GetAutoChargeRequest;
@class GetChargesRequest;
@class GetMetricsRequest;
@class GetOrganizationRequest;
@class Metrics;
@class Organization;
@class UpdateDefaultOrganizationRequest;
@class UpdateUserInfoRequest;
@class User;
@class UserPasswordChangeTicket;

#if !defined(GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO) || !GPB_GRPC_FORWARD_DECLARE_MESSAGE_PROTO
#endif

@class GRPCUnaryProtoCall;
@class GRPCStreamingProtoCall;
@class GRPCCallOptions;
@protocol GRPCProtoResponseHandler;
@class GRPCProtoCall;


NS_ASSUME_NONNULL_BEGIN

@protocol DashboardService2 <NSObject>

#pragma mark GetMe(EmptyRequest) returns (User)

/**
 * Get info
 */
- (GRPCUnaryProtoCall *)getMeWithMessage:(EmptyRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetOrganization(GetOrganizationRequest) returns (Organization)

- (GRPCUnaryProtoCall *)getOrganizationWithMessage:(GetOrganizationRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetMetrics(GetMetricsRequest) returns (Metrics)

- (GRPCUnaryProtoCall *)getMetricsWithMessage:(GetMetricsRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CreateAPIKey(APIKeyRequest) returns (APIKey)

/**
 * API key management
 */
- (GRPCUnaryProtoCall *)createAPIKeyWithMessage:(APIKeyRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteAPIKey(APIKeyFindRequest) returns (APIKey)

- (GRPCUnaryProtoCall *)deleteAPIKeyWithMessage:(APIKeyFindRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateDefaultOrganization(UpdateDefaultOrganizationRequest) returns (User)

/**
 * User settings
 */
- (GRPCUnaryProtoCall *)updateDefaultOrganizationWithMessage:(UpdateDefaultOrganizationRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetClientSettings(EmptyRequest) returns (ClientSettings)

- (GRPCUnaryProtoCall *)getClientSettingsWithMessage:(EmptyRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark SetClientSettings(ClientSettings) returns (ClientSettings)

- (GRPCUnaryProtoCall *)setClientSettingsWithMessage:(ClientSettings *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateUserInfo(UpdateUserInfoRequest) returns (User)

- (GRPCUnaryProtoCall *)updateUserInfoWithMessage:(UpdateUserInfoRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CreatePasswordChangeTicket(EmptyRequest) returns (UserPasswordChangeTicket)

- (GRPCUnaryProtoCall *)createPasswordChangeTicketWithMessage:(EmptyRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark DeleteAccount(EmptyRequest) returns (User)

- (GRPCUnaryProtoCall *)deleteAccountWithMessage:(EmptyRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CreateCharge(CreateChargeRequest) returns (Charge)

/**
 * Payment functions
 */
- (GRPCUnaryProtoCall *)createChargeWithMessage:(CreateChargeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetCharges(GetChargesRequest) returns (Charges)

- (GRPCUnaryProtoCall *)getChargesWithMessage:(GetChargesRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark CreateAutoChargeIntent(CreateAutoChargeIntentRequest) returns (AutoChargeIntent)

- (GRPCUnaryProtoCall *)createAutoChargeIntentWithMessage:(CreateAutoChargeIntentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark UpdateAutoChargeIntent(CreateAutoChargeIntentRequest) returns (AutoChargeIntent)

- (GRPCUnaryProtoCall *)updateAutoChargeIntentWithMessage:(CreateAutoChargeIntentRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

#pragma mark GetAutoChargeIntent(GetAutoChargeRequest) returns (AutoChargeIntent)

- (GRPCUnaryProtoCall *)getAutoChargeIntentWithMessage:(GetAutoChargeRequest *)message responseHandler:(id<GRPCProtoResponseHandler>)handler callOptions:(GRPCCallOptions *_Nullable)callOptions;

@end

/**
 * The methods in this protocol belong to a set of old APIs that have been deprecated. They do not
 * recognize call options provided in the initializer. Using the v2 protocol is recommended.
 */
@protocol DashboardService <NSObject>

#pragma mark GetMe(EmptyRequest) returns (User)

/**
 * Get info
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)getMeWithRequest:(EmptyRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;

/**
 * Get info
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToGetMeWithRequest:(EmptyRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetOrganization(GetOrganizationRequest) returns (Organization)

- (void)getOrganizationWithRequest:(GetOrganizationRequest *)request handler:(void(^)(Organization *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetOrganizationWithRequest:(GetOrganizationRequest *)request handler:(void(^)(Organization *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetMetrics(GetMetricsRequest) returns (Metrics)

- (void)getMetricsWithRequest:(GetMetricsRequest *)request handler:(void(^)(Metrics *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetMetricsWithRequest:(GetMetricsRequest *)request handler:(void(^)(Metrics *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CreateAPIKey(APIKeyRequest) returns (APIKey)

/**
 * API key management
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)createAPIKeyWithRequest:(APIKeyRequest *)request handler:(void(^)(APIKey *_Nullable response, NSError *_Nullable error))handler;

/**
 * API key management
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToCreateAPIKeyWithRequest:(APIKeyRequest *)request handler:(void(^)(APIKey *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteAPIKey(APIKeyFindRequest) returns (APIKey)

- (void)deleteAPIKeyWithRequest:(APIKeyFindRequest *)request handler:(void(^)(APIKey *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToDeleteAPIKeyWithRequest:(APIKeyFindRequest *)request handler:(void(^)(APIKey *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateDefaultOrganization(UpdateDefaultOrganizationRequest) returns (User)

/**
 * User settings
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)updateDefaultOrganizationWithRequest:(UpdateDefaultOrganizationRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;

/**
 * User settings
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToUpdateDefaultOrganizationWithRequest:(UpdateDefaultOrganizationRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetClientSettings(EmptyRequest) returns (ClientSettings)

- (void)getClientSettingsWithRequest:(EmptyRequest *)request handler:(void(^)(ClientSettings *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetClientSettingsWithRequest:(EmptyRequest *)request handler:(void(^)(ClientSettings *_Nullable response, NSError *_Nullable error))handler;


#pragma mark SetClientSettings(ClientSettings) returns (ClientSettings)

- (void)setClientSettingsWithRequest:(ClientSettings *)request handler:(void(^)(ClientSettings *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToSetClientSettingsWithRequest:(ClientSettings *)request handler:(void(^)(ClientSettings *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateUserInfo(UpdateUserInfoRequest) returns (User)

- (void)updateUserInfoWithRequest:(UpdateUserInfoRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToUpdateUserInfoWithRequest:(UpdateUserInfoRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CreatePasswordChangeTicket(EmptyRequest) returns (UserPasswordChangeTicket)

- (void)createPasswordChangeTicketWithRequest:(EmptyRequest *)request handler:(void(^)(UserPasswordChangeTicket *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCreatePasswordChangeTicketWithRequest:(EmptyRequest *)request handler:(void(^)(UserPasswordChangeTicket *_Nullable response, NSError *_Nullable error))handler;


#pragma mark DeleteAccount(EmptyRequest) returns (User)

- (void)deleteAccountWithRequest:(EmptyRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToDeleteAccountWithRequest:(EmptyRequest *)request handler:(void(^)(User *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CreateCharge(CreateChargeRequest) returns (Charge)

/**
 * Payment functions
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (void)createChargeWithRequest:(CreateChargeRequest *)request handler:(void(^)(Charge *_Nullable response, NSError *_Nullable error))handler;

/**
 * Payment functions
 *
 * This method belongs to a set of APIs that have been deprecated. Using the v2 API is recommended.
 */
- (GRPCProtoCall *)RPCToCreateChargeWithRequest:(CreateChargeRequest *)request handler:(void(^)(Charge *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetCharges(GetChargesRequest) returns (Charges)

- (void)getChargesWithRequest:(GetChargesRequest *)request handler:(void(^)(Charges *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetChargesWithRequest:(GetChargesRequest *)request handler:(void(^)(Charges *_Nullable response, NSError *_Nullable error))handler;


#pragma mark CreateAutoChargeIntent(CreateAutoChargeIntentRequest) returns (AutoChargeIntent)

- (void)createAutoChargeIntentWithRequest:(CreateAutoChargeIntentRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToCreateAutoChargeIntentWithRequest:(CreateAutoChargeIntentRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;


#pragma mark UpdateAutoChargeIntent(CreateAutoChargeIntentRequest) returns (AutoChargeIntent)

- (void)updateAutoChargeIntentWithRequest:(CreateAutoChargeIntentRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToUpdateAutoChargeIntentWithRequest:(CreateAutoChargeIntentRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;


#pragma mark GetAutoChargeIntent(GetAutoChargeRequest) returns (AutoChargeIntent)

- (void)getAutoChargeIntentWithRequest:(GetAutoChargeRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;

- (GRPCProtoCall *)RPCToGetAutoChargeIntentWithRequest:(GetAutoChargeRequest *)request handler:(void(^)(AutoChargeIntent *_Nullable response, NSError *_Nullable error))handler;


@end


#if !defined(GPB_GRPC_PROTOCOL_ONLY) || !GPB_GRPC_PROTOCOL_ONLY
/**
 * Basic service implementation, over gRPC, that only does
 * marshalling and parsing.
 */
@interface DashboardService : GRPCProtoService<DashboardService2, DashboardService>
- (instancetype)initWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions NS_DESIGNATED_INITIALIZER;
+ (instancetype)serviceWithHost:(NSString *)host callOptions:(GRPCCallOptions *_Nullable)callOptions;
// The following methods belong to a set of old APIs that have been deprecated.
- (instancetype)initWithHost:(NSString *)host;
+ (instancetype)serviceWithHost:(NSString *)host;
@end
#endif

NS_ASSUME_NONNULL_END

