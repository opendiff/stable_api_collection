@isTest
private class OASOrganizationMembershipTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = organizationMembership1;
        OASOrganizationMembership organizationMembership3 = new OASOrganizationMembership();
        OASOrganizationMembership organizationMembership4 = organizationMembership3;

        System.assert(organizationMembership1.equals(organizationMembership2));
        System.assert(organizationMembership2.equals(organizationMembership1));
        System.assert(organizationMembership1.equals(organizationMembership1));
        System.assert(organizationMembership3.equals(organizationMembership4));
        System.assert(organizationMembership4.equals(organizationMembership3));
        System.assert(organizationMembership3.equals(organizationMembership3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership3 = new OASOrganizationMembership();
        OASOrganizationMembership organizationMembership4 = new OASOrganizationMembership();

        System.assert(organizationMembership1.equals(organizationMembership2));
        System.assert(organizationMembership2.equals(organizationMembership1));
        System.assert(organizationMembership3.equals(organizationMembership4));
        System.assert(organizationMembership4.equals(organizationMembership3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = new OASOrganizationMembership();

        System.assertEquals(false, organizationMembership1.equals('foo'));
        System.assertEquals(false, organizationMembership2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = new OASOrganizationMembership();
        OASOrganizationMembership organizationMembership3;

        System.assertEquals(false, organizationMembership1.equals(organizationMembership3));
        System.assertEquals(false, organizationMembership2.equals(organizationMembership3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = new OASOrganizationMembership();

        System.assertEquals(organizationMembership1.hashCode(), organizationMembership1.hashCode());
        System.assertEquals(organizationMembership2.hashCode(), organizationMembership2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrganizationMembership organizationMembership1 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership2 = OASOrganizationMembership.getExample();
        OASOrganizationMembership organizationMembership3 = new OASOrganizationMembership();
        OASOrganizationMembership organizationMembership4 = new OASOrganizationMembership();

        System.assert(organizationMembership1.equals(organizationMembership2));
        System.assert(organizationMembership3.equals(organizationMembership4));
        System.assertEquals(organizationMembership1.hashCode(), organizationMembership2.hashCode());
        System.assertEquals(organizationMembership3.hashCode(), organizationMembership4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrganizationMembership organizationMembership = new OASOrganizationMembership();
        Map<String, String> x-property-mappings = organizationMembership.getx-property-mappings();
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
    }
}
