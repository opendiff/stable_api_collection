#ifndef balance_response_body_TEST
#define balance_response_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define balance_response_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/balance_response_body.h"
balance_response_body_t* instantiate_balance_response_body(int include_optional);



balance_response_body_t* instantiate_balance_response_body(int include_optional) {
  balance_response_body_t* balance_response_body = NULL;
  if (include_optional) {
    balance_response_body = balance_response_body_create(
      0.11570747925644202
    );
  } else {
    balance_response_body = balance_response_body_create(
      0.11570747925644202
    );
  }

  return balance_response_body;
}


#ifdef balance_response_body_MAIN

void test_balance_response_body(int include_optional) {
    balance_response_body_t* balance_response_body_1 = instantiate_balance_response_body(include_optional);

	cJSON* jsonbalance_response_body_1 = balance_response_body_convertToJSON(balance_response_body_1);
	printf("balance_response_body :\n%s\n", cJSON_Print(jsonbalance_response_body_1));
	balance_response_body_t* balance_response_body_2 = balance_response_body_parseFromJSON(jsonbalance_response_body_1);
	cJSON* jsonbalance_response_body_2 = balance_response_body_convertToJSON(balance_response_body_2);
	printf("repeating balance_response_body:\n%s\n", cJSON_Print(jsonbalance_response_body_2));
}

int main() {
  test_balance_response_body(1);
  test_balance_response_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // balance_response_body_MAIN
#endif // balance_response_body_TEST
