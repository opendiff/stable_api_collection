#ifndef TINY_CPP_CLIENT_V1alphaEnginesApi_H_
#define TINY_CPP_CLIENT_V1alphaEnginesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ListEnginesResponseBody.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class V1alphaEnginesApi : public Service {
public:
    V1alphaEnginesApi() = default;

    virtual ~V1alphaEnginesApi() = default;

    /**
    * list.
    *
    * List all engines available to your organization/user
    * \param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    */
    Response<
                ListEnginesResponseBody
        >
    v1alpha_enginesListEngines(
            
            std::string organization
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_V1alphaEnginesApi_H_ */