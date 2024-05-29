package com.messaginapp.messageapplication.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketDisconnectEventListner {
    

    @EventListener
    public void disconnectEvenrListner(SessionDisconnectEvent event) {
        // TODO complete
    }
}
