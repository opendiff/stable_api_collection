//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeemptyRequest")
public inline fun emptyRequest(block: gooseai.EmptyRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.EmptyRequest =
  gooseai.EmptyRequestKt.Dsl._create(gooseai.Dashboard.EmptyRequest.newBuilder()).apply { block() }._build()
public object EmptyRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.EmptyRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.EmptyRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.EmptyRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.EmptyRequest.copy(block: gooseai.EmptyRequestKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.EmptyRequest =
  gooseai.EmptyRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
