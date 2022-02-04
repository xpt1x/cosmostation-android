// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/vote/v1beta1/types.proto

package axelar.vote.v1beta1;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TalliedVoteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.vote.v1beta1.TalliedVote)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes tally = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The tally.
     */
    com.google.protobuf.ByteString getTally();

    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @return A list containing the voters.
     */
    java.util.List<com.google.protobuf.ByteString> getVotersList();
    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @return The count of voters.
     */
    int getVotersCount();
    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @param index The index of the element to return.
     * @return The voters at the given index.
     */
    com.google.protobuf.ByteString getVoters(int index);

    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     * @return Whether the data field is set.
     */
    boolean hasData();
    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     * @return The data.
     */
    com.google.protobuf2.Any getData();
    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     */
    com.google.protobuf2.AnyOrBuilder getDataOrBuilder();
  }
  /**
   * <pre>
   * TalliedVote represents a vote for a poll with the accumulated stake of all
   * validators voting for the same data
   * </pre>
   *
   * Protobuf type {@code axelar.vote.v1beta1.TalliedVote}
   */
  public static final class TalliedVote extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.vote.v1beta1.TalliedVote)
      TalliedVoteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TalliedVote.newBuilder() to construct.
    private TalliedVote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TalliedVote() {
      tally_ = com.google.protobuf.ByteString.EMPTY;
      voters_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TalliedVote();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TalliedVote(
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

              tally_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                voters_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              voters_.add(input.readBytes());
              break;
            }
            case 26: {
              com.google.protobuf2.Any.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(com.google.protobuf2.Any.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
              }

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
          voters_ = java.util.Collections.unmodifiableList(voters_); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return axelar.vote.v1beta1.Types.internal_static_axelar_vote_v1beta1_TalliedVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return axelar.vote.v1beta1.Types.internal_static_axelar_vote_v1beta1_TalliedVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              axelar.vote.v1beta1.Types.TalliedVote.class, axelar.vote.v1beta1.Types.TalliedVote.Builder.class);
    }

    public static final int TALLY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString tally_;
    /**
     * <code>bytes tally = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The tally.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTally() {
      return tally_;
    }

    public static final int VOTERS_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.ByteString> voters_;
    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @return A list containing the voters.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getVotersList() {
      return voters_;
    }
    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @return The count of voters.
     */
    public int getVotersCount() {
      return voters_.size();
    }
    /**
     * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
     * @param index The index of the element to return.
     * @return The voters at the given index.
     */
    public com.google.protobuf.ByteString getVoters(int index) {
      return voters_.get(index);
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private com.google.protobuf2.Any data_;
    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf2.Any getData() {
      return data_ == null ? com.google.protobuf2.Any.getDefaultInstance() : data_;
    }
    /**
     * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
     */
    @java.lang.Override
    public com.google.protobuf2.AnyOrBuilder getDataOrBuilder() {
      return getData();
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
      if (!tally_.isEmpty()) {
        output.writeBytes(1, tally_);
      }
      for (int i = 0; i < voters_.size(); i++) {
        output.writeBytes(2, voters_.get(i));
      }
      if (data_ != null) {
        output.writeMessage(3, getData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!tally_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, tally_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < voters_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(voters_.get(i));
        }
        size += dataSize;
        size += 1 * getVotersList().size();
      }
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getData());
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
      if (!(obj instanceof axelar.vote.v1beta1.Types.TalliedVote)) {
        return super.equals(obj);
      }
      axelar.vote.v1beta1.Types.TalliedVote other = (axelar.vote.v1beta1.Types.TalliedVote) obj;

      if (!getTally()
          .equals(other.getTally())) return false;
      if (!getVotersList()
          .equals(other.getVotersList())) return false;
      if (hasData() != other.hasData()) return false;
      if (hasData()) {
        if (!getData()
            .equals(other.getData())) return false;
      }
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
      hash = (37 * hash) + TALLY_FIELD_NUMBER;
      hash = (53 * hash) + getTally().hashCode();
      if (getVotersCount() > 0) {
        hash = (37 * hash) + VOTERS_FIELD_NUMBER;
        hash = (53 * hash) + getVotersList().hashCode();
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.vote.v1beta1.Types.TalliedVote parseFrom(
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
    public static Builder newBuilder(axelar.vote.v1beta1.Types.TalliedVote prototype) {
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
     * TalliedVote represents a vote for a poll with the accumulated stake of all
     * validators voting for the same data
     * </pre>
     *
     * Protobuf type {@code axelar.vote.v1beta1.TalliedVote}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.vote.v1beta1.TalliedVote)
        axelar.vote.v1beta1.Types.TalliedVoteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return axelar.vote.v1beta1.Types.internal_static_axelar_vote_v1beta1_TalliedVote_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return axelar.vote.v1beta1.Types.internal_static_axelar_vote_v1beta1_TalliedVote_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                axelar.vote.v1beta1.Types.TalliedVote.class, axelar.vote.v1beta1.Types.TalliedVote.Builder.class);
      }

      // Construct using axelar.vote.v1beta1.Types.TalliedVote.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tally_ = com.google.protobuf.ByteString.EMPTY;

        voters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return axelar.vote.v1beta1.Types.internal_static_axelar_vote_v1beta1_TalliedVote_descriptor;
      }

      @java.lang.Override
      public axelar.vote.v1beta1.Types.TalliedVote getDefaultInstanceForType() {
        return axelar.vote.v1beta1.Types.TalliedVote.getDefaultInstance();
      }

      @java.lang.Override
      public axelar.vote.v1beta1.Types.TalliedVote build() {
        axelar.vote.v1beta1.Types.TalliedVote result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public axelar.vote.v1beta1.Types.TalliedVote buildPartial() {
        axelar.vote.v1beta1.Types.TalliedVote result = new axelar.vote.v1beta1.Types.TalliedVote(this);
        int from_bitField0_ = bitField0_;
        result.tally_ = tally_;
        if (((bitField0_ & 0x00000001) != 0)) {
          voters_ = java.util.Collections.unmodifiableList(voters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.voters_ = voters_;
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
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
        if (other instanceof axelar.vote.v1beta1.Types.TalliedVote) {
          return mergeFrom((axelar.vote.v1beta1.Types.TalliedVote)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(axelar.vote.v1beta1.Types.TalliedVote other) {
        if (other == axelar.vote.v1beta1.Types.TalliedVote.getDefaultInstance()) return this;
        if (other.getTally() != com.google.protobuf.ByteString.EMPTY) {
          setTally(other.getTally());
        }
        if (!other.voters_.isEmpty()) {
          if (voters_.isEmpty()) {
            voters_ = other.voters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVotersIsMutable();
            voters_.addAll(other.voters_);
          }
          onChanged();
        }
        if (other.hasData()) {
          mergeData(other.getData());
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
        axelar.vote.v1beta1.Types.TalliedVote parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (axelar.vote.v1beta1.Types.TalliedVote) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString tally_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes tally = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The tally.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getTally() {
        return tally_;
      }
      /**
       * <code>bytes tally = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The tally to set.
       * @return This builder for chaining.
       */
      public Builder setTally(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tally_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes tally = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearTally() {
        
        tally_ = getDefaultInstance().getTally();
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> voters_ = java.util.Collections.emptyList();
      private void ensureVotersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          voters_ = new java.util.ArrayList<com.google.protobuf.ByteString>(voters_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @return A list containing the voters.
       */
      public java.util.List<com.google.protobuf.ByteString>
          getVotersList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(voters_) : voters_;
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @return The count of voters.
       */
      public int getVotersCount() {
        return voters_.size();
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @param index The index of the element to return.
       * @return The voters at the given index.
       */
      public com.google.protobuf.ByteString getVoters(int index) {
        return voters_.get(index);
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @param index The index to set the value at.
       * @param value The voters to set.
       * @return This builder for chaining.
       */
      public Builder setVoters(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVotersIsMutable();
        voters_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @param value The voters to add.
       * @return This builder for chaining.
       */
      public Builder addVoters(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVotersIsMutable();
        voters_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @param values The voters to add.
       * @return This builder for chaining.
       */
      public Builder addAllVoters(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureVotersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, voters_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes voters = 2 [(.gogoproto.castrepeated) = "Voters"];</code>
       * @return This builder for chaining.
       */
      public Builder clearVoters() {
        voters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf2.Any data_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder> dataBuilder_;
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       * @return Whether the data field is set.
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       * @return The data.
       */
      public com.google.protobuf2.Any getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? com.google.protobuf2.Any.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public Builder setData(com.google.protobuf2.Any value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public Builder setData(
          com.google.protobuf2.Any.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public Builder mergeData(com.google.protobuf2.Any value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              com.google.protobuf2.Any.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public com.google.protobuf2.Any.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      public com.google.protobuf2.AnyOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              com.google.protobuf2.Any.getDefaultInstance() : data_;
        }
      }
      /**
       * <code>.google.protobuf2.Any data = 3 [(.cosmos_proto.accepts_interface) = "github.com/cosmos/codec/ProtoMarshaler"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf2.Any, com.google.protobuf2.Any.Builder, com.google.protobuf2.AnyOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:axelar.vote.v1beta1.TalliedVote)
    }

    // @@protoc_insertion_point(class_scope:axelar.vote.v1beta1.TalliedVote)
    private static final axelar.vote.v1beta1.Types.TalliedVote DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new axelar.vote.v1beta1.Types.TalliedVote();
    }

    public static axelar.vote.v1beta1.Types.TalliedVote getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TalliedVote>
        PARSER = new com.google.protobuf.AbstractParser<TalliedVote>() {
      @java.lang.Override
      public TalliedVote parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TalliedVote(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TalliedVote> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TalliedVote> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public axelar.vote.v1beta1.Types.TalliedVote getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_vote_v1beta1_TalliedVote_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_vote_v1beta1_TalliedVote_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037axelar/vote/v1beta1/types.proto\022\023axela" +
      "r.vote.v1beta1\032\032google/protobuf2/any.pro" +
      "to\032\024gogoproto/gogo.proto\032\031cosmos_proto/c" +
      "osmos.proto\"\271\001\n\013TalliedVote\022=\n\005tally\030\001 \001" +
      "(\014B.\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.Int\310\336\037\000\022\032\n\006voters\030\002 \003(\014B\n\252\337\037\006Voters\022O" +
      "\n\004data\030\003 \001(\0132\025.google.protobuf2.AnyB*\312\264-" +
      "&github.com/cosmos/codec/ProtoMarshalerB" +
      "7Z1github.com/axelarnetwork/axelar-core/" +
      "x/vote/types\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.AnyProto.getDescriptor(),
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          cosmos_proto.Cosmos.getDescriptor(),
        });
    internal_static_axelar_vote_v1beta1_TalliedVote_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_vote_v1beta1_TalliedVote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_vote_v1beta1_TalliedVote_descriptor,
        new java.lang.String[] { "Tally", "Voters", "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos_proto.Cosmos.acceptsInterface);
    registry.add(com.google.protobuf2.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf2.GoGoProtos.customtype);
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.AnyProto.getDescriptor();
    com.google.protobuf2.GoGoProtos.getDescriptor();
    cosmos_proto.Cosmos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
