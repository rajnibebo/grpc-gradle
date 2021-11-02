// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.rajni.grpc.blog;

/**
 * Protobuf type {@code blog.BlogRequest}
 */
public final class BlogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:blog.BlogRequest)
    BlogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlogRequest.newBuilder() to construct.
  private BlogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlogRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlogRequest(
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
            com.rajni.grpc.blog.Blog.Builder subBuilder = null;
            if (blogRequest_ != null) {
              subBuilder = blogRequest_.toBuilder();
            }
            blogRequest_ = input.readMessage(com.rajni.grpc.blog.Blog.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blogRequest_);
              blogRequest_ = subBuilder.buildPartial();
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
    return com.rajni.grpc.blog.BlogOuterClass.internal_static_blog_BlogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rajni.grpc.blog.BlogOuterClass.internal_static_blog_BlogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rajni.grpc.blog.BlogRequest.class, com.rajni.grpc.blog.BlogRequest.Builder.class);
  }

  public static final int BLOG_REQUEST_FIELD_NUMBER = 1;
  private com.rajni.grpc.blog.Blog blogRequest_;
  /**
   * <code>.blog.Blog blog_request = 1;</code>
   * @return Whether the blogRequest field is set.
   */
  @java.lang.Override
  public boolean hasBlogRequest() {
    return blogRequest_ != null;
  }
  /**
   * <code>.blog.Blog blog_request = 1;</code>
   * @return The blogRequest.
   */
  @java.lang.Override
  public com.rajni.grpc.blog.Blog getBlogRequest() {
    return blogRequest_ == null ? com.rajni.grpc.blog.Blog.getDefaultInstance() : blogRequest_;
  }
  /**
   * <code>.blog.Blog blog_request = 1;</code>
   */
  @java.lang.Override
  public com.rajni.grpc.blog.BlogOrBuilder getBlogRequestOrBuilder() {
    return getBlogRequest();
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
    if (blogRequest_ != null) {
      output.writeMessage(1, getBlogRequest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blogRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlogRequest());
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
    if (!(obj instanceof com.rajni.grpc.blog.BlogRequest)) {
      return super.equals(obj);
    }
    com.rajni.grpc.blog.BlogRequest other = (com.rajni.grpc.blog.BlogRequest) obj;

    if (hasBlogRequest() != other.hasBlogRequest()) return false;
    if (hasBlogRequest()) {
      if (!getBlogRequest()
          .equals(other.getBlogRequest())) return false;
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
    if (hasBlogRequest()) {
      hash = (37 * hash) + BLOG_REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getBlogRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.blog.BlogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.blog.BlogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.grpc.blog.BlogRequest parseFrom(
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
  public static Builder newBuilder(com.rajni.grpc.blog.BlogRequest prototype) {
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
   * Protobuf type {@code blog.BlogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:blog.BlogRequest)
      com.rajni.grpc.blog.BlogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rajni.grpc.blog.BlogOuterClass.internal_static_blog_BlogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rajni.grpc.blog.BlogOuterClass.internal_static_blog_BlogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rajni.grpc.blog.BlogRequest.class, com.rajni.grpc.blog.BlogRequest.Builder.class);
    }

    // Construct using com.rajni.grpc.blog.BlogRequest.newBuilder()
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
      if (blogRequestBuilder_ == null) {
        blogRequest_ = null;
      } else {
        blogRequest_ = null;
        blogRequestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rajni.grpc.blog.BlogOuterClass.internal_static_blog_BlogRequest_descriptor;
    }

    @java.lang.Override
    public com.rajni.grpc.blog.BlogRequest getDefaultInstanceForType() {
      return com.rajni.grpc.blog.BlogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rajni.grpc.blog.BlogRequest build() {
      com.rajni.grpc.blog.BlogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rajni.grpc.blog.BlogRequest buildPartial() {
      com.rajni.grpc.blog.BlogRequest result = new com.rajni.grpc.blog.BlogRequest(this);
      if (blogRequestBuilder_ == null) {
        result.blogRequest_ = blogRequest_;
      } else {
        result.blogRequest_ = blogRequestBuilder_.build();
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
      if (other instanceof com.rajni.grpc.blog.BlogRequest) {
        return mergeFrom((com.rajni.grpc.blog.BlogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rajni.grpc.blog.BlogRequest other) {
      if (other == com.rajni.grpc.blog.BlogRequest.getDefaultInstance()) return this;
      if (other.hasBlogRequest()) {
        mergeBlogRequest(other.getBlogRequest());
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
      com.rajni.grpc.blog.BlogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rajni.grpc.blog.BlogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.rajni.grpc.blog.Blog blogRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.blog.Blog, com.rajni.grpc.blog.Blog.Builder, com.rajni.grpc.blog.BlogOrBuilder> blogRequestBuilder_;
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     * @return Whether the blogRequest field is set.
     */
    public boolean hasBlogRequest() {
      return blogRequestBuilder_ != null || blogRequest_ != null;
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     * @return The blogRequest.
     */
    public com.rajni.grpc.blog.Blog getBlogRequest() {
      if (blogRequestBuilder_ == null) {
        return blogRequest_ == null ? com.rajni.grpc.blog.Blog.getDefaultInstance() : blogRequest_;
      } else {
        return blogRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public Builder setBlogRequest(com.rajni.grpc.blog.Blog value) {
      if (blogRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blogRequest_ = value;
        onChanged();
      } else {
        blogRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public Builder setBlogRequest(
        com.rajni.grpc.blog.Blog.Builder builderForValue) {
      if (blogRequestBuilder_ == null) {
        blogRequest_ = builderForValue.build();
        onChanged();
      } else {
        blogRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public Builder mergeBlogRequest(com.rajni.grpc.blog.Blog value) {
      if (blogRequestBuilder_ == null) {
        if (blogRequest_ != null) {
          blogRequest_ =
            com.rajni.grpc.blog.Blog.newBuilder(blogRequest_).mergeFrom(value).buildPartial();
        } else {
          blogRequest_ = value;
        }
        onChanged();
      } else {
        blogRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public Builder clearBlogRequest() {
      if (blogRequestBuilder_ == null) {
        blogRequest_ = null;
        onChanged();
      } else {
        blogRequest_ = null;
        blogRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public com.rajni.grpc.blog.Blog.Builder getBlogRequestBuilder() {
      
      onChanged();
      return getBlogRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    public com.rajni.grpc.blog.BlogOrBuilder getBlogRequestOrBuilder() {
      if (blogRequestBuilder_ != null) {
        return blogRequestBuilder_.getMessageOrBuilder();
      } else {
        return blogRequest_ == null ?
            com.rajni.grpc.blog.Blog.getDefaultInstance() : blogRequest_;
      }
    }
    /**
     * <code>.blog.Blog blog_request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rajni.grpc.blog.Blog, com.rajni.grpc.blog.Blog.Builder, com.rajni.grpc.blog.BlogOrBuilder> 
        getBlogRequestFieldBuilder() {
      if (blogRequestBuilder_ == null) {
        blogRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rajni.grpc.blog.Blog, com.rajni.grpc.blog.Blog.Builder, com.rajni.grpc.blog.BlogOrBuilder>(
                getBlogRequest(),
                getParentForChildren(),
                isClean());
        blogRequest_ = null;
      }
      return blogRequestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:blog.BlogRequest)
  }

  // @@protoc_insertion_point(class_scope:blog.BlogRequest)
  private static final com.rajni.grpc.blog.BlogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rajni.grpc.blog.BlogRequest();
  }

  public static com.rajni.grpc.blog.BlogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlogRequest>
      PARSER = new com.google.protobuf.AbstractParser<BlogRequest>() {
    @java.lang.Override
    public BlogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rajni.grpc.blog.BlogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

