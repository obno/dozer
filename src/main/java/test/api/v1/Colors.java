// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test/test.proto

package test.api.v1;

/**
 * Protobuf type {@code test.api.v1.Colors}
 */
public  final class Colors extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:test.api.v1.Colors)
    ColorsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Colors.newBuilder() to construct.
  private Colors(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Colors() {
    color_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Colors(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            color_ = rawValue;
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
    return test.api.v1.Test.internal_static_test_api_v1_Colors_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return test.api.v1.Test.internal_static_test_api_v1_Colors_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            test.api.v1.Colors.class, test.api.v1.Colors.Builder.class);
  }

  /**
   * Protobuf enum {@code test.api.v1.Colors.Color}
   */
  public enum Color
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>red = 0;</code>
     */
    red(0),
    /**
     * <code>blue = 1;</code>
     */
    blue(1),
    /**
     * <code>green = 2;</code>
     */
    green(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>red = 0;</code>
     */
    public static final int red_VALUE = 0;
    /**
     * <code>blue = 1;</code>
     */
    public static final int blue_VALUE = 1;
    /**
     * <code>green = 2;</code>
     */
    public static final int green_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Color valueOf(int value) {
      return forNumber(value);
    }

    public static Color forNumber(int value) {
      switch (value) {
        case 0: return red;
        case 1: return blue;
        case 2: return green;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Color>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Color> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Color>() {
            public Color findValueByNumber(int number) {
              return Color.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return test.api.v1.Colors.getDescriptor().getEnumTypes().get(0);
    }

    private static final Color[] VALUES = values();

    public static Color valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Color(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:test.api.v1.Colors.Color)
  }

  public static final int COLOR_FIELD_NUMBER = 1;
  private int color_;
  /**
   * <code>.test.api.v1.Colors.Color color = 1;</code>
   */
  public int getColorValue() {
    return color_;
  }
  /**
   * <code>.test.api.v1.Colors.Color color = 1;</code>
   */
  public test.api.v1.Colors.Color getColor() {
    test.api.v1.Colors.Color result = test.api.v1.Colors.Color.valueOf(color_);
    return result == null ? test.api.v1.Colors.Color.UNRECOGNIZED : result;
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
    if (color_ != test.api.v1.Colors.Color.red.getNumber()) {
      output.writeEnum(1, color_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (color_ != test.api.v1.Colors.Color.red.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, color_);
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
    if (!(obj instanceof test.api.v1.Colors)) {
      return super.equals(obj);
    }
    test.api.v1.Colors other = (test.api.v1.Colors) obj;

    boolean result = true;
    result = result && color_ == other.color_;
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
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + color_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static test.api.v1.Colors parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static test.api.v1.Colors parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static test.api.v1.Colors parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static test.api.v1.Colors parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static test.api.v1.Colors parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static test.api.v1.Colors parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static test.api.v1.Colors parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static test.api.v1.Colors parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static test.api.v1.Colors parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static test.api.v1.Colors parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static test.api.v1.Colors parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static test.api.v1.Colors parseFrom(
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
  public static Builder newBuilder(test.api.v1.Colors prototype) {
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
   * Protobuf type {@code test.api.v1.Colors}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:test.api.v1.Colors)
      test.api.v1.ColorsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return test.api.v1.Test.internal_static_test_api_v1_Colors_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return test.api.v1.Test.internal_static_test_api_v1_Colors_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              test.api.v1.Colors.class, test.api.v1.Colors.Builder.class);
    }

    // Construct using test.api.v1.Colors.newBuilder()
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
      color_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return test.api.v1.Test.internal_static_test_api_v1_Colors_descriptor;
    }

    public test.api.v1.Colors getDefaultInstanceForType() {
      return test.api.v1.Colors.getDefaultInstance();
    }

    public test.api.v1.Colors build() {
      test.api.v1.Colors result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public test.api.v1.Colors buildPartial() {
      test.api.v1.Colors result = new test.api.v1.Colors(this);
      result.color_ = color_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof test.api.v1.Colors) {
        return mergeFrom((test.api.v1.Colors)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(test.api.v1.Colors other) {
      if (other == test.api.v1.Colors.getDefaultInstance()) return this;
      if (other.color_ != 0) {
        setColorValue(other.getColorValue());
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
      test.api.v1.Colors parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (test.api.v1.Colors) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int color_ = 0;
    /**
     * <code>.test.api.v1.Colors.Color color = 1;</code>
     */
    public int getColorValue() {
      return color_;
    }
    /**
     * <code>.test.api.v1.Colors.Color color = 1;</code>
     */
    public Builder setColorValue(int value) {
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.test.api.v1.Colors.Color color = 1;</code>
     */
    public test.api.v1.Colors.Color getColor() {
      test.api.v1.Colors.Color result = test.api.v1.Colors.Color.valueOf(color_);
      return result == null ? test.api.v1.Colors.Color.UNRECOGNIZED : result;
    }
    /**
     * <code>.test.api.v1.Colors.Color color = 1;</code>
     */
    public Builder setColor(test.api.v1.Colors.Color value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      color_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.test.api.v1.Colors.Color color = 1;</code>
     */
    public Builder clearColor() {
      
      color_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:test.api.v1.Colors)
  }

  // @@protoc_insertion_point(class_scope:test.api.v1.Colors)
  private static final test.api.v1.Colors DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new test.api.v1.Colors();
  }

  public static test.api.v1.Colors getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Colors>
      PARSER = new com.google.protobuf.AbstractParser<Colors>() {
    public Colors parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Colors(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Colors> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Colors> getParserForType() {
    return PARSER;
  }

  public test.api.v1.Colors getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

