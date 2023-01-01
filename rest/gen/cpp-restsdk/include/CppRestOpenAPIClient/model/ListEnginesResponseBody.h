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
 * ListEnginesResponseBody.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ListEnginesResponseBody_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ListEnginesResponseBody_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Engine.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Engine;

/// <summary>
/// 
/// </summary>
class  ListEnginesResponseBody
    : public ModelBase
{
public:
    ListEnginesResponseBody();
    virtual ~ListEnginesResponseBody();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ListEnginesResponseBody members

    /// <summary>
    /// The engines available to your user/organization
    /// </summary>
    std::vector<std::shared_ptr<Engine>>& getEngines();
    bool enginesIsSet() const;
    void unsetEngines();

    void setEngines(const std::vector<std::shared_ptr<Engine>>& value);


protected:
    std::vector<std::shared_ptr<Engine>> m_Engines;
    bool m_EnginesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ListEnginesResponseBody_H_ */
