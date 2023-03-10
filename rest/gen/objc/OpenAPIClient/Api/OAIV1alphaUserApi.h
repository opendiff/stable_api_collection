#import <Foundation/Foundation.h>
#import "OAIAccountResponseBody.h"
#import "OAIBalanceResponseBody.h"
#import "OAIApi.h"

/**
* Stability.ai REST API
* Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
*
* The version of the OpenAPI document: 0.1
* Contact: info@stability.ai
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIV1alphaUserApi: NSObject <OAIApi>

extern NSString* kOAIV1alphaUserApiErrorDomain;
extern NSInteger kOAIV1alphaUserApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// account
/// Get information about the account associated with the provided API key
///
/// 
///  code:200 message:"OK response."
///
/// @return OAIAccountResponseBody*
-(NSURLSessionTask*) v1alphaUserAccountWithCompletionHandler: 
    (void (^)(OAIAccountResponseBody* output, NSError* error)) handler;


/// balance
/// Get the credit balance of the account/organization associated with the API key
///
/// @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional)
/// 
///  code:200 message:"OK response."
///
/// @return OAIBalanceResponseBody*
-(NSURLSessionTask*) v1alphaUserBalanceWithOrganization: (NSString*) organization
    completionHandler: (void (^)(OAIBalanceResponseBody* output, NSError* error)) handler;



@end
