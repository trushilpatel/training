package com.inversionOfControl.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    	CricketCoach cc = context.getBean("coach2", CricketCoach.class);
    	
    	cc.getMessage();
    	Message message = context.getBean("message2", Message.class);
    	Message message1 = context.getBean("message", Message.class);
    	message1.setMessage("you are watching message from message1");
    	System.out.println(message.getMessage());
    	System.out.println(message1.getMessage());
    	context.close();

    	System.out.println(cc);
    	System.out.println(message.getNewMessage());
    }
}
