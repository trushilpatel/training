package com.scope.beansDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
//    	
//    	CricketCoach cc = con.getBean("message", CricketCoach.class);
//    	
//    	cc.getMessage();    	
//    	con.close();
//    	
//    	System.out.println("AnnotationConfiguration");
    	
    	AnnotationConfigApplicationContext con =
    			new AnnotationConfigApplicationContext(SportConfig.class);
    	CricketCoach cc = con.getBean("cricketCoach", CricketCoach.class);

    
    	cc.getMessage();
    	con.close();
    }
}
