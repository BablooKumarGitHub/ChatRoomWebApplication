package com.chatroomapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer
{

//	to connect with server: /server1
	// to send message:  /app/message , and then send message into body{}
	//to subscribe so that we can" /topic/return-to" then receive message 
	
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry)
	{
		// TODO Auto-generated method stub
	//	WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
		registry.addEndpoint("/server1").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) 
	{
		// TODO Auto-generated method stub
	//	WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
	}
	
}
