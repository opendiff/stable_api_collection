
/*
 * ListEnginesResponseBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListEnginesResponseBody_H_
#define TINY_CPP_CLIENT_ListEnginesResponseBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Engine.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListEnginesResponseBody{
public:

    /*! \brief Constructor.
	 */
    ListEnginesResponseBody();
    ListEnginesResponseBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListEnginesResponseBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The engines available to your user/organization
	 */
	std::list<Engine> getEngines();

	/*! \brief Set The engines available to your user/organization
	 */
	void setEngines(std::list <Engine> engines);


    private:
    std::list<Engine> engines;
};
}

#endif /* TINY_CPP_CLIENT_ListEnginesResponseBody_H_ */
