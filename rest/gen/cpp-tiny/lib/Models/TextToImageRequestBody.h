
/*
 * TextToImageRequestBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TextToImageRequestBody_H_
#define TINY_CPP_CLIENT_TextToImageRequestBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TextPrompt.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TextToImageRequestBody{
public:

    /*! \brief Constructor.
	 */
    TextToImageRequestBody();
    TextToImageRequestBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TextToImageRequestBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
	 */
	long getCfgScale();

	/*! \brief Set How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
	 */
	void setCfgScale(long  cfg_scale);
	/*! \brief Get 
	 */
	std::string getClipGuidancePreset();

	/*! \brief Set 
	 */
	void setClipGuidancePreset(std::string  clip_guidance_preset);
	/*! \brief Get Height of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	int getHeight();

	/*! \brief Set Height of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	void setHeight(int  height);
	/*! \brief Get Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
	 */
	std::string getSampler();

	/*! \brief Set Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.
	 */
	void setSampler(std::string  sampler);
	/*! \brief Get Number of images to generate
	 */
	int getSamples();

	/*! \brief Set Number of images to generate
	 */
	void setSamples(int  samples);
	/*! \brief Get Random noise seed (omit this option or use `0` for a random seed)
	 */
	int getSeed();

	/*! \brief Set Random noise seed (omit this option or use `0` for a random seed)
	 */
	void setSeed(int  seed);
	/*! \brief Get Number of diffusion steps to run
	 */
	int getSteps();

	/*! \brief Set Number of diffusion steps to run
	 */
	void setSteps(int  steps);
	/*! \brief Get 
	 */
	std::list<TextPrompt> getTextPrompts();

	/*! \brief Set 
	 */
	void setTextPrompts(std::list <TextPrompt> text_prompts);
	/*! \brief Get Width of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	int getWidth();

	/*! \brief Set Width of the image (note: `height * width` must be <= 1 Megapixel)
	 */
	void setWidth(int  width);


    private:
    long cfg_scale{};
    std::string clip_guidance_preset{};
    int height{};
    std::string sampler{};
    int samples{};
    int seed{};
    int steps{};
    std::list<TextPrompt> text_prompts;
    int width{};
};
}

#endif /* TINY_CPP_CLIENT_TextToImageRequestBody_H_ */
