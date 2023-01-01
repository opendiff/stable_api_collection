#ifndef organization_membership_TEST
#define organization_membership_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define organization_membership_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/organization_membership.h"
organization_membership_t* instantiate_organization_membership(int include_optional);



organization_membership_t* instantiate_organization_membership(int include_optional) {
  organization_membership_t* organization_membership = NULL;
  if (include_optional) {
    organization_membership = organization_membership_create(
      "org-123456",
      false,
      "My Organization",
      "MEMBER"
    );
  } else {
    organization_membership = organization_membership_create(
      "org-123456",
      false,
      "My Organization",
      "MEMBER"
    );
  }

  return organization_membership;
}


#ifdef organization_membership_MAIN

void test_organization_membership(int include_optional) {
    organization_membership_t* organization_membership_1 = instantiate_organization_membership(include_optional);

	cJSON* jsonorganization_membership_1 = organization_membership_convertToJSON(organization_membership_1);
	printf("organization_membership :\n%s\n", cJSON_Print(jsonorganization_membership_1));
	organization_membership_t* organization_membership_2 = organization_membership_parseFromJSON(jsonorganization_membership_1);
	cJSON* jsonorganization_membership_2 = organization_membership_convertToJSON(organization_membership_2);
	printf("repeating organization_membership:\n%s\n", cJSON_Print(jsonorganization_membership_2));
}

int main() {
  test_organization_membership(1);
  test_organization_membership(0);

  printf("Hello world \n");
  return 0;
}

#endif // organization_membership_MAIN
#endif // organization_membership_TEST
