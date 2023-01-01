
/*
 * TextPrompt.h
 *
 * Text prompt for image generation
 */

#ifndef TINY_CPP_CLIENT_TextPrompt_H_
#define TINY_CPP_CLIENT_TextPrompt_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Text prompt for image generation
 *
 *  \ingroup Models
 *
 */

class TextPrompt{
public:

    /*! \brief Constructor.
	 */
    TextPrompt();
    TextPrompt(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TextPrompt();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);
	/*! \brief Get Weight of the prompt (use negative numbers for negative prompts)
	 */
	float getWeight();

	/*! \brief Set Weight of the prompt (use negative numbers for negative prompts)
	 */
	void setWeight(float  weight);


    private:
    std::string text{};
    float weight{};
};
}

#endif /* TINY_CPP_CLIENT_TextPrompt_H_ */
