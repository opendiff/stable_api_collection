// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensors.proto

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

@class Attribute;
@class Module;
@class Tensor;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum Dtype

typedef GPB_ENUM(Dtype) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  Dtype_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  Dtype_DtInvalid = 0,
  Dtype_DtFloat32 = 1,
  Dtype_DtFloat64 = 2,
  Dtype_DtFloat16 = 3,
  Dtype_DtBfloat16 = 4,
  Dtype_DtComplex32 = 5,
  Dtype_DtComplex64 = 6,
  Dtype_DtComplex128 = 7,
  Dtype_DtUint8 = 8,
  Dtype_DtInt8 = 9,
  Dtype_DtInt16 = 10,
  Dtype_DtInt32 = 11,
  Dtype_DtInt64 = 12,
  Dtype_DtBool = 13,
  Dtype_DtQuint8 = 14,
  Dtype_DtQint8 = 15,
  Dtype_DtQint32 = 16,
  Dtype_DtQuint42 = 17,
};

GPBEnumDescriptor *Dtype_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL Dtype_IsValidValue(int32_t value);

#pragma mark - Enum AttributeType

typedef GPB_ENUM(AttributeType) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  AttributeType_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  AttributeType_AtParameter = 0,
  AttributeType_AtBuffer = 1,
};

GPBEnumDescriptor *AttributeType_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL AttributeType_IsValidValue(int32_t value);

#pragma mark - TensorsRoot

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
GPB_FINAL @interface TensorsRoot : GPBRootObject
@end

#pragma mark - Tensor

typedef GPB_ENUM(Tensor_FieldNumber) {
  Tensor_FieldNumber_Dtype = 1,
  Tensor_FieldNumber_ShapeArray = 2,
  Tensor_FieldNumber_Data_p = 3,
  Tensor_FieldNumber_AttrType = 4,
};

GPB_FINAL @interface Tensor : GPBMessage

@property(nonatomic, readwrite) Dtype dtype;

@property(nonatomic, readwrite, strong, null_resettable) GPBInt64Array *shapeArray;
/** The number of items in @c shapeArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger shapeArray_Count;

@property(nonatomic, readwrite, copy, null_resettable) NSData *data_p;

@property(nonatomic, readwrite) AttributeType attrType;

@property(nonatomic, readwrite) BOOL hasAttrType;
@end

/**
 * Fetches the raw value of a @c Tensor's @c dtype property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t Tensor_Dtype_RawValue(Tensor *message);
/**
 * Sets the raw value of an @c Tensor's @c dtype property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetTensor_Dtype_RawValue(Tensor *message, int32_t value);

/**
 * Fetches the raw value of a @c Tensor's @c attrType property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t Tensor_AttrType_RawValue(Tensor *message);
/**
 * Sets the raw value of an @c Tensor's @c attrType property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetTensor_AttrType_RawValue(Tensor *message, int32_t value);

#pragma mark - Attribute

typedef GPB_ENUM(Attribute_FieldNumber) {
  Attribute_FieldNumber_Name = 1,
  Attribute_FieldNumber_Module = 3,
  Attribute_FieldNumber_Tensor = 4,
  Attribute_FieldNumber_String = 5,
  Attribute_FieldNumber_Int64 = 6,
  Attribute_FieldNumber_Float_p = 7,
  Attribute_FieldNumber_Bool_p = 8,
};

typedef GPB_ENUM(Attribute_Value_OneOfCase) {
  Attribute_Value_OneOfCase_GPBUnsetOneOfCase = 0,
  Attribute_Value_OneOfCase_Module = 3,
  Attribute_Value_OneOfCase_Tensor = 4,
  Attribute_Value_OneOfCase_String = 5,
  Attribute_Value_OneOfCase_Int64 = 6,
  Attribute_Value_OneOfCase_Float_p = 7,
  Attribute_Value_OneOfCase_Bool_p = 8,
};

GPB_FINAL @interface Attribute : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@property(nonatomic, readonly) Attribute_Value_OneOfCase valueOneOfCase;

@property(nonatomic, readwrite, strong, null_resettable) Module *module;

@property(nonatomic, readwrite, strong, null_resettable) Tensor *tensor;

@property(nonatomic, readwrite, copy, null_resettable) NSString *string;

@property(nonatomic, readwrite) int64_t int64;

@property(nonatomic, readwrite) float float_p;

@property(nonatomic, readwrite) BOOL bool_p;

@end

/**
 * Clears whatever value was set for the oneof 'value'.
 **/
void Attribute_ClearValueOneOfCase(Attribute *message);

#pragma mark - Module

typedef GPB_ENUM(Module_FieldNumber) {
  Module_FieldNumber_Name = 1,
  Module_FieldNumber_NamesArray = 2,
  Module_FieldNumber_AttributesArray = 3,
};

GPB_FINAL @interface Module : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *name;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *namesArray;
/** The number of items in @c namesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger namesArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<Attribute*> *attributesArray;
/** The number of items in @c attributesArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger attributesArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
