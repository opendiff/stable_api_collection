// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: engines.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30004
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30004 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class EngineInfo;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum EngineType

/** Possible engine type */
typedef GPB_ENUM(EngineType) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  EngineType_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  EngineType_Text = 0,
  EngineType_Picture = 1,
  EngineType_Audio = 2,
  EngineType_Video = 3,
  EngineType_Classification = 4,
  EngineType_Storage = 5,
};

GPBEnumDescriptor *EngineType_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL EngineType_IsValidValue(int32_t value);

#pragma mark - Enum EngineTokenizer

typedef GPB_ENUM(EngineTokenizer) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  EngineTokenizer_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  EngineTokenizer_Gpt2 = 0,
  EngineTokenizer_Pile = 1,
};

GPBEnumDescriptor *EngineTokenizer_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL EngineTokenizer_IsValidValue(int32_t value);

#pragma mark - EnginesRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
GPB_FINAL @interface EnginesRoot : GPBRootObject
@end

#pragma mark - EngineInfo

typedef GPB_ENUM(EngineInfo_FieldNumber) {
  EngineInfo_FieldNumber_Id_p = 1,
  EngineInfo_FieldNumber_Owner = 2,
  EngineInfo_FieldNumber_Ready = 3,
  EngineInfo_FieldNumber_Type = 4,
  EngineInfo_FieldNumber_Tokenizer = 5,
  EngineInfo_FieldNumber_Name = 6,
  EngineInfo_FieldNumber_Description_p = 7,
};

/**
 * Engine info struct
 **/
GPB_FINAL @interface EngineInfo : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *id_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *owner;

@property(nonatomic, readwrite) BOOL ready;

@property(nonatomic, readwrite) EngineType type;

@property(nonatomic, readwrite) EngineTokenizer tokenizer;

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@property(nonatomic, readwrite, copy, null_resettable) NSString *description_p;

@end

/**
 * Fetches the raw value of a @c EngineInfo's @c type property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t EngineInfo_Type_RawValue(EngineInfo *message);
/**
 * Sets the raw value of an @c EngineInfo's @c type property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetEngineInfo_Type_RawValue(EngineInfo *message, int32_t value);

/**
 * Fetches the raw value of a @c EngineInfo's @c tokenizer property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t EngineInfo_Tokenizer_RawValue(EngineInfo *message);
/**
 * Sets the raw value of an @c EngineInfo's @c tokenizer property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetEngineInfo_Tokenizer_RawValue(EngineInfo *message, int32_t value);

#pragma mark - ListEnginesRequest

/**
 * Empty
 **/
GPB_FINAL @interface ListEnginesRequest : GPBMessage

@end

#pragma mark - Engines

typedef GPB_ENUM(Engines_FieldNumber) {
  Engines_FieldNumber_EngineArray = 1,
};

/**
 * Engine info list
 **/
GPB_FINAL @interface Engines : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<EngineInfo*> *engineArray;
/** The number of items in @c engineArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger engineArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)