@isTest
private class OASTextToImageRequestBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = textToImageRequestBody1;
        OASTextToImageRequestBody textToImageRequestBody3 = new OASTextToImageRequestBody();
        OASTextToImageRequestBody textToImageRequestBody4 = textToImageRequestBody3;

        System.assert(textToImageRequestBody1.equals(textToImageRequestBody2));
        System.assert(textToImageRequestBody2.equals(textToImageRequestBody1));
        System.assert(textToImageRequestBody1.equals(textToImageRequestBody1));
        System.assert(textToImageRequestBody3.equals(textToImageRequestBody4));
        System.assert(textToImageRequestBody4.equals(textToImageRequestBody3));
        System.assert(textToImageRequestBody3.equals(textToImageRequestBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody3 = new OASTextToImageRequestBody();
        OASTextToImageRequestBody textToImageRequestBody4 = new OASTextToImageRequestBody();

        System.assert(textToImageRequestBody1.equals(textToImageRequestBody2));
        System.assert(textToImageRequestBody2.equals(textToImageRequestBody1));
        System.assert(textToImageRequestBody3.equals(textToImageRequestBody4));
        System.assert(textToImageRequestBody4.equals(textToImageRequestBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = new OASTextToImageRequestBody();

        System.assertEquals(false, textToImageRequestBody1.equals('foo'));
        System.assertEquals(false, textToImageRequestBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = new OASTextToImageRequestBody();
        OASTextToImageRequestBody textToImageRequestBody3;

        System.assertEquals(false, textToImageRequestBody1.equals(textToImageRequestBody3));
        System.assertEquals(false, textToImageRequestBody2.equals(textToImageRequestBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = new OASTextToImageRequestBody();

        System.assertEquals(textToImageRequestBody1.hashCode(), textToImageRequestBody1.hashCode());
        System.assertEquals(textToImageRequestBody2.hashCode(), textToImageRequestBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTextToImageRequestBody textToImageRequestBody1 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody2 = OASTextToImageRequestBody.getExample();
        OASTextToImageRequestBody textToImageRequestBody3 = new OASTextToImageRequestBody();
        OASTextToImageRequestBody textToImageRequestBody4 = new OASTextToImageRequestBody();

        System.assert(textToImageRequestBody1.equals(textToImageRequestBody2));
        System.assert(textToImageRequestBody3.equals(textToImageRequestBody4));
        System.assertEquals(textToImageRequestBody1.hashCode(), textToImageRequestBody2.hashCode());
        System.assertEquals(textToImageRequestBody3.hashCode(), textToImageRequestBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTextToImageRequestBody textToImageRequestBody = new OASTextToImageRequestBody();
        Map<String, String> x-property-mappings = textToImageRequestBody.getx-property-mappings();
        System.assertEquals('cfgScale', x-property-mappings.get('cfg_scale'));
        System.assertEquals('clipGuidancePreset', x-property-mappings.get('clip_guidance_preset'));
        System.assertEquals('textPrompts', x-property-mappings.get('text_prompts'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTextToImageRequestBody textToImageRequestBody = new OASTextToImageRequestBody();
        System.assertEquals(7, textToImageRequestBody.cfgScale);
        System.assertEquals(ClipGuidancePresetEnum.NONE, textToImageRequestBody.clipGuidancePreset);
        System.assertEquals(512, textToImageRequestBody.height);
        System.assertEquals(1, textToImageRequestBody.samples);
        System.assertEquals(50, textToImageRequestBody.steps);
        System.assertEquals(new List<OASTextPrompt>(), textToImageRequestBody.textPrompts);
        System.assertEquals(512, textToImageRequestBody.width);
        System.assertEquals(null, textToImageRequestBody.sampler);
        System.assertEquals(null, textToImageRequestBody.seed);
    }
}
