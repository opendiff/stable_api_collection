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



#include "CppRestOpenAPIClient/model/TextPrompt.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



TextPrompt::TextPrompt()
{
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
    m_Weight = 0.0f;
    m_WeightIsSet = false;
}

TextPrompt::~TextPrompt()
{
}

void TextPrompt::validate()
{
    // TODO: implement validation
}

web::json::value TextPrompt::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }
    if(m_WeightIsSet)
    {
        val[utility::conversions::to_string_t(U("weight"))] = ModelBase::toJson(m_Weight);
    }

    return val;
}

bool TextPrompt::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("weight"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("weight")));
        if(!fieldValue.is_null())
        {
            float refVal_setWeight;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWeight);
            setWeight(refVal_setWeight);
        }
    }
    return ok;
}

void TextPrompt::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
    if(m_WeightIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("weight")), m_Weight));
    }
}

bool TextPrompt::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("weight"))))
    {
        float refVal_setWeight;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("weight"))), refVal_setWeight );
        setWeight(refVal_setWeight);
    }
    return ok;
}

utility::string_t TextPrompt::getText() const
{
    return m_Text;
}

void TextPrompt::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool TextPrompt::textIsSet() const
{
    return m_TextIsSet;
}

void TextPrompt::unsetText()
{
    m_TextIsSet = false;
}
float TextPrompt::getWeight() const
{
    return m_Weight;
}

void TextPrompt::setWeight(float value)
{
    m_Weight = value;
    m_WeightIsSet = true;
}

bool TextPrompt::weightIsSet() const
{
    return m_WeightIsSet;
}

void TextPrompt::unsetWeight()
{
    m_WeightIsSet = false;
}
}
}
}
}


