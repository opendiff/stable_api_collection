#import "OAITextToImageRequestBody.h"

@implementation OAITextToImageRequestBody

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.cfgScale = @7;
    self.clipGuidancePreset = @"NONE";
    self.height = @512;
    self.samples = @1;
    self.steps = @50;
    self.width = @512;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cfgScale": @"cfg_scale", @"clipGuidancePreset": @"clip_guidance_preset", @"height": @"height", @"sampler": @"sampler", @"samples": @"samples", @"seed": @"seed", @"steps": @"steps", @"textPrompts": @"text_prompts", @"width": @"width" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cfgScale", @"clipGuidancePreset", @"height", @"sampler", @"samples", @"seed", @"steps", @"width"];
  return [optionalProperties containsObject:propertyName];
}

@end
