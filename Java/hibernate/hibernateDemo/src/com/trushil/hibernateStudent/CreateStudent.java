package com.trushil.hibernateStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			Student s = new Student("Trushil", "Patel", "trushilpatel@outlook.com");
			
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();
			
			System.out.println("Done!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
