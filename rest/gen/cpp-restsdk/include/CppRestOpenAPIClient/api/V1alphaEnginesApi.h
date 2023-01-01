/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * V1alphaEnginesApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_V1alphaEnginesApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_V1alphaEnginesApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/ListEnginesResponseBody.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  V1alphaEnginesApi 
{
public:

    explicit V1alphaEnginesApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~V1alphaEnginesApi();

    /// <summary>
    /// list
    /// </summary>
    /// <remarks>
    /// List all engines available to your organization/user
    /// </remarks>
    /// <param name="organization">Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::shared_ptr<ListEnginesResponseBody>> v1alpha_enginesListEngines(
        boost::optional<utility::string_t> organization
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_V1alphaEnginesApi_H_ */
