/*
 * BalanceResponseBody.h
 *
 * 
 */

#ifndef _BalanceResponseBody_H_
#define _BalanceResponseBody_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BalanceResponseBody : public Object {
public:
	/*! \brief Constructor.
	 */
	BalanceResponseBody();
	BalanceResponseBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BalanceResponseBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The balance of the account/organization associated with the API key
	 */
	double getCredits();

	/*! \brief Set The balance of the account/organization associated with the API key
	 */
	void setCredits(double  credits);

private:
	double credits;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BalanceResponseBody_H_ */
