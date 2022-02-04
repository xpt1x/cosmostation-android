// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/reward/v1beta1/genesis.proto

package axelar.reward.v1beta1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.reward.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    axelar.reward.v1beta1.ParamsOuterClass.Params getParams();
    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder();

    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<axelar.reward.v1beta1.Types.Pool> 
        getPoolsList();
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    axelar.reward.v1beta1.Types.Pool getPools(int index);
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    int getPoolsCount();
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    java.util.List<? extends axelar.reward.v1beta1.Types.PoolOrBuilder> 
        getPoolsOrBuilderList();
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    axelar.reward.v1beta1.Types.PoolOrBuilder getPoolsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState represents the genesis state
   * </pre>
   *
   * Protobuf type {@code axelar.reward.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.reward.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      pools_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenesisState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              axelar.reward.v1beta1.ParamsOuterClass.Params.Builder subBuilder = null;
              if (params_ != null) {
                subBuilder = params_.toBuilder();
              }
              params_ = input.readMessage(axelar.reward.v1beta1.ParamsOuterClass.Params.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(params_);
                params_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pools_ = new java.util.ArrayList<axelar.reward.v1beta1.Types.Pool>();
                mutable_bitField0_ |= 0x00000001;
              }
              pools_.add(
                  input.readMessage(axelar.reward.v1beta1.Types.Pool.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          pools_ = java.util.Collections.unmodifiableList(pools_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return axelar.reward.v1beta1.Genesis.internal_static_axelar_reward_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return axelar.reward.v1beta1.Genesis.internal_static_axelar_reward_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              axelar.reward.v1beta1.Genesis.GenesisState.class, axelar.reward.v1beta1.Genesis.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private axelar.reward.v1beta1.ParamsOuterClass.Params params_;
    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public axelar.reward.v1beta1.ParamsOuterClass.Params getParams() {
      return params_ == null ? axelar.reward.v1beta1.ParamsOuterClass.Params.getDefaultInstance() : params_;
    }
    /**
     * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder() {
      return getParams();
    }

    public static final int POOLS_FIELD_NUMBER = 2;
    private java.util.List<axelar.reward.v1beta1.Types.Pool> pools_;
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<axelar.reward.v1beta1.Types.Pool> getPoolsList() {
      return pools_;
    }
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public java.util.List<? extends axelar.reward.v1beta1.Types.PoolOrBuilder> 
        getPoolsOrBuilderList() {
      return pools_;
    }
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public int getPoolsCount() {
      return pools_.size();
    }
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public axelar.reward.v1beta1.Types.Pool getPools(int index) {
      return pools_.get(index);
    }
    /**
     * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public axelar.reward.v1beta1.Types.PoolOrBuilder getPoolsOrBuilder(
        int index) {
      return pools_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (params_ != null) {
        output.writeMessage(1, getParams());
      }
      for (int i = 0; i < pools_.size(); i++) {
        output.writeMessage(2, pools_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getParams());
      }
      for (int i = 0; i < pools_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, pools_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof axelar.reward.v1beta1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      axelar.reward.v1beta1.Genesis.GenesisState other = (axelar.reward.v1beta1.Genesis.GenesisState) obj;

      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (!getPoolsList()
          .equals(other.getPoolsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      if (getPoolsCount() > 0) {
        hash = (37 * hash) + POOLS_FIELD_NUMBER;
        hash = (53 * hash) + getPoolsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.reward.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(axelar.reward.v1beta1.Genesis.GenesisState prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * GenesisState represents the genesis state
     * </pre>
     *
     * Protobuf type {@code axelar.reward.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.reward.v1beta1.GenesisState)
        axelar.reward.v1beta1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return axelar.reward.v1beta1.Genesis.internal_static_axelar_reward_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return axelar.reward.v1beta1.Genesis.internal_static_axelar_reward_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                axelar.reward.v1beta1.Genesis.GenesisState.class, axelar.reward.v1beta1.Genesis.GenesisState.Builder.class);
      }

      // Construct using axelar.reward.v1beta1.Genesis.GenesisState.newBuilder()
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
          getPoolsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (paramsBuilder_ == null) {
          params_ = null;
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }
        if (poolsBuilder_ == null) {
          pools_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          poolsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return axelar.reward.v1beta1.Genesis.internal_static_axelar_reward_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public axelar.reward.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
        return axelar.reward.v1beta1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public axelar.reward.v1beta1.Genesis.GenesisState build() {
        axelar.reward.v1beta1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public axelar.reward.v1beta1.Genesis.GenesisState buildPartial() {
        axelar.reward.v1beta1.Genesis.GenesisState result = new axelar.reward.v1beta1.Genesis.GenesisState(this);
        int from_bitField0_ = bitField0_;
        if (paramsBuilder_ == null) {
          result.params_ = params_;
        } else {
          result.params_ = paramsBuilder_.build();
        }
        if (poolsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pools_ = java.util.Collections.unmodifiableList(pools_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pools_ = pools_;
        } else {
          result.pools_ = poolsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof axelar.reward.v1beta1.Genesis.GenesisState) {
          return mergeFrom((axelar.reward.v1beta1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(axelar.reward.v1beta1.Genesis.GenesisState other) {
        if (other == axelar.reward.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        if (poolsBuilder_ == null) {
          if (!other.pools_.isEmpty()) {
            if (pools_.isEmpty()) {
              pools_ = other.pools_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePoolsIsMutable();
              pools_.addAll(other.pools_);
            }
            onChanged();
          }
        } else {
          if (!other.pools_.isEmpty()) {
            if (poolsBuilder_.isEmpty()) {
              poolsBuilder_.dispose();
              poolsBuilder_ = null;
              pools_ = other.pools_;
              bitField0_ = (bitField0_ & ~0x00000001);
              poolsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPoolsFieldBuilder() : null;
            } else {
              poolsBuilder_.addAllMessages(other.pools_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        axelar.reward.v1beta1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (axelar.reward.v1beta1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private axelar.reward.v1beta1.ParamsOuterClass.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          axelar.reward.v1beta1.ParamsOuterClass.Params, axelar.reward.v1beta1.ParamsOuterClass.Params.Builder, axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder> paramsBuilder_;
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return paramsBuilder_ != null || params_ != null;
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public axelar.reward.v1beta1.ParamsOuterClass.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? axelar.reward.v1beta1.ParamsOuterClass.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(axelar.reward.v1beta1.ParamsOuterClass.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
          onChanged();
        } else {
          paramsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          axelar.reward.v1beta1.ParamsOuterClass.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
          onChanged();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(axelar.reward.v1beta1.ParamsOuterClass.Params value) {
        if (paramsBuilder_ == null) {
          if (params_ != null) {
            params_ =
              axelar.reward.v1beta1.ParamsOuterClass.Params.newBuilder(params_).mergeFrom(value).buildPartial();
          } else {
            params_ = value;
          }
          onChanged();
        } else {
          paramsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        if (paramsBuilder_ == null) {
          params_ = null;
          onChanged();
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.ParamsOuterClass.Params.Builder getParamsBuilder() {
        
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              axelar.reward.v1beta1.ParamsOuterClass.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <code>.axelar.reward.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          axelar.reward.v1beta1.ParamsOuterClass.Params, axelar.reward.v1beta1.ParamsOuterClass.Params.Builder, axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              axelar.reward.v1beta1.ParamsOuterClass.Params, axelar.reward.v1beta1.ParamsOuterClass.Params.Builder, axelar.reward.v1beta1.ParamsOuterClass.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private java.util.List<axelar.reward.v1beta1.Types.Pool> pools_ =
        java.util.Collections.emptyList();
      private void ensurePoolsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pools_ = new java.util.ArrayList<axelar.reward.v1beta1.Types.Pool>(pools_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          axelar.reward.v1beta1.Types.Pool, axelar.reward.v1beta1.Types.Pool.Builder, axelar.reward.v1beta1.Types.PoolOrBuilder> poolsBuilder_;

      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<axelar.reward.v1beta1.Types.Pool> getPoolsList() {
        if (poolsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pools_);
        } else {
          return poolsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public int getPoolsCount() {
        if (poolsBuilder_ == null) {
          return pools_.size();
        } else {
          return poolsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.Types.Pool getPools(int index) {
        if (poolsBuilder_ == null) {
          return pools_.get(index);
        } else {
          return poolsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setPools(
          int index, axelar.reward.v1beta1.Types.Pool value) {
        if (poolsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolsIsMutable();
          pools_.set(index, value);
          onChanged();
        } else {
          poolsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setPools(
          int index, axelar.reward.v1beta1.Types.Pool.Builder builderForValue) {
        if (poolsBuilder_ == null) {
          ensurePoolsIsMutable();
          pools_.set(index, builderForValue.build());
          onChanged();
        } else {
          poolsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addPools(axelar.reward.v1beta1.Types.Pool value) {
        if (poolsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolsIsMutable();
          pools_.add(value);
          onChanged();
        } else {
          poolsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addPools(
          int index, axelar.reward.v1beta1.Types.Pool value) {
        if (poolsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePoolsIsMutable();
          pools_.add(index, value);
          onChanged();
        } else {
          poolsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addPools(
          axelar.reward.v1beta1.Types.Pool.Builder builderForValue) {
        if (poolsBuilder_ == null) {
          ensurePoolsIsMutable();
          pools_.add(builderForValue.build());
          onChanged();
        } else {
          poolsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addPools(
          int index, axelar.reward.v1beta1.Types.Pool.Builder builderForValue) {
        if (poolsBuilder_ == null) {
          ensurePoolsIsMutable();
          pools_.add(index, builderForValue.build());
          onChanged();
        } else {
          poolsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder addAllPools(
          java.lang.Iterable<? extends axelar.reward.v1beta1.Types.Pool> values) {
        if (poolsBuilder_ == null) {
          ensurePoolsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pools_);
          onChanged();
        } else {
          poolsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearPools() {
        if (poolsBuilder_ == null) {
          pools_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          poolsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder removePools(int index) {
        if (poolsBuilder_ == null) {
          ensurePoolsIsMutable();
          pools_.remove(index);
          onChanged();
        } else {
          poolsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.Types.Pool.Builder getPoolsBuilder(
          int index) {
        return getPoolsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.Types.PoolOrBuilder getPoolsOrBuilder(
          int index) {
        if (poolsBuilder_ == null) {
          return pools_.get(index);  } else {
          return poolsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<? extends axelar.reward.v1beta1.Types.PoolOrBuilder> 
           getPoolsOrBuilderList() {
        if (poolsBuilder_ != null) {
          return poolsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pools_);
        }
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.Types.Pool.Builder addPoolsBuilder() {
        return getPoolsFieldBuilder().addBuilder(
            axelar.reward.v1beta1.Types.Pool.getDefaultInstance());
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.reward.v1beta1.Types.Pool.Builder addPoolsBuilder(
          int index) {
        return getPoolsFieldBuilder().addBuilder(
            index, axelar.reward.v1beta1.Types.Pool.getDefaultInstance());
      }
      /**
       * <code>repeated .axelar.reward.v1beta1.Pool pools = 2 [(.gogoproto.nullable) = false];</code>
       */
      public java.util.List<axelar.reward.v1beta1.Types.Pool.Builder> 
           getPoolsBuilderList() {
        return getPoolsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          axelar.reward.v1beta1.Types.Pool, axelar.reward.v1beta1.Types.Pool.Builder, axelar.reward.v1beta1.Types.PoolOrBuilder> 
          getPoolsFieldBuilder() {
        if (poolsBuilder_ == null) {
          poolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              axelar.reward.v1beta1.Types.Pool, axelar.reward.v1beta1.Types.Pool.Builder, axelar.reward.v1beta1.Types.PoolOrBuilder>(
                  pools_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pools_ = null;
        }
        return poolsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:axelar.reward.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:axelar.reward.v1beta1.GenesisState)
    private static final axelar.reward.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new axelar.reward.v1beta1.Genesis.GenesisState();
    }

    public static axelar.reward.v1beta1.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenesisState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public axelar.reward.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_reward_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_reward_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#axelar/reward/v1beta1/genesis.proto\022\025a" +
      "xelar.reward.v1beta1\032\024gogoproto/gogo.pro" +
      "to\032\"axelar/reward/v1beta1/params.proto\032!" +
      "axelar/reward/v1beta1/types.proto\"u\n\014Gen" +
      "esisState\0223\n\006params\030\001 \001(\0132\035.axelar.rewar" +
      "d.v1beta1.ParamsB\004\310\336\037\000\0220\n\005pools\030\002 \003(\0132\033." +
      "axelar.reward.v1beta1.PoolB\004\310\336\037\000B9Z3gith" +
      "ub.com/axelarnetwork/axelar-core/x/rewar" +
      "d/types\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          axelar.reward.v1beta1.ParamsOuterClass.getDescriptor(),
          axelar.reward.v1beta1.Types.getDescriptor(),
        });
    internal_static_axelar_reward_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_reward_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_reward_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "Pools", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    axelar.reward.v1beta1.ParamsOuterClass.getDescriptor();
    axelar.reward.v1beta1.Types.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
