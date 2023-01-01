
#include "AccountResponseBody.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AccountResponseBody_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "email", "hello"
    };

    AccountResponseBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_AccountResponseBody_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AccountResponseBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_AccountResponseBody_profile_picture_is_assigned_from_json()
{


    bourne::json input =
    {
        "profile_picture", "hello"
    };

    AccountResponseBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProfilePicture().c_str());






}



void test_AccountResponseBody_email_is_converted_to_json()
{

    bourne::json input =
    {
        "email", "hello"
    };

    AccountResponseBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_AccountResponseBody_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AccountResponseBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_AccountResponseBody_profile_picture_is_converted_to_json()
{

    bourne::json input =
    {
        "profile_picture", "hello"
    };

    AccountResponseBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["profile_picture"] == output["profile_picture"]);



}


