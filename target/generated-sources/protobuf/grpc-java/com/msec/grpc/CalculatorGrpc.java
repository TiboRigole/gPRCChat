package com.msec.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * De calculator service definitie
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: tutorial.proto")
public class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "tutorial.Calculator";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.msec.grpc.Sum,
      com.msec.grpc.CalculatorReply> METHOD_CALCULATE_SUM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "tutorial.Calculator", "calculateSum"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.Sum.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.CalculatorReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.msec.grpc.Sum,
      com.msec.grpc.CalculatorReply> METHOD_STREAMING_SUM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "tutorial.Calculator", "streamingSum"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.Sum.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.CalculatorReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.msec.grpc.Empty,
      com.msec.grpc.Calculation> METHOD_CALCULATOR_HISTORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "tutorial.Calculator", "calculatorHistory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.msec.grpc.Calculation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    return new CalculatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorFutureStub(channel);
  }

  /**
   * <pre>
   * De calculator service definitie
   * </pre>
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Bereken een som
     * </pre>
     */
    public void calculateSum(com.msec.grpc.Sum request,
        io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CALCULATE_SUM, responseObserver);
    }

    /**
     * <pre>
     * Doe een som met onbepaalde input
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.msec.grpc.Sum> streamingSum(
        io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_STREAMING_SUM, responseObserver);
    }

    /**
     * <pre>
     * Vraag de uitgevoerde berekeningen op
     * </pre>
     */
    public void calculatorHistory(com.msec.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.msec.grpc.Calculation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CALCULATOR_HISTORY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CALCULATE_SUM,
            asyncUnaryCall(
              new MethodHandlers<
                com.msec.grpc.Sum,
                com.msec.grpc.CalculatorReply>(
                  this, METHODID_CALCULATE_SUM)))
          .addMethod(
            METHOD_STREAMING_SUM,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.msec.grpc.Sum,
                com.msec.grpc.CalculatorReply>(
                  this, METHODID_STREAMING_SUM)))
          .addMethod(
            METHOD_CALCULATOR_HISTORY,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.msec.grpc.Empty,
                com.msec.grpc.Calculation>(
                  this, METHODID_CALCULATOR_HISTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * De calculator service definitie
   * </pre>
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractStub<CalculatorStub> {
    private CalculatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bereken een som
     * </pre>
     */
    public void calculateSum(com.msec.grpc.Sum request,
        io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CALCULATE_SUM, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Doe een som met onbepaalde input
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.msec.grpc.Sum> streamingSum(
        io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_STREAMING_SUM, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Vraag de uitgevoerde berekeningen op
     * </pre>
     */
    public void calculatorHistory(com.msec.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.msec.grpc.Calculation> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_CALCULATOR_HISTORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * De calculator service definitie
   * </pre>
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bereken een som
     * </pre>
     */
    public com.msec.grpc.CalculatorReply calculateSum(com.msec.grpc.Sum request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CALCULATE_SUM, getCallOptions(), request);
    }

    /**
     * <pre>
     * Vraag de uitgevoerde berekeningen op
     * </pre>
     */
    public java.util.Iterator<com.msec.grpc.Calculation> calculatorHistory(
        com.msec.grpc.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_CALCULATOR_HISTORY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * De calculator service definitie
   * </pre>
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractStub<CalculatorFutureStub> {
    private CalculatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bereken een som
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.msec.grpc.CalculatorReply> calculateSum(
        com.msec.grpc.Sum request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CALCULATE_SUM, getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_SUM = 0;
  private static final int METHODID_CALCULATOR_HISTORY = 1;
  private static final int METHODID_STREAMING_SUM = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_SUM:
          serviceImpl.calculateSum((com.msec.grpc.Sum) request,
              (io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply>) responseObserver);
          break;
        case METHODID_CALCULATOR_HISTORY:
          serviceImpl.calculatorHistory((com.msec.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.msec.grpc.Calculation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAMING_SUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingSum(
              (io.grpc.stub.StreamObserver<com.msec.grpc.CalculatorReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CALCULATE_SUM,
        METHOD_STREAMING_SUM,
        METHOD_CALCULATOR_HISTORY);
  }

}
