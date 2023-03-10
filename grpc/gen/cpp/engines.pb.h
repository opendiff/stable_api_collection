// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: engines.proto

#ifndef GOOGLE_PROTOBUF_INCLUDED_engines_2eproto
#define GOOGLE_PROTOBUF_INCLUDED_engines_2eproto

#include <limits>
#include <string>

#include <google/protobuf/port_def.inc>
#if PROTOBUF_VERSION < 3021000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers. Please update
#error your headers.
#endif
#if 3021012 < PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers. Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/port_undef.inc>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_bases.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata_lite.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/generated_enum_reflection.h>
#include <google/protobuf/unknown_field_set.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
#define PROTOBUF_INTERNAL_EXPORT_engines_2eproto
PROTOBUF_NAMESPACE_OPEN
namespace internal {
class AnyMetadata;
}  // namespace internal
PROTOBUF_NAMESPACE_CLOSE

// Internal implementation detail -- do not use these members.
struct TableStruct_engines_2eproto {
  static const uint32_t offsets[];
};
extern const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_engines_2eproto;
namespace gooseai {
class EngineInfo;
struct EngineInfoDefaultTypeInternal;
extern EngineInfoDefaultTypeInternal _EngineInfo_default_instance_;
class Engines;
struct EnginesDefaultTypeInternal;
extern EnginesDefaultTypeInternal _Engines_default_instance_;
class ListEnginesRequest;
struct ListEnginesRequestDefaultTypeInternal;
extern ListEnginesRequestDefaultTypeInternal _ListEnginesRequest_default_instance_;
}  // namespace gooseai
PROTOBUF_NAMESPACE_OPEN
template<> ::gooseai::EngineInfo* Arena::CreateMaybeMessage<::gooseai::EngineInfo>(Arena*);
template<> ::gooseai::Engines* Arena::CreateMaybeMessage<::gooseai::Engines>(Arena*);
template<> ::gooseai::ListEnginesRequest* Arena::CreateMaybeMessage<::gooseai::ListEnginesRequest>(Arena*);
PROTOBUF_NAMESPACE_CLOSE
namespace gooseai {

enum EngineType : int {
  TEXT = 0,
  PICTURE = 1,
  AUDIO = 2,
  VIDEO = 3,
  CLASSIFICATION = 4,
  STORAGE = 5,
  EngineType_INT_MIN_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::min(),
  EngineType_INT_MAX_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::max()
};
bool EngineType_IsValid(int value);
constexpr EngineType EngineType_MIN = TEXT;
constexpr EngineType EngineType_MAX = STORAGE;
constexpr int EngineType_ARRAYSIZE = EngineType_MAX + 1;

const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* EngineType_descriptor();
template<typename T>
inline const std::string& EngineType_Name(T enum_t_value) {
  static_assert(::std::is_same<T, EngineType>::value ||
    ::std::is_integral<T>::value,
    "Incorrect type passed to function EngineType_Name.");
  return ::PROTOBUF_NAMESPACE_ID::internal::NameOfEnum(
    EngineType_descriptor(), enum_t_value);
}
inline bool EngineType_Parse(
    ::PROTOBUF_NAMESPACE_ID::ConstStringParam name, EngineType* value) {
  return ::PROTOBUF_NAMESPACE_ID::internal::ParseNamedEnum<EngineType>(
    EngineType_descriptor(), name, value);
}
enum EngineTokenizer : int {
  GPT2 = 0,
  PILE = 1,
  EngineTokenizer_INT_MIN_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::min(),
  EngineTokenizer_INT_MAX_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::max()
};
bool EngineTokenizer_IsValid(int value);
constexpr EngineTokenizer EngineTokenizer_MIN = GPT2;
constexpr EngineTokenizer EngineTokenizer_MAX = PILE;
constexpr int EngineTokenizer_ARRAYSIZE = EngineTokenizer_MAX + 1;

const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* EngineTokenizer_descriptor();
template<typename T>
inline const std::string& EngineTokenizer_Name(T enum_t_value) {
  static_assert(::std::is_same<T, EngineTokenizer>::value ||
    ::std::is_integral<T>::value,
    "Incorrect type passed to function EngineTokenizer_Name.");
  return ::PROTOBUF_NAMESPACE_ID::internal::NameOfEnum(
    EngineTokenizer_descriptor(), enum_t_value);
}
inline bool EngineTokenizer_Parse(
    ::PROTOBUF_NAMESPACE_ID::ConstStringParam name, EngineTokenizer* value) {
  return ::PROTOBUF_NAMESPACE_ID::internal::ParseNamedEnum<EngineTokenizer>(
    EngineTokenizer_descriptor(), name, value);
}
// ===================================================================

class EngineInfo final :
    public ::PROTOBUF_NAMESPACE_ID::Message /* @@protoc_insertion_point(class_definition:gooseai.EngineInfo) */ {
 public:
  inline EngineInfo() : EngineInfo(nullptr) {}
  ~EngineInfo() override;
  explicit PROTOBUF_CONSTEXPR EngineInfo(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  EngineInfo(const EngineInfo& from);
  EngineInfo(EngineInfo&& from) noexcept
    : EngineInfo() {
    *this = ::std::move(from);
  }

  inline EngineInfo& operator=(const EngineInfo& from) {
    CopyFrom(from);
    return *this;
  }
  inline EngineInfo& operator=(EngineInfo&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const EngineInfo& default_instance() {
    return *internal_default_instance();
  }
  static inline const EngineInfo* internal_default_instance() {
    return reinterpret_cast<const EngineInfo*>(
               &_EngineInfo_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(EngineInfo& a, EngineInfo& b) {
    a.Swap(&b);
  }
  inline void Swap(EngineInfo* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(EngineInfo* other) {
    if (other == this) return;
    GOOGLE_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  EngineInfo* New(::PROTOBUF_NAMESPACE_ID::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<EngineInfo>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::Message::CopyFrom;
  void CopyFrom(const EngineInfo& from);
  using ::PROTOBUF_NAMESPACE_ID::Message::MergeFrom;
  void MergeFrom( const EngineInfo& from) {
    EngineInfo::MergeImpl(*this, from);
  }
  private:
  static void MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) final;
  uint8_t* _InternalSerialize(
      uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _impl_._cached_size_.Get(); }

  private:
  void SharedCtor(::PROTOBUF_NAMESPACE_ID::Arena* arena, bool is_message_owned);
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(EngineInfo* other);

  private:
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::PROTOBUF_NAMESPACE_ID::StringPiece FullMessageName() {
    return "gooseai.EngineInfo";
  }
  protected:
  explicit EngineInfo(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                       bool is_message_owned = false);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kIdFieldNumber = 1,
    kOwnerFieldNumber = 2,
    kNameFieldNumber = 6,
    kDescriptionFieldNumber = 7,
    kReadyFieldNumber = 3,
    kTypeFieldNumber = 4,
    kTokenizerFieldNumber = 5,
  };
  // string id = 1 [json_name = "id"];
  void clear_id();
  const std::string& id() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_id(ArgT0&& arg0, ArgT... args);
  std::string* mutable_id();
  PROTOBUF_NODISCARD std::string* release_id();
  void set_allocated_id(std::string* id);
  private:
  const std::string& _internal_id() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_id(const std::string& value);
  std::string* _internal_mutable_id();
  public:

  // string owner = 2 [json_name = "owner"];
  void clear_owner();
  const std::string& owner() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_owner(ArgT0&& arg0, ArgT... args);
  std::string* mutable_owner();
  PROTOBUF_NODISCARD std::string* release_owner();
  void set_allocated_owner(std::string* owner);
  private:
  const std::string& _internal_owner() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_owner(const std::string& value);
  std::string* _internal_mutable_owner();
  public:

  // string name = 6 [json_name = "name"];
  void clear_name();
  const std::string& name() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_name(ArgT0&& arg0, ArgT... args);
  std::string* mutable_name();
  PROTOBUF_NODISCARD std::string* release_name();
  void set_allocated_name(std::string* name);
  private:
  const std::string& _internal_name() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_name(const std::string& value);
  std::string* _internal_mutable_name();
  public:

  // string description = 7 [json_name = "description"];
  void clear_description();
  const std::string& description() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_description(ArgT0&& arg0, ArgT... args);
  std::string* mutable_description();
  PROTOBUF_NODISCARD std::string* release_description();
  void set_allocated_description(std::string* description);
  private:
  const std::string& _internal_description() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_description(const std::string& value);
  std::string* _internal_mutable_description();
  public:

  // bool ready = 3 [json_name = "ready"];
  void clear_ready();
  bool ready() const;
  void set_ready(bool value);
  private:
  bool _internal_ready() const;
  void _internal_set_ready(bool value);
  public:

  // .gooseai.EngineType type = 4 [json_name = "type"];
  void clear_type();
  ::gooseai::EngineType type() const;
  void set_type(::gooseai::EngineType value);
  private:
  ::gooseai::EngineType _internal_type() const;
  void _internal_set_type(::gooseai::EngineType value);
  public:

  // .gooseai.EngineTokenizer tokenizer = 5 [json_name = "tokenizer"];
  void clear_tokenizer();
  ::gooseai::EngineTokenizer tokenizer() const;
  void set_tokenizer(::gooseai::EngineTokenizer value);
  private:
  ::gooseai::EngineTokenizer _internal_tokenizer() const;
  void _internal_set_tokenizer(::gooseai::EngineTokenizer value);
  public:

  // @@protoc_insertion_point(class_scope:gooseai.EngineInfo)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  struct Impl_ {
    ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr id_;
    ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr owner_;
    ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr name_;
    ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr description_;
    bool ready_;
    int type_;
    int tokenizer_;
    mutable ::PROTOBUF_NAMESPACE_ID::internal::CachedSize _cached_size_;
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_engines_2eproto;
};
// -------------------------------------------------------------------

class ListEnginesRequest final :
    public ::PROTOBUF_NAMESPACE_ID::internal::ZeroFieldsBase /* @@protoc_insertion_point(class_definition:gooseai.ListEnginesRequest) */ {
 public:
  inline ListEnginesRequest() : ListEnginesRequest(nullptr) {}
  explicit PROTOBUF_CONSTEXPR ListEnginesRequest(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  ListEnginesRequest(const ListEnginesRequest& from);
  ListEnginesRequest(ListEnginesRequest&& from) noexcept
    : ListEnginesRequest() {
    *this = ::std::move(from);
  }

  inline ListEnginesRequest& operator=(const ListEnginesRequest& from) {
    CopyFrom(from);
    return *this;
  }
  inline ListEnginesRequest& operator=(ListEnginesRequest&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const ListEnginesRequest& default_instance() {
    return *internal_default_instance();
  }
  static inline const ListEnginesRequest* internal_default_instance() {
    return reinterpret_cast<const ListEnginesRequest*>(
               &_ListEnginesRequest_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    1;

  friend void swap(ListEnginesRequest& a, ListEnginesRequest& b) {
    a.Swap(&b);
  }
  inline void Swap(ListEnginesRequest* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(ListEnginesRequest* other) {
    if (other == this) return;
    GOOGLE_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  ListEnginesRequest* New(::PROTOBUF_NAMESPACE_ID::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<ListEnginesRequest>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::internal::ZeroFieldsBase::CopyFrom;
  inline void CopyFrom(const ListEnginesRequest& from) {
    ::PROTOBUF_NAMESPACE_ID::internal::ZeroFieldsBase::CopyImpl(*this, from);
  }
  using ::PROTOBUF_NAMESPACE_ID::internal::ZeroFieldsBase::MergeFrom;
  void MergeFrom(const ListEnginesRequest& from) {
    ::PROTOBUF_NAMESPACE_ID::internal::ZeroFieldsBase::MergeImpl(*this, from);
  }
  public:

  private:
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::PROTOBUF_NAMESPACE_ID::StringPiece FullMessageName() {
    return "gooseai.ListEnginesRequest";
  }
  protected:
  explicit ListEnginesRequest(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                       bool is_message_owned = false);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // @@protoc_insertion_point(class_scope:gooseai.ListEnginesRequest)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  struct Impl_ {
  };
  friend struct ::TableStruct_engines_2eproto;
};
// -------------------------------------------------------------------

class Engines final :
    public ::PROTOBUF_NAMESPACE_ID::Message /* @@protoc_insertion_point(class_definition:gooseai.Engines) */ {
 public:
  inline Engines() : Engines(nullptr) {}
  ~Engines() override;
  explicit PROTOBUF_CONSTEXPR Engines(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  Engines(const Engines& from);
  Engines(Engines&& from) noexcept
    : Engines() {
    *this = ::std::move(from);
  }

  inline Engines& operator=(const Engines& from) {
    CopyFrom(from);
    return *this;
  }
  inline Engines& operator=(Engines&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const Engines& default_instance() {
    return *internal_default_instance();
  }
  static inline const Engines* internal_default_instance() {
    return reinterpret_cast<const Engines*>(
               &_Engines_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    2;

  friend void swap(Engines& a, Engines& b) {
    a.Swap(&b);
  }
  inline void Swap(Engines* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(Engines* other) {
    if (other == this) return;
    GOOGLE_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  Engines* New(::PROTOBUF_NAMESPACE_ID::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<Engines>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::Message::CopyFrom;
  void CopyFrom(const Engines& from);
  using ::PROTOBUF_NAMESPACE_ID::Message::MergeFrom;
  void MergeFrom( const Engines& from) {
    Engines::MergeImpl(*this, from);
  }
  private:
  static void MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) final;
  uint8_t* _InternalSerialize(
      uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _impl_._cached_size_.Get(); }

  private:
  void SharedCtor(::PROTOBUF_NAMESPACE_ID::Arena* arena, bool is_message_owned);
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(Engines* other);

  private:
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::PROTOBUF_NAMESPACE_ID::StringPiece FullMessageName() {
    return "gooseai.Engines";
  }
  protected:
  explicit Engines(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                       bool is_message_owned = false);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kEngineFieldNumber = 1,
  };
  // repeated .gooseai.EngineInfo engine = 1 [json_name = "engine"];
  int engine_size() const;
  private:
  int _internal_engine_size() const;
  public:
  void clear_engine();
  ::gooseai::EngineInfo* mutable_engine(int index);
  ::PROTOBUF_NAMESPACE_ID::RepeatedPtrField< ::gooseai::EngineInfo >*
      mutable_engine();
  private:
  const ::gooseai::EngineInfo& _internal_engine(int index) const;
  ::gooseai::EngineInfo* _internal_add_engine();
  public:
  const ::gooseai::EngineInfo& engine(int index) const;
  ::gooseai::EngineInfo* add_engine();
  const ::PROTOBUF_NAMESPACE_ID::RepeatedPtrField< ::gooseai::EngineInfo >&
      engine() const;

  // @@protoc_insertion_point(class_scope:gooseai.Engines)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  struct Impl_ {
    ::PROTOBUF_NAMESPACE_ID::RepeatedPtrField< ::gooseai::EngineInfo > engine_;
    mutable ::PROTOBUF_NAMESPACE_ID::internal::CachedSize _cached_size_;
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_engines_2eproto;
};
// ===================================================================


// ===================================================================

#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// EngineInfo

// string id = 1 [json_name = "id"];
inline void EngineInfo::clear_id() {
  _impl_.id_.ClearToEmpty();
}
inline const std::string& EngineInfo::id() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.id)
  return _internal_id();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void EngineInfo::set_id(ArgT0&& arg0, ArgT... args) {
 
 _impl_.id_.Set(static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.id)
}
inline std::string* EngineInfo::mutable_id() {
  std::string* _s = _internal_mutable_id();
  // @@protoc_insertion_point(field_mutable:gooseai.EngineInfo.id)
  return _s;
}
inline const std::string& EngineInfo::_internal_id() const {
  return _impl_.id_.Get();
}
inline void EngineInfo::_internal_set_id(const std::string& value) {
  
  _impl_.id_.Set(value, GetArenaForAllocation());
}
inline std::string* EngineInfo::_internal_mutable_id() {
  
  return _impl_.id_.Mutable(GetArenaForAllocation());
}
inline std::string* EngineInfo::release_id() {
  // @@protoc_insertion_point(field_release:gooseai.EngineInfo.id)
  return _impl_.id_.Release();
}
inline void EngineInfo::set_allocated_id(std::string* id) {
  if (id != nullptr) {
    
  } else {
    
  }
  _impl_.id_.SetAllocated(id, GetArenaForAllocation());
#ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (_impl_.id_.IsDefault()) {
    _impl_.id_.Set("", GetArenaForAllocation());
  }
#endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:gooseai.EngineInfo.id)
}

// string owner = 2 [json_name = "owner"];
inline void EngineInfo::clear_owner() {
  _impl_.owner_.ClearToEmpty();
}
inline const std::string& EngineInfo::owner() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.owner)
  return _internal_owner();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void EngineInfo::set_owner(ArgT0&& arg0, ArgT... args) {
 
 _impl_.owner_.Set(static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.owner)
}
inline std::string* EngineInfo::mutable_owner() {
  std::string* _s = _internal_mutable_owner();
  // @@protoc_insertion_point(field_mutable:gooseai.EngineInfo.owner)
  return _s;
}
inline const std::string& EngineInfo::_internal_owner() const {
  return _impl_.owner_.Get();
}
inline void EngineInfo::_internal_set_owner(const std::string& value) {
  
  _impl_.owner_.Set(value, GetArenaForAllocation());
}
inline std::string* EngineInfo::_internal_mutable_owner() {
  
  return _impl_.owner_.Mutable(GetArenaForAllocation());
}
inline std::string* EngineInfo::release_owner() {
  // @@protoc_insertion_point(field_release:gooseai.EngineInfo.owner)
  return _impl_.owner_.Release();
}
inline void EngineInfo::set_allocated_owner(std::string* owner) {
  if (owner != nullptr) {
    
  } else {
    
  }
  _impl_.owner_.SetAllocated(owner, GetArenaForAllocation());
#ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (_impl_.owner_.IsDefault()) {
    _impl_.owner_.Set("", GetArenaForAllocation());
  }
#endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:gooseai.EngineInfo.owner)
}

// bool ready = 3 [json_name = "ready"];
inline void EngineInfo::clear_ready() {
  _impl_.ready_ = false;
}
inline bool EngineInfo::_internal_ready() const {
  return _impl_.ready_;
}
inline bool EngineInfo::ready() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.ready)
  return _internal_ready();
}
inline void EngineInfo::_internal_set_ready(bool value) {
  
  _impl_.ready_ = value;
}
inline void EngineInfo::set_ready(bool value) {
  _internal_set_ready(value);
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.ready)
}

// .gooseai.EngineType type = 4 [json_name = "type"];
inline void EngineInfo::clear_type() {
  _impl_.type_ = 0;
}
inline ::gooseai::EngineType EngineInfo::_internal_type() const {
  return static_cast< ::gooseai::EngineType >(_impl_.type_);
}
inline ::gooseai::EngineType EngineInfo::type() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.type)
  return _internal_type();
}
inline void EngineInfo::_internal_set_type(::gooseai::EngineType value) {
  
  _impl_.type_ = value;
}
inline void EngineInfo::set_type(::gooseai::EngineType value) {
  _internal_set_type(value);
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.type)
}

// .gooseai.EngineTokenizer tokenizer = 5 [json_name = "tokenizer"];
inline void EngineInfo::clear_tokenizer() {
  _impl_.tokenizer_ = 0;
}
inline ::gooseai::EngineTokenizer EngineInfo::_internal_tokenizer() const {
  return static_cast< ::gooseai::EngineTokenizer >(_impl_.tokenizer_);
}
inline ::gooseai::EngineTokenizer EngineInfo::tokenizer() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.tokenizer)
  return _internal_tokenizer();
}
inline void EngineInfo::_internal_set_tokenizer(::gooseai::EngineTokenizer value) {
  
  _impl_.tokenizer_ = value;
}
inline void EngineInfo::set_tokenizer(::gooseai::EngineTokenizer value) {
  _internal_set_tokenizer(value);
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.tokenizer)
}

// string name = 6 [json_name = "name"];
inline void EngineInfo::clear_name() {
  _impl_.name_.ClearToEmpty();
}
inline const std::string& EngineInfo::name() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.name)
  return _internal_name();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void EngineInfo::set_name(ArgT0&& arg0, ArgT... args) {
 
 _impl_.name_.Set(static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.name)
}
inline std::string* EngineInfo::mutable_name() {
  std::string* _s = _internal_mutable_name();
  // @@protoc_insertion_point(field_mutable:gooseai.EngineInfo.name)
  return _s;
}
inline const std::string& EngineInfo::_internal_name() const {
  return _impl_.name_.Get();
}
inline void EngineInfo::_internal_set_name(const std::string& value) {
  
  _impl_.name_.Set(value, GetArenaForAllocation());
}
inline std::string* EngineInfo::_internal_mutable_name() {
  
  return _impl_.name_.Mutable(GetArenaForAllocation());
}
inline std::string* EngineInfo::release_name() {
  // @@protoc_insertion_point(field_release:gooseai.EngineInfo.name)
  return _impl_.name_.Release();
}
inline void EngineInfo::set_allocated_name(std::string* name) {
  if (name != nullptr) {
    
  } else {
    
  }
  _impl_.name_.SetAllocated(name, GetArenaForAllocation());
#ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (_impl_.name_.IsDefault()) {
    _impl_.name_.Set("", GetArenaForAllocation());
  }
#endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:gooseai.EngineInfo.name)
}

// string description = 7 [json_name = "description"];
inline void EngineInfo::clear_description() {
  _impl_.description_.ClearToEmpty();
}
inline const std::string& EngineInfo::description() const {
  // @@protoc_insertion_point(field_get:gooseai.EngineInfo.description)
  return _internal_description();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void EngineInfo::set_description(ArgT0&& arg0, ArgT... args) {
 
 _impl_.description_.Set(static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:gooseai.EngineInfo.description)
}
inline std::string* EngineInfo::mutable_description() {
  std::string* _s = _internal_mutable_description();
  // @@protoc_insertion_point(field_mutable:gooseai.EngineInfo.description)
  return _s;
}
inline const std::string& EngineInfo::_internal_description() const {
  return _impl_.description_.Get();
}
inline void EngineInfo::_internal_set_description(const std::string& value) {
  
  _impl_.description_.Set(value, GetArenaForAllocation());
}
inline std::string* EngineInfo::_internal_mutable_description() {
  
  return _impl_.description_.Mutable(GetArenaForAllocation());
}
inline std::string* EngineInfo::release_description() {
  // @@protoc_insertion_point(field_release:gooseai.EngineInfo.description)
  return _impl_.description_.Release();
}
inline void EngineInfo::set_allocated_description(std::string* description) {
  if (description != nullptr) {
    
  } else {
    
  }
  _impl_.description_.SetAllocated(description, GetArenaForAllocation());
#ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (_impl_.description_.IsDefault()) {
    _impl_.description_.Set("", GetArenaForAllocation());
  }
#endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  // @@protoc_insertion_point(field_set_allocated:gooseai.EngineInfo.description)
}

// -------------------------------------------------------------------

// ListEnginesRequest

// -------------------------------------------------------------------

// Engines

// repeated .gooseai.EngineInfo engine = 1 [json_name = "engine"];
inline int Engines::_internal_engine_size() const {
  return _impl_.engine_.size();
}
inline int Engines::engine_size() const {
  return _internal_engine_size();
}
inline void Engines::clear_engine() {
  _impl_.engine_.Clear();
}
inline ::gooseai::EngineInfo* Engines::mutable_engine(int index) {
  // @@protoc_insertion_point(field_mutable:gooseai.Engines.engine)
  return _impl_.engine_.Mutable(index);
}
inline ::PROTOBUF_NAMESPACE_ID::RepeatedPtrField< ::gooseai::EngineInfo >*
Engines::mutable_engine() {
  // @@protoc_insertion_point(field_mutable_list:gooseai.Engines.engine)
  return &_impl_.engine_;
}
inline const ::gooseai::EngineInfo& Engines::_internal_engine(int index) const {
  return _impl_.engine_.Get(index);
}
inline const ::gooseai::EngineInfo& Engines::engine(int index) const {
  // @@protoc_insertion_point(field_get:gooseai.Engines.engine)
  return _internal_engine(index);
}
inline ::gooseai::EngineInfo* Engines::_internal_add_engine() {
  return _impl_.engine_.Add();
}
inline ::gooseai::EngineInfo* Engines::add_engine() {
  ::gooseai::EngineInfo* _add = _internal_add_engine();
  // @@protoc_insertion_point(field_add:gooseai.Engines.engine)
  return _add;
}
inline const ::PROTOBUF_NAMESPACE_ID::RepeatedPtrField< ::gooseai::EngineInfo >&
Engines::engine() const {
  // @@protoc_insertion_point(field_list:gooseai.Engines.engine)
  return _impl_.engine_;
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__
// -------------------------------------------------------------------

// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace gooseai

PROTOBUF_NAMESPACE_OPEN

template <> struct is_proto_enum< ::gooseai::EngineType> : ::std::true_type {};
template <>
inline const EnumDescriptor* GetEnumDescriptor< ::gooseai::EngineType>() {
  return ::gooseai::EngineType_descriptor();
}
template <> struct is_proto_enum< ::gooseai::EngineTokenizer> : ::std::true_type {};
template <>
inline const EnumDescriptor* GetEnumDescriptor< ::gooseai::EngineTokenizer>() {
  return ::gooseai::EngineTokenizer_descriptor();
}

PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)

#include <google/protobuf/port_undef.inc>
#endif  // GOOGLE_PROTOBUF_INCLUDED_GOOGLE_PROTOBUF_INCLUDED_engines_2eproto
