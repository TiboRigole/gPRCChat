package com.msec.grpc;

public class ReceiveThread extends Thread{


    ChatGrpc.ChatBlockingStub blockingStub;
    String naam;
    public ReceiveThread(ChatGrpc.ChatBlockingStub blockingStub, String naam){
        this.blockingStub=blockingStub;
        this.naam=naam;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            blockingStub.receiveMessages(ChatClient.newBuilder().setNaam(naam).build());
        }
    }
}
