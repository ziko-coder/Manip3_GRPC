package zakariagrpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: game.proto")
public final class GameGrpc {

  private GameGrpc() {}

  public static final String SERVICE_NAME = "Game";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GameOuterClass.GuessRequest,
      GameOuterClass.GuessResponse> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Guess",
      requestType = GameOuterClass.GuessRequest.class,
      responseType = GameOuterClass.GuessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GameOuterClass.GuessRequest,
      GameOuterClass.GuessResponse> getGuessMethod() {
    io.grpc.MethodDescriptor<GameOuterClass.GuessRequest, GameOuterClass.GuessResponse> getGuessMethod;
    if ((getGuessMethod = GameGrpc.getGuessMethod) == null) {
      synchronized (GameGrpc.class) {
        if ((getGuessMethod = GameGrpc.getGuessMethod) == null) {
          GameGrpc.getGuessMethod = getGuessMethod = 
              io.grpc.MethodDescriptor.<GameOuterClass.GuessRequest, GameOuterClass.GuessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Game", "Guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GameOuterClass.GuessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GameOuterClass.GuessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameMethodDescriptorSupplier("Guess"))
                  .build();
          }
        }
     }
     return getGuessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GameOuterClass.WinnerRequest,
      GameOuterClass.WinnerResponse> getGetWinnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWinner",
      requestType = GameOuterClass.WinnerRequest.class,
      responseType = GameOuterClass.WinnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GameOuterClass.WinnerRequest,
      GameOuterClass.WinnerResponse> getGetWinnerMethod() {
    io.grpc.MethodDescriptor<GameOuterClass.WinnerRequest, GameOuterClass.WinnerResponse> getGetWinnerMethod;
    if ((getGetWinnerMethod = GameGrpc.getGetWinnerMethod) == null) {
      synchronized (GameGrpc.class) {
        if ((getGetWinnerMethod = GameGrpc.getGetWinnerMethod) == null) {
          GameGrpc.getGetWinnerMethod = getGetWinnerMethod = 
              io.grpc.MethodDescriptor.<GameOuterClass.WinnerRequest, GameOuterClass.WinnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Game", "GetWinner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GameOuterClass.WinnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GameOuterClass.WinnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameMethodDescriptorSupplier("GetWinner"))
                  .build();
          }
        }
     }
     return getGetWinnerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameStub newStub(io.grpc.Channel channel) {
    return new GameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GameFutureStub(channel);
  }

  /**
   */
  public static abstract class GameImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * La méthode pour envoyer une tentative de numéro par un client
     * </pre>
     */
    public void guess(GameOuterClass.GuessRequest request,
                      io.grpc.stub.StreamObserver<GameOuterClass.GuessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGuessMethod(), responseObserver);
    }

    /**
     * <pre>
     * La méthode pour récupérer le gagnant
     * </pre>
     */
    public void getWinner(GameOuterClass.WinnerRequest request,
                          io.grpc.stub.StreamObserver<GameOuterClass.WinnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWinnerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGuessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GameOuterClass.GuessRequest,
                GameOuterClass.GuessResponse>(
                  this, METHODID_GUESS)))
          .addMethod(
            getGetWinnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GameOuterClass.WinnerRequest,
                GameOuterClass.WinnerResponse>(
                  this, METHODID_GET_WINNER)))
          .build();
    }
  }

  /**
   */
  public static final class GameStub extends io.grpc.stub.AbstractStub<GameStub> {
    private GameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameStub(channel, callOptions);
    }

    /**
     * <pre>
     * La méthode pour envoyer une tentative de numéro par un client
     * </pre>
     */
    public void guess(GameOuterClass.GuessRequest request,
                      io.grpc.stub.StreamObserver<GameOuterClass.GuessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * La méthode pour récupérer le gagnant
     * </pre>
     */
    public void getWinner(GameOuterClass.WinnerRequest request,
                          io.grpc.stub.StreamObserver<GameOuterClass.WinnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWinnerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GameBlockingStub extends io.grpc.stub.AbstractStub<GameBlockingStub> {
    private GameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * La méthode pour envoyer une tentative de numéro par un client
     * </pre>
     */
    public GameOuterClass.GuessResponse guess(GameOuterClass.GuessRequest request) {
      return blockingUnaryCall(
          getChannel(), getGuessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * La méthode pour récupérer le gagnant
     * </pre>
     */
    public GameOuterClass.WinnerResponse getWinner(GameOuterClass.WinnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWinnerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GameFutureStub extends io.grpc.stub.AbstractStub<GameFutureStub> {
    private GameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * La méthode pour envoyer une tentative de numéro par un client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GameOuterClass.GuessResponse> guess(
        GameOuterClass.GuessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * La méthode pour récupérer le gagnant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GameOuterClass.WinnerResponse> getWinner(
        GameOuterClass.WinnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWinnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GUESS = 0;
  private static final int METHODID_GET_WINNER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GUESS:
          serviceImpl.guess((GameOuterClass.GuessRequest) request,
              (io.grpc.stub.StreamObserver<GameOuterClass.GuessResponse>) responseObserver);
          break;
        case METHODID_GET_WINNER:
          serviceImpl.getWinner((GameOuterClass.WinnerRequest) request,
              (io.grpc.stub.StreamObserver<GameOuterClass.WinnerResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GameOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Game");
    }
  }

  private static final class GameFileDescriptorSupplier
      extends GameBaseDescriptorSupplier {
    GameFileDescriptorSupplier() {}
  }

  private static final class GameMethodDescriptorSupplier
      extends GameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameFileDescriptorSupplier())
              .addMethod(getGuessMethod())
              .addMethod(getGetWinnerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
