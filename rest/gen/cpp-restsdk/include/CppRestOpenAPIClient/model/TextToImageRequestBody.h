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
 * TextToImageRequestBody.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TextToImageRequestBody_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TextToImageRequestBody_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/TextPrompt.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class TextPrompt;

/// <summary>
/// 
/// </summary>
class  TextToImageRequestBody
    : public ModelBase
{
public:
    TextToImageRequestBody();
    virtual ~TextToImageRequestBody();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TextToImageRequestBody members

    /// <summary>
    /// How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
    /// </summary>
    double getCfgScale() const;
    bool cfgScaleIsSet() const;
    void unsetCfg_scale();

    void setCfgScale(double value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getClipGuidancePreset() const;
    bool clipGuidancePresetIsSet() const;
    void unsetClip_guidance_preset();

    void setClipGuidancePreset(const utility::string_t& value);

    /// <summary>
    /// Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
    /// </summary>
    int32_t getHeight() const;
    bool heightIsSet() const;
    void unsetHeight();

    void setHeight(int32_t value);

    /// <summary>
    /// Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you.
    /// </summary>
    utility::string_t getSampler() const;
    bool samplerIsSet() const;
    void unsetSampler();

    void setSampler(const utility::string_t& value);

    /// <summary>
    /// Number of images to generate
    /// </summary>
    int32_t getSamples() const;
    bool samplesIsSet() const;
    void unsetSamples();

    void setSamples(int32_t value);

    /// <summary>
    /// Random noise seed (omit this option or use &#x60;0&#x60; for a random seed)
    /// </summary>
    int32_t getSeed() const;
    bool seedIsSet() const;
    void unsetSeed();

    void setSeed(int32_t value);

    /// <summary>
    /// Number of diffusion steps to run
    /// </summary>
    int32_t getSteps() const;
    bool stepsIsSet() const;
    void unsetSteps();

    void setSteps(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<TextPrompt>>& getTextPrompts();
    bool textPromptsIsSet() const;
    void unsetText_prompts();

    void setTextPrompts(const std::vector<std::shared_ptr<TextPrompt>>& value);

    /// <summary>
    /// Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
    /// </summary>
    int32_t getWidth() const;
    bool widthIsSet() const;
    void unsetWidth();

    void setWidth(int32_t value);


protected:
    double m_Cfg_scale;
    bool m_Cfg_scaleIsSet;
    utility::string_t m_Clip_guidance_preset;
    bool m_Clip_guidance_presetIsSet;
    int32_t m_Height;
    bool m_HeightIsSet;
    utility::string_t m_Sampler;
    bool m_SamplerIsSet;
    int32_t m_Samples;
    bool m_SamplesIsSet;
    int32_t m_Seed;
    bool m_SeedIsSet;
    int32_t m_Steps;
    bool m_StepsIsSet;
    std::vector<std::shared_ptr<TextPrompt>> m_Text_prompts;
    bool m_Text_promptsIsSet;
    int32_t m_Width;
    bool m_WidthIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TextToImageRequestBody_H_ */
