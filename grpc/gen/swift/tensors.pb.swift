// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: tensors.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

enum Tensors_Dtype: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case dtInvalid // = 0
  case dtFloat32 // = 1
  case dtFloat64 // = 2
  case dtFloat16 // = 3
  case dtBfloat16 // = 4
  case dtComplex32 // = 5
  case dtComplex64 // = 6
  case dtComplex128 // = 7
  case dtUint8 // = 8
  case dtInt8 // = 9
  case dtInt16 // = 10
  case dtInt32 // = 11
  case dtInt64 // = 12
  case dtBool // = 13
  case dtQuint8 // = 14
  case dtQint8 // = 15
  case dtQint32 // = 16
  case dtQuint42 // = 17
  case UNRECOGNIZED(Int)

  init() {
    self = .dtInvalid
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .dtInvalid
    case 1: self = .dtFloat32
    case 2: self = .dtFloat64
    case 3: self = .dtFloat16
    case 4: self = .dtBfloat16
    case 5: self = .dtComplex32
    case 6: self = .dtComplex64
    case 7: self = .dtComplex128
    case 8: self = .dtUint8
    case 9: self = .dtInt8
    case 10: self = .dtInt16
    case 11: self = .dtInt32
    case 12: self = .dtInt64
    case 13: self = .dtBool
    case 14: self = .dtQuint8
    case 15: self = .dtQint8
    case 16: self = .dtQint32
    case 17: self = .dtQuint42
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .dtInvalid: return 0
    case .dtFloat32: return 1
    case .dtFloat64: return 2
    case .dtFloat16: return 3
    case .dtBfloat16: return 4
    case .dtComplex32: return 5
    case .dtComplex64: return 6
    case .dtComplex128: return 7
    case .dtUint8: return 8
    case .dtInt8: return 9
    case .dtInt16: return 10
    case .dtInt32: return 11
    case .dtInt64: return 12
    case .dtBool: return 13
    case .dtQuint8: return 14
    case .dtQint8: return 15
    case .dtQint32: return 16
    case .dtQuint42: return 17
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Tensors_Dtype: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Tensors_Dtype] = [
    .dtInvalid,
    .dtFloat32,
    .dtFloat64,
    .dtFloat16,
    .dtBfloat16,
    .dtComplex32,
    .dtComplex64,
    .dtComplex128,
    .dtUint8,
    .dtInt8,
    .dtInt16,
    .dtInt32,
    .dtInt64,
    .dtBool,
    .dtQuint8,
    .dtQint8,
    .dtQint32,
    .dtQuint42,
  ]
}

#endif  // swift(>=4.2)

enum Tensors_AttributeType: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case atParameter // = 0
  case atBuffer // = 1
  case UNRECOGNIZED(Int)

  init() {
    self = .atParameter
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .atParameter
    case 1: self = .atBuffer
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .atParameter: return 0
    case .atBuffer: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Tensors_AttributeType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Tensors_AttributeType] = [
    .atParameter,
    .atBuffer,
  ]
}

#endif  // swift(>=4.2)

struct Tensors_Tensor {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var dtype: Tensors_Dtype = .dtInvalid

  var shape: [Int64] = []

  var data: Data = Data()

  var attrType: Tensors_AttributeType {
    get {return _attrType ?? .atParameter}
    set {_attrType = newValue}
  }
  /// Returns true if `attrType` has been explicitly set.
  var hasAttrType: Bool {return self._attrType != nil}
  /// Clears the value of `attrType`. Subsequent reads from it will return its default value.
  mutating func clearAttrType() {self._attrType = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _attrType: Tensors_AttributeType? = nil
}

struct Tensors_Attribute {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var value: Tensors_Attribute.OneOf_Value? = nil

  var module: Tensors_Module {
    get {
      if case .module(let v)? = value {return v}
      return Tensors_Module()
    }
    set {value = .module(newValue)}
  }

  var tensor: Tensors_Tensor {
    get {
      if case .tensor(let v)? = value {return v}
      return Tensors_Tensor()
    }
    set {value = .tensor(newValue)}
  }

  var string: String {
    get {
      if case .string(let v)? = value {return v}
      return String()
    }
    set {value = .string(newValue)}
  }

  var int64: Int64 {
    get {
      if case .int64(let v)? = value {return v}
      return 0
    }
    set {value = .int64(newValue)}
  }

  var float: Float {
    get {
      if case .float(let v)? = value {return v}
      return 0
    }
    set {value = .float(newValue)}
  }

  var bool: Bool {
    get {
      if case .bool(let v)? = value {return v}
      return false
    }
    set {value = .bool(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  enum OneOf_Value: Equatable {
    case module(Tensors_Module)
    case tensor(Tensors_Tensor)
    case string(String)
    case int64(Int64)
    case float(Float)
    case bool(Bool)

  #if !swift(>=4.1)
    static func ==(lhs: Tensors_Attribute.OneOf_Value, rhs: Tensors_Attribute.OneOf_Value) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.module, .module): return {
        guard case .module(let l) = lhs, case .module(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.tensor, .tensor): return {
        guard case .tensor(let l) = lhs, case .tensor(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.string, .string): return {
        guard case .string(let l) = lhs, case .string(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.int64, .int64): return {
        guard case .int64(let l) = lhs, case .int64(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.float, .float): return {
        guard case .float(let l) = lhs, case .float(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.bool, .bool): return {
        guard case .bool(let l) = lhs, case .bool(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}
}

struct Tensors_Module {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var names: [String] = []

  var attributes: [Tensors_Attribute] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Tensors_Dtype: @unchecked Sendable {}
extension Tensors_AttributeType: @unchecked Sendable {}
extension Tensors_Tensor: @unchecked Sendable {}
extension Tensors_Attribute: @unchecked Sendable {}
extension Tensors_Attribute.OneOf_Value: @unchecked Sendable {}
extension Tensors_Module: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "tensors"

extension Tensors_Dtype: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DT_INVALID"),
    1: .same(proto: "DT_FLOAT32"),
    2: .same(proto: "DT_FLOAT64"),
    3: .same(proto: "DT_FLOAT16"),
    4: .same(proto: "DT_BFLOAT16"),
    5: .same(proto: "DT_COMPLEX32"),
    6: .same(proto: "DT_COMPLEX64"),
    7: .same(proto: "DT_COMPLEX128"),
    8: .same(proto: "DT_UINT8"),
    9: .same(proto: "DT_INT8"),
    10: .same(proto: "DT_INT16"),
    11: .same(proto: "DT_INT32"),
    12: .same(proto: "DT_INT64"),
    13: .same(proto: "DT_BOOL"),
    14: .same(proto: "DT_QUINT8"),
    15: .same(proto: "DT_QINT8"),
    16: .same(proto: "DT_QINT32"),
    17: .same(proto: "DT_QUINT4_2"),
  ]
}

extension Tensors_AttributeType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "AT_PARAMETER"),
    1: .same(proto: "AT_BUFFER"),
  ]
}

extension Tensors_Tensor: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Tensor"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "dtype"),
    2: .same(proto: "shape"),
    3: .same(proto: "data"),
    4: .standard(proto: "attr_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.dtype) }()
      case 2: try { try decoder.decodeRepeatedInt64Field(value: &self.shape) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self._attrType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.dtype != .dtInvalid {
      try visitor.visitSingularEnumField(value: self.dtype, fieldNumber: 1)
    }
    if !self.shape.isEmpty {
      try visitor.visitPackedInt64Field(value: self.shape, fieldNumber: 2)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 3)
    }
    try { if let v = self._attrType {
      try visitor.visitSingularEnumField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tensors_Tensor, rhs: Tensors_Tensor) -> Bool {
    if lhs.dtype != rhs.dtype {return false}
    if lhs.shape != rhs.shape {return false}
    if lhs.data != rhs.data {return false}
    if lhs._attrType != rhs._attrType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tensors_Attribute: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Attribute"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    3: .same(proto: "module"),
    4: .same(proto: "tensor"),
    5: .same(proto: "string"),
    6: .same(proto: "int64"),
    7: .same(proto: "float"),
    8: .same(proto: "bool"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try {
        var v: Tensors_Module?
        var hadOneofValue = false
        if let current = self.value {
          hadOneofValue = true
          if case .module(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.value = .module(v)
        }
      }()
      case 4: try {
        var v: Tensors_Tensor?
        var hadOneofValue = false
        if let current = self.value {
          hadOneofValue = true
          if case .tensor(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.value = .tensor(v)
        }
      }()
      case 5: try {
        var v: String?
        try decoder.decodeSingularStringField(value: &v)
        if let v = v {
          if self.value != nil {try decoder.handleConflictingOneOf()}
          self.value = .string(v)
        }
      }()
      case 6: try {
        var v: Int64?
        try decoder.decodeSingularInt64Field(value: &v)
        if let v = v {
          if self.value != nil {try decoder.handleConflictingOneOf()}
          self.value = .int64(v)
        }
      }()
      case 7: try {
        var v: Float?
        try decoder.decodeSingularFloatField(value: &v)
        if let v = v {
          if self.value != nil {try decoder.handleConflictingOneOf()}
          self.value = .float(v)
        }
      }()
      case 8: try {
        var v: Bool?
        try decoder.decodeSingularBoolField(value: &v)
        if let v = v {
          if self.value != nil {try decoder.handleConflictingOneOf()}
          self.value = .bool(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    switch self.value {
    case .module?: try {
      guard case .module(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }()
    case .tensor?: try {
      guard case .tensor(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }()
    case .string?: try {
      guard case .string(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularStringField(value: v, fieldNumber: 5)
    }()
    case .int64?: try {
      guard case .int64(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularInt64Field(value: v, fieldNumber: 6)
    }()
    case .float?: try {
      guard case .float(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularFloatField(value: v, fieldNumber: 7)
    }()
    case .bool?: try {
      guard case .bool(let v)? = self.value else { preconditionFailure() }
      try visitor.visitSingularBoolField(value: v, fieldNumber: 8)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tensors_Attribute, rhs: Tensors_Attribute) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Tensors_Module: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Module"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "names"),
    3: .same(proto: "attributes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.names) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.attributes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.names.isEmpty {
      try visitor.visitRepeatedStringField(value: self.names, fieldNumber: 2)
    }
    if !self.attributes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.attributes, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Tensors_Module, rhs: Tensors_Module) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.names != rhs.names {return false}
    if lhs.attributes != rhs.attributes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
