package com.scope.beansDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Message implements Messages {
	private String message;
	private String newMessage;
	private int Id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	Message(){}
	Message(String message){
		this.message = message;
	}
	
	void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public String getNewMessage() {
		return newMessage;
	}

	public void setNewMessage(String newMessage) {
		this.newMessage = newMessage;
	}
	
	@PostConstruct
	public void initMessage() {
		System.out.println("init Message executed");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy Message executed");
	}
}
