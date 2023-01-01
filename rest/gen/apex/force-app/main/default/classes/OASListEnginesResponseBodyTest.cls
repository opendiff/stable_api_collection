@isTest
private class OASListEnginesResponseBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = listEnginesResponseBody1;
        OASListEnginesResponseBody listEnginesResponseBody3 = new OASListEnginesResponseBody();
        OASListEnginesResponseBody listEnginesResponseBody4 = listEnginesResponseBody3;

        System.assert(listEnginesResponseBody1.equals(listEnginesResponseBody2));
        System.assert(listEnginesResponseBody2.equals(listEnginesResponseBody1));
        System.assert(listEnginesResponseBody1.equals(listEnginesResponseBody1));
        System.assert(listEnginesResponseBody3.equals(listEnginesResponseBody4));
        System.assert(listEnginesResponseBody4.equals(listEnginesResponseBody3));
        System.assert(listEnginesResponseBody3.equals(listEnginesResponseBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody3 = new OASListEnginesResponseBody();
        OASListEnginesResponseBody listEnginesResponseBody4 = new OASListEnginesResponseBody();

        System.assert(listEnginesResponseBody1.equals(listEnginesResponseBody2));
        System.assert(listEnginesResponseBody2.equals(listEnginesResponseBody1));
        System.assert(listEnginesResponseBody3.equals(listEnginesResponseBody4));
        System.assert(listEnginesResponseBody4.equals(listEnginesResponseBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = new OASListEnginesResponseBody();

        System.assertEquals(false, listEnginesResponseBody1.equals('foo'));
        System.assertEquals(false, listEnginesResponseBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = new OASListEnginesResponseBody();
        OASListEnginesResponseBody listEnginesResponseBody3;

        System.assertEquals(false, listEnginesResponseBody1.equals(listEnginesResponseBody3));
        System.assertEquals(false, listEnginesResponseBody2.equals(listEnginesResponseBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = new OASListEnginesResponseBody();

        System.assertEquals(listEnginesResponseBody1.hashCode(), listEnginesResponseBody1.hashCode());
        System.assertEquals(listEnginesResponseBody2.hashCode(), listEnginesResponseBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListEnginesResponseBody listEnginesResponseBody1 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody2 = OASListEnginesResponseBody.getExample();
        OASListEnginesResponseBody listEnginesResponseBody3 = new OASListEnginesResponseBody();
        OASListEnginesResponseBody listEnginesResponseBody4 = new OASListEnginesResponseBody();

        System.assert(listEnginesResponseBody1.equals(listEnginesResponseBody2));
        System.assert(listEnginesResponseBody3.equals(listEnginesResponseBody4));
        System.assertEquals(listEnginesResponseBody1.hashCode(), listEnginesResponseBody2.hashCode());
        System.assertEquals(listEnginesResponseBody3.hashCode(), listEnginesResponseBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListEnginesResponseBody listEnginesResponseBody = new OASListEnginesResponseBody();
        System.assertEquals(new List<OASEngine>(), listEnginesResponseBody.engines);
    }
}
