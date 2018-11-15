package com.msec.grpc;

import java.util.ArrayList;
import java.util.List;

public class User {
    String naam;
    List<Bericht> inbox=new ArrayList();

    public User(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Bericht> getInbox() {
        return inbox;
    }

    public void addToInbox(Bericht bericht){
        inbox.add(bericht);
    }

    public void setInbox(List<Bericht> inbox) {
        this.inbox = inbox;
    }
}
