
/*
 * OrganizationMembership.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrganizationMembership_H_
#define TINY_CPP_CLIENT_OrganizationMembership_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrganizationMembership{
public:

    /*! \brief Constructor.
	 */
    OrganizationMembership();
    OrganizationMembership(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrganizationMembership();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	bool isIsDefault();

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
    std::string id{};
    bool is_default{};
    std::string name{};
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_OrganizationMembership_H_ */
