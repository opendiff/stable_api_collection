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



#include "CppRestOpenAPIClient/model/OrganizationMembership.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrganizationMembership::OrganizationMembership()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Is_default = false;
    m_Is_defaultIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
}

OrganizationMembership::~OrganizationMembership()
{
}

void OrganizationMembership::validate()
{
    // TODO: implement validation
}

web::json::value OrganizationMembership::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Is_defaultIsSet)
    {
        val[utility::conversions::to_string_t(U("is_default"))] = ModelBase::toJson(m_Is_default);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_RoleIsSet)
    {
        val[utility::conversions::to_string_t(U("role"))] = ModelBase::toJson(m_Role);
    }

    return val;
}

bool OrganizationMembership::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("is_default"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("is_default")));
        if(!fieldValue.is_null())
        {
            bool refVal_setIsDefault;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIsDefault);
            setIsDefault(refVal_setIsDefault);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("role"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("role")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRole;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRole);
            setRole(refVal_setRole);
        }
    }
    return ok;
}

void OrganizationMembership::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Is_defaultIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("is_default")), m_Is_default));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_RoleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("role")), m_Role));
    }
}

bool OrganizationMembership::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("is_default"))))
    {
        bool refVal_setIsDefault;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("is_default"))), refVal_setIsDefault );
        setIsDefault(refVal_setIsDefault);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("role"))))
    {
        utility::string_t refVal_setRole;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("role"))), refVal_setRole );
        setRole(refVal_setRole);
    }
    return ok;
}

utility::string_t OrganizationMembership::getId() const
{
    return m_Id;
}

void OrganizationMembership::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool OrganizationMembership::idIsSet() const
{
    return m_IdIsSet;
}

void OrganizationMembership::unsetId()
{
    m_IdIsSet = false;
}
bool OrganizationMembership::isIsDefault() const
{
    return m_Is_default;
}

void OrganizationMembership::setIsDefault(bool value)
{
    m_Is_default = value;
    m_Is_defaultIsSet = true;
}

bool OrganizationMembership::isDefaultIsSet() const
{
    return m_Is_defaultIsSet;
}

void OrganizationMembership::unsetIs_default()
{
    m_Is_defaultIsSet = false;
}
utility::string_t OrganizationMembership::getName() const
{
    return m_Name;
}

void OrganizationMembership::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool OrganizationMembership::nameIsSet() const
{
    return m_NameIsSet;
}

void OrganizationMembership::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t OrganizationMembership::getRole() const
{
    return m_Role;
}

void OrganizationMembership::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool OrganizationMembership::roleIsSet() const
{
    return m_RoleIsSet;
}

void OrganizationMembership::unsetRole()
{
    m_RoleIsSet = false;
}
}
}
}
}


