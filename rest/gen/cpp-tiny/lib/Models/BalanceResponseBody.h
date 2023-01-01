
/*
 * BalanceResponseBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BalanceResponseBody_H_
#define TINY_CPP_CLIENT_BalanceResponseBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BalanceResponseBody{
public:

    /*! \brief Constructor.
	 */
    BalanceResponseBody();
    BalanceResponseBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BalanceResponseBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The balance of the account/organization associated with the API key
	 */
	double getCredits();

	/*! \brief Set The balance of the account/organization associated with the API key
	 */
	void setCredits(double  credits);


    private:
    double credits{};
};
}

#endif /* TINY_CPP_CLIENT_BalanceResponseBody_H_ */
