
#include "OrganizationMembership.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrganizationMembership_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OrganizationMembership obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OrganizationMembership_is_default_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_default", true
    };

    OrganizationMembership obj(input.dump());

    TEST_ASSERT(true == obj.isIsDefault());




}


void test_OrganizationMembership_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    OrganizationMembership obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_OrganizationMembership_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "role", "hello"
    };

    OrganizationMembership obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRole().c_str());






}



void test_OrganizationMembership_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OrganizationMembership obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OrganizationMembership_is_default_is_converted_to_json()
{


    bourne::json input =
    {
        "is_default", true
    };

    OrganizationMembership obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_default"] == output["is_default"]);


}


void test_OrganizationMembership_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    OrganizationMembership obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_OrganizationMembership_role_is_converted_to_json()
{

    bourne::json input =
    {
        "role", "hello"
    };

    OrganizationMembership obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["role"] == output["role"]);



}


