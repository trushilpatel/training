package com.JavaAnnotaionConfig.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
    			new AnnotationConfigApplicationContext(SportConfig.class);
    			
    	Message message = context.getBean("message", Message.class);
    	
    	System.out.println(message.getMessage());
    	context.close();
    }
}
