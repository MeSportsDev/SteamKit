package uk.co.thomasc.steamkit.base.generated;

public final class EncryptedAppTicketOuterClass {
  private EncryptedAppTicketOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EncryptedAppTicketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EncryptedAppTicket)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 ticket_version_no = 1;</code>
     */
    boolean hasTicketVersionNo();
    /**
     * <code>optional uint32 ticket_version_no = 1;</code>
     */
    int getTicketVersionNo();

    /**
     * <code>optional uint32 crc_encryptedticket = 2;</code>
     */
    boolean hasCrcEncryptedticket();
    /**
     * <code>optional uint32 crc_encryptedticket = 2;</code>
     */
    int getCrcEncryptedticket();

    /**
     * <code>optional uint32 cb_encrypteduserdata = 3;</code>
     */
    boolean hasCbEncrypteduserdata();
    /**
     * <code>optional uint32 cb_encrypteduserdata = 3;</code>
     */
    int getCbEncrypteduserdata();

    /**
     * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
     */
    boolean hasCbEncryptedAppownershipticket();
    /**
     * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
     */
    int getCbEncryptedAppownershipticket();

    /**
     * <code>optional bytes encrypted_ticket = 5;</code>
     */
    boolean hasEncryptedTicket();
    /**
     * <code>optional bytes encrypted_ticket = 5;</code>
     */
    com.google.protobuf.ByteString getEncryptedTicket();
  }
  /**
   * Protobuf type {@code EncryptedAppTicket}
   */
  public  static final class EncryptedAppTicket extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EncryptedAppTicket)
      EncryptedAppTicketOrBuilder {
    // Use EncryptedAppTicket.newBuilder() to construct.
    private EncryptedAppTicket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EncryptedAppTicket() {
      ticketVersionNo_ = 0;
      crcEncryptedticket_ = 0;
      cbEncrypteduserdata_ = 0;
      cbEncryptedAppownershipticket_ = 0;
      encryptedTicket_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EncryptedAppTicket(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              ticketVersionNo_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              crcEncryptedticket_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              cbEncrypteduserdata_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              cbEncryptedAppownershipticket_ = input.readUInt32();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              encryptedTicket_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.internal_static_EncryptedAppTicket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.internal_static_EncryptedAppTicket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.class, uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.Builder.class);
    }

    private int bitField0_;
    public static final int TICKET_VERSION_NO_FIELD_NUMBER = 1;
    private int ticketVersionNo_;
    /**
     * <code>optional uint32 ticket_version_no = 1;</code>
     */
    public boolean hasTicketVersionNo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 ticket_version_no = 1;</code>
     */
    public int getTicketVersionNo() {
      return ticketVersionNo_;
    }

    public static final int CRC_ENCRYPTEDTICKET_FIELD_NUMBER = 2;
    private int crcEncryptedticket_;
    /**
     * <code>optional uint32 crc_encryptedticket = 2;</code>
     */
    public boolean hasCrcEncryptedticket() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 crc_encryptedticket = 2;</code>
     */
    public int getCrcEncryptedticket() {
      return crcEncryptedticket_;
    }

    public static final int CB_ENCRYPTEDUSERDATA_FIELD_NUMBER = 3;
    private int cbEncrypteduserdata_;
    /**
     * <code>optional uint32 cb_encrypteduserdata = 3;</code>
     */
    public boolean hasCbEncrypteduserdata() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 cb_encrypteduserdata = 3;</code>
     */
    public int getCbEncrypteduserdata() {
      return cbEncrypteduserdata_;
    }

    public static final int CB_ENCRYPTED_APPOWNERSHIPTICKET_FIELD_NUMBER = 4;
    private int cbEncryptedAppownershipticket_;
    /**
     * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
     */
    public boolean hasCbEncryptedAppownershipticket() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
     */
    public int getCbEncryptedAppownershipticket() {
      return cbEncryptedAppownershipticket_;
    }

    public static final int ENCRYPTED_TICKET_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString encryptedTicket_;
    /**
     * <code>optional bytes encrypted_ticket = 5;</code>
     */
    public boolean hasEncryptedTicket() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes encrypted_ticket = 5;</code>
     */
    public com.google.protobuf.ByteString getEncryptedTicket() {
      return encryptedTicket_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, ticketVersionNo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, crcEncryptedticket_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, cbEncrypteduserdata_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, cbEncryptedAppownershipticket_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, encryptedTicket_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, ticketVersionNo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, crcEncryptedticket_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cbEncrypteduserdata_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cbEncryptedAppownershipticket_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, encryptedTicket_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket)) {
        return super.equals(obj);
      }
      uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket other = (uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket) obj;

      boolean result = true;
      result = result && (hasTicketVersionNo() == other.hasTicketVersionNo());
      if (hasTicketVersionNo()) {
        result = result && (getTicketVersionNo()
            == other.getTicketVersionNo());
      }
      result = result && (hasCrcEncryptedticket() == other.hasCrcEncryptedticket());
      if (hasCrcEncryptedticket()) {
        result = result && (getCrcEncryptedticket()
            == other.getCrcEncryptedticket());
      }
      result = result && (hasCbEncrypteduserdata() == other.hasCbEncrypteduserdata());
      if (hasCbEncrypteduserdata()) {
        result = result && (getCbEncrypteduserdata()
            == other.getCbEncrypteduserdata());
      }
      result = result && (hasCbEncryptedAppownershipticket() == other.hasCbEncryptedAppownershipticket());
      if (hasCbEncryptedAppownershipticket()) {
        result = result && (getCbEncryptedAppownershipticket()
            == other.getCbEncryptedAppownershipticket());
      }
      result = result && (hasEncryptedTicket() == other.hasEncryptedTicket());
      if (hasEncryptedTicket()) {
        result = result && getEncryptedTicket()
            .equals(other.getEncryptedTicket());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasTicketVersionNo()) {
        hash = (37 * hash) + TICKET_VERSION_NO_FIELD_NUMBER;
        hash = (53 * hash) + getTicketVersionNo();
      }
      if (hasCrcEncryptedticket()) {
        hash = (37 * hash) + CRC_ENCRYPTEDTICKET_FIELD_NUMBER;
        hash = (53 * hash) + getCrcEncryptedticket();
      }
      if (hasCbEncrypteduserdata()) {
        hash = (37 * hash) + CB_ENCRYPTEDUSERDATA_FIELD_NUMBER;
        hash = (53 * hash) + getCbEncrypteduserdata();
      }
      if (hasCbEncryptedAppownershipticket()) {
        hash = (37 * hash) + CB_ENCRYPTED_APPOWNERSHIPTICKET_FIELD_NUMBER;
        hash = (53 * hash) + getCbEncryptedAppownershipticket();
      }
      if (hasEncryptedTicket()) {
        hash = (37 * hash) + ENCRYPTED_TICKET_FIELD_NUMBER;
        hash = (53 * hash) + getEncryptedTicket().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EncryptedAppTicket}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EncryptedAppTicket)
        uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.internal_static_EncryptedAppTicket_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.internal_static_EncryptedAppTicket_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.class, uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.Builder.class);
      }

      // Construct using uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        ticketVersionNo_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        crcEncryptedticket_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        cbEncrypteduserdata_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        cbEncryptedAppownershipticket_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        encryptedTicket_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.internal_static_EncryptedAppTicket_descriptor;
      }

      public uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket getDefaultInstanceForType() {
        return uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.getDefaultInstance();
      }

      public uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket build() {
        uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket buildPartial() {
        uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket result = new uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ticketVersionNo_ = ticketVersionNo_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.crcEncryptedticket_ = crcEncryptedticket_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.cbEncrypteduserdata_ = cbEncrypteduserdata_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cbEncryptedAppownershipticket_ = cbEncryptedAppownershipticket_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.encryptedTicket_ = encryptedTicket_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket) {
          return mergeFrom((uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket other) {
        if (other == uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket.getDefaultInstance()) return this;
        if (other.hasTicketVersionNo()) {
          setTicketVersionNo(other.getTicketVersionNo());
        }
        if (other.hasCrcEncryptedticket()) {
          setCrcEncryptedticket(other.getCrcEncryptedticket());
        }
        if (other.hasCbEncrypteduserdata()) {
          setCbEncrypteduserdata(other.getCbEncrypteduserdata());
        }
        if (other.hasCbEncryptedAppownershipticket()) {
          setCbEncryptedAppownershipticket(other.getCbEncryptedAppownershipticket());
        }
        if (other.hasEncryptedTicket()) {
          setEncryptedTicket(other.getEncryptedTicket());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int ticketVersionNo_ ;
      /**
       * <code>optional uint32 ticket_version_no = 1;</code>
       */
      public boolean hasTicketVersionNo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 ticket_version_no = 1;</code>
       */
      public int getTicketVersionNo() {
        return ticketVersionNo_;
      }
      /**
       * <code>optional uint32 ticket_version_no = 1;</code>
       */
      public Builder setTicketVersionNo(int value) {
        bitField0_ |= 0x00000001;
        ticketVersionNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ticket_version_no = 1;</code>
       */
      public Builder clearTicketVersionNo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ticketVersionNo_ = 0;
        onChanged();
        return this;
      }

      private int crcEncryptedticket_ ;
      /**
       * <code>optional uint32 crc_encryptedticket = 2;</code>
       */
      public boolean hasCrcEncryptedticket() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 crc_encryptedticket = 2;</code>
       */
      public int getCrcEncryptedticket() {
        return crcEncryptedticket_;
      }
      /**
       * <code>optional uint32 crc_encryptedticket = 2;</code>
       */
      public Builder setCrcEncryptedticket(int value) {
        bitField0_ |= 0x00000002;
        crcEncryptedticket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 crc_encryptedticket = 2;</code>
       */
      public Builder clearCrcEncryptedticket() {
        bitField0_ = (bitField0_ & ~0x00000002);
        crcEncryptedticket_ = 0;
        onChanged();
        return this;
      }

      private int cbEncrypteduserdata_ ;
      /**
       * <code>optional uint32 cb_encrypteduserdata = 3;</code>
       */
      public boolean hasCbEncrypteduserdata() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 cb_encrypteduserdata = 3;</code>
       */
      public int getCbEncrypteduserdata() {
        return cbEncrypteduserdata_;
      }
      /**
       * <code>optional uint32 cb_encrypteduserdata = 3;</code>
       */
      public Builder setCbEncrypteduserdata(int value) {
        bitField0_ |= 0x00000004;
        cbEncrypteduserdata_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cb_encrypteduserdata = 3;</code>
       */
      public Builder clearCbEncrypteduserdata() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cbEncrypteduserdata_ = 0;
        onChanged();
        return this;
      }

      private int cbEncryptedAppownershipticket_ ;
      /**
       * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
       */
      public boolean hasCbEncryptedAppownershipticket() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
       */
      public int getCbEncryptedAppownershipticket() {
        return cbEncryptedAppownershipticket_;
      }
      /**
       * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
       */
      public Builder setCbEncryptedAppownershipticket(int value) {
        bitField0_ |= 0x00000008;
        cbEncryptedAppownershipticket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cb_encrypted_appownershipticket = 4;</code>
       */
      public Builder clearCbEncryptedAppownershipticket() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cbEncryptedAppownershipticket_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString encryptedTicket_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes encrypted_ticket = 5;</code>
       */
      public boolean hasEncryptedTicket() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes encrypted_ticket = 5;</code>
       */
      public com.google.protobuf.ByteString getEncryptedTicket() {
        return encryptedTicket_;
      }
      /**
       * <code>optional bytes encrypted_ticket = 5;</code>
       */
      public Builder setEncryptedTicket(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        encryptedTicket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes encrypted_ticket = 5;</code>
       */
      public Builder clearEncryptedTicket() {
        bitField0_ = (bitField0_ & ~0x00000010);
        encryptedTicket_ = getDefaultInstance().getEncryptedTicket();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EncryptedAppTicket)
    }

    // @@protoc_insertion_point(class_scope:EncryptedAppTicket)
    private static final uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket();
    }

    public static uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EncryptedAppTicket>
        PARSER = new com.google.protobuf.AbstractParser<EncryptedAppTicket>() {
      public EncryptedAppTicket parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new EncryptedAppTicket(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EncryptedAppTicket> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EncryptedAppTicket> getParserForType() {
      return PARSER;
    }

    public uk.co.thomasc.steamkit.base.generated.EncryptedAppTicketOuterClass.EncryptedAppTicket getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EncryptedAppTicket_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EncryptedAppTicket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGin/dragonbra/javasteam/protobufs/steam" +
      "client/encrypted_app_ticket.proto\"\255\001\n\022En" +
      "cryptedAppTicket\022\031\n\021ticket_version_no\030\001 " +
      "\001(\r\022\033\n\023crc_encryptedticket\030\002 \001(\r\022\034\n\024cb_e" +
      "ncrypteduserdata\030\003 \001(\r\022\'\n\037cb_encrypted_a" +
      "ppownershipticket\030\004 \001(\r\022\030\n\020encrypted_tic" +
      "ket\030\005 \001(\014B3\n,in.dragonbra.javasteam.prot" +
      "obufs.steamclientH\001\200\001\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EncryptedAppTicket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EncryptedAppTicket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EncryptedAppTicket_descriptor,
        new java.lang.String[] { "TicketVersionNo", "CrcEncryptedticket", "CbEncrypteduserdata", "CbEncryptedAppownershipticket", "EncryptedTicket", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
