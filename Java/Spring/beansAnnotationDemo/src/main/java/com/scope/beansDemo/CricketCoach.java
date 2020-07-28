package com.scope.beansDemo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach {
	@Autowired
	@Qualifier("message2")
	Messages message;
	String coachMessage;
	List<Message> messages;

	@Autowired
	CricketCoach() {
		System.out.println("CricketCoach : Message cunstructor");
	}

	CricketCoach(List<Message> message) {
		this.messages = message;
		System.out.println("CricketCoach : List constructor");
		getListOfMessages();
	}

	void getListOfMessages() {
		for (Message m : messages) {
			//System.out.println(m.getMessage());
		}
	}

	@PostConstruct
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Hello this is cricket Coach");

	}
	
	public void getMessage() {
		System.out.println(coachMessage + " " + message.getMessage());
		// getListOfMessages();
	}
	
	// @Autowired
	public void setMessage(Message message) {
		this.message = message;
	}

}
