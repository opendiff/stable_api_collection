#ifndef account_response_body_TEST
#define account_response_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define account_response_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/account_response_body.h"
account_response_body_t* instantiate_account_response_body(int include_optional);



account_response_body_t* instantiate_account_response_body(int include_optional) {
  account_response_body_t* account_response_body = NULL;
  if (include_optional) {
    account_response_body = account_response_body_create(
      "example@stability.ai",
      "user-1234",
      [{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"},{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"},{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"}],
      "https://api.stability.ai/example.png"
    );
  } else {
    account_response_body = account_response_body_create(
      "example@stability.ai",
      "user-1234",
      [{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"},{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"},{"id":"org-123456","is_default":false,"name":"My Organization","role":"MEMBER"}],
      "https://api.stability.ai/example.png"
    );
  }

  return account_response_body;
}


#ifdef account_response_body_MAIN

void test_account_response_body(int include_optional) {
    account_response_body_t* account_response_body_1 = instantiate_account_response_body(include_optional);

	cJSON* jsonaccount_response_body_1 = account_response_body_convertToJSON(account_response_body_1);
	printf("account_response_body :\n%s\n", cJSON_Print(jsonaccount_response_body_1));
	account_response_body_t* account_response_body_2 = account_response_body_parseFromJSON(jsonaccount_response_body_1);
	cJSON* jsonaccount_response_body_2 = account_response_body_convertToJSON(account_response_body_2);
	printf("repeating account_response_body:\n%s\n", cJSON_Print(jsonaccount_response_body_2));
}

int main() {
  test_account_response_body(1);
  test_account_response_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // account_response_body_MAIN
#endif // account_response_body_TEST
