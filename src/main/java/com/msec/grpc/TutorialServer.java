package com.msec.grpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TutorialServer {
	private static final Logger logger = Logger.getLogger(TutorialServer.class.getName());
	private static HashMap<String, User> users=new HashMap<String, User>();
	private final int port;
	private final Server server;

	
	public TutorialServer(int port) throws IOException {
		this(ServerBuilder.forPort(port), port);
	}
	
	public TutorialServer(ServerBuilder<?> serverBuilder, int port){
		this.port = port;
		if(users == null)
			users = new HashMap<String, User>();
		server = serverBuilder.addService(new ChatService()).build();
	}
	
	public void start() throws IOException{
		server.start();
		logger.info("Server started, listening on " + port);
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	        @Override
	        public void run() {
	          // Use stderr here since the logger may has been reset by its JVM shutdown hook.
	          System.err.println("*** shutting down gRPC server since JVM is shutting down");
	          TutorialServer.this.stop();
	          System.err.println("*** server shut down");
	        }
	      });
	}

	  /** Stop serving requests and shutdown resources. */
	  public void stop() {
	    if (server != null) {
	      server.shutdown();
	    }
	  }

	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }

	public static void main(String[] args) throws Exception{
		TutorialServer server = new TutorialServer(50050);
	    server.start();
	    server.blockUntilShutdown();

	}
	
	private static class ChatService extends ChatGrpc.ChatImplBase {

		@Override
		public void sendMessage(Bericht bericht, StreamObserver<Empty> streamObserver){
			String zender= bericht.getZender();

            for (User user : users.values()) {
                if(!user.getNaam().equals(zender)){
                    user.addToInbox(bericht);
                }
            }

            streamObserver.onNext(Empty.newBuilder().build());
            streamObserver.onCompleted();

		}

		@Override
        public void register(Registratie registratie, StreamObserver<RegistratieResponse> streamObserver){
            System.out.println("er wordt geregistreerd");
            System.out.println(registratie.getNaam());

            if(!users.containsKey(registratie.getNaam())) {
                System.out.println("user bestaat nog niet");
                users.put(registratie.getNaam(), new User(registratie.getNaam()));
                streamObserver.onNext(RegistratieResponse.newBuilder().setBevestiging(true).build());
                streamObserver.onCompleted();
            }
            else{
                streamObserver.onNext(RegistratieResponse.newBuilder().setBevestiging(false).build());
                streamObserver.onCompleted();
            }

        }

        @Override
        public synchronized void receiveMessages(ChatClient ontvanger, StreamObserver<Bericht> streamObserver){
            User ontvangerUser= users.get(ontvanger.getNaam());
		    while(ontvangerUser.getInbox().isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (Bericht inbox : ontvangerUser.getInbox()) {
                streamObserver.onNext(inbox);
            }
            streamObserver.onCompleted();
        }

		

	}

}
