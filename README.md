# Spring Boot WebSocket Chat Application

This project is a chat application built using Spring Boot and WebSockets, leveraging the STOMP protocol. The application allows users to join a chat room, send messages, and receive updates when other users join or leave the chat.

Tech Stack and Frameworks

### Backend

* **Spring Boot:** A framework to create stand-alone, production-grade Spring-based applications.

* **Alternatives:** Quarkus, Micronaut, Dropwizard.

### Spring WebSocket: Handles WebSocket communication.

* **Alternatives:** Java EE WebSocket API, Netty, Jetty WebSocket API.

### STOMP (Simple Text Oriented Messaging Protocol): A simple protocol for WebSocket messaging, facilitating topic-based messaging.

* **Alternatives:** MQTT, AMQP, XMPP.

### SockJS: Provides WebSocket emulation for environments where WebSockets are not supported.

* **Alternatives:** Socket.IO, SignalR.

### SLF4J (Simple Logging Facade for Java): A facade for various logging frameworks.

* **Alternatives:** Log4j, java.util.logging, Logback.

### Frontend

* **JavaScript (with STOMP.js and SockJS):** Handles client-side WebSocket communication.

* **Alternatives:** Vanilla WebSocket API, Socket.IO.

## Features

* **Real-time Messaging:** Users can send and receive messages instantly.

* **User Join/Leave Notifications:** Users are notified when someone joins or leaves the chat.

* **WebSocket Communication:** Efficient communication using WebSockets.

* **Fallback to SockJS:** Ensures compatibility in environments where WebSockets are not supported.

## Getting Started

**Prerequisites**

* Java 8 or higher

* Maven

* Node.js and npm (for frontend dependencies, if needed)

**Running the Application**

* Clone the repository
```
git clone https://github.com/yourusername/chat-application.git
```
```
cd chat-application
```

* Build the application

```
./mvnw clean install
```

# Run the application
```
./mvnw spring-boot:run
```

# Open your browser

* Navigate to **http://localhost:8080** to access the chat application.


## Frontend Setup

The frontend uses plain HTML, CSS, and JavaScript along with SockJS and STOMP.js libraries.

**HTML and CSS:**

* The HTML file includes the structure of the chat application.

* The CSS file styles the chat interface.

**JavaScript:**

* Manages WebSocket connections and handles user interactions.

* Uses SockJS for WebSocket fallback and STOMP.js for message handling.

# Example Usage

**Connect to the WebSocket server:**

Users connect by entering their username and joining the chat room.

**Send and receive messages:**

Users can send messages that are broadcast to all connected users.

**User notifications:**

The application notifies when users join or leave the chat.

# Contributions

Feel free to submit pull requests or open issues if you have any suggestions or find any bugs.
