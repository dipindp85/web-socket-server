package com.samples.servers;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/actions")
public class DeviceWebSocketServer {

	@OnOpen
	public void open(Session session) {
		System.out.println("** Started Web Socket Server **");
	}

	@OnClose
	public void close(Session session) {
		System.out.println("** closed **");
	}

	@OnError
	public void onError(Throwable error) {
		System.out.println(error.getMessage());
	}

	@OnMessage
	public void handleMessage(String message, Session session) {
		System.out.println("** Received message  **");
	}

}
