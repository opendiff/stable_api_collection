@isTest
private class OASAccountResponseBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = accountResponseBody1;
        OASAccountResponseBody accountResponseBody3 = new OASAccountResponseBody();
        OASAccountResponseBody accountResponseBody4 = accountResponseBody3;

        System.assert(accountResponseBody1.equals(accountResponseBody2));
        System.assert(accountResponseBody2.equals(accountResponseBody1));
        System.assert(accountResponseBody1.equals(accountResponseBody1));
        System.assert(accountResponseBody3.equals(accountResponseBody4));
        System.assert(accountResponseBody4.equals(accountResponseBody3));
        System.assert(accountResponseBody3.equals(accountResponseBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody3 = new OASAccountResponseBody();
        OASAccountResponseBody accountResponseBody4 = new OASAccountResponseBody();

        System.assert(accountResponseBody1.equals(accountResponseBody2));
        System.assert(accountResponseBody2.equals(accountResponseBody1));
        System.assert(accountResponseBody3.equals(accountResponseBody4));
        System.assert(accountResponseBody4.equals(accountResponseBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = new OASAccountResponseBody();

        System.assertEquals(false, accountResponseBody1.equals('foo'));
        System.assertEquals(false, accountResponseBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = new OASAccountResponseBody();
        OASAccountResponseBody accountResponseBody3;

        System.assertEquals(false, accountResponseBody1.equals(accountResponseBody3));
        System.assertEquals(false, accountResponseBody2.equals(accountResponseBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = new OASAccountResponseBody();

        System.assertEquals(accountResponseBody1.hashCode(), accountResponseBody1.hashCode());
        System.assertEquals(accountResponseBody2.hashCode(), accountResponseBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAccountResponseBody accountResponseBody1 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody2 = OASAccountResponseBody.getExample();
        OASAccountResponseBody accountResponseBody3 = new OASAccountResponseBody();
        OASAccountResponseBody accountResponseBody4 = new OASAccountResponseBody();

        System.assert(accountResponseBody1.equals(accountResponseBody2));
        System.assert(accountResponseBody3.equals(accountResponseBody4));
        System.assertEquals(accountResponseBody1.hashCode(), accountResponseBody2.hashCode());
        System.assertEquals(accountResponseBody3.hashCode(), accountResponseBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAccountResponseBody accountResponseBody = new OASAccountResponseBody();
        Map<String, String> x-property-mappings = accountResponseBody.getx-property-mappings();
        System.assertEquals('profilePicture', x-property-mappings.get('profile_picture'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAccountResponseBody accountResponseBody = new OASAccountResponseBody();
        System.assertEquals(new List<OASOrganizationMembership>(), accountResponseBody.organizations);
        System.assertEquals(null, accountResponseBody.email);
        System.assertEquals(null, accountResponseBody.id);
        System.assertEquals(null, accountResponseBody.profilePicture);
    }
}
