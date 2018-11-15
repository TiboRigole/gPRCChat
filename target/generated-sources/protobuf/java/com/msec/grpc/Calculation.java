// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tutorial.proto

package com.msec.grpc;

/**
 * <pre>
 * Een volledige berekening voor eenvoudige sommen
 * </pre>
 *
 * Protobuf type {@code tutorial.Calculation}
 */
public  final class Calculation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.Calculation)
    CalculationOrBuilder {
  // Use Calculation.newBuilder() to construct.
  private Calculation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Calculation() {
    index_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Calculation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            index_ = input.readInt32();
            break;
          }
          case 18: {
            com.msec.grpc.Sum.Builder subBuilder = null;
            if (sum_ != null) {
              subBuilder = sum_.toBuilder();
            }
            sum_ = input.readMessage(com.msec.grpc.Sum.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sum_);
              sum_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.msec.grpc.CalculatorReply.Builder subBuilder = null;
            if (solution_ != null) {
              subBuilder = solution_.toBuilder();
            }
            solution_ = input.readMessage(com.msec.grpc.CalculatorReply.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(solution_);
              solution_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.msec.grpc.TutorialProto.internal_static_tutorial_Calculation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.msec.grpc.TutorialProto.internal_static_tutorial_Calculation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.msec.grpc.Calculation.class, com.msec.grpc.Calculation.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_;
  /**
   * <code>optional int32 index = 1;</code>
   */
  public int getIndex() {
    return index_;
  }

  public static final int SUM_FIELD_NUMBER = 2;
  private com.msec.grpc.Sum sum_;
  /**
   * <code>optional .tutorial.Sum sum = 2;</code>
   */
  public boolean hasSum() {
    return sum_ != null;
  }
  /**
   * <code>optional .tutorial.Sum sum = 2;</code>
   */
  public com.msec.grpc.Sum getSum() {
    return sum_ == null ? com.msec.grpc.Sum.getDefaultInstance() : sum_;
  }
  /**
   * <code>optional .tutorial.Sum sum = 2;</code>
   */
  public com.msec.grpc.SumOrBuilder getSumOrBuilder() {
    return getSum();
  }

  public static final int SOLUTION_FIELD_NUMBER = 3;
  private com.msec.grpc.CalculatorReply solution_;
  /**
   * <code>optional .tutorial.CalculatorReply solution = 3;</code>
   */
  public boolean hasSolution() {
    return solution_ != null;
  }
  /**
   * <code>optional .tutorial.CalculatorReply solution = 3;</code>
   */
  public com.msec.grpc.CalculatorReply getSolution() {
    return solution_ == null ? com.msec.grpc.CalculatorReply.getDefaultInstance() : solution_;
  }
  /**
   * <code>optional .tutorial.CalculatorReply solution = 3;</code>
   */
  public com.msec.grpc.CalculatorReplyOrBuilder getSolutionOrBuilder() {
    return getSolution();
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
    if (index_ != 0) {
      output.writeInt32(1, index_);
    }
    if (sum_ != null) {
      output.writeMessage(2, getSum());
    }
    if (solution_ != null) {
      output.writeMessage(3, getSolution());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, index_);
    }
    if (sum_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSum());
    }
    if (solution_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSolution());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.msec.grpc.Calculation)) {
      return super.equals(obj);
    }
    com.msec.grpc.Calculation other = (com.msec.grpc.Calculation) obj;

    boolean result = true;
    result = result && (getIndex()
        == other.getIndex());
    result = result && (hasSum() == other.hasSum());
    if (hasSum()) {
      result = result && getSum()
          .equals(other.getSum());
    }
    result = result && (hasSolution() == other.hasSolution());
    if (hasSolution()) {
      result = result && getSolution()
          .equals(other.getSolution());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    if (hasSum()) {
      hash = (37 * hash) + SUM_FIELD_NUMBER;
      hash = (53 * hash) + getSum().hashCode();
    }
    if (hasSolution()) {
      hash = (37 * hash) + SOLUTION_FIELD_NUMBER;
      hash = (53 * hash) + getSolution().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.msec.grpc.Calculation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.msec.grpc.Calculation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.msec.grpc.Calculation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.msec.grpc.Calculation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.msec.grpc.Calculation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.msec.grpc.Calculation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.msec.grpc.Calculation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.msec.grpc.Calculation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.msec.grpc.Calculation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.msec.grpc.Calculation parseFrom(
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
  public static Builder newBuilder(com.msec.grpc.Calculation prototype) {
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
   * <pre>
   * Een volledige berekening voor eenvoudige sommen
   * </pre>
   *
   * Protobuf type {@code tutorial.Calculation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.Calculation)
      com.msec.grpc.CalculationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.msec.grpc.TutorialProto.internal_static_tutorial_Calculation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.msec.grpc.TutorialProto.internal_static_tutorial_Calculation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.msec.grpc.Calculation.class, com.msec.grpc.Calculation.Builder.class);
    }

    // Construct using com.msec.grpc.Calculation.newBuilder()
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
      index_ = 0;

      if (sumBuilder_ == null) {
        sum_ = null;
      } else {
        sum_ = null;
        sumBuilder_ = null;
      }
      if (solutionBuilder_ == null) {
        solution_ = null;
      } else {
        solution_ = null;
        solutionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.msec.grpc.TutorialProto.internal_static_tutorial_Calculation_descriptor;
    }

    public com.msec.grpc.Calculation getDefaultInstanceForType() {
      return com.msec.grpc.Calculation.getDefaultInstance();
    }

    public com.msec.grpc.Calculation build() {
      com.msec.grpc.Calculation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.msec.grpc.Calculation buildPartial() {
      com.msec.grpc.Calculation result = new com.msec.grpc.Calculation(this);
      result.index_ = index_;
      if (sumBuilder_ == null) {
        result.sum_ = sum_;
      } else {
        result.sum_ = sumBuilder_.build();
      }
      if (solutionBuilder_ == null) {
        result.solution_ = solution_;
      } else {
        result.solution_ = solutionBuilder_.build();
      }
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
      if (other instanceof com.msec.grpc.Calculation) {
        return mergeFrom((com.msec.grpc.Calculation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.msec.grpc.Calculation other) {
      if (other == com.msec.grpc.Calculation.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasSum()) {
        mergeSum(other.getSum());
      }
      if (other.hasSolution()) {
        mergeSolution(other.getSolution());
      }
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
      com.msec.grpc.Calculation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.msec.grpc.Calculation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int index_ ;
    /**
     * <code>optional int32 index = 1;</code>
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <code>optional int32 index = 1;</code>
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 index = 1;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private com.msec.grpc.Sum sum_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.msec.grpc.Sum, com.msec.grpc.Sum.Builder, com.msec.grpc.SumOrBuilder> sumBuilder_;
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public boolean hasSum() {
      return sumBuilder_ != null || sum_ != null;
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public com.msec.grpc.Sum getSum() {
      if (sumBuilder_ == null) {
        return sum_ == null ? com.msec.grpc.Sum.getDefaultInstance() : sum_;
      } else {
        return sumBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public Builder setSum(com.msec.grpc.Sum value) {
      if (sumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sum_ = value;
        onChanged();
      } else {
        sumBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public Builder setSum(
        com.msec.grpc.Sum.Builder builderForValue) {
      if (sumBuilder_ == null) {
        sum_ = builderForValue.build();
        onChanged();
      } else {
        sumBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public Builder mergeSum(com.msec.grpc.Sum value) {
      if (sumBuilder_ == null) {
        if (sum_ != null) {
          sum_ =
            com.msec.grpc.Sum.newBuilder(sum_).mergeFrom(value).buildPartial();
        } else {
          sum_ = value;
        }
        onChanged();
      } else {
        sumBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public Builder clearSum() {
      if (sumBuilder_ == null) {
        sum_ = null;
        onChanged();
      } else {
        sum_ = null;
        sumBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public com.msec.grpc.Sum.Builder getSumBuilder() {
      
      onChanged();
      return getSumFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    public com.msec.grpc.SumOrBuilder getSumOrBuilder() {
      if (sumBuilder_ != null) {
        return sumBuilder_.getMessageOrBuilder();
      } else {
        return sum_ == null ?
            com.msec.grpc.Sum.getDefaultInstance() : sum_;
      }
    }
    /**
     * <code>optional .tutorial.Sum sum = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.msec.grpc.Sum, com.msec.grpc.Sum.Builder, com.msec.grpc.SumOrBuilder> 
        getSumFieldBuilder() {
      if (sumBuilder_ == null) {
        sumBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.msec.grpc.Sum, com.msec.grpc.Sum.Builder, com.msec.grpc.SumOrBuilder>(
                getSum(),
                getParentForChildren(),
                isClean());
        sum_ = null;
      }
      return sumBuilder_;
    }

    private com.msec.grpc.CalculatorReply solution_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.msec.grpc.CalculatorReply, com.msec.grpc.CalculatorReply.Builder, com.msec.grpc.CalculatorReplyOrBuilder> solutionBuilder_;
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public boolean hasSolution() {
      return solutionBuilder_ != null || solution_ != null;
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public com.msec.grpc.CalculatorReply getSolution() {
      if (solutionBuilder_ == null) {
        return solution_ == null ? com.msec.grpc.CalculatorReply.getDefaultInstance() : solution_;
      } else {
        return solutionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public Builder setSolution(com.msec.grpc.CalculatorReply value) {
      if (solutionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        solution_ = value;
        onChanged();
      } else {
        solutionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public Builder setSolution(
        com.msec.grpc.CalculatorReply.Builder builderForValue) {
      if (solutionBuilder_ == null) {
        solution_ = builderForValue.build();
        onChanged();
      } else {
        solutionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public Builder mergeSolution(com.msec.grpc.CalculatorReply value) {
      if (solutionBuilder_ == null) {
        if (solution_ != null) {
          solution_ =
            com.msec.grpc.CalculatorReply.newBuilder(solution_).mergeFrom(value).buildPartial();
        } else {
          solution_ = value;
        }
        onChanged();
      } else {
        solutionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public Builder clearSolution() {
      if (solutionBuilder_ == null) {
        solution_ = null;
        onChanged();
      } else {
        solution_ = null;
        solutionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public com.msec.grpc.CalculatorReply.Builder getSolutionBuilder() {
      
      onChanged();
      return getSolutionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    public com.msec.grpc.CalculatorReplyOrBuilder getSolutionOrBuilder() {
      if (solutionBuilder_ != null) {
        return solutionBuilder_.getMessageOrBuilder();
      } else {
        return solution_ == null ?
            com.msec.grpc.CalculatorReply.getDefaultInstance() : solution_;
      }
    }
    /**
     * <code>optional .tutorial.CalculatorReply solution = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.msec.grpc.CalculatorReply, com.msec.grpc.CalculatorReply.Builder, com.msec.grpc.CalculatorReplyOrBuilder> 
        getSolutionFieldBuilder() {
      if (solutionBuilder_ == null) {
        solutionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.msec.grpc.CalculatorReply, com.msec.grpc.CalculatorReply.Builder, com.msec.grpc.CalculatorReplyOrBuilder>(
                getSolution(),
                getParentForChildren(),
                isClean());
        solution_ = null;
      }
      return solutionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tutorial.Calculation)
  }

  // @@protoc_insertion_point(class_scope:tutorial.Calculation)
  private static final com.msec.grpc.Calculation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.msec.grpc.Calculation();
  }

  public static com.msec.grpc.Calculation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Calculation>
      PARSER = new com.google.protobuf.AbstractParser<Calculation>() {
    public Calculation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Calculation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Calculation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Calculation> getParserForType() {
    return PARSER;
  }

  public com.msec.grpc.Calculation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

