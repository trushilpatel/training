package com.scope.beansDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Message2 implements Messages {
	String message = " Nothing to show";
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	@PostConstruct
	public void initMessage() {
		System.out.println("init Message2 executed");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy Message2 executed");
	}
}
