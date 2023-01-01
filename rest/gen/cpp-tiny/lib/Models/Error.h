
/*
 * Error.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Error_H_
#define TINY_CPP_CLIENT_Error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Error{
public:

    /*! \brief Constructor.
	 */
    Error();
    Error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Is the error a server-side fault?
	 */
	bool isFault();

	/*! \brief Set Is the error a server-side fault?
	 */
	void setFault(bool  fault);
	/*! \brief Get ID is a unique identifier for this particular occurrence of the problem.
	 */
	std::string getId();

	/*! \brief Set ID is a unique identifier for this particular occurrence of the problem.
	 */
	void setId(std::string  id);
	/*! \brief Get Message is a human-readable explanation specific to this occurrence of the problem.
	 */
	std::string getMessage();

	/*! \brief Set Message is a human-readable explanation specific to this occurrence of the problem.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Name is the name of this class of errors.
	 */
	std::string getName();

	/*! \brief Set Name is the name of this class of errors.
	 */
	void setName(std::string  name);
	/*! \brief Get Is the error temporary?
	 */
	bool isTemporary();

	/*! \brief Set Is the error temporary?
	 */
	void setTemporary(bool  temporary);
	/*! \brief Get Is the error a timeout?
	 */
	bool isTimeout();

	/*! \brief Set Is the error a timeout?
	 */
	void setTimeout(bool  timeout);


    private:
    bool fault{};
    std::string id{};
    std::string message{};
    std::string name{};
    bool temporary{};
    bool timeout{};
};
}

#endif /* TINY_CPP_CLIENT_Error_H_ */
