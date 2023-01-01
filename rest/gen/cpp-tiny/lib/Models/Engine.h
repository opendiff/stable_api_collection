
/*
 * Engine.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Engine_H_
#define TINY_CPP_CLIENT_Engine_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Engine{
public:

    /*! \brief Constructor.
	 */
    Engine();
    Engine(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Engine();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Unique identifier for the engine
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the engine
	 */
	void setId(std::string  id);
	/*! \brief Get Name of the engine
	 */
	std::string getName();

	/*! \brief Set Name of the engine
	 */
	void setName(std::string  name);
	/*! \brief Get The type of content this engine produces
	 */
	std::string getType();

	/*! \brief Set The type of content this engine produces
	 */
	void setType(std::string  type);


    private:
    std::string description{};
    std::string id{};
    std::string name{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_Engine_H_ */
