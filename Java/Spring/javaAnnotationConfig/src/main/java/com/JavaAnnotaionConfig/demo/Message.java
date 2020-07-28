package com.JavaAnnotaionConfig.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Message {
	@Value("${temp.message}")
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
