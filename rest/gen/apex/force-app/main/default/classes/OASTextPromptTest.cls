@isTest
private class OASTextPromptTest {
    @isTest
    private static void equalsSameInstance() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = textPrompt1;
        OASTextPrompt textPrompt3 = new OASTextPrompt();
        OASTextPrompt textPrompt4 = textPrompt3;

        System.assert(textPrompt1.equals(textPrompt2));
        System.assert(textPrompt2.equals(textPrompt1));
        System.assert(textPrompt1.equals(textPrompt1));
        System.assert(textPrompt3.equals(textPrompt4));
        System.assert(textPrompt4.equals(textPrompt3));
        System.assert(textPrompt3.equals(textPrompt3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt3 = new OASTextPrompt();
        OASTextPrompt textPrompt4 = new OASTextPrompt();

        System.assert(textPrompt1.equals(textPrompt2));
        System.assert(textPrompt2.equals(textPrompt1));
        System.assert(textPrompt3.equals(textPrompt4));
        System.assert(textPrompt4.equals(textPrompt3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = new OASTextPrompt();

        System.assertEquals(false, textPrompt1.equals('foo'));
        System.assertEquals(false, textPrompt2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = new OASTextPrompt();
        OASTextPrompt textPrompt3;

        System.assertEquals(false, textPrompt1.equals(textPrompt3));
        System.assertEquals(false, textPrompt2.equals(textPrompt3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = new OASTextPrompt();

        System.assertEquals(textPrompt1.hashCode(), textPrompt1.hashCode());
        System.assertEquals(textPrompt2.hashCode(), textPrompt2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTextPrompt textPrompt1 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt2 = OASTextPrompt.getExample();
        OASTextPrompt textPrompt3 = new OASTextPrompt();
        OASTextPrompt textPrompt4 = new OASTextPrompt();

        System.assert(textPrompt1.equals(textPrompt2));
        System.assert(textPrompt3.equals(textPrompt4));
        System.assertEquals(textPrompt1.hashCode(), textPrompt2.hashCode());
        System.assertEquals(textPrompt3.hashCode(), textPrompt4.hashCode());
    }
}
