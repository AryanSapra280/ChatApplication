package com.messaginapp.messageapplication.entities;

import com.messaginapp.messageapplication.entities.enums.MessageType;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    
    public ChatMessage() {
    }


    public ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }
    


    @Override
    public String toString() {
        return "ChatMessage [type=" + type + ", content=" + content + ", sender=" + sender + "]";
    }


    public MessageType getType() {
        return type;
    }


    public void setType(MessageType type) {
        this.type = type;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public String getSender() {
        return sender;
    }


    public void setSender(String sender) {
        this.sender = sender;
    }

    
   
    
}
