package com.msec.grpc;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.grpc.stub.StreamObservers;

import com.msec.grpc.ChatGrpc.ChatBlockingStub;
import com.msec.grpc.ChatGrpc.ChatStub;

public class TutorialClient {
	private static final Logger logger = Logger.getLogger(TutorialClient.class.getName());
	
	private final ManagedChannel channel;
	private final ChatGrpc.ChatBlockingStub blockingStub;
	private final ChatGrpc.ChatStub asyncStub;
	
	public TutorialClient(String host, int port){
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
	}
	
	public TutorialClient(ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = ChatGrpc.newBlockingStub(channel);
		asyncStub = ChatGrpc.newStub(channel);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	public void sendMessage(String message, String naam){
		info("Sending message: {1}", message);
		
		Bericht bericht = Bericht.newBuilder().setMessage(message).setZender(naam).build();

		try{
			blockingStub.sendMessage(bericht);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}
		info("Send message success");
	}
	

	public void receiveMessages(String naam){
		info("Requesting calculator history");
		
		Iterator<Bericht> berichten;
		try{
			berichten = blockingStub.receiveMessages(ChatClient.newBuilder().setNaam(naam).build());
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			return;
		}
		
		StringBuilder responseLog = new StringBuilder("Messages:\n");
		while(berichten.hasNext()){
			Bericht bericht = berichten.next();
			responseLog.append(bericht);
		}
		
		info(responseLog.toString());
	}

	public void register(String naam){
	    RegistratieResponse regResponse=blockingStub.register(Registratie.newBuilder().setNaam(naam).build());
	    if(regResponse.getBevestiging()){
	        info("Registratie succes");
        }
        else{
            info("Naam reeds in gebruik");
        }
    }

	public static void main(String[] args) throws InterruptedException {
		TutorialClient client = new TutorialClient("localhost", 50050);
		Scanner sc= new Scanner(System.in);
        System.out.println("geef je naam in");
		String naam= sc.nextLine();
		try{
			client.register(naam);
			
			ReceiveThread thread= new ReceiveThread(client.blockingStub, naam);
			//thread.start();
			
			while(sc.hasNext()){
			    client.sendMessage(sc.nextLine(), naam);
            }
		} finally {
			client.shutdown();
		}
		

	}

	private static void info(String msg, Object... params) {
		logger.log(Level.INFO, msg, params);
	}

}
