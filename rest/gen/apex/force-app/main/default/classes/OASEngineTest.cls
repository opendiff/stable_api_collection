@isTest
private class OASEngineTest {
    @isTest
    private static void equalsSameInstance() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = engine1;
        OASEngine engine3 = new OASEngine();
        OASEngine engine4 = engine3;

        System.assert(engine1.equals(engine2));
        System.assert(engine2.equals(engine1));
        System.assert(engine1.equals(engine1));
        System.assert(engine3.equals(engine4));
        System.assert(engine4.equals(engine3));
        System.assert(engine3.equals(engine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = OASEngine.getExample();
        OASEngine engine3 = new OASEngine();
        OASEngine engine4 = new OASEngine();

        System.assert(engine1.equals(engine2));
        System.assert(engine2.equals(engine1));
        System.assert(engine3.equals(engine4));
        System.assert(engine4.equals(engine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = new OASEngine();

        System.assertEquals(false, engine1.equals('foo'));
        System.assertEquals(false, engine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = new OASEngine();
        OASEngine engine3;

        System.assertEquals(false, engine1.equals(engine3));
        System.assertEquals(false, engine2.equals(engine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = new OASEngine();

        System.assertEquals(engine1.hashCode(), engine1.hashCode());
        System.assertEquals(engine2.hashCode(), engine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEngine engine1 = OASEngine.getExample();
        OASEngine engine2 = OASEngine.getExample();
        OASEngine engine3 = new OASEngine();
        OASEngine engine4 = new OASEngine();

        System.assert(engine1.equals(engine2));
        System.assert(engine3.equals(engine4));
        System.assertEquals(engine1.hashCode(), engine2.hashCode());
        System.assertEquals(engine3.hashCode(), engine4.hashCode());
    }
}
