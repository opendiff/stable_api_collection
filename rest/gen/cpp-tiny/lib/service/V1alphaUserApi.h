#ifndef TINY_CPP_CLIENT_V1alphaUserApi_H_
#define TINY_CPP_CLIENT_V1alphaUserApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AccountResponseBody.h"
#include "BalanceResponseBody.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class V1alphaUserApi : public Service {
public:
    V1alphaUserApi() = default;

    virtual ~V1alphaUserApi() = default;

    /**
    * account.
    *
    * Get information about the account associated with the provided API key
    */
    Response<
                AccountResponseBody
        >
    v1alpha_userAccount(
    );
    /**
    * balance.
    *
    * Get the credit balance of the account/organization associated with the API key
    * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    */
    Response<
                BalanceResponseBody
        >
    v1alpha_userBalance(
            
            std::string organization
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_V1alphaUserApi_H_ */