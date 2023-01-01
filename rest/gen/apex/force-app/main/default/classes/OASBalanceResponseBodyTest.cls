@isTest
private class OASBalanceResponseBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = balanceResponseBody1;
        OASBalanceResponseBody balanceResponseBody3 = new OASBalanceResponseBody();
        OASBalanceResponseBody balanceResponseBody4 = balanceResponseBody3;

        System.assert(balanceResponseBody1.equals(balanceResponseBody2));
        System.assert(balanceResponseBody2.equals(balanceResponseBody1));
        System.assert(balanceResponseBody1.equals(balanceResponseBody1));
        System.assert(balanceResponseBody3.equals(balanceResponseBody4));
        System.assert(balanceResponseBody4.equals(balanceResponseBody3));
        System.assert(balanceResponseBody3.equals(balanceResponseBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody3 = new OASBalanceResponseBody();
        OASBalanceResponseBody balanceResponseBody4 = new OASBalanceResponseBody();

        System.assert(balanceResponseBody1.equals(balanceResponseBody2));
        System.assert(balanceResponseBody2.equals(balanceResponseBody1));
        System.assert(balanceResponseBody3.equals(balanceResponseBody4));
        System.assert(balanceResponseBody4.equals(balanceResponseBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = new OASBalanceResponseBody();

        System.assertEquals(false, balanceResponseBody1.equals('foo'));
        System.assertEquals(false, balanceResponseBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = new OASBalanceResponseBody();
        OASBalanceResponseBody balanceResponseBody3;

        System.assertEquals(false, balanceResponseBody1.equals(balanceResponseBody3));
        System.assertEquals(false, balanceResponseBody2.equals(balanceResponseBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = new OASBalanceResponseBody();

        System.assertEquals(balanceResponseBody1.hashCode(), balanceResponseBody1.hashCode());
        System.assertEquals(balanceResponseBody2.hashCode(), balanceResponseBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBalanceResponseBody balanceResponseBody1 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody2 = OASBalanceResponseBody.getExample();
        OASBalanceResponseBody balanceResponseBody3 = new OASBalanceResponseBody();
        OASBalanceResponseBody balanceResponseBody4 = new OASBalanceResponseBody();

        System.assert(balanceResponseBody1.equals(balanceResponseBody2));
        System.assert(balanceResponseBody3.equals(balanceResponseBody4));
        System.assertEquals(balanceResponseBody1.hashCode(), balanceResponseBody2.hashCode());
        System.assertEquals(balanceResponseBody3.hashCode(), balanceResponseBody4.hashCode());
    }
}
