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



#include "CppRestOpenAPIClient/model/BalanceResponseBody.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



BalanceResponseBody::BalanceResponseBody()
{
    m_Credits = 0.0;
    m_CreditsIsSet = false;
}

BalanceResponseBody::~BalanceResponseBody()
{
}

void BalanceResponseBody::validate()
{
    // TODO: implement validation
}

web::json::value BalanceResponseBody::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CreditsIsSet)
    {
        val[utility::conversions::to_string_t(U("credits"))] = ModelBase::toJson(m_Credits);
    }

    return val;
}

bool BalanceResponseBody::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("credits"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("credits")));
        if(!fieldValue.is_null())
        {
            double refVal_setCredits;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCredits);
            setCredits(refVal_setCredits);
        }
    }
    return ok;
}

void BalanceResponseBody::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CreditsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("credits")), m_Credits));
    }
}

bool BalanceResponseBody::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("credits"))))
    {
        double refVal_setCredits;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("credits"))), refVal_setCredits );
        setCredits(refVal_setCredits);
    }
    return ok;
}

double BalanceResponseBody::getCredits() const
{
    return m_Credits;
}

void BalanceResponseBody::setCredits(double value)
{
    m_Credits = value;
    m_CreditsIsSet = true;
}

bool BalanceResponseBody::creditsIsSet() const
{
    return m_CreditsIsSet;
}

void BalanceResponseBody::unsetCredits()
{
    m_CreditsIsSet = false;
}
}
}
}
}


