package com.inversionOfControl.app;

import java.util.List;

public class CricketCoach implements coach {
	Message message;
	String coachMessage;
	List<Message> messages;

	CricketCoach(Message message, String coachMessage) {
		System.out.println("CricketCoach : Message, String cunstructor");
		this.coachMessage = coachMessage;
		this.message = message;
	}

	CricketCoach(List<Message> message) {
		this.messages = message;
		System.out.println("CricketCoach : List constructor");
		getListOfMessages();
	}

	void getListOfMessages() {
		for (Message m : messages) {
			System.out.println(m.getMessage());
		}
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Hello this is cricket Coach");

	}

	public void getMessage() {
		System.out.println(coachMessage + " " + message.getMessage());
		// getListOfMessages();
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}
