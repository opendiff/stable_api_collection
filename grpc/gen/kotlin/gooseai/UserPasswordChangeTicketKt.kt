//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: dashboard.proto

package gooseai;

@kotlin.jvm.JvmName("-initializeuserPasswordChangeTicket")
public inline fun userPasswordChangeTicket(block: gooseai.UserPasswordChangeTicketKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.UserPasswordChangeTicket =
  gooseai.UserPasswordChangeTicketKt.Dsl._create(gooseai.Dashboard.UserPasswordChangeTicket.newBuilder()).apply { block() }._build()
public object UserPasswordChangeTicketKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: gooseai.Dashboard.UserPasswordChangeTicket.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: gooseai.Dashboard.UserPasswordChangeTicket.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): gooseai.Dashboard.UserPasswordChangeTicket = _builder.build()

    /**
     * <code>string ticket = 1 [json_name = "ticket"];</code>
     */
    public var ticket: kotlin.String
      @JvmName("getTicket")
      get() = _builder.getTicket()
      @JvmName("setTicket")
      set(value) {
        _builder.setTicket(value)
      }
    /**
     * <code>string ticket = 1 [json_name = "ticket"];</code>
     */
    public fun clearTicket() {
      _builder.clearTicket()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun gooseai.Dashboard.UserPasswordChangeTicket.copy(block: gooseai.UserPasswordChangeTicketKt.Dsl.() -> kotlin.Unit): gooseai.Dashboard.UserPasswordChangeTicket =
  gooseai.UserPasswordChangeTicketKt.Dsl._create(this.toBuilder()).apply { block() }._build()
