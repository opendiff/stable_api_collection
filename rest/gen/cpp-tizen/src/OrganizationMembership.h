/*
 * OrganizationMembership.h
 *
 * 
 */

#ifndef _OrganizationMembership_H_
#define _OrganizationMembership_H_


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

class OrganizationMembership : public Object {
public:
	/*! \brief Constructor.
	 */
	OrganizationMembership();
	OrganizationMembership(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrganizationMembership();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	bool getIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getRole();

	/*! \brief Set 
	 */
	void setRole(std::string  role);

private:
	std::string id;
	bool is_default;
	std::string name;
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrganizationMembership_H_ */
