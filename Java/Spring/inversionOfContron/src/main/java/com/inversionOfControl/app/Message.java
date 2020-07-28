package com.inversionOfControl.app;

import org.springframework.beans.factory.DisposableBean;

public class Message implements DisposableBean{
	private String message;
	private String newMessage;
	private int Id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	Message(String message){
		this.message = message;
	}
	
	void setMessage(String message) {
		this.message = message;
	}

	String getMessage() {
		return message;
	}

	public String getNewMessage() {
		return newMessage;
	}

	public void setNewMessage(String newMessage) {
		this.newMessage = newMessage;
	}
	
	public void initMessage() {
		System.out.println("init Message executed");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy Message executed");
	}
}
