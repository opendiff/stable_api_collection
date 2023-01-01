// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: engines.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

#import <stdatomic.h>

#import "Engines.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#pragma clang diagnostic ignored "-Wdollar-in-identifier-extension"

#pragma mark - Objective C Class declarations
// Forward declarations of Objective C classes that we can use as
// static values in struct initializers.
// We don't use [Foo class] because it is not a static value.
GPBObjCClassDeclaration(EngineInfo);

#pragma mark - EnginesRoot

@implementation EnginesRoot

// No extensions in the file and no imports, so no need to generate
// +extensionRegistry.

@end

#pragma mark - EnginesRoot_FileDescriptor

static GPBFileDescriptor *EnginesRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"gooseai"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Enum EngineType

GPBEnumDescriptor *EngineType_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Text\000Picture\000Audio\000Video\000Classification\000"
        "Storage\000";
    static const int32_t values[] = {
        EngineType_Text,
        EngineType_Picture,
        EngineType_Audio,
        EngineType_Video,
        EngineType_Classification,
        EngineType_Storage,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(EngineType)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:EngineType_IsValidValue];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL EngineType_IsValidValue(int32_t value__) {
  switch (value__) {
    case EngineType_Text:
    case EngineType_Picture:
    case EngineType_Audio:
    case EngineType_Video:
    case EngineType_Classification:
    case EngineType_Storage:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum EngineTokenizer

GPBEnumDescriptor *EngineTokenizer_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Gpt2\000Pile\000";
    static const int32_t values[] = {
        EngineTokenizer_Gpt2,
        EngineTokenizer_Pile,
    };
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(EngineTokenizer)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:EngineTokenizer_IsValidValue];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL EngineTokenizer_IsValidValue(int32_t value__) {
  switch (value__) {
    case EngineTokenizer_Gpt2:
    case EngineTokenizer_Pile:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - EngineInfo

@implementation EngineInfo

@dynamic id_p;
@dynamic owner;
@dynamic ready;
@dynamic type;
@dynamic tokenizer;
@dynamic name;
@dynamic description_p;

typedef struct EngineInfo__storage_ {
  uint32_t _has_storage_[1];
  EngineType type;
  EngineTokenizer tokenizer;
  NSString *id_p;
  NSString *owner;
  NSString *name;
  NSString *description_p;
} EngineInfo__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "id_p",
        .dataTypeSpecific.clazz = Nil,
        .number = EngineInfo_FieldNumber_Id_p,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, id_p),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "owner",
        .dataTypeSpecific.clazz = Nil,
        .number = EngineInfo_FieldNumber_Owner,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, owner),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "ready",
        .dataTypeSpecific.clazz = Nil,
        .number = EngineInfo_FieldNumber_Ready,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "type",
        .dataTypeSpecific.enumDescFunc = EngineType_EnumDescriptor,
        .number = EngineInfo_FieldNumber_Type,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, type),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "tokenizer",
        .dataTypeSpecific.enumDescFunc = EngineTokenizer_EnumDescriptor,
        .number = EngineInfo_FieldNumber_Tokenizer,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, tokenizer),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "name",
        .dataTypeSpecific.clazz = Nil,
        .number = EngineInfo_FieldNumber_Name,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, name),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "description_p",
        .dataTypeSpecific.clazz = Nil,
        .number = EngineInfo_FieldNumber_Description_p,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(EngineInfo__storage_, description_p),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldClearHasIvarOnZero),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[EngineInfo class]
                                     rootClass:[EnginesRoot class]
                                          file:EnginesRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(EngineInfo__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t EngineInfo_Type_RawValue(EngineInfo *message) {
  GPBDescriptor *descriptor = [EngineInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:EngineInfo_FieldNumber_Type];
  return GPBGetMessageRawEnumField(message, field);
}

void SetEngineInfo_Type_RawValue(EngineInfo *message, int32_t value) {
  GPBDescriptor *descriptor = [EngineInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:EngineInfo_FieldNumber_Type];
  GPBSetMessageRawEnumField(message, field, value);
}

int32_t EngineInfo_Tokenizer_RawValue(EngineInfo *message) {
  GPBDescriptor *descriptor = [EngineInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:EngineInfo_FieldNumber_Tokenizer];
  return GPBGetMessageRawEnumField(message, field);
}

void SetEngineInfo_Tokenizer_RawValue(EngineInfo *message, int32_t value) {
  GPBDescriptor *descriptor = [EngineInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:EngineInfo_FieldNumber_Tokenizer];
  GPBSetMessageRawEnumField(message, field, value);
}

#pragma mark - ListEnginesRequest

@implementation ListEnginesRequest


typedef struct ListEnginesRequest__storage_ {
  uint32_t _has_storage_[1];
} ListEnginesRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ListEnginesRequest class]
                                     rootClass:[EnginesRoot class]
                                          file:EnginesRoot_FileDescriptor()
                                        fields:NULL
                                    fieldCount:0
                                   storageSize:sizeof(ListEnginesRequest__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - Engines

@implementation Engines

@dynamic engineArray, engineArray_Count;

typedef struct Engines__storage_ {
  uint32_t _has_storage_[1];
  NSMutableArray *engineArray;
} Engines__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "engineArray",
        .dataTypeSpecific.clazz = GPBObjCClass(EngineInfo),
        .number = Engines_FieldNumber_EngineArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(Engines__storage_, engineArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[Engines class]
                                     rootClass:[EnginesRoot class]
                                          file:EnginesRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(Engines__storage_)
                                         flags:(GPBDescriptorInitializationFlags)(GPBDescriptorInitializationFlag_UsesClassRefs | GPBDescriptorInitializationFlag_Proto3OptionalKnown)];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
