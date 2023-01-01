#ifndef list_engines_response_body_TEST
#define list_engines_response_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_engines_response_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_engines_response_body.h"
list_engines_response_body_t* instantiate_list_engines_response_body(int include_optional);



list_engines_response_body_t* instantiate_list_engines_response_body(int include_optional) {
  list_engines_response_body_t* list_engines_response_body = NULL;
  if (include_optional) {
    list_engines_response_body = list_engines_response_body_create(
      [{"description":"Stability-AI Stable Diffusion v1.5","id":"stable-diffusion-v1-5","name":"Stable Diffusion v1.5","type":"PICTURE"},{"description":"Stability-AI Stable Diffusion v2.1","id":"stable-diffusion-512-v2-1","name":"Stable Diffusion v2.1","type":"PICTURE"},{"description":"Stability-AI Stable Diffusion 768 v2.1","id":"stable-diffusion-768-v2-1","name":"Stable Diffusion v2.1-768","type":"PICTURE"}]
    );
  } else {
    list_engines_response_body = list_engines_response_body_create(
      [{"description":"Stability-AI Stable Diffusion v1.5","id":"stable-diffusion-v1-5","name":"Stable Diffusion v1.5","type":"PICTURE"},{"description":"Stability-AI Stable Diffusion v2.1","id":"stable-diffusion-512-v2-1","name":"Stable Diffusion v2.1","type":"PICTURE"},{"description":"Stability-AI Stable Diffusion 768 v2.1","id":"stable-diffusion-768-v2-1","name":"Stable Diffusion v2.1-768","type":"PICTURE"}]
    );
  }

  return list_engines_response_body;
}


#ifdef list_engines_response_body_MAIN

void test_list_engines_response_body(int include_optional) {
    list_engines_response_body_t* list_engines_response_body_1 = instantiate_list_engines_response_body(include_optional);

	cJSON* jsonlist_engines_response_body_1 = list_engines_response_body_convertToJSON(list_engines_response_body_1);
	printf("list_engines_response_body :\n%s\n", cJSON_Print(jsonlist_engines_response_body_1));
	list_engines_response_body_t* list_engines_response_body_2 = list_engines_response_body_parseFromJSON(jsonlist_engines_response_body_1);
	cJSON* jsonlist_engines_response_body_2 = list_engines_response_body_convertToJSON(list_engines_response_body_2);
	printf("repeating list_engines_response_body:\n%s\n", cJSON_Print(jsonlist_engines_response_body_2));
}

int main() {
  test_list_engines_response_body(1);
  test_list_engines_response_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_engines_response_body_MAIN
#endif // list_engines_response_body_TEST
