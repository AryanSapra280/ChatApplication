package com.messaginapp.messageapplication.events;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.messaginapp.messageapplication.entities.ChatMessage;
import com.messaginapp.messageapplication.entities.enums.MessageType;

@Component
public class WebSocketDisconnectEventListner {
    
    Logger logger = LoggerFactory.getLogger(WebSocketDisconnectEventListner.class);

    @Autowired
    private SimpMessageSendingOperations messageTemplate;
    
    public WebSocketDisconnectEventListner() {
        super();
    }
    @EventListener
    public void disconnectEvenrListner(SessionDisconnectEvent event) {
        StompHeaderAccessor stompHeaderAccessor = StompHeaderAccessor.wrap(event.getMessage());  
        String username = null;
        try {
            username = (String) stompHeaderAccessor.getSessionAttributes().get("username");
        }catch(NullPointerException exception) {
            logger.info("Session Attributes is null");
            return;
        }
        if(username != null) {
            logger.info(username + " has disconnected");
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.setType(MessageType.LEAVE);
            chatMessage.setSender(username);

            // need to inform all the subscribers that the user has left the chat
            messageTemplate.convertAndSend("/topic/public",chatMessage);
        }
    }
}
