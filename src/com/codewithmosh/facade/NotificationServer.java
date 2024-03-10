package com.codewithmosh.facade;

public class NotificationServer {

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authToken(String appId, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Sending a message" + message.getContent());
    }
}
