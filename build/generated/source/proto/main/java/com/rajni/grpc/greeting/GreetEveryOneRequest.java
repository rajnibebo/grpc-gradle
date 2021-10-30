// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.rajni.grpc.greeting;

/**
 * Protobuf type {@code greet.GreetEveryOneRequest}
 */
public final class GreetEveryOneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.GreetEveryOneRequest)
    GreetEveryOneRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetEveryOneRequest.newBuilder() to construct.
  private GreetEveryOneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetEveryOneRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GreetEveryOneRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GreetEveryOneRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.rajni.grpc.greeting.Greeting.Builder subBuilder = null;
            if (greet_ != null) {
              subBuilder = greet_.toBuilder();
            }
            greet_ = input.readMessage(com.rajni.grpc.greeting.Greeting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(greet_);
              greet_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rajni.grpc.greeting.Greet.internal_static_greet_GreetEveryOneRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rajni.grpc.greeting.Greet.internal_static_greet_GreetEveryOneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rajni.grpc.greeting.GreetEveryOneRequest.class, com.rajni.grpc.greeting.GreetEveryOneRequest.Builder.class);
  }

  public static final int GREET_FIELD_NUMBER = 1;
  private com.rajni.grpc.greeting.Greeting greet_;
  /**
   * <code>.greet.Greeting greet = 1;</code>
   * @return Whether the greet field is set.
   */
  @java.lang.Override
  public boolean hasGreet() {
    return greet_ != null;
  }
  /**
   * <code>.greet.Greeting greet = 1;</code>
   * @return The greet.
   */
  @java.lang.Override
  public com.rajni.grpc.greeting.Greeting getGreet() {
    return greet_ == null ? com.rajni.grpc.greeting.Greeting.getDefaultInstance() : greet_;
  }
  /**
   * <code>.greet.Greeting greet = 1;</code>
   */
  @java.lang.Override
  public com.rajni.grpc.greeting.GreetingOrBuilder getGreetOrBuilder() {
    return getGreet();
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
    if (greet_ != null) {
      output.writeMessage(1, getGreet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (greet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGreet());
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
    if (!(obj instanceof com.rajni.grpc.greeting.GreetEveryOneRequest)) {
      return super.equals(obj);
    }
    com.rajni.grpc.greeting.GreetEveryOneRequest other = (com.rajni.grpc.greeting.GreetEveryOneRequest) obj;

    if (hasGreet() != other.hasGreet()) return false;
    if (hasGreet()) {
      if (!getGreet()
          .equals(other.getGreet())) return false;
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
    if (hasGreet()) {
      hash = (37 * hash) + GREET_FIELD_NUMBER;
      hash = (53 * hash) + getGreet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.GreetEveryOneRequest parseFrom(
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
  public static Builder newBuilder(com.rajni.grpc.greeting.GreetEveryOneRequest prototype) {
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
   * Protobuf type {@code greet.GreetEveryOneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetEveryOneRequest)
      com.rajni.grpc.greeting.GreetEveryOneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_GreetEveryOneRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_GreetEveryOneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rajni.grpc.greeting.GreetEveryOneRequest.class, com.rajni.grpc.greeting.GreetEveryOneRequest.Builder.class);
    }

    // Construct using com.rajni.grpc.greeting.GreetEveryOneRequest.newBuilder()
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
      if (greetBuilder_ == null) {
        greet_ = null;
      } else {
        greet_ = null;
        greetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_GreetEveryOneRequest_descriptor;
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.GreetEveryOneRequest getDefaultInstanceForType() {
      return com.rajni.grpc.greeting.GreetEveryOneRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.GreetEveryOneRequest build() {
      com.rajni.grpc.greeting.GreetEveryOneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.GreetEveryOneRequest buildPartial() {
      com.rajni.grpc.greeting.GreetEveryOneRequest result = new com.rajni.grpc.greeting.GreetEveryOneRequest(this);
      if (greetBuilder_ == null) {
        result.greet_ = greet_;
      } else {
        result.greet_ = greetBuilder_.build();
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
      if (other instanceof com.rajni.grpc.greeting.GreetEveryOneRequest) {
        return mergeFrom((com.rajni.grpc.greeting.GreetEveryOneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rajni.grpc.greeting.GreetEveryOneRequest other) {
      if (other == com.rajni.grpc.greeting.GreetEveryOneRequest.getDefaultInstance()) return this;
      if (other.hasGreet()) {
        mergeGreet(other.getGreet());
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
      com.rajni.grpc.greeting.GreetEveryOneRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rajni.grpc.greeting.GreetEveryOneRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.rajni.grpc.greeting.Greeting greet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.greeting.Greeting, com.rajni.grpc.greeting.Greeting.Builder, com.rajni.grpc.greeting.GreetingOrBuilder> greetBuilder_;
    /**
     * <code>.greet.Greeting greet = 1;</code>
     * @return Whether the greet field is set.
     */
    public boolean hasGreet() {
      return greetBuilder_ != null || greet_ != null;
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     * @return The greet.
     */
    public com.rajni.grpc.greeting.Greeting getGreet() {
      if (greetBuilder_ == null) {
        return greet_ == null ? com.rajni.grpc.greeting.Greeting.getDefaultInstance() : greet_;
      } else {
        return greetBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public Builder setGreet(com.rajni.grpc.greeting.Greeting value) {
      if (greetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        greet_ = value;
        onChanged();
      } else {
        greetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public Builder setGreet(
        com.rajni.grpc.greeting.Greeting.Builder builderForValue) {
      if (greetBuilder_ == null) {
        greet_ = builderForValue.build();
        onChanged();
      } else {
        greetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public Builder mergeGreet(com.rajni.grpc.greeting.Greeting value) {
      if (greetBuilder_ == null) {
        if (greet_ != null) {
          greet_ =
            com.rajni.grpc.greeting.Greeting.newBuilder(greet_).mergeFrom(value).buildPartial();
        } else {
          greet_ = value;
        }
        onChanged();
      } else {
        greetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public Builder clearGreet() {
      if (greetBuilder_ == null) {
        greet_ = null;
        onChanged();
      } else {
        greet_ = null;
        greetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public com.rajni.grpc.greeting.Greeting.Builder getGreetBuilder() {
      
      onChanged();
      return getGreetFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    public com.rajni.grpc.greeting.GreetingOrBuilder getGreetOrBuilder() {
      if (greetBuilder_ != null) {
        return greetBuilder_.getMessageOrBuilder();
      } else {
        return greet_ == null ?
            com.rajni.grpc.greeting.Greeting.getDefaultInstance() : greet_;
      }
    }
    /**
     * <code>.greet.Greeting greet = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.greeting.Greeting, com.rajni.grpc.greeting.Greeting.Builder, com.rajni.grpc.greeting.GreetingOrBuilder> 
        getGreetFieldBuilder() {
      if (greetBuilder_ == null) {
        greetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rajni.grpc.greeting.Greeting, com.rajni.grpc.greeting.Greeting.Builder, com.rajni.grpc.greeting.GreetingOrBuilder>(
                getGreet(),
                getParentForChildren(),
                isClean());
        greet_ = null;
      }
      return greetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:greet.GreetEveryOneRequest)
  }

  // @@protoc_insertion_point(class_scope:greet.GreetEveryOneRequest)
  private static final com.rajni.grpc.greeting.GreetEveryOneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rajni.grpc.greeting.GreetEveryOneRequest();
  }

  public static com.rajni.grpc.greeting.GreetEveryOneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetEveryOneRequest>
      PARSER = new com.google.protobuf.AbstractParser<GreetEveryOneRequest>() {
    @java.lang.Override
    public GreetEveryOneRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GreetEveryOneRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GreetEveryOneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetEveryOneRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rajni.grpc.greeting.GreetEveryOneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

