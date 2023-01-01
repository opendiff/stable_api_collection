#ifndef text_prompt_TEST
#define text_prompt_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define text_prompt_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/text_prompt.h"
text_prompt_t* instantiate_text_prompt(int include_optional);



text_prompt_t* instantiate_text_prompt(int include_optional) {
  text_prompt_t* text_prompt = NULL;
  if (include_optional) {
    text_prompt = text_prompt_create(
      "jum",
      0.80305135
    );
  } else {
    text_prompt = text_prompt_create(
      "jum",
      0.80305135
    );
  }

  return text_prompt;
}


#ifdef text_prompt_MAIN

void test_text_prompt(int include_optional) {
    text_prompt_t* text_prompt_1 = instantiate_text_prompt(include_optional);

	cJSON* jsontext_prompt_1 = text_prompt_convertToJSON(text_prompt_1);
	printf("text_prompt :\n%s\n", cJSON_Print(jsontext_prompt_1));
	text_prompt_t* text_prompt_2 = text_prompt_parseFromJSON(jsontext_prompt_1);
	cJSON* jsontext_prompt_2 = text_prompt_convertToJSON(text_prompt_2);
	printf("repeating text_prompt:\n%s\n", cJSON_Print(jsontext_prompt_2));
}

int main() {
  test_text_prompt(1);
  test_text_prompt(0);

  printf("Hello world \n");
  return 0;
}

#endif // text_prompt_MAIN
#endif // text_prompt_TEST
