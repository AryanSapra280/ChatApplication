package com.messaginapp.messageapplication.entities;

import com.messaginapp.messageapplication.entities.enums.MessageType;

public class ChatMessage {
    private String message;
    private String sender;
    private MessageType messageType;

    
    public ChatMessage() {
    }

    
    @Override
    public String toString() {
        return "ChatMessage [message=" + message + ", sender=" + sender + ", messageType=" + messageType + "]";
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public MessageType getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    
    
}
