package uk.co.thomasc.steamkit.base.generated;

public final class SteammessagesTwofactorSteamclient {
  private SteammessagesTwofactorSteamclient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CTwoFactor_Status_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_Status_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    long getSteamid();
  }
  /**
   * Protobuf type {@code CTwoFactor_Status_Request}
   */
  public  static final class CTwoFactor_Status_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_Status_Request)
      CTwoFactor_Status_RequestOrBuilder {
    // Use CTwoFactor_Status_Request.newBuilder() to construct.
    private CTwoFactor_Status_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_Status_Request() {
      steamid_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_Status_Request(
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
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public long getSteamid() {
      return steamid_;
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
        output.writeFixed64(1, steamid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_Status_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_Status_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_Status_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_Status_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_Status_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_Status_Request>() {
      public CTwoFactor_Status_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_Status_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_Status_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_Status_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_Status_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_Status_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
     */
    boolean hasState();
    /**
     * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
     */
    int getState();

    /**
     * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
     */
    boolean hasInactivationReason();
    /**
     * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
     */
    int getInactivationReason();

    /**
     * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
     */
    boolean hasAuthenticatorType();
    /**
     * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
     */
    int getAuthenticatorType();

    /**
     * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
     */
    boolean hasAuthenticatorAllowed();
    /**
     * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
     */
    boolean getAuthenticatorAllowed();

    /**
     * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
     */
    boolean hasSteamguardScheme();
    /**
     * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
     */
    int getSteamguardScheme();

    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    boolean hasTokenGid();
    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    java.lang.String getTokenGid();
    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    com.google.protobuf.ByteString
        getTokenGidBytes();

    /**
     * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
     */
    boolean hasEmailValidated();
    /**
     * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
     */
    boolean getEmailValidated();

    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    boolean hasDeviceIdentifier();
    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    java.lang.String getDeviceIdentifier();
    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    com.google.protobuf.ByteString
        getDeviceIdentifierBytes();

    /**
     * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
     */
    boolean hasTimeCreated();
    /**
     * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
     */
    int getTimeCreated();

    /**
     * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    boolean hasRevocationAttemptsRemaining();
    /**
     * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    int getRevocationAttemptsRemaining();

    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    boolean hasClassifiedAgent();
    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    java.lang.String getClassifiedAgent();
    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    com.google.protobuf.ByteString
        getClassifiedAgentBytes();

    /**
     * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
     */
    boolean hasAllowExternalAuthenticator();
    /**
     * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
     */
    boolean getAllowExternalAuthenticator();

    /**
     * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
     */
    boolean hasExternalAuthenticatorType();
    /**
     * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
     */
    int getExternalAuthenticatorType();
  }
  /**
   * Protobuf type {@code CTwoFactor_Status_Response}
   */
  public  static final class CTwoFactor_Status_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_Status_Response)
      CTwoFactor_Status_ResponseOrBuilder {
    // Use CTwoFactor_Status_Response.newBuilder() to construct.
    private CTwoFactor_Status_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_Status_Response() {
      state_ = 0;
      inactivationReason_ = 0;
      authenticatorType_ = 0;
      authenticatorAllowed_ = false;
      steamguardScheme_ = 0;
      tokenGid_ = "";
      emailValidated_ = false;
      deviceIdentifier_ = "";
      timeCreated_ = 0;
      revocationAttemptsRemaining_ = 0;
      classifiedAgent_ = "";
      allowExternalAuthenticator_ = false;
      externalAuthenticatorType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_Status_Response(
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
              state_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              inactivationReason_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              authenticatorType_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              authenticatorAllowed_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              steamguardScheme_ = input.readUInt32();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              tokenGid_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              emailValidated_ = input.readBool();
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              deviceIdentifier_ = bs;
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              timeCreated_ = input.readUInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              revocationAttemptsRemaining_ = input.readUInt32();
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000400;
              classifiedAgent_ = bs;
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              allowExternalAuthenticator_ = input.readBool();
              break;
            }
            case 104: {
              bitField0_ |= 0x00001000;
              externalAuthenticatorType_ = input.readUInt32();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.Builder.class);
    }

    private int bitField0_;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
     */
    public int getState() {
      return state_;
    }

    public static final int INACTIVATION_REASON_FIELD_NUMBER = 2;
    private int inactivationReason_;
    /**
     * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
     */
    public boolean hasInactivationReason() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
     */
    public int getInactivationReason() {
      return inactivationReason_;
    }

    public static final int AUTHENTICATOR_TYPE_FIELD_NUMBER = 3;
    private int authenticatorType_;
    /**
     * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
     */
    public boolean hasAuthenticatorType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
     */
    public int getAuthenticatorType() {
      return authenticatorType_;
    }

    public static final int AUTHENTICATOR_ALLOWED_FIELD_NUMBER = 4;
    private boolean authenticatorAllowed_;
    /**
     * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
     */
    public boolean hasAuthenticatorAllowed() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
     */
    public boolean getAuthenticatorAllowed() {
      return authenticatorAllowed_;
    }

    public static final int STEAMGUARD_SCHEME_FIELD_NUMBER = 5;
    private int steamguardScheme_;
    /**
     * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
     */
    public boolean hasSteamguardScheme() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
     */
    public int getSteamguardScheme() {
      return steamguardScheme_;
    }

    public static final int TOKEN_GID_FIELD_NUMBER = 6;
    private volatile java.lang.Object tokenGid_;
    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    public boolean hasTokenGid() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    public java.lang.String getTokenGid() {
      java.lang.Object ref = tokenGid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tokenGid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
     */
    public com.google.protobuf.ByteString
        getTokenGidBytes() {
      java.lang.Object ref = tokenGid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenGid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_VALIDATED_FIELD_NUMBER = 7;
    private boolean emailValidated_;
    /**
     * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
     */
    public boolean hasEmailValidated() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
     */
    public boolean getEmailValidated() {
      return emailValidated_;
    }

    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 8;
    private volatile java.lang.Object deviceIdentifier_;
    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    public boolean hasDeviceIdentifier() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    public java.lang.String getDeviceIdentifier() {
      java.lang.Object ref = deviceIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceIdentifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdentifierBytes() {
      java.lang.Object ref = deviceIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_CREATED_FIELD_NUMBER = 9;
    private int timeCreated_;
    /**
     * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
     */
    public boolean hasTimeCreated() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
     */
    public int getTimeCreated() {
      return timeCreated_;
    }

    public static final int REVOCATION_ATTEMPTS_REMAINING_FIELD_NUMBER = 10;
    private int revocationAttemptsRemaining_;
    /**
     * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    public boolean hasRevocationAttemptsRemaining() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    public int getRevocationAttemptsRemaining() {
      return revocationAttemptsRemaining_;
    }

    public static final int CLASSIFIED_AGENT_FIELD_NUMBER = 11;
    private volatile java.lang.Object classifiedAgent_;
    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    public boolean hasClassifiedAgent() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    public java.lang.String getClassifiedAgent() {
      java.lang.Object ref = classifiedAgent_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          classifiedAgent_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
     */
    public com.google.protobuf.ByteString
        getClassifiedAgentBytes() {
      java.lang.Object ref = classifiedAgent_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classifiedAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOW_EXTERNAL_AUTHENTICATOR_FIELD_NUMBER = 12;
    private boolean allowExternalAuthenticator_;
    /**
     * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
     */
    public boolean hasAllowExternalAuthenticator() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
     */
    public boolean getAllowExternalAuthenticator() {
      return allowExternalAuthenticator_;
    }

    public static final int EXTERNAL_AUTHENTICATOR_TYPE_FIELD_NUMBER = 13;
    private int externalAuthenticatorType_;
    /**
     * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
     */
    public boolean hasExternalAuthenticatorType() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
     */
    public int getExternalAuthenticatorType() {
      return externalAuthenticatorType_;
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
        output.writeUInt32(1, state_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, inactivationReason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, authenticatorType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, authenticatorAllowed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, steamguardScheme_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, tokenGid_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, emailValidated_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, deviceIdentifier_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeUInt32(9, timeCreated_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeUInt32(10, revocationAttemptsRemaining_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, classifiedAgent_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeBool(12, allowExternalAuthenticator_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeUInt32(13, externalAuthenticatorType_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, state_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, inactivationReason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, authenticatorType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, authenticatorAllowed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, steamguardScheme_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, tokenGid_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, emailValidated_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, deviceIdentifier_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, timeCreated_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, revocationAttemptsRemaining_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, classifiedAgent_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, allowExternalAuthenticator_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, externalAuthenticatorType_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response) obj;

      boolean result = true;
      result = result && (hasState() == other.hasState());
      if (hasState()) {
        result = result && (getState()
            == other.getState());
      }
      result = result && (hasInactivationReason() == other.hasInactivationReason());
      if (hasInactivationReason()) {
        result = result && (getInactivationReason()
            == other.getInactivationReason());
      }
      result = result && (hasAuthenticatorType() == other.hasAuthenticatorType());
      if (hasAuthenticatorType()) {
        result = result && (getAuthenticatorType()
            == other.getAuthenticatorType());
      }
      result = result && (hasAuthenticatorAllowed() == other.hasAuthenticatorAllowed());
      if (hasAuthenticatorAllowed()) {
        result = result && (getAuthenticatorAllowed()
            == other.getAuthenticatorAllowed());
      }
      result = result && (hasSteamguardScheme() == other.hasSteamguardScheme());
      if (hasSteamguardScheme()) {
        result = result && (getSteamguardScheme()
            == other.getSteamguardScheme());
      }
      result = result && (hasTokenGid() == other.hasTokenGid());
      if (hasTokenGid()) {
        result = result && getTokenGid()
            .equals(other.getTokenGid());
      }
      result = result && (hasEmailValidated() == other.hasEmailValidated());
      if (hasEmailValidated()) {
        result = result && (getEmailValidated()
            == other.getEmailValidated());
      }
      result = result && (hasDeviceIdentifier() == other.hasDeviceIdentifier());
      if (hasDeviceIdentifier()) {
        result = result && getDeviceIdentifier()
            .equals(other.getDeviceIdentifier());
      }
      result = result && (hasTimeCreated() == other.hasTimeCreated());
      if (hasTimeCreated()) {
        result = result && (getTimeCreated()
            == other.getTimeCreated());
      }
      result = result && (hasRevocationAttemptsRemaining() == other.hasRevocationAttemptsRemaining());
      if (hasRevocationAttemptsRemaining()) {
        result = result && (getRevocationAttemptsRemaining()
            == other.getRevocationAttemptsRemaining());
      }
      result = result && (hasClassifiedAgent() == other.hasClassifiedAgent());
      if (hasClassifiedAgent()) {
        result = result && getClassifiedAgent()
            .equals(other.getClassifiedAgent());
      }
      result = result && (hasAllowExternalAuthenticator() == other.hasAllowExternalAuthenticator());
      if (hasAllowExternalAuthenticator()) {
        result = result && (getAllowExternalAuthenticator()
            == other.getAllowExternalAuthenticator());
      }
      result = result && (hasExternalAuthenticatorType() == other.hasExternalAuthenticatorType());
      if (hasExternalAuthenticatorType()) {
        result = result && (getExternalAuthenticatorType()
            == other.getExternalAuthenticatorType());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getState();
      }
      if (hasInactivationReason()) {
        hash = (37 * hash) + INACTIVATION_REASON_FIELD_NUMBER;
        hash = (53 * hash) + getInactivationReason();
      }
      if (hasAuthenticatorType()) {
        hash = (37 * hash) + AUTHENTICATOR_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getAuthenticatorType();
      }
      if (hasAuthenticatorAllowed()) {
        hash = (37 * hash) + AUTHENTICATOR_ALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getAuthenticatorAllowed());
      }
      if (hasSteamguardScheme()) {
        hash = (37 * hash) + STEAMGUARD_SCHEME_FIELD_NUMBER;
        hash = (53 * hash) + getSteamguardScheme();
      }
      if (hasTokenGid()) {
        hash = (37 * hash) + TOKEN_GID_FIELD_NUMBER;
        hash = (53 * hash) + getTokenGid().hashCode();
      }
      if (hasEmailValidated()) {
        hash = (37 * hash) + EMAIL_VALIDATED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEmailValidated());
      }
      if (hasDeviceIdentifier()) {
        hash = (37 * hash) + DEVICE_IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getDeviceIdentifier().hashCode();
      }
      if (hasTimeCreated()) {
        hash = (37 * hash) + TIME_CREATED_FIELD_NUMBER;
        hash = (53 * hash) + getTimeCreated();
      }
      if (hasRevocationAttemptsRemaining()) {
        hash = (37 * hash) + REVOCATION_ATTEMPTS_REMAINING_FIELD_NUMBER;
        hash = (53 * hash) + getRevocationAttemptsRemaining();
      }
      if (hasClassifiedAgent()) {
        hash = (37 * hash) + CLASSIFIED_AGENT_FIELD_NUMBER;
        hash = (53 * hash) + getClassifiedAgent().hashCode();
      }
      if (hasAllowExternalAuthenticator()) {
        hash = (37 * hash) + ALLOW_EXTERNAL_AUTHENTICATOR_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getAllowExternalAuthenticator());
      }
      if (hasExternalAuthenticatorType()) {
        hash = (37 * hash) + EXTERNAL_AUTHENTICATOR_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getExternalAuthenticatorType();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_Status_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_Status_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.newBuilder()
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
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        inactivationReason_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        authenticatorType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        authenticatorAllowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        steamguardScheme_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        tokenGid_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        emailValidated_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        deviceIdentifier_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        timeCreated_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        revocationAttemptsRemaining_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        classifiedAgent_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        allowExternalAuthenticator_ = false;
        bitField0_ = (bitField0_ & ~0x00000800);
        externalAuthenticatorType_ = 0;
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_Status_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.inactivationReason_ = inactivationReason_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.authenticatorType_ = authenticatorType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.authenticatorAllowed_ = authenticatorAllowed_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.steamguardScheme_ = steamguardScheme_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.tokenGid_ = tokenGid_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.emailValidated_ = emailValidated_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.deviceIdentifier_ = deviceIdentifier_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.timeCreated_ = timeCreated_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.revocationAttemptsRemaining_ = revocationAttemptsRemaining_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.classifiedAgent_ = classifiedAgent_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.allowExternalAuthenticator_ = allowExternalAuthenticator_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.externalAuthenticatorType_ = externalAuthenticatorType_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasInactivationReason()) {
          setInactivationReason(other.getInactivationReason());
        }
        if (other.hasAuthenticatorType()) {
          setAuthenticatorType(other.getAuthenticatorType());
        }
        if (other.hasAuthenticatorAllowed()) {
          setAuthenticatorAllowed(other.getAuthenticatorAllowed());
        }
        if (other.hasSteamguardScheme()) {
          setSteamguardScheme(other.getSteamguardScheme());
        }
        if (other.hasTokenGid()) {
          bitField0_ |= 0x00000020;
          tokenGid_ = other.tokenGid_;
          onChanged();
        }
        if (other.hasEmailValidated()) {
          setEmailValidated(other.getEmailValidated());
        }
        if (other.hasDeviceIdentifier()) {
          bitField0_ |= 0x00000080;
          deviceIdentifier_ = other.deviceIdentifier_;
          onChanged();
        }
        if (other.hasTimeCreated()) {
          setTimeCreated(other.getTimeCreated());
        }
        if (other.hasRevocationAttemptsRemaining()) {
          setRevocationAttemptsRemaining(other.getRevocationAttemptsRemaining());
        }
        if (other.hasClassifiedAgent()) {
          bitField0_ |= 0x00000400;
          classifiedAgent_ = other.classifiedAgent_;
          onChanged();
        }
        if (other.hasAllowExternalAuthenticator()) {
          setAllowExternalAuthenticator(other.getAllowExternalAuthenticator());
        }
        if (other.hasExternalAuthenticatorType()) {
          setExternalAuthenticatorType(other.getExternalAuthenticatorType());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int state_ ;
      /**
       * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000001;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 state = 1 [(.description) = "Authenticator state"];</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      private int inactivationReason_ ;
      /**
       * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
       */
      public boolean hasInactivationReason() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
       */
      public int getInactivationReason() {
        return inactivationReason_;
      }
      /**
       * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
       */
      public Builder setInactivationReason(int value) {
        bitField0_ |= 0x00000002;
        inactivationReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 inactivation_reason = 2 [(.description) = "Inactivation reason (if any)"];</code>
       */
      public Builder clearInactivationReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        inactivationReason_ = 0;
        onChanged();
        return this;
      }

      private int authenticatorType_ ;
      /**
       * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
       */
      public boolean hasAuthenticatorType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
       */
      public int getAuthenticatorType() {
        return authenticatorType_;
      }
      /**
       * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
       */
      public Builder setAuthenticatorType(int value) {
        bitField0_ |= 0x00000004;
        authenticatorType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 authenticator_type = 3 [(.description) = "Type of authenticator"];</code>
       */
      public Builder clearAuthenticatorType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        authenticatorType_ = 0;
        onChanged();
        return this;
      }

      private boolean authenticatorAllowed_ ;
      /**
       * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
       */
      public boolean hasAuthenticatorAllowed() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
       */
      public boolean getAuthenticatorAllowed() {
        return authenticatorAllowed_;
      }
      /**
       * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
       */
      public Builder setAuthenticatorAllowed(boolean value) {
        bitField0_ |= 0x00000008;
        authenticatorAllowed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool authenticator_allowed = 4 [(.description) = "Account allowed to have an authenticator?"];</code>
       */
      public Builder clearAuthenticatorAllowed() {
        bitField0_ = (bitField0_ & ~0x00000008);
        authenticatorAllowed_ = false;
        onChanged();
        return this;
      }

      private int steamguardScheme_ ;
      /**
       * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
       */
      public boolean hasSteamguardScheme() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
       */
      public int getSteamguardScheme() {
        return steamguardScheme_;
      }
      /**
       * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
       */
      public Builder setSteamguardScheme(int value) {
        bitField0_ |= 0x00000010;
        steamguardScheme_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 steamguard_scheme = 5 [(.description) = "Steam Guard scheme in effect"];</code>
       */
      public Builder clearSteamguardScheme() {
        bitField0_ = (bitField0_ & ~0x00000010);
        steamguardScheme_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tokenGid_ = "";
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public boolean hasTokenGid() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public java.lang.String getTokenGid() {
        java.lang.Object ref = tokenGid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tokenGid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public com.google.protobuf.ByteString
          getTokenGidBytes() {
        java.lang.Object ref = tokenGid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tokenGid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public Builder setTokenGid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        tokenGid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public Builder clearTokenGid() {
        bitField0_ = (bitField0_ & ~0x00000020);
        tokenGid_ = getDefaultInstance().getTokenGid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string token_gid = 6 [(.description) = "String rep of token GID assigned by server"];</code>
       */
      public Builder setTokenGidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        tokenGid_ = value;
        onChanged();
        return this;
      }

      private boolean emailValidated_ ;
      /**
       * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
       */
      public boolean hasEmailValidated() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
       */
      public boolean getEmailValidated() {
        return emailValidated_;
      }
      /**
       * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
       */
      public Builder setEmailValidated(boolean value) {
        bitField0_ |= 0x00000040;
        emailValidated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool email_validated = 7 [(.description) = "Account has verified email capability"];</code>
       */
      public Builder clearEmailValidated() {
        bitField0_ = (bitField0_ & ~0x00000040);
        emailValidated_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object deviceIdentifier_ = "";
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public boolean hasDeviceIdentifier() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public java.lang.String getDeviceIdentifier() {
        java.lang.Object ref = deviceIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceIdentifier_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public com.google.protobuf.ByteString
          getDeviceIdentifierBytes() {
        java.lang.Object ref = deviceIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public Builder setDeviceIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        deviceIdentifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public Builder clearDeviceIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000080);
        deviceIdentifier_ = getDefaultInstance().getDeviceIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_identifier = 8 [(.description) = "Authenticator (phone) identifier"];</code>
       */
      public Builder setDeviceIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        deviceIdentifier_ = value;
        onChanged();
        return this;
      }

      private int timeCreated_ ;
      /**
       * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
       */
      public boolean hasTimeCreated() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
       */
      public int getTimeCreated() {
        return timeCreated_;
      }
      /**
       * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
       */
      public Builder setTimeCreated(int value) {
        bitField0_ |= 0x00000100;
        timeCreated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 time_created = 9 [(.description) = "When the token was created"];</code>
       */
      public Builder clearTimeCreated() {
        bitField0_ = (bitField0_ & ~0x00000100);
        timeCreated_ = 0;
        onChanged();
        return this;
      }

      private int revocationAttemptsRemaining_ ;
      /**
       * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public boolean hasRevocationAttemptsRemaining() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public int getRevocationAttemptsRemaining() {
        return revocationAttemptsRemaining_;
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public Builder setRevocationAttemptsRemaining(int value) {
        bitField0_ |= 0x00000200;
        revocationAttemptsRemaining_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 10 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public Builder clearRevocationAttemptsRemaining() {
        bitField0_ = (bitField0_ & ~0x00000200);
        revocationAttemptsRemaining_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object classifiedAgent_ = "";
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public boolean hasClassifiedAgent() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public java.lang.String getClassifiedAgent() {
        java.lang.Object ref = classifiedAgent_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            classifiedAgent_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public com.google.protobuf.ByteString
          getClassifiedAgentBytes() {
        java.lang.Object ref = classifiedAgent_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          classifiedAgent_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public Builder setClassifiedAgent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        classifiedAgent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public Builder clearClassifiedAgent() {
        bitField0_ = (bitField0_ & ~0x00000400);
        classifiedAgent_ = getDefaultInstance().getClassifiedAgent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string classified_agent = 11 [(.description) = "Agent that added the authenticator (e.g., ios / android / other)"];</code>
       */
      public Builder setClassifiedAgentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        classifiedAgent_ = value;
        onChanged();
        return this;
      }

      private boolean allowExternalAuthenticator_ ;
      /**
       * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
       */
      public boolean hasAllowExternalAuthenticator() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
       */
      public boolean getAllowExternalAuthenticator() {
        return allowExternalAuthenticator_;
      }
      /**
       * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
       */
      public Builder setAllowExternalAuthenticator(boolean value) {
        bitField0_ |= 0x00000800;
        allowExternalAuthenticator_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool allow_external_authenticator = 12 [(.description) = "Allow a third-party authenticator (in addition to two-factor)"];</code>
       */
      public Builder clearAllowExternalAuthenticator() {
        bitField0_ = (bitField0_ & ~0x00000800);
        allowExternalAuthenticator_ = false;
        onChanged();
        return this;
      }

      private int externalAuthenticatorType_ ;
      /**
       * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
       */
      public boolean hasExternalAuthenticatorType() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
       */
      public int getExternalAuthenticatorType() {
        return externalAuthenticatorType_;
      }
      /**
       * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
       */
      public Builder setExternalAuthenticatorType(int value) {
        bitField0_ |= 0x00001000;
        externalAuthenticatorType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 external_authenticator_type = 13 [(.description) = "Type of third-party authenticator"];</code>
       */
      public Builder clearExternalAuthenticatorType() {
        bitField0_ = (bitField0_ & ~0x00001000);
        externalAuthenticatorType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_Status_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_Status_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_Status_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_Status_Response>() {
      public CTwoFactor_Status_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_Status_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_Status_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_Status_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_Status_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_AddAuthenticator_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_AddAuthenticator_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    long getSteamid();

    /**
     * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
     */
    boolean hasAuthenticatorTime();
    /**
     * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
     */
    long getAuthenticatorTime();

    /**
     * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
     */
    boolean hasSerialNumber();
    /**
     * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
     */
    long getSerialNumber();

    /**
     * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
     */
    boolean hasAuthenticatorType();
    /**
     * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
     */
    int getAuthenticatorType();

    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    boolean hasDeviceIdentifier();
    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    java.lang.String getDeviceIdentifier();
    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    com.google.protobuf.ByteString
        getDeviceIdentifierBytes();

    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    boolean hasSmsPhoneId();
    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    java.lang.String getSmsPhoneId();
    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    com.google.protobuf.ByteString
        getSmsPhoneIdBytes();

    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    java.util.List<java.lang.String>
        getHttpHeadersList();
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    int getHttpHeadersCount();
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    java.lang.String getHttpHeaders(int index);
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    com.google.protobuf.ByteString
        getHttpHeadersBytes(int index);
  }
  /**
   * Protobuf type {@code CTwoFactor_AddAuthenticator_Request}
   */
  public  static final class CTwoFactor_AddAuthenticator_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_AddAuthenticator_Request)
      CTwoFactor_AddAuthenticator_RequestOrBuilder {
    // Use CTwoFactor_AddAuthenticator_Request.newBuilder() to construct.
    private CTwoFactor_AddAuthenticator_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_AddAuthenticator_Request() {
      steamid_ = 0L;
      authenticatorTime_ = 0L;
      serialNumber_ = 0L;
      authenticatorType_ = 0;
      deviceIdentifier_ = "";
      smsPhoneId_ = "";
      httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_AddAuthenticator_Request(
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
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              authenticatorTime_ = input.readUInt64();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              serialNumber_ = input.readFixed64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              authenticatorType_ = input.readUInt32();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              deviceIdentifier_ = bs;
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              smsPhoneId_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                httpHeaders_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000040;
              }
              httpHeaders_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          httpHeaders_ = httpHeaders_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public long getSteamid() {
      return steamid_;
    }

    public static final int AUTHENTICATOR_TIME_FIELD_NUMBER = 2;
    private long authenticatorTime_;
    /**
     * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
     */
    public boolean hasAuthenticatorTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
     */
    public long getAuthenticatorTime() {
      return authenticatorTime_;
    }

    public static final int SERIAL_NUMBER_FIELD_NUMBER = 3;
    private long serialNumber_;
    /**
     * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
     */
    public boolean hasSerialNumber() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
     */
    public long getSerialNumber() {
      return serialNumber_;
    }

    public static final int AUTHENTICATOR_TYPE_FIELD_NUMBER = 4;
    private int authenticatorType_;
    /**
     * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
     */
    public boolean hasAuthenticatorType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
     */
    public int getAuthenticatorType() {
      return authenticatorType_;
    }

    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 5;
    private volatile java.lang.Object deviceIdentifier_;
    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    public boolean hasDeviceIdentifier() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    public java.lang.String getDeviceIdentifier() {
      java.lang.Object ref = deviceIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceIdentifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdentifierBytes() {
      java.lang.Object ref = deviceIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SMS_PHONE_ID_FIELD_NUMBER = 6;
    private volatile java.lang.Object smsPhoneId_;
    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    public boolean hasSmsPhoneId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    public java.lang.String getSmsPhoneId() {
      java.lang.Object ref = smsPhoneId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          smsPhoneId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
     */
    public com.google.protobuf.ByteString
        getSmsPhoneIdBytes() {
      java.lang.Object ref = smsPhoneId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smsPhoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HTTP_HEADERS_FIELD_NUMBER = 7;
    private com.google.protobuf.LazyStringList httpHeaders_;
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHttpHeadersList() {
      return httpHeaders_;
    }
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public int getHttpHeadersCount() {
      return httpHeaders_.size();
    }
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public java.lang.String getHttpHeaders(int index) {
      return httpHeaders_.get(index);
    }
    /**
     * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public com.google.protobuf.ByteString
        getHttpHeadersBytes(int index) {
      return httpHeaders_.getByteString(index);
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
        output.writeFixed64(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, authenticatorTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFixed64(3, serialNumber_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, authenticatorType_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, deviceIdentifier_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, smsPhoneId_);
      }
      for (int i = 0; i < httpHeaders_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, httpHeaders_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, authenticatorTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(3, serialNumber_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, authenticatorType_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, deviceIdentifier_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, smsPhoneId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < httpHeaders_.size(); i++) {
          dataSize += computeStringSizeNoTag(httpHeaders_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getHttpHeadersList().size();
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
      }
      result = result && (hasAuthenticatorTime() == other.hasAuthenticatorTime());
      if (hasAuthenticatorTime()) {
        result = result && (getAuthenticatorTime()
            == other.getAuthenticatorTime());
      }
      result = result && (hasSerialNumber() == other.hasSerialNumber());
      if (hasSerialNumber()) {
        result = result && (getSerialNumber()
            == other.getSerialNumber());
      }
      result = result && (hasAuthenticatorType() == other.hasAuthenticatorType());
      if (hasAuthenticatorType()) {
        result = result && (getAuthenticatorType()
            == other.getAuthenticatorType());
      }
      result = result && (hasDeviceIdentifier() == other.hasDeviceIdentifier());
      if (hasDeviceIdentifier()) {
        result = result && getDeviceIdentifier()
            .equals(other.getDeviceIdentifier());
      }
      result = result && (hasSmsPhoneId() == other.hasSmsPhoneId());
      if (hasSmsPhoneId()) {
        result = result && getSmsPhoneId()
            .equals(other.getSmsPhoneId());
      }
      result = result && getHttpHeadersList()
          .equals(other.getHttpHeadersList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      if (hasAuthenticatorTime()) {
        hash = (37 * hash) + AUTHENTICATOR_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAuthenticatorTime());
      }
      if (hasSerialNumber()) {
        hash = (37 * hash) + SERIAL_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSerialNumber());
      }
      if (hasAuthenticatorType()) {
        hash = (37 * hash) + AUTHENTICATOR_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getAuthenticatorType();
      }
      if (hasDeviceIdentifier()) {
        hash = (37 * hash) + DEVICE_IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getDeviceIdentifier().hashCode();
      }
      if (hasSmsPhoneId()) {
        hash = (37 * hash) + SMS_PHONE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSmsPhoneId().hashCode();
      }
      if (getHttpHeadersCount() > 0) {
        hash = (37 * hash) + HTTP_HEADERS_FIELD_NUMBER;
        hash = (53 * hash) + getHttpHeadersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_AddAuthenticator_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_AddAuthenticator_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        authenticatorTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        serialNumber_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        authenticatorType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        deviceIdentifier_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        smsPhoneId_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.authenticatorTime_ = authenticatorTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.serialNumber_ = serialNumber_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.authenticatorType_ = authenticatorType_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.deviceIdentifier_ = deviceIdentifier_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.smsPhoneId_ = smsPhoneId_;
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          httpHeaders_ = httpHeaders_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.httpHeaders_ = httpHeaders_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
        }
        if (other.hasAuthenticatorTime()) {
          setAuthenticatorTime(other.getAuthenticatorTime());
        }
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasAuthenticatorType()) {
          setAuthenticatorType(other.getAuthenticatorType());
        }
        if (other.hasDeviceIdentifier()) {
          bitField0_ |= 0x00000010;
          deviceIdentifier_ = other.deviceIdentifier_;
          onChanged();
        }
        if (other.hasSmsPhoneId()) {
          bitField0_ |= 0x00000020;
          smsPhoneId_ = other.smsPhoneId_;
          onChanged();
        }
        if (!other.httpHeaders_.isEmpty()) {
          if (httpHeaders_.isEmpty()) {
            httpHeaders_ = other.httpHeaders_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureHttpHeadersIsMutable();
            httpHeaders_.addAll(other.httpHeaders_);
          }
          onChanged();
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
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
        onChanged();
        return this;
      }

      private long authenticatorTime_ ;
      /**
       * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
       */
      public boolean hasAuthenticatorTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
       */
      public long getAuthenticatorTime() {
        return authenticatorTime_;
      }
      /**
       * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
       */
      public Builder setAuthenticatorTime(long value) {
        bitField0_ |= 0x00000002;
        authenticatorTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 authenticator_time = 2 [(.description) = "Current authenticator time"];</code>
       */
      public Builder clearAuthenticatorTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        authenticatorTime_ = 0L;
        onChanged();
        return this;
      }

      private long serialNumber_ ;
      /**
       * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
       */
      public boolean hasSerialNumber() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
       */
      public long getSerialNumber() {
        return serialNumber_;
      }
      /**
       * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
       */
      public Builder setSerialNumber(long value) {
        bitField0_ |= 0x00000004;
        serialNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 serial_number = 3 [(.description) = "locally computed serial (deprecated)"];</code>
       */
      public Builder clearSerialNumber() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serialNumber_ = 0L;
        onChanged();
        return this;
      }

      private int authenticatorType_ ;
      /**
       * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
       */
      public boolean hasAuthenticatorType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
       */
      public int getAuthenticatorType() {
        return authenticatorType_;
      }
      /**
       * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
       */
      public Builder setAuthenticatorType(int value) {
        bitField0_ |= 0x00000008;
        authenticatorType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 authenticator_type = 4 [(.description) = "Authenticator type"];</code>
       */
      public Builder clearAuthenticatorType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        authenticatorType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object deviceIdentifier_ = "";
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public boolean hasDeviceIdentifier() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public java.lang.String getDeviceIdentifier() {
        java.lang.Object ref = deviceIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceIdentifier_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public com.google.protobuf.ByteString
          getDeviceIdentifierBytes() {
        java.lang.Object ref = deviceIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public Builder setDeviceIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceIdentifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public Builder clearDeviceIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000010);
        deviceIdentifier_ = getDefaultInstance().getDeviceIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_identifier = 5 [(.description) = "Authenticator identifier"];</code>
       */
      public Builder setDeviceIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceIdentifier_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object smsPhoneId_ = "";
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public boolean hasSmsPhoneId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public java.lang.String getSmsPhoneId() {
        java.lang.Object ref = smsPhoneId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            smsPhoneId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public com.google.protobuf.ByteString
          getSmsPhoneIdBytes() {
        java.lang.Object ref = smsPhoneId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          smsPhoneId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public Builder setSmsPhoneId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        smsPhoneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public Builder clearSmsPhoneId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        smsPhoneId_ = getDefaultInstance().getSmsPhoneId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sms_phone_id = 6 [(.description) = "ID of phone to use for SMS verification"];</code>
       */
      public Builder setSmsPhoneIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        smsPhoneId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureHttpHeadersIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          httpHeaders_ = new com.google.protobuf.LazyStringArrayList(httpHeaders_);
          bitField0_ |= 0x00000040;
         }
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public com.google.protobuf.ProtocolStringList
          getHttpHeadersList() {
        return httpHeaders_.getUnmodifiableView();
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public int getHttpHeadersCount() {
        return httpHeaders_.size();
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public java.lang.String getHttpHeaders(int index) {
        return httpHeaders_.get(index);
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public com.google.protobuf.ByteString
          getHttpHeadersBytes(int index) {
        return httpHeaders_.getByteString(index);
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder setHttpHeaders(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addHttpHeaders(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addAllHttpHeaders(
          java.lang.Iterable<java.lang.String> values) {
        ensureHttpHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, httpHeaders_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder clearHttpHeaders() {
        httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 7 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addHttpHeadersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.add(value);
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_AddAuthenticator_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_AddAuthenticator_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_AddAuthenticator_Request>() {
      public CTwoFactor_AddAuthenticator_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_AddAuthenticator_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_AddAuthenticator_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_AddAuthenticator_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
     */
    boolean hasSharedSecret();
    /**
     * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
     */
    com.google.protobuf.ByteString getSharedSecret();

    /**
     * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
     */
    boolean hasSerialNumber();
    /**
     * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
     */
    long getSerialNumber();

    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    boolean hasRevocationCode();
    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    java.lang.String getRevocationCode();
    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    com.google.protobuf.ByteString
        getRevocationCodeBytes();

    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    boolean hasUri();
    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    java.lang.String getUri();
    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    com.google.protobuf.ByteString
        getUriBytes();

    /**
     * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
     */
    boolean hasServerTime();
    /**
     * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
     */
    long getServerTime();

    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    boolean hasAccountName();
    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    java.lang.String getAccountName();
    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    com.google.protobuf.ByteString
        getAccountNameBytes();

    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    boolean hasTokenGid();
    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    java.lang.String getTokenGid();
    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    com.google.protobuf.ByteString
        getTokenGidBytes();

    /**
     * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
     */
    boolean hasIdentitySecret();
    /**
     * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
     */
    com.google.protobuf.ByteString getIdentitySecret();

    /**
     * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
     */
    boolean hasSecret1();
    /**
     * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
     */
    com.google.protobuf.ByteString getSecret1();

    /**
     * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code CTwoFactor_AddAuthenticator_Response}
   */
  public  static final class CTwoFactor_AddAuthenticator_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_AddAuthenticator_Response)
      CTwoFactor_AddAuthenticator_ResponseOrBuilder {
    // Use CTwoFactor_AddAuthenticator_Response.newBuilder() to construct.
    private CTwoFactor_AddAuthenticator_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_AddAuthenticator_Response() {
      sharedSecret_ = com.google.protobuf.ByteString.EMPTY;
      serialNumber_ = 0L;
      revocationCode_ = "";
      uri_ = "";
      serverTime_ = 0L;
      accountName_ = "";
      tokenGid_ = "";
      identitySecret_ = com.google.protobuf.ByteString.EMPTY;
      secret1_ = com.google.protobuf.ByteString.EMPTY;
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_AddAuthenticator_Response(
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
            case 10: {
              bitField0_ |= 0x00000001;
              sharedSecret_ = input.readBytes();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              serialNumber_ = input.readFixed64();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              revocationCode_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              uri_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              serverTime_ = input.readUInt64();
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              accountName_ = bs;
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              tokenGid_ = bs;
              break;
            }
            case 66: {
              bitField0_ |= 0x00000080;
              identitySecret_ = input.readBytes();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              secret1_ = input.readBytes();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              status_ = input.readInt32();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.Builder.class);
    }

    private int bitField0_;
    public static final int SHARED_SECRET_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString sharedSecret_;
    /**
     * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
     */
    public boolean hasSharedSecret() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
     */
    public com.google.protobuf.ByteString getSharedSecret() {
      return sharedSecret_;
    }

    public static final int SERIAL_NUMBER_FIELD_NUMBER = 2;
    private long serialNumber_;
    /**
     * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
     */
    public boolean hasSerialNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
     */
    public long getSerialNumber() {
      return serialNumber_;
    }

    public static final int REVOCATION_CODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object revocationCode_;
    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    public boolean hasRevocationCode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    public java.lang.String getRevocationCode() {
      java.lang.Object ref = revocationCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          revocationCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
     */
    public com.google.protobuf.ByteString
        getRevocationCodeBytes() {
      java.lang.Object ref = revocationCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revocationCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URI_FIELD_NUMBER = 4;
    private volatile java.lang.Object uri_;
    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    public boolean hasUri() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uri_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 5;
    private long serverTime_;
    /**
     * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
     */
    public boolean hasServerTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
     */
    public long getServerTime() {
      return serverTime_;
    }

    public static final int ACCOUNT_NAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object accountName_;
    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    public boolean hasAccountName() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    public java.lang.String getAccountName() {
      java.lang.Object ref = accountName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          accountName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
     */
    public com.google.protobuf.ByteString
        getAccountNameBytes() {
      java.lang.Object ref = accountName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOKEN_GID_FIELD_NUMBER = 7;
    private volatile java.lang.Object tokenGid_;
    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    public boolean hasTokenGid() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    public java.lang.String getTokenGid() {
      java.lang.Object ref = tokenGid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tokenGid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
     */
    public com.google.protobuf.ByteString
        getTokenGidBytes() {
      java.lang.Object ref = tokenGid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenGid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IDENTITY_SECRET_FIELD_NUMBER = 8;
    private com.google.protobuf.ByteString identitySecret_;
    /**
     * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
     */
    public boolean hasIdentitySecret() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
     */
    public com.google.protobuf.ByteString getIdentitySecret() {
      return identitySecret_;
    }

    public static final int SECRET_1_FIELD_NUMBER = 9;
    private com.google.protobuf.ByteString secret1_;
    /**
     * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
     */
    public boolean hasSecret1() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
     */
    public com.google.protobuf.ByteString getSecret1() {
      return secret1_;
    }

    public static final int STATUS_FIELD_NUMBER = 10;
    private int status_;
    /**
     * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
     */
    public int getStatus() {
      return status_;
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
        output.writeBytes(1, sharedSecret_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFixed64(2, serialNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revocationCode_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uri_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, serverTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, accountName_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, tokenGid_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, identitySecret_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, secret1_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, status_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, sharedSecret_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(2, serialNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revocationCode_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uri_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, serverTime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, accountName_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, tokenGid_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, identitySecret_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, secret1_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, status_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response) obj;

      boolean result = true;
      result = result && (hasSharedSecret() == other.hasSharedSecret());
      if (hasSharedSecret()) {
        result = result && getSharedSecret()
            .equals(other.getSharedSecret());
      }
      result = result && (hasSerialNumber() == other.hasSerialNumber());
      if (hasSerialNumber()) {
        result = result && (getSerialNumber()
            == other.getSerialNumber());
      }
      result = result && (hasRevocationCode() == other.hasRevocationCode());
      if (hasRevocationCode()) {
        result = result && getRevocationCode()
            .equals(other.getRevocationCode());
      }
      result = result && (hasUri() == other.hasUri());
      if (hasUri()) {
        result = result && getUri()
            .equals(other.getUri());
      }
      result = result && (hasServerTime() == other.hasServerTime());
      if (hasServerTime()) {
        result = result && (getServerTime()
            == other.getServerTime());
      }
      result = result && (hasAccountName() == other.hasAccountName());
      if (hasAccountName()) {
        result = result && getAccountName()
            .equals(other.getAccountName());
      }
      result = result && (hasTokenGid() == other.hasTokenGid());
      if (hasTokenGid()) {
        result = result && getTokenGid()
            .equals(other.getTokenGid());
      }
      result = result && (hasIdentitySecret() == other.hasIdentitySecret());
      if (hasIdentitySecret()) {
        result = result && getIdentitySecret()
            .equals(other.getIdentitySecret());
      }
      result = result && (hasSecret1() == other.hasSecret1());
      if (hasSecret1()) {
        result = result && getSecret1()
            .equals(other.getSecret1());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && (getStatus()
            == other.getStatus());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSharedSecret()) {
        hash = (37 * hash) + SHARED_SECRET_FIELD_NUMBER;
        hash = (53 * hash) + getSharedSecret().hashCode();
      }
      if (hasSerialNumber()) {
        hash = (37 * hash) + SERIAL_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSerialNumber());
      }
      if (hasRevocationCode()) {
        hash = (37 * hash) + REVOCATION_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getRevocationCode().hashCode();
      }
      if (hasUri()) {
        hash = (37 * hash) + URI_FIELD_NUMBER;
        hash = (53 * hash) + getUri().hashCode();
      }
      if (hasServerTime()) {
        hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getServerTime());
      }
      if (hasAccountName()) {
        hash = (37 * hash) + ACCOUNT_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getAccountName().hashCode();
      }
      if (hasTokenGid()) {
        hash = (37 * hash) + TOKEN_GID_FIELD_NUMBER;
        hash = (53 * hash) + getTokenGid().hashCode();
      }
      if (hasIdentitySecret()) {
        hash = (37 * hash) + IDENTITY_SECRET_FIELD_NUMBER;
        hash = (53 * hash) + getIdentitySecret().hashCode();
      }
      if (hasSecret1()) {
        hash = (37 * hash) + SECRET_1_FIELD_NUMBER;
        hash = (53 * hash) + getSecret1().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_AddAuthenticator_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_AddAuthenticator_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.newBuilder()
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
        sharedSecret_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        serialNumber_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        revocationCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        uri_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        serverTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        accountName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        tokenGid_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        identitySecret_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000080);
        secret1_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_AddAuthenticator_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sharedSecret_ = sharedSecret_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serialNumber_ = serialNumber_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.revocationCode_ = revocationCode_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.uri_ = uri_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.serverTime_ = serverTime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.accountName_ = accountName_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.tokenGid_ = tokenGid_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.identitySecret_ = identitySecret_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.secret1_ = secret1_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.status_ = status_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response.getDefaultInstance()) return this;
        if (other.hasSharedSecret()) {
          setSharedSecret(other.getSharedSecret());
        }
        if (other.hasSerialNumber()) {
          setSerialNumber(other.getSerialNumber());
        }
        if (other.hasRevocationCode()) {
          bitField0_ |= 0x00000004;
          revocationCode_ = other.revocationCode_;
          onChanged();
        }
        if (other.hasUri()) {
          bitField0_ |= 0x00000008;
          uri_ = other.uri_;
          onChanged();
        }
        if (other.hasServerTime()) {
          setServerTime(other.getServerTime());
        }
        if (other.hasAccountName()) {
          bitField0_ |= 0x00000020;
          accountName_ = other.accountName_;
          onChanged();
        }
        if (other.hasTokenGid()) {
          bitField0_ |= 0x00000040;
          tokenGid_ = other.tokenGid_;
          onChanged();
        }
        if (other.hasIdentitySecret()) {
          setIdentitySecret(other.getIdentitySecret());
        }
        if (other.hasSecret1()) {
          setSecret1(other.getSecret1());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString sharedSecret_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
       */
      public boolean hasSharedSecret() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
       */
      public com.google.protobuf.ByteString getSharedSecret() {
        return sharedSecret_;
      }
      /**
       * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
       */
      public Builder setSharedSecret(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sharedSecret_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes shared_secret = 1 [(.description) = "Shared secret between server and authenticator"];</code>
       */
      public Builder clearSharedSecret() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sharedSecret_ = getDefaultInstance().getSharedSecret();
        onChanged();
        return this;
      }

      private long serialNumber_ ;
      /**
       * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
       */
      public boolean hasSerialNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
       */
      public long getSerialNumber() {
        return serialNumber_;
      }
      /**
       * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
       */
      public Builder setSerialNumber(long value) {
        bitField0_ |= 0x00000002;
        serialNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 serial_number = 2 [(.description) = "Authenticator serial number (unique per token)"];</code>
       */
      public Builder clearSerialNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serialNumber_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object revocationCode_ = "";
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public boolean hasRevocationCode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public java.lang.String getRevocationCode() {
        java.lang.Object ref = revocationCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            revocationCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public com.google.protobuf.ByteString
          getRevocationCodeBytes() {
        java.lang.Object ref = revocationCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          revocationCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public Builder setRevocationCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        revocationCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public Builder clearRevocationCode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        revocationCode_ = getDefaultInstance().getRevocationCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string revocation_code = 3 [(.description) = "code used to revoke authenticator"];</code>
       */
      public Builder setRevocationCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        revocationCode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object uri_ = "";
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public boolean hasUri() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public java.lang.String getUri() {
        java.lang.Object ref = uri_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uri_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public com.google.protobuf.ByteString
          getUriBytes() {
        java.lang.Object ref = uri_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uri_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public Builder setUri(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uri_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public Builder clearUri() {
        bitField0_ = (bitField0_ & ~0x00000008);
        uri_ = getDefaultInstance().getUri();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uri = 4 [(.description) = "URI for QR code generation"];</code>
       */
      public Builder setUriBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uri_ = value;
        onChanged();
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
       */
      public boolean hasServerTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
       */
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
       */
      public Builder setServerTime(long value) {
        bitField0_ |= 0x00000010;
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 server_time = 5 [(.description) = "Current server time"];</code>
       */
      public Builder clearServerTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        serverTime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object accountName_ = "";
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public boolean hasAccountName() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public java.lang.String getAccountName() {
        java.lang.Object ref = accountName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            accountName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public com.google.protobuf.ByteString
          getAccountNameBytes() {
        java.lang.Object ref = accountName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accountName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public Builder setAccountName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        accountName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public Builder clearAccountName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        accountName_ = getDefaultInstance().getAccountName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string account_name = 6 [(.description) = "Account name to display on token client"];</code>
       */
      public Builder setAccountNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        accountName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object tokenGid_ = "";
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public boolean hasTokenGid() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public java.lang.String getTokenGid() {
        java.lang.Object ref = tokenGid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tokenGid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public com.google.protobuf.ByteString
          getTokenGidBytes() {
        java.lang.Object ref = tokenGid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tokenGid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public Builder setTokenGid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        tokenGid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public Builder clearTokenGid() {
        bitField0_ = (bitField0_ & ~0x00000040);
        tokenGid_ = getDefaultInstance().getTokenGid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string token_gid = 7 [(.description) = "Token GID assigned by server"];</code>
       */
      public Builder setTokenGidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        tokenGid_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString identitySecret_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
       */
      public boolean hasIdentitySecret() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
       */
      public com.google.protobuf.ByteString getIdentitySecret() {
        return identitySecret_;
      }
      /**
       * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
       */
      public Builder setIdentitySecret(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        identitySecret_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes identity_secret = 8 [(.description) = "Secret used for identity attestation (e.g., for eventing)"];</code>
       */
      public Builder clearIdentitySecret() {
        bitField0_ = (bitField0_ & ~0x00000080);
        identitySecret_ = getDefaultInstance().getIdentitySecret();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString secret1_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
       */
      public boolean hasSecret1() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
       */
      public com.google.protobuf.ByteString getSecret1() {
        return secret1_;
      }
      /**
       * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
       */
      public Builder setSecret1(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        secret1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes secret_1 = 9 [(.description) = "Spare shared secret"];</code>
       */
      public Builder clearSecret1() {
        bitField0_ = (bitField0_ & ~0x00000100);
        secret1_ = getDefaultInstance().getSecret1();
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000200;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 10 [(.description) = "Result code"];</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000200);
        status_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_AddAuthenticator_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_AddAuthenticator_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_AddAuthenticator_Response>() {
      public CTwoFactor_AddAuthenticator_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_AddAuthenticator_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_AddAuthenticator_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_AddAuthenticator_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_SendEmail_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_SendEmail_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
     */
    long getSteamid();

    /**
     * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
     */
    boolean hasEmailType();
    /**
     * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
     */
    int getEmailType();

    /**
     * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
     */
    boolean hasIncludeActivationCode();
    /**
     * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
     */
    boolean getIncludeActivationCode();
  }
  /**
   * Protobuf type {@code CTwoFactor_SendEmail_Request}
   */
  public  static final class CTwoFactor_SendEmail_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_SendEmail_Request)
      CTwoFactor_SendEmail_RequestOrBuilder {
    // Use CTwoFactor_SendEmail_Request.newBuilder() to construct.
    private CTwoFactor_SendEmail_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_SendEmail_Request() {
      steamid_ = 0L;
      emailType_ = 0;
      includeActivationCode_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_SendEmail_Request(
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
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              emailType_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              includeActivationCode_ = input.readBool();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
     */
    public long getSteamid() {
      return steamid_;
    }

    public static final int EMAIL_TYPE_FIELD_NUMBER = 2;
    private int emailType_;
    /**
     * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
     */
    public boolean hasEmailType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
     */
    public int getEmailType() {
      return emailType_;
    }

    public static final int INCLUDE_ACTIVATION_CODE_FIELD_NUMBER = 3;
    private boolean includeActivationCode_;
    /**
     * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
     */
    public boolean hasIncludeActivationCode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
     */
    public boolean getIncludeActivationCode() {
      return includeActivationCode_;
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
        output.writeFixed64(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, emailType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, includeActivationCode_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, emailType_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, includeActivationCode_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
      }
      result = result && (hasEmailType() == other.hasEmailType());
      if (hasEmailType()) {
        result = result && (getEmailType()
            == other.getEmailType());
      }
      result = result && (hasIncludeActivationCode() == other.hasIncludeActivationCode());
      if (hasIncludeActivationCode()) {
        result = result && (getIncludeActivationCode()
            == other.getIncludeActivationCode());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      if (hasEmailType()) {
        hash = (37 * hash) + EMAIL_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getEmailType();
      }
      if (hasIncludeActivationCode()) {
        hash = (37 * hash) + INCLUDE_ACTIVATION_CODE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIncludeActivationCode());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_SendEmail_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_SendEmail_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        emailType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        includeActivationCode_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.emailType_ = emailType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.includeActivationCode_ = includeActivationCode_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
        }
        if (other.hasEmailType()) {
          setEmailType(other.getEmailType());
        }
        if (other.hasIncludeActivationCode()) {
          setIncludeActivationCode(other.getIncludeActivationCode());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "Steamid to use"];</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
        onChanged();
        return this;
      }

      private int emailType_ ;
      /**
       * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
       */
      public boolean hasEmailType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
       */
      public int getEmailType() {
        return emailType_;
      }
      /**
       * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
       */
      public Builder setEmailType(int value) {
        bitField0_ |= 0x00000002;
        emailType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 email_type = 2 [(.description) = "Type of email to send (ETwoFactorEmailType::*)"];</code>
       */
      public Builder clearEmailType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        emailType_ = 0;
        onChanged();
        return this;
      }

      private boolean includeActivationCode_ ;
      /**
       * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
       */
      public boolean hasIncludeActivationCode() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
       */
      public boolean getIncludeActivationCode() {
        return includeActivationCode_;
      }
      /**
       * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
       */
      public Builder setIncludeActivationCode(boolean value) {
        bitField0_ |= 0x00000004;
        includeActivationCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool include_activation_code = 3 [(.description) = "Include activation code in email parameters"];</code>
       */
      public Builder clearIncludeActivationCode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        includeActivationCode_ = false;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_SendEmail_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_SendEmail_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_SendEmail_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_SendEmail_Request>() {
      public CTwoFactor_SendEmail_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_SendEmail_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_SendEmail_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_SendEmail_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_SendEmail_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_SendEmail_Response)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CTwoFactor_SendEmail_Response}
   */
  public  static final class CTwoFactor_SendEmail_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_SendEmail_Response)
      CTwoFactor_SendEmail_ResponseOrBuilder {
    // Use CTwoFactor_SendEmail_Response.newBuilder() to construct.
    private CTwoFactor_SendEmail_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_SendEmail_Response() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_SendEmail_Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_SendEmail_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_SendEmail_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_SendEmail_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response(this);
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response.getDefaultInstance()) return this;
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
        SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_SendEmail_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_SendEmail_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_SendEmail_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_SendEmail_Response>() {
      public CTwoFactor_SendEmail_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_SendEmail_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_SendEmail_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_SendEmail_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_SendEmail_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_FinalizeAddAuthenticator_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_FinalizeAddAuthenticator_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    long getSteamid();

    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    boolean hasAuthenticatorCode();
    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    java.lang.String getAuthenticatorCode();
    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    com.google.protobuf.ByteString
        getAuthenticatorCodeBytes();

    /**
     * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
     */
    boolean hasAuthenticatorTime();
    /**
     * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
     */
    long getAuthenticatorTime();

    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    boolean hasActivationCode();
    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    java.lang.String getActivationCode();
    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    com.google.protobuf.ByteString
        getActivationCodeBytes();

    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    java.util.List<java.lang.String>
        getHttpHeadersList();
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    int getHttpHeadersCount();
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    java.lang.String getHttpHeaders(int index);
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    com.google.protobuf.ByteString
        getHttpHeadersBytes(int index);
  }
  /**
   * Protobuf type {@code CTwoFactor_FinalizeAddAuthenticator_Request}
   */
  public  static final class CTwoFactor_FinalizeAddAuthenticator_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_FinalizeAddAuthenticator_Request)
      CTwoFactor_FinalizeAddAuthenticator_RequestOrBuilder {
    // Use CTwoFactor_FinalizeAddAuthenticator_Request.newBuilder() to construct.
    private CTwoFactor_FinalizeAddAuthenticator_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_FinalizeAddAuthenticator_Request() {
      steamid_ = 0L;
      authenticatorCode_ = "";
      authenticatorTime_ = 0L;
      activationCode_ = "";
      httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_FinalizeAddAuthenticator_Request(
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
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              authenticatorCode_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              authenticatorTime_ = input.readUInt64();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              activationCode_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                httpHeaders_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000010;
              }
              httpHeaders_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          httpHeaders_ = httpHeaders_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public long getSteamid() {
      return steamid_;
    }

    public static final int AUTHENTICATOR_CODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object authenticatorCode_;
    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    public boolean hasAuthenticatorCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    public java.lang.String getAuthenticatorCode() {
      java.lang.Object ref = authenticatorCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authenticatorCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
     */
    public com.google.protobuf.ByteString
        getAuthenticatorCodeBytes() {
      java.lang.Object ref = authenticatorCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authenticatorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHENTICATOR_TIME_FIELD_NUMBER = 3;
    private long authenticatorTime_;
    /**
     * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
     */
    public boolean hasAuthenticatorTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
     */
    public long getAuthenticatorTime() {
      return authenticatorTime_;
    }

    public static final int ACTIVATION_CODE_FIELD_NUMBER = 4;
    private volatile java.lang.Object activationCode_;
    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    public boolean hasActivationCode() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    public java.lang.String getActivationCode() {
      java.lang.Object ref = activationCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          activationCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
     */
    public com.google.protobuf.ByteString
        getActivationCodeBytes() {
      java.lang.Object ref = activationCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        activationCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HTTP_HEADERS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList httpHeaders_;
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHttpHeadersList() {
      return httpHeaders_;
    }
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public int getHttpHeadersCount() {
      return httpHeaders_.size();
    }
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public java.lang.String getHttpHeaders(int index) {
      return httpHeaders_.get(index);
    }
    /**
     * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
     */
    public com.google.protobuf.ByteString
        getHttpHeadersBytes(int index) {
      return httpHeaders_.getByteString(index);
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
        output.writeFixed64(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authenticatorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, authenticatorTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, activationCode_);
      }
      for (int i = 0; i < httpHeaders_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, httpHeaders_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authenticatorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, authenticatorTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, activationCode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < httpHeaders_.size(); i++) {
          dataSize += computeStringSizeNoTag(httpHeaders_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getHttpHeadersList().size();
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
      }
      result = result && (hasAuthenticatorCode() == other.hasAuthenticatorCode());
      if (hasAuthenticatorCode()) {
        result = result && getAuthenticatorCode()
            .equals(other.getAuthenticatorCode());
      }
      result = result && (hasAuthenticatorTime() == other.hasAuthenticatorTime());
      if (hasAuthenticatorTime()) {
        result = result && (getAuthenticatorTime()
            == other.getAuthenticatorTime());
      }
      result = result && (hasActivationCode() == other.hasActivationCode());
      if (hasActivationCode()) {
        result = result && getActivationCode()
            .equals(other.getActivationCode());
      }
      result = result && getHttpHeadersList()
          .equals(other.getHttpHeadersList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      if (hasAuthenticatorCode()) {
        hash = (37 * hash) + AUTHENTICATOR_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getAuthenticatorCode().hashCode();
      }
      if (hasAuthenticatorTime()) {
        hash = (37 * hash) + AUTHENTICATOR_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAuthenticatorTime());
      }
      if (hasActivationCode()) {
        hash = (37 * hash) + ACTIVATION_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getActivationCode().hashCode();
      }
      if (getHttpHeadersCount() > 0) {
        hash = (37 * hash) + HTTP_HEADERS_FIELD_NUMBER;
        hash = (53 * hash) + getHttpHeadersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_FinalizeAddAuthenticator_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_FinalizeAddAuthenticator_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        authenticatorCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        authenticatorTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        activationCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.authenticatorCode_ = authenticatorCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.authenticatorTime_ = authenticatorTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.activationCode_ = activationCode_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          httpHeaders_ = httpHeaders_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.httpHeaders_ = httpHeaders_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
        }
        if (other.hasAuthenticatorCode()) {
          bitField0_ |= 0x00000002;
          authenticatorCode_ = other.authenticatorCode_;
          onChanged();
        }
        if (other.hasAuthenticatorTime()) {
          setAuthenticatorTime(other.getAuthenticatorTime());
        }
        if (other.hasActivationCode()) {
          bitField0_ |= 0x00000008;
          activationCode_ = other.activationCode_;
          onChanged();
        }
        if (!other.httpHeaders_.isEmpty()) {
          if (httpHeaders_.isEmpty()) {
            httpHeaders_ = other.httpHeaders_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureHttpHeadersIsMutable();
            httpHeaders_.addAll(other.httpHeaders_);
          }
          onChanged();
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
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object authenticatorCode_ = "";
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public boolean hasAuthenticatorCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public java.lang.String getAuthenticatorCode() {
        java.lang.Object ref = authenticatorCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            authenticatorCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public com.google.protobuf.ByteString
          getAuthenticatorCodeBytes() {
        java.lang.Object ref = authenticatorCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authenticatorCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public Builder setAuthenticatorCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authenticatorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public Builder clearAuthenticatorCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        authenticatorCode_ = getDefaultInstance().getAuthenticatorCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string authenticator_code = 2 [(.description) = "Current auth code"];</code>
       */
      public Builder setAuthenticatorCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        authenticatorCode_ = value;
        onChanged();
        return this;
      }

      private long authenticatorTime_ ;
      /**
       * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
       */
      public boolean hasAuthenticatorTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
       */
      public long getAuthenticatorTime() {
        return authenticatorTime_;
      }
      /**
       * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
       */
      public Builder setAuthenticatorTime(long value) {
        bitField0_ |= 0x00000004;
        authenticatorTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 authenticator_time = 3 [(.description) = "Current authenticator time"];</code>
       */
      public Builder clearAuthenticatorTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        authenticatorTime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object activationCode_ = "";
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public boolean hasActivationCode() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public java.lang.String getActivationCode() {
        java.lang.Object ref = activationCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            activationCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public com.google.protobuf.ByteString
          getActivationCodeBytes() {
        java.lang.Object ref = activationCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          activationCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public Builder setActivationCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        activationCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public Builder clearActivationCode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        activationCode_ = getDefaultInstance().getActivationCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string activation_code = 4 [(.description) = "Activation code from out-of-band message"];</code>
       */
      public Builder setActivationCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        activationCode_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureHttpHeadersIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          httpHeaders_ = new com.google.protobuf.LazyStringArrayList(httpHeaders_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public com.google.protobuf.ProtocolStringList
          getHttpHeadersList() {
        return httpHeaders_.getUnmodifiableView();
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public int getHttpHeadersCount() {
        return httpHeaders_.size();
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public java.lang.String getHttpHeaders(int index) {
        return httpHeaders_.get(index);
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public com.google.protobuf.ByteString
          getHttpHeadersBytes(int index) {
        return httpHeaders_.getByteString(index);
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder setHttpHeaders(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addHttpHeaders(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addAllHttpHeaders(
          java.lang.Iterable<java.lang.String> values) {
        ensureHttpHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, httpHeaders_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder clearHttpHeaders() {
        httpHeaders_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string http_headers = 5 [(.description) = "HTTP headers alternating by K/V"];</code>
       */
      public Builder addHttpHeadersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHttpHeadersIsMutable();
        httpHeaders_.add(value);
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_FinalizeAddAuthenticator_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_FinalizeAddAuthenticator_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_FinalizeAddAuthenticator_Request>() {
      public CTwoFactor_FinalizeAddAuthenticator_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_FinalizeAddAuthenticator_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_FinalizeAddAuthenticator_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_FinalizeAddAuthenticator_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
     */
    boolean hasSuccess();
    /**
     * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
     */
    boolean getSuccess();

    /**
     * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
     */
    boolean hasWantMore();
    /**
     * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
     */
    boolean getWantMore();

    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    boolean hasServerTime();
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    long getServerTime();

    /**
     * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code CTwoFactor_FinalizeAddAuthenticator_Response}
   */
  public  static final class CTwoFactor_FinalizeAddAuthenticator_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_FinalizeAddAuthenticator_Response)
      CTwoFactor_FinalizeAddAuthenticator_ResponseOrBuilder {
    // Use CTwoFactor_FinalizeAddAuthenticator_Response.newBuilder() to construct.
    private CTwoFactor_FinalizeAddAuthenticator_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_FinalizeAddAuthenticator_Response() {
      success_ = false;
      wantMore_ = false;
      serverTime_ = 0L;
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_FinalizeAddAuthenticator_Response(
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
              success_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              wantMore_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              serverTime_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              status_ = input.readInt32();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.Builder.class);
    }

    private int bitField0_;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int WANT_MORE_FIELD_NUMBER = 2;
    private boolean wantMore_;
    /**
     * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
     */
    public boolean hasWantMore() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
     */
    public boolean getWantMore() {
      return wantMore_;
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 3;
    private long serverTime_;
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    public boolean hasServerTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    public long getServerTime() {
      return serverTime_;
    }

    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    /**
     * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
     */
    public int getStatus() {
      return status_;
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
        output.writeBool(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, wantMore_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, serverTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, status_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, wantMore_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, serverTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, status_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response) obj;

      boolean result = true;
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess()
            == other.getSuccess());
      }
      result = result && (hasWantMore() == other.hasWantMore());
      if (hasWantMore()) {
        result = result && (getWantMore()
            == other.getWantMore());
      }
      result = result && (hasServerTime() == other.hasServerTime());
      if (hasServerTime()) {
        result = result && (getServerTime()
            == other.getServerTime());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && (getStatus()
            == other.getStatus());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSuccess());
      }
      if (hasWantMore()) {
        hash = (37 * hash) + WANT_MORE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getWantMore());
      }
      if (hasServerTime()) {
        hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getServerTime());
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_FinalizeAddAuthenticator_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_FinalizeAddAuthenticator_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.newBuilder()
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
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        wantMore_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        serverTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.wantMore_ = wantMore_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.serverTime_ = serverTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.status_ = status_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasWantMore()) {
          setWantMore(other.getWantMore());
        }
        if (other.hasServerTime()) {
          setServerTime(other.getServerTime());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean success_ ;
      /**
       * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if succeeded, or want more tries"];</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }

      private boolean wantMore_ ;
      /**
       * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
       */
      public boolean hasWantMore() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
       */
      public boolean getWantMore() {
        return wantMore_;
      }
      /**
       * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
       */
      public Builder setWantMore(boolean value) {
        bitField0_ |= 0x00000002;
        wantMore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool want_more = 2 [(.description) = "True if want more tries"];</code>
       */
      public Builder clearWantMore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        wantMore_ = false;
        onChanged();
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public boolean hasServerTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public Builder setServerTime(long value) {
        bitField0_ |= 0x00000004;
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public Builder clearServerTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serverTime_ = 0L;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 4 [(.description) = "Result code"];</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        status_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_FinalizeAddAuthenticator_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_FinalizeAddAuthenticator_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_FinalizeAddAuthenticator_Response>() {
      public CTwoFactor_FinalizeAddAuthenticator_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_FinalizeAddAuthenticator_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_FinalizeAddAuthenticator_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_FinalizeAddAuthenticator_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_RemoveAuthenticator_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_RemoveAuthenticator_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    boolean hasRevocationCode();
    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    java.lang.String getRevocationCode();
    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    com.google.protobuf.ByteString
        getRevocationCodeBytes();

    /**
     * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
     */
    boolean hasRevocationReason();
    /**
     * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
     */
    int getRevocationReason();

    /**
     * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
     */
    boolean hasSteamguardScheme();
    /**
     * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
     */
    int getSteamguardScheme();

    /**
     * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
     */
    boolean hasRemoveAllSteamguardCookies();
    /**
     * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
     */
    boolean getRemoveAllSteamguardCookies();
  }
  /**
   * Protobuf type {@code CTwoFactor_RemoveAuthenticator_Request}
   */
  public  static final class CTwoFactor_RemoveAuthenticator_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_RemoveAuthenticator_Request)
      CTwoFactor_RemoveAuthenticator_RequestOrBuilder {
    // Use CTwoFactor_RemoveAuthenticator_Request.newBuilder() to construct.
    private CTwoFactor_RemoveAuthenticator_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_RemoveAuthenticator_Request() {
      revocationCode_ = "";
      revocationReason_ = 0;
      steamguardScheme_ = 0;
      removeAllSteamguardCookies_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_RemoveAuthenticator_Request(
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
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              revocationCode_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000002;
              revocationReason_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              steamguardScheme_ = input.readUInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000008;
              removeAllSteamguardCookies_ = input.readBool();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.Builder.class);
    }

    private int bitField0_;
    public static final int REVOCATION_CODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object revocationCode_;
    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    public boolean hasRevocationCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    public java.lang.String getRevocationCode() {
      java.lang.Object ref = revocationCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          revocationCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
     */
    public com.google.protobuf.ByteString
        getRevocationCodeBytes() {
      java.lang.Object ref = revocationCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revocationCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REVOCATION_REASON_FIELD_NUMBER = 5;
    private int revocationReason_;
    /**
     * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
     */
    public boolean hasRevocationReason() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
     */
    public int getRevocationReason() {
      return revocationReason_;
    }

    public static final int STEAMGUARD_SCHEME_FIELD_NUMBER = 6;
    private int steamguardScheme_;
    /**
     * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
     */
    public boolean hasSteamguardScheme() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
     */
    public int getSteamguardScheme() {
      return steamguardScheme_;
    }

    public static final int REMOVE_ALL_STEAMGUARD_COOKIES_FIELD_NUMBER = 7;
    private boolean removeAllSteamguardCookies_;
    /**
     * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
     */
    public boolean hasRemoveAllSteamguardCookies() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
     */
    public boolean getRemoveAllSteamguardCookies() {
      return removeAllSteamguardCookies_;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revocationCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(5, revocationReason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(6, steamguardScheme_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(7, removeAllSteamguardCookies_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revocationCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, revocationReason_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, steamguardScheme_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, removeAllSteamguardCookies_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request) obj;

      boolean result = true;
      result = result && (hasRevocationCode() == other.hasRevocationCode());
      if (hasRevocationCode()) {
        result = result && getRevocationCode()
            .equals(other.getRevocationCode());
      }
      result = result && (hasRevocationReason() == other.hasRevocationReason());
      if (hasRevocationReason()) {
        result = result && (getRevocationReason()
            == other.getRevocationReason());
      }
      result = result && (hasSteamguardScheme() == other.hasSteamguardScheme());
      if (hasSteamguardScheme()) {
        result = result && (getSteamguardScheme()
            == other.getSteamguardScheme());
      }
      result = result && (hasRemoveAllSteamguardCookies() == other.hasRemoveAllSteamguardCookies());
      if (hasRemoveAllSteamguardCookies()) {
        result = result && (getRemoveAllSteamguardCookies()
            == other.getRemoveAllSteamguardCookies());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRevocationCode()) {
        hash = (37 * hash) + REVOCATION_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getRevocationCode().hashCode();
      }
      if (hasRevocationReason()) {
        hash = (37 * hash) + REVOCATION_REASON_FIELD_NUMBER;
        hash = (53 * hash) + getRevocationReason();
      }
      if (hasSteamguardScheme()) {
        hash = (37 * hash) + STEAMGUARD_SCHEME_FIELD_NUMBER;
        hash = (53 * hash) + getSteamguardScheme();
      }
      if (hasRemoveAllSteamguardCookies()) {
        hash = (37 * hash) + REMOVE_ALL_STEAMGUARD_COOKIES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getRemoveAllSteamguardCookies());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_RemoveAuthenticator_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_RemoveAuthenticator_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.newBuilder()
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
        revocationCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        revocationReason_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        steamguardScheme_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        removeAllSteamguardCookies_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.revocationCode_ = revocationCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.revocationReason_ = revocationReason_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.steamguardScheme_ = steamguardScheme_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.removeAllSteamguardCookies_ = removeAllSteamguardCookies_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request.getDefaultInstance()) return this;
        if (other.hasRevocationCode()) {
          bitField0_ |= 0x00000001;
          revocationCode_ = other.revocationCode_;
          onChanged();
        }
        if (other.hasRevocationReason()) {
          setRevocationReason(other.getRevocationReason());
        }
        if (other.hasSteamguardScheme()) {
          setSteamguardScheme(other.getSteamguardScheme());
        }
        if (other.hasRemoveAllSteamguardCookies()) {
          setRemoveAllSteamguardCookies(other.getRemoveAllSteamguardCookies());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object revocationCode_ = "";
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public boolean hasRevocationCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public java.lang.String getRevocationCode() {
        java.lang.Object ref = revocationCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            revocationCode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public com.google.protobuf.ByteString
          getRevocationCodeBytes() {
        java.lang.Object ref = revocationCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          revocationCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public Builder setRevocationCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        revocationCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public Builder clearRevocationCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        revocationCode_ = getDefaultInstance().getRevocationCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string revocation_code = 2 [(.description) = "Password needed to remove token"];</code>
       */
      public Builder setRevocationCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        revocationCode_ = value;
        onChanged();
        return this;
      }

      private int revocationReason_ ;
      /**
       * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
       */
      public boolean hasRevocationReason() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
       */
      public int getRevocationReason() {
        return revocationReason_;
      }
      /**
       * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
       */
      public Builder setRevocationReason(int value) {
        bitField0_ |= 0x00000002;
        revocationReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 revocation_reason = 5 [(.description) = "Reason the authenticator is being removed"];</code>
       */
      public Builder clearRevocationReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        revocationReason_ = 0;
        onChanged();
        return this;
      }

      private int steamguardScheme_ ;
      /**
       * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
       */
      public boolean hasSteamguardScheme() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
       */
      public int getSteamguardScheme() {
        return steamguardScheme_;
      }
      /**
       * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
       */
      public Builder setSteamguardScheme(int value) {
        bitField0_ |= 0x00000004;
        steamguardScheme_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 steamguard_scheme = 6 [(.description) = "Type of Steam Guard to use once token is removed"];</code>
       */
      public Builder clearSteamguardScheme() {
        bitField0_ = (bitField0_ & ~0x00000004);
        steamguardScheme_ = 0;
        onChanged();
        return this;
      }

      private boolean removeAllSteamguardCookies_ ;
      /**
       * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
       */
      public boolean hasRemoveAllSteamguardCookies() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
       */
      public boolean getRemoveAllSteamguardCookies() {
        return removeAllSteamguardCookies_;
      }
      /**
       * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
       */
      public Builder setRemoveAllSteamguardCookies(boolean value) {
        bitField0_ |= 0x00000008;
        removeAllSteamguardCookies_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool remove_all_steamguard_cookies = 7 [(.description) = "Remove all steamguard cookies"];</code>
       */
      public Builder clearRemoveAllSteamguardCookies() {
        bitField0_ = (bitField0_ & ~0x00000008);
        removeAllSteamguardCookies_ = false;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_RemoveAuthenticator_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_RemoveAuthenticator_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_RemoveAuthenticator_Request>() {
      public CTwoFactor_RemoveAuthenticator_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_RemoveAuthenticator_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_RemoveAuthenticator_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_RemoveAuthenticator_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
     */
    boolean hasSuccess();
    /**
     * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
     */
    boolean getSuccess();

    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    boolean hasServerTime();
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    long getServerTime();

    /**
     * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    boolean hasRevocationAttemptsRemaining();
    /**
     * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    int getRevocationAttemptsRemaining();
  }
  /**
   * Protobuf type {@code CTwoFactor_RemoveAuthenticator_Response}
   */
  public  static final class CTwoFactor_RemoveAuthenticator_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_RemoveAuthenticator_Response)
      CTwoFactor_RemoveAuthenticator_ResponseOrBuilder {
    // Use CTwoFactor_RemoveAuthenticator_Response.newBuilder() to construct.
    private CTwoFactor_RemoveAuthenticator_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_RemoveAuthenticator_Response() {
      success_ = false;
      serverTime_ = 0L;
      revocationAttemptsRemaining_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_RemoveAuthenticator_Response(
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
              success_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              serverTime_ = input.readUInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000004;
              revocationAttemptsRemaining_ = input.readUInt32();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.Builder.class);
    }

    private int bitField0_;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int SERVER_TIME_FIELD_NUMBER = 3;
    private long serverTime_;
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    public boolean hasServerTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
     */
    public long getServerTime() {
      return serverTime_;
    }

    public static final int REVOCATION_ATTEMPTS_REMAINING_FIELD_NUMBER = 5;
    private int revocationAttemptsRemaining_;
    /**
     * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    public boolean hasRevocationAttemptsRemaining() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
     */
    public int getRevocationAttemptsRemaining() {
      return revocationAttemptsRemaining_;
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
        output.writeBool(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(3, serverTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(5, revocationAttemptsRemaining_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, serverTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, revocationAttemptsRemaining_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response) obj;

      boolean result = true;
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess()
            == other.getSuccess());
      }
      result = result && (hasServerTime() == other.hasServerTime());
      if (hasServerTime()) {
        result = result && (getServerTime()
            == other.getServerTime());
      }
      result = result && (hasRevocationAttemptsRemaining() == other.hasRevocationAttemptsRemaining());
      if (hasRevocationAttemptsRemaining()) {
        result = result && (getRevocationAttemptsRemaining()
            == other.getRevocationAttemptsRemaining());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSuccess());
      }
      if (hasServerTime()) {
        hash = (37 * hash) + SERVER_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getServerTime());
      }
      if (hasRevocationAttemptsRemaining()) {
        hash = (37 * hash) + REVOCATION_ATTEMPTS_REMAINING_FIELD_NUMBER;
        hash = (53 * hash) + getRevocationAttemptsRemaining();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_RemoveAuthenticator_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_RemoveAuthenticator_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.newBuilder()
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
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        serverTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        revocationAttemptsRemaining_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverTime_ = serverTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.revocationAttemptsRemaining_ = revocationAttemptsRemaining_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasServerTime()) {
          setServerTime(other.getServerTime());
        }
        if (other.hasRevocationAttemptsRemaining()) {
          setRevocationAttemptsRemaining(other.getRevocationAttemptsRemaining());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean success_ ;
      /**
       * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool success = 1 [(.description) = "True if request succeeeded. The mobile app checks this."];</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public boolean hasServerTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public Builder setServerTime(long value) {
        bitField0_ |= 0x00000002;
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 server_time = 3 [(.description) = "Current server time"];</code>
       */
      public Builder clearServerTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverTime_ = 0L;
        onChanged();
        return this;
      }

      private int revocationAttemptsRemaining_ ;
      /**
       * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public boolean hasRevocationAttemptsRemaining() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public int getRevocationAttemptsRemaining() {
        return revocationAttemptsRemaining_;
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public Builder setRevocationAttemptsRemaining(int value) {
        bitField0_ |= 0x00000004;
        revocationAttemptsRemaining_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 revocation_attempts_remaining = 5 [(.description) = "Number of revocation code attempts remaining"];</code>
       */
      public Builder clearRevocationAttemptsRemaining() {
        bitField0_ = (bitField0_ & ~0x00000004);
        revocationAttemptsRemaining_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_RemoveAuthenticator_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_RemoveAuthenticator_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_RemoveAuthenticator_Response>() {
      public CTwoFactor_RemoveAuthenticator_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_RemoveAuthenticator_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_RemoveAuthenticator_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_RemoveAuthenticator_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_CreateEmergencyCodes_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_CreateEmergencyCodes_Request)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CTwoFactor_CreateEmergencyCodes_Request}
   */
  public  static final class CTwoFactor_CreateEmergencyCodes_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_CreateEmergencyCodes_Request)
      CTwoFactor_CreateEmergencyCodes_RequestOrBuilder {
    // Use CTwoFactor_CreateEmergencyCodes_Request.newBuilder() to construct.
    private CTwoFactor_CreateEmergencyCodes_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_CreateEmergencyCodes_Request() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_CreateEmergencyCodes_Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_CreateEmergencyCodes_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_CreateEmergencyCodes_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request(this);
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request.getDefaultInstance()) return this;
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
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_CreateEmergencyCodes_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_CreateEmergencyCodes_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_CreateEmergencyCodes_Request>() {
      public CTwoFactor_CreateEmergencyCodes_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_CreateEmergencyCodes_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_CreateEmergencyCodes_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_CreateEmergencyCodes_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    java.util.List<java.lang.String>
        getCodesList();
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    int getCodesCount();
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    java.lang.String getCodes(int index);
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    com.google.protobuf.ByteString
        getCodesBytes(int index);
  }
  /**
   * Protobuf type {@code CTwoFactor_CreateEmergencyCodes_Response}
   */
  public  static final class CTwoFactor_CreateEmergencyCodes_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_CreateEmergencyCodes_Response)
      CTwoFactor_CreateEmergencyCodes_ResponseOrBuilder {
    // Use CTwoFactor_CreateEmergencyCodes_Response.newBuilder() to construct.
    private CTwoFactor_CreateEmergencyCodes_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_CreateEmergencyCodes_Response() {
      codes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_CreateEmergencyCodes_Response(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                codes_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              codes_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          codes_ = codes_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.Builder.class);
    }

    public static final int CODES_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList codes_;
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    public com.google.protobuf.ProtocolStringList
        getCodesList() {
      return codes_;
    }
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    public int getCodesCount() {
      return codes_.size();
    }
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    public java.lang.String getCodes(int index) {
      return codes_.get(index);
    }
    /**
     * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
     */
    public com.google.protobuf.ByteString
        getCodesBytes(int index) {
      return codes_.getByteString(index);
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
      for (int i = 0; i < codes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codes_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < codes_.size(); i++) {
          dataSize += computeStringSizeNoTag(codes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getCodesList().size();
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response) obj;

      boolean result = true;
      result = result && getCodesList()
          .equals(other.getCodesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getCodesCount() > 0) {
        hash = (37 * hash) + CODES_FIELD_NUMBER;
        hash = (53 * hash) + getCodesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_CreateEmergencyCodes_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_CreateEmergencyCodes_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.newBuilder()
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
        codes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          codes_ = codes_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.codes_ = codes_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response.getDefaultInstance()) return this;
        if (!other.codes_.isEmpty()) {
          if (codes_.isEmpty()) {
            codes_ = other.codes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCodesIsMutable();
            codes_.addAll(other.codes_);
          }
          onChanged();
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
        SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList codes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureCodesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          codes_ = new com.google.protobuf.LazyStringArrayList(codes_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public com.google.protobuf.ProtocolStringList
          getCodesList() {
        return codes_.getUnmodifiableView();
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public int getCodesCount() {
        return codes_.size();
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public java.lang.String getCodes(int index) {
        return codes_.get(index);
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public com.google.protobuf.ByteString
          getCodesBytes(int index) {
        return codes_.getByteString(index);
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public Builder setCodes(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCodesIsMutable();
        codes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public Builder addCodes(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCodesIsMutable();
        codes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public Builder addAllCodes(
          java.lang.Iterable<java.lang.String> values) {
        ensureCodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, codes_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public Builder clearCodes() {
        codes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string codes = 1 [(.description) = "Emergency codes"];</code>
       */
      public Builder addCodesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCodesIsMutable();
        codes_.add(value);
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_CreateEmergencyCodes_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_CreateEmergencyCodes_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_CreateEmergencyCodes_Response>() {
      public CTwoFactor_CreateEmergencyCodes_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_CreateEmergencyCodes_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_CreateEmergencyCodes_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_CreateEmergencyCodes_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_DestroyEmergencyCodes_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_DestroyEmergencyCodes_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    boolean hasSteamid();
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    long getSteamid();
  }
  /**
   * Protobuf type {@code CTwoFactor_DestroyEmergencyCodes_Request}
   */
  public  static final class CTwoFactor_DestroyEmergencyCodes_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_DestroyEmergencyCodes_Request)
      CTwoFactor_DestroyEmergencyCodes_RequestOrBuilder {
    // Use CTwoFactor_DestroyEmergencyCodes_Request.newBuilder() to construct.
    private CTwoFactor_DestroyEmergencyCodes_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_DestroyEmergencyCodes_Request() {
      steamid_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_DestroyEmergencyCodes_Request(
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
            case 9: {
              bitField0_ |= 0x00000001;
              steamid_ = input.readFixed64();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.Builder.class);
    }

    private int bitField0_;
    public static final int STEAMID_FIELD_NUMBER = 1;
    private long steamid_;
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public boolean hasSteamid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
     */
    public long getSteamid() {
      return steamid_;
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
        output.writeFixed64(1, steamid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, steamid_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request) obj;

      boolean result = true;
      result = result && (hasSteamid() == other.hasSteamid());
      if (hasSteamid()) {
        result = result && (getSteamid()
            == other.getSteamid());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSteamid()) {
        hash = (37 * hash) + STEAMID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSteamid());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_DestroyEmergencyCodes_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_DestroyEmergencyCodes_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.newBuilder()
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
        steamid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.steamid_ = steamid_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request.getDefaultInstance()) return this;
        if (other.hasSteamid()) {
          setSteamid(other.getSteamid());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long steamid_ ;
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public boolean hasSteamid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public long getSteamid() {
        return steamid_;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder setSteamid(long value) {
        bitField0_ |= 0x00000001;
        steamid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional fixed64 steamid = 1 [(.description) = "steamid to use"];</code>
       */
      public Builder clearSteamid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        steamid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_DestroyEmergencyCodes_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_DestroyEmergencyCodes_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_DestroyEmergencyCodes_Request>() {
      public CTwoFactor_DestroyEmergencyCodes_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_DestroyEmergencyCodes_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_DestroyEmergencyCodes_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_DestroyEmergencyCodes_Response)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CTwoFactor_DestroyEmergencyCodes_Response}
   */
  public  static final class CTwoFactor_DestroyEmergencyCodes_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_DestroyEmergencyCodes_Response)
      CTwoFactor_DestroyEmergencyCodes_ResponseOrBuilder {
    // Use CTwoFactor_DestroyEmergencyCodes_Response.newBuilder() to construct.
    private CTwoFactor_DestroyEmergencyCodes_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_DestroyEmergencyCodes_Response() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_DestroyEmergencyCodes_Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_DestroyEmergencyCodes_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_DestroyEmergencyCodes_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response(this);
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response.getDefaultInstance()) return this;
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
        SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_DestroyEmergencyCodes_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_DestroyEmergencyCodes_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_DestroyEmergencyCodes_Response>() {
      public CTwoFactor_DestroyEmergencyCodes_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_DestroyEmergencyCodes_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_DestroyEmergencyCodes_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_DestroyEmergencyCodes_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_ValidateToken_RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_ValidateToken_Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    boolean hasCode();
    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    java.lang.String getCode();
    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    com.google.protobuf.ByteString
        getCodeBytes();
  }
  /**
   * Protobuf type {@code CTwoFactor_ValidateToken_Request}
   */
  public  static final class CTwoFactor_ValidateToken_Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_ValidateToken_Request)
      CTwoFactor_ValidateToken_RequestOrBuilder {
    // Use CTwoFactor_ValidateToken_Request.newBuilder() to construct.
    private CTwoFactor_ValidateToken_Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_ValidateToken_Request() {
      code_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_ValidateToken_Request(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              code_ = bs;
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.Builder.class);
    }

    private int bitField0_;
    public static final int CODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object code_;
    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          code_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string code = 1 [(.description) = "code to validate"];</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request other = (SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request) obj;

      boolean result = true;
      result = result && (hasCode() == other.hasCode());
      if (hasCode()) {
        result = result && getCode()
            .equals(other.getCode());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCode()) {
        hash = (37 * hash) + CODE_FIELD_NUMBER;
        hash = (53 * hash) + getCode().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request prototype) {
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
     * Protobuf type {@code CTwoFactor_ValidateToken_Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_ValidateToken_Request)
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.class, SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.newBuilder()
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
        code_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Request_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request result = new SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request.getDefaultInstance()) return this;
        if (other.hasCode()) {
          bitField0_ |= 0x00000001;
          code_ = other.code_;
          onChanged();
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
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object code_ = "";
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public java.lang.String getCode() {
        java.lang.Object ref = code_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            code_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        java.lang.Object ref = code_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          code_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public Builder setCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = getDefaultInstance().getCode();
        onChanged();
        return this;
      }
      /**
       * <code>optional string code = 1 [(.description) = "code to validate"];</code>
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        code_ = value;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_ValidateToken_Request)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_ValidateToken_Request)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_ValidateToken_Request>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_ValidateToken_Request>() {
      public CTwoFactor_ValidateToken_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_ValidateToken_Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_ValidateToken_Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_ValidateToken_Request> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CTwoFactor_ValidateToken_ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CTwoFactor_ValidateToken_Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
     */
    boolean hasValid();
    /**
     * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
     */
    boolean getValid();
  }
  /**
   * Protobuf type {@code CTwoFactor_ValidateToken_Response}
   */
  public  static final class CTwoFactor_ValidateToken_Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CTwoFactor_ValidateToken_Response)
      CTwoFactor_ValidateToken_ResponseOrBuilder {
    // Use CTwoFactor_ValidateToken_Response.newBuilder() to construct.
    private CTwoFactor_ValidateToken_Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CTwoFactor_ValidateToken_Response() {
      valid_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CTwoFactor_ValidateToken_Response(
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
              valid_ = input.readBool();
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
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.Builder.class);
    }

    private int bitField0_;
    public static final int VALID_FIELD_NUMBER = 1;
    private boolean valid_;
    /**
     * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
     */
    public boolean hasValid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
     */
    public boolean getValid() {
      return valid_;
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
        output.writeBool(1, valid_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, valid_);
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
      if (!(obj instanceof SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response)) {
        return super.equals(obj);
      }
      SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response other = (SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response) obj;

      boolean result = true;
      result = result && (hasValid() == other.hasValid());
      if (hasValid()) {
        result = result && (getValid()
            == other.getValid());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasValid()) {
        hash = (37 * hash) + VALID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getValid());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parseFrom(
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
    public static Builder newBuilder(SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response prototype) {
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
     * Protobuf type {@code CTwoFactor_ValidateToken_Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CTwoFactor_ValidateToken_Response)
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Response_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.class, SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.Builder.class);
      }

      // Construct using SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.newBuilder()
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
        valid_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SteammessagesTwofactorSteamclient.internal_static_CTwoFactor_ValidateToken_Response_descriptor;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response getDefaultInstanceForType() {
        return SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.getDefaultInstance();
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response build() {
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response buildPartial() {
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response result = new SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.valid_ = valid_;
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
        if (other instanceof SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response) {
          return mergeFrom((SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response other) {
        if (other == SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response.getDefaultInstance()) return this;
        if (other.hasValid()) {
          setValid(other.getValid());
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
        SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean valid_ ;
      /**
       * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
       */
      public boolean hasValid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
       */
      public boolean getValid() {
        return valid_;
      }
      /**
       * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
       */
      public Builder setValid(boolean value) {
        bitField0_ |= 0x00000001;
        valid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool valid = 1 [(.description) = "result of validation"];</code>
       */
      public Builder clearValid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        valid_ = false;
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


      // @@protoc_insertion_point(builder_scope:CTwoFactor_ValidateToken_Response)
    }

    // @@protoc_insertion_point(class_scope:CTwoFactor_ValidateToken_Response)
    private static final SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response();
    }

    public static SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CTwoFactor_ValidateToken_Response>
        PARSER = new com.google.protobuf.AbstractParser<CTwoFactor_ValidateToken_Response>() {
      public CTwoFactor_ValidateToken_Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CTwoFactor_ValidateToken_Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CTwoFactor_ValidateToken_Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CTwoFactor_ValidateToken_Response> getParserForType() {
      return PARSER;
    }

    public SteammessagesTwofactorSteamclient.CTwoFactor_ValidateToken_Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_Status_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_Status_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_Status_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_Status_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_AddAuthenticator_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_AddAuthenticator_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_AddAuthenticator_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_AddAuthenticator_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_SendEmail_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_SendEmail_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_SendEmail_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_SendEmail_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_RemoveAuthenticator_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_RemoveAuthenticator_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_CreateEmergencyCodes_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_CreateEmergencyCodes_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_DestroyEmergencyCodes_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_DestroyEmergencyCodes_Response_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_ValidateToken_Request_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_ValidateToken_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CTwoFactor_ValidateToken_Response_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CTwoFactor_ValidateToken_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5steamclient/steammessages_twofactor.st" +
      "eamclient.proto\0328steamclient/steammessag" +
      "es_unified_base.steamclient.proto\"@\n\031CTw" +
      "oFactor_Status_Request\022#\n\007steamid\030\001 \001(\006B" +
      "\022\202\265\030\016steamid to use\"\261\007\n\032CTwoFactor_Statu" +
      "s_Response\022&\n\005state\030\001 \001(\rB\027\202\265\030\023Authentic" +
      "ator state\022=\n\023inactivation_reason\030\002 \001(\rB" +
      " \202\265\030\034Inactivation reason (if any)\0225\n\022aut" +
      "henticator_type\030\003 \001(\rB\031\202\265\030\025Type of authe" +
      "nticator\022L\n\025authenticator_allowed\030\004 \001(\010B",
      "-\202\265\030)Account allowed to have an authenti" +
      "cator?\022;\n\021steamguard_scheme\030\005 \001(\rB \202\265\030\034S" +
      "team Guard scheme in effect\022A\n\ttoken_gid" +
      "\030\006 \001(\tB.\202\265\030*String rep of token GID assi" +
      "gned by server\022B\n\017email_validated\030\007 \001(\010B" +
      ")\202\265\030%Account has verified email capabili" +
      "ty\022?\n\021device_identifier\030\010 \001(\tB$\202\265\030 Authe" +
      "nticator (phone) identifier\0224\n\014time_crea" +
      "ted\030\t \001(\rB\036\202\265\030\032When the token was create" +
      "d\022W\n\035revocation_attempts_remaining\030\n \001(\r",
      "B0\202\265\030,Number of revocation code attempts" +
      " remaining\022^\n\020classified_agent\030\013 \001(\tBD\202\265" +
      "\030@Agent that added the authenticator (e." +
      "g., ios / android / other)\022g\n\034allow_exte" +
      "rnal_authenticator\030\014 \001(\010BA\202\265\030=Allow a th" +
      "ird-party authenticator (in addition to " +
      "two-factor)\022J\n\033external_authenticator_ty" +
      "pe\030\r \001(\rB%\202\265\030!Type of third-party authen" +
      "ticator\"\262\003\n#CTwoFactor_AddAuthenticator_" +
      "Request\022#\n\007steamid\030\001 \001(\006B\022\202\265\030\016steamid to",
      " use\022:\n\022authenticator_time\030\002 \001(\004B\036\202\265\030\032Cu" +
      "rrent authenticator time\022?\n\rserial_numbe" +
      "r\030\003 \001(\006B(\202\265\030$locally computed serial (de" +
      "precated)\0222\n\022authenticator_type\030\004 \001(\rB\026\202" +
      "\265\030\022Authenticator type\0227\n\021device_identifi" +
      "er\030\005 \001(\tB\034\202\265\030\030Authenticator identifier\022A" +
      "\n\014sms_phone_id\030\006 \001(\tB+\202\265\030\'ID of phone to" +
      " use for SMS verification\0229\n\014http_header" +
      "s\030\007 \003(\tB#\202\265\030\037HTTP headers alternating by" +
      " K/V\"\363\004\n$CTwoFactor_AddAuthenticator_Res",
      "ponse\022I\n\rshared_secret\030\001 \001(\014B2\202\265\030.Shared" +
      " secret between server and authenticator" +
      "\022I\n\rserial_number\030\002 \001(\006B2\202\265\030.Authenticat" +
      "or serial number (unique per token)\022>\n\017r" +
      "evocation_code\030\003 \001(\tB%\202\265\030!code used to r" +
      "evoke authenticator\022+\n\003uri\030\004 \001(\tB\036\202\265\030\032UR" +
      "I for QR code generation\022,\n\013server_time\030" +
      "\005 \001(\004B\027\202\265\030\023Current server time\022A\n\014accoun" +
      "t_name\030\006 \001(\tB+\202\265\030\'Account name to displa" +
      "y on token client\0223\n\ttoken_gid\030\007 \001(\tB \202\265",
      "\030\034Token GID assigned by server\022V\n\017identi" +
      "ty_secret\030\010 \001(\014B=\202\265\0309Secret used for ide" +
      "ntity attestation (e.g., for eventing)\022)" +
      "\n\010secret_1\030\t \001(\014B\027\202\265\030\023Spare shared secre" +
      "t\022\037\n\006status\030\n \001(\005B\017\202\265\030\013Result code\"\335\001\n\034C" +
      "TwoFactor_SendEmail_Request\022#\n\007steamid\030\001" +
      " \001(\006B\022\202\265\030\016Steamid to use\022F\n\nemail_type\030\002" +
      " \001(\rB2\202\265\030.Type of email to send (ETwoFac" +
      "torEmailType::*)\022P\n\027include_activation_c" +
      "ode\030\003 \001(\010B/\202\265\030+Include activation code i",
      "n email parameters\"\037\n\035CTwoFactor_SendEma" +
      "il_Response\"\303\002\n+CTwoFactor_FinalizeAddAu" +
      "thenticator_Request\022#\n\007steamid\030\001 \001(\006B\022\202\265" +
      "\030\016steamid to use\0221\n\022authenticator_code\030\002" +
      " \001(\tB\025\202\265\030\021Current auth code\022:\n\022authentic" +
      "ator_time\030\003 \001(\004B\036\202\265\030\032Current authenticat" +
      "or time\022E\n\017activation_code\030\004 \001(\tB,\202\265\030(Ac" +
      "tivation code from out-of-band message\0229" +
      "\n\014http_headers\030\005 \003(\tB#\202\265\030\037HTTP headers a" +
      "lternating by K/V\"\351\001\n,CTwoFactor_Finaliz",
      "eAddAuthenticator_Response\022:\n\007success\030\001 " +
      "\001(\010B)\202\265\030%True if succeeded, or want more" +
      " tries\022.\n\twant_more\030\002 \001(\010B\033\202\265\030\027True if w" +
      "ant more tries\022,\n\013server_time\030\003 \001(\004B\027\202\265\030" +
      "\023Current server time\022\037\n\006status\030\004 \001(\005B\017\202\265" +
      "\030\013Result code\"\313\002\n&CTwoFactor_RemoveAuthe" +
      "nticator_Request\022<\n\017revocation_code\030\002 \001(" +
      "\tB#\202\265\030\037Password needed to remove token\022H" +
      "\n\021revocation_reason\030\005 \001(\rB-\202\265\030)Reason th" +
      "e authenticator is being removed\022O\n\021stea",
      "mguard_scheme\030\006 \001(\rB4\202\265\0300Type of Steam G" +
      "uard to use once token is removed\022H\n\035rem" +
      "ove_all_steamguard_cookies\030\007 \001(\010B!\202\265\030\035Re" +
      "move all steamguard cookies\"\376\001\n\'CTwoFact" +
      "or_RemoveAuthenticator_Response\022L\n\007succe" +
      "ss\030\001 \001(\010B;\202\265\0307True if request succeeeded" +
      ". The mobile app checks this.\022,\n\013server_" +
      "time\030\003 \001(\004B\027\202\265\030\023Current server time\022W\n\035r" +
      "evocation_attempts_remaining\030\005 \001(\rB0\202\265\030," +
      "Number of revocation code attempts remai",
      "ning\")\n\'CTwoFactor_CreateEmergencyCodes_" +
      "Request\"N\n(CTwoFactor_CreateEmergencyCod" +
      "es_Response\022\"\n\005codes\030\001 \003(\tB\023\202\265\030\017Emergenc" +
      "y codes\"O\n(CTwoFactor_DestroyEmergencyCo" +
      "des_Request\022#\n\007steamid\030\001 \001(\006B\022\202\265\030\016steami" +
      "d to use\"+\n)CTwoFactor_DestroyEmergencyC" +
      "odes_Response\"F\n CTwoFactor_ValidateToke" +
      "n_Request\022\"\n\004code\030\001 \001(\tB\024\202\265\030\020code to val" +
      "idate\"L\n!CTwoFactor_ValidateToken_Respon" +
      "se\022\'\n\005valid\030\001 \001(\010B\030\202\265\030\024result of validat",
      "ion2\204\n\n\tTwoFactor\022\214\001\n\013QueryStatus\022\032.CTwo" +
      "Factor_Status_Request\032\033.CTwoFactor_Statu" +
      "s_Response\"D\202\265\030@Get two-factor authentic" +
      "ation settings for the logged-in account" +
      "\022\232\001\n\020AddAuthenticator\022$.CTwoFactor_AddAu" +
      "thenticator_Request\032%.CTwoFactor_AddAuth" +
      "enticator_Response\"9\202\265\0305Add two-factor a" +
      "uthenticator to the logged-in account\022i\n" +
      "\tSendEmail\022\035.CTwoFactor_SendEmail_Reques" +
      "t\032\036.CTwoFactor_SendEmail_Response\"\035\202\265\030\031S",
      "end email to the account\022\301\001\n\030FinalizeAdd" +
      "Authenticator\022,.CTwoFactor_FinalizeAddAu" +
      "thenticator_Request\032-.CTwoFactor_Finaliz" +
      "eAddAuthenticator_Response\"H\202\265\030DFinalize" +
      " two-factor authentication addition to t" +
      "he logged-in account\022\262\001\n\023RemoveAuthentic" +
      "ator\022\'.CTwoFactor_RemoveAuthenticator_Re" +
      "quest\032(.CTwoFactor_RemoveAuthenticator_R" +
      "esponse\"H\202\265\030DRemove two-factor authentic" +
      "ation addition from the logged-in accoun",
      "t\022\227\001\n\024CreateEmergencyCodes\022(.CTwoFactor_" +
      "CreateEmergencyCodes_Request\032).CTwoFacto" +
      "r_CreateEmergencyCodes_Response\"*\202\265\030&Gen" +
      "erate emergency authenticator codes\022\251\001\n\025" +
      "DestroyEmergencyCodes\022).CTwoFactor_Destr" +
      "oyEmergencyCodes_Request\032*.CTwoFactor_De" +
      "stroyEmergencyCodes_Response\"9\202\265\0305Destro" +
      "y emergency authenticator codes for the " +
      "account\022z\n\rValidateToken\022!.CTwoFactor_Va" +
      "lidateToken_Request\032\".CTwoFactor_Validat",
      "eToken_Response\"\"\202\265\030\036Validate (and consu" +
      "me) a token\032%\202\265\030!Two Factor Authenticati" +
      "on ServiceB\003\200\001\001"
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
          SteammessagesUnifiedBaseSteamclient.getDescriptor(),
        }, assigner);
    internal_static_CTwoFactor_Status_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CTwoFactor_Status_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_Status_Request_descriptor,
        new java.lang.String[] { "Steamid", });
    internal_static_CTwoFactor_Status_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CTwoFactor_Status_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_Status_Response_descriptor,
        new java.lang.String[] { "State", "InactivationReason", "AuthenticatorType", "AuthenticatorAllowed", "SteamguardScheme", "TokenGid", "EmailValidated", "DeviceIdentifier", "TimeCreated", "RevocationAttemptsRemaining", "ClassifiedAgent", "AllowExternalAuthenticator", "ExternalAuthenticatorType", });
    internal_static_CTwoFactor_AddAuthenticator_Request_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CTwoFactor_AddAuthenticator_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_AddAuthenticator_Request_descriptor,
        new java.lang.String[] { "Steamid", "AuthenticatorTime", "SerialNumber", "AuthenticatorType", "DeviceIdentifier", "SmsPhoneId", "HttpHeaders", });
    internal_static_CTwoFactor_AddAuthenticator_Response_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CTwoFactor_AddAuthenticator_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_AddAuthenticator_Response_descriptor,
        new java.lang.String[] { "SharedSecret", "SerialNumber", "RevocationCode", "Uri", "ServerTime", "AccountName", "TokenGid", "IdentitySecret", "Secret1", "Status", });
    internal_static_CTwoFactor_SendEmail_Request_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CTwoFactor_SendEmail_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_SendEmail_Request_descriptor,
        new java.lang.String[] { "Steamid", "EmailType", "IncludeActivationCode", });
    internal_static_CTwoFactor_SendEmail_Response_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_CTwoFactor_SendEmail_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_SendEmail_Response_descriptor,
        new java.lang.String[] { });
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_FinalizeAddAuthenticator_Request_descriptor,
        new java.lang.String[] { "Steamid", "AuthenticatorCode", "AuthenticatorTime", "ActivationCode", "HttpHeaders", });
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_FinalizeAddAuthenticator_Response_descriptor,
        new java.lang.String[] { "Success", "WantMore", "ServerTime", "Status", });
    internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CTwoFactor_RemoveAuthenticator_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_RemoveAuthenticator_Request_descriptor,
        new java.lang.String[] { "RevocationCode", "RevocationReason", "SteamguardScheme", "RemoveAllSteamguardCookies", });
    internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CTwoFactor_RemoveAuthenticator_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_RemoveAuthenticator_Response_descriptor,
        new java.lang.String[] { "Success", "ServerTime", "RevocationAttemptsRemaining", });
    internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_CTwoFactor_CreateEmergencyCodes_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_CreateEmergencyCodes_Request_descriptor,
        new java.lang.String[] { });
    internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_CTwoFactor_CreateEmergencyCodes_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_CreateEmergencyCodes_Response_descriptor,
        new java.lang.String[] { "Codes", });
    internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_CTwoFactor_DestroyEmergencyCodes_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_DestroyEmergencyCodes_Request_descriptor,
        new java.lang.String[] { "Steamid", });
    internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_CTwoFactor_DestroyEmergencyCodes_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_DestroyEmergencyCodes_Response_descriptor,
        new java.lang.String[] { });
    internal_static_CTwoFactor_ValidateToken_Request_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_CTwoFactor_ValidateToken_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_ValidateToken_Request_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_CTwoFactor_ValidateToken_Response_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_CTwoFactor_ValidateToken_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CTwoFactor_ValidateToken_Response_descriptor,
        new java.lang.String[] { "Valid", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(SteammessagesUnifiedBaseSteamclient.description);
    registry.add(SteammessagesUnifiedBaseSteamclient.methodDescription);
    registry.add(SteammessagesUnifiedBaseSteamclient.serviceDescription);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    SteammessagesUnifiedBaseSteamclient.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
