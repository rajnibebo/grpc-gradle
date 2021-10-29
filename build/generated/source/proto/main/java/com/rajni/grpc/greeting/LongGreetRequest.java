// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.rajni.grpc.greeting;

/**
 * Protobuf type {@code greet.LongGreetRequest}
 */
public final class LongGreetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.LongGreetRequest)
    LongGreetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LongGreetRequest.newBuilder() to construct.
  private LongGreetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LongGreetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LongGreetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LongGreetRequest(
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
            com.rajni.grpc.greeting.GreetRequest.Builder subBuilder = null;
            if (request_ != null) {
              subBuilder = request_.toBuilder();
            }
            request_ = input.readMessage(com.rajni.grpc.greeting.GreetRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(request_);
              request_ = subBuilder.buildPartial();
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
    return com.rajni.grpc.greeting.Greet.internal_static_greet_LongGreetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rajni.grpc.greeting.Greet.internal_static_greet_LongGreetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rajni.grpc.greeting.LongGreetRequest.class, com.rajni.grpc.greeting.LongGreetRequest.Builder.class);
  }

  public static final int REQUEST_FIELD_NUMBER = 1;
  private com.rajni.grpc.greeting.GreetRequest request_;
  /**
   * <code>.greet.GreetRequest request = 1;</code>
   * @return Whether the request field is set.
   */
  @java.lang.Override
  public boolean hasRequest() {
    return request_ != null;
  }
  /**
   * <code>.greet.GreetRequest request = 1;</code>
   * @return The request.
   */
  @java.lang.Override
  public com.rajni.grpc.greeting.GreetRequest getRequest() {
    return request_ == null ? com.rajni.grpc.greeting.GreetRequest.getDefaultInstance() : request_;
  }
  /**
   * <code>.greet.GreetRequest request = 1;</code>
   */
  @java.lang.Override
  public com.rajni.grpc.greeting.GreetRequestOrBuilder getRequestOrBuilder() {
    return getRequest();
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
    if (request_ != null) {
      output.writeMessage(1, getRequest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (request_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequest());
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
    if (!(obj instanceof com.rajni.grpc.greeting.LongGreetRequest)) {
      return super.equals(obj);
    }
    com.rajni.grpc.greeting.LongGreetRequest other = (com.rajni.grpc.greeting.LongGreetRequest) obj;

    if (hasRequest() != other.hasRequest()) return false;
    if (hasRequest()) {
      if (!getRequest()
          .equals(other.getRequest())) return false;
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
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.greeting.LongGreetRequest parseFrom(
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
  public static Builder newBuilder(com.rajni.grpc.greeting.LongGreetRequest prototype) {
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
   * Protobuf type {@code greet.LongGreetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.LongGreetRequest)
      com.rajni.grpc.greeting.LongGreetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_LongGreetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_LongGreetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rajni.grpc.greeting.LongGreetRequest.class, com.rajni.grpc.greeting.LongGreetRequest.Builder.class);
    }

    // Construct using com.rajni.grpc.greeting.LongGreetRequest.newBuilder()
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
      if (requestBuilder_ == null) {
        request_ = null;
      } else {
        request_ = null;
        requestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rajni.grpc.greeting.Greet.internal_static_greet_LongGreetRequest_descriptor;
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.LongGreetRequest getDefaultInstanceForType() {
      return com.rajni.grpc.greeting.LongGreetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.LongGreetRequest build() {
      com.rajni.grpc.greeting.LongGreetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rajni.grpc.greeting.LongGreetRequest buildPartial() {
      com.rajni.grpc.greeting.LongGreetRequest result = new com.rajni.grpc.greeting.LongGreetRequest(this);
      if (requestBuilder_ == null) {
        result.request_ = request_;
      } else {
        result.request_ = requestBuilder_.build();
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
      if (other instanceof com.rajni.grpc.greeting.LongGreetRequest) {
        return mergeFrom((com.rajni.grpc.greeting.LongGreetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rajni.grpc.greeting.LongGreetRequest other) {
      if (other == com.rajni.grpc.greeting.LongGreetRequest.getDefaultInstance()) return this;
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
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
      com.rajni.grpc.greeting.LongGreetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rajni.grpc.greeting.LongGreetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.rajni.grpc.greeting.GreetRequest request_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.greeting.GreetRequest, com.rajni.grpc.greeting.GreetRequest.Builder, com.rajni.grpc.greeting.GreetRequestOrBuilder> requestBuilder_;
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     * @return Whether the request field is set.
     */
    public boolean hasRequest() {
      return requestBuilder_ != null || request_ != null;
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     * @return The request.
     */
    public com.rajni.grpc.greeting.GreetRequest getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null ? com.rajni.grpc.greeting.GreetRequest.getDefaultInstance() : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public Builder setRequest(com.rajni.grpc.greeting.GreetRequest value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        requestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public Builder setRequest(
        com.rajni.grpc.greeting.GreetRequest.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public Builder mergeRequest(com.rajni.grpc.greeting.GreetRequest value) {
      if (requestBuilder_ == null) {
        if (request_ != null) {
          request_ =
            com.rajni.grpc.greeting.GreetRequest.newBuilder(request_).mergeFrom(value).buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        requestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public Builder clearRequest() {
      if (requestBuilder_ == null) {
        request_ = null;
        onChanged();
      } else {
        request_ = null;
        requestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public com.rajni.grpc.greeting.GreetRequest.Builder getRequestBuilder() {
      
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    public com.rajni.grpc.greeting.GreetRequestOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null ?
            com.rajni.grpc.greeting.GreetRequest.getDefaultInstance() : request_;
      }
    }
    /**
     * <code>.greet.GreetRequest request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.greeting.GreetRequest, com.rajni.grpc.greeting.GreetRequest.Builder, com.rajni.grpc.greeting.GreetRequestOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rajni.grpc.greeting.GreetRequest, com.rajni.grpc.greeting.GreetRequest.Builder, com.rajni.grpc.greeting.GreetRequestOrBuilder>(
                getRequest(),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:greet.LongGreetRequest)
  }

  // @@protoc_insertion_point(class_scope:greet.LongGreetRequest)
  private static final com.rajni.grpc.greeting.LongGreetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rajni.grpc.greeting.LongGreetRequest();
  }

  public static com.rajni.grpc.greeting.LongGreetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LongGreetRequest>
      PARSER = new com.google.protobuf.AbstractParser<LongGreetRequest>() {
    @java.lang.Override
    public LongGreetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LongGreetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LongGreetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LongGreetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rajni.grpc.greeting.LongGreetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
