package com.trushil.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		try {
			// Create Instructor and InstructorDetails object
			Instructor instructor = new Instructor("Trushil", "Patel", "trushilpatel@gmail.com");
			InstructorDetail instructorDetails = new InstructorDetail("Not available","Codding");
			
			instructor.setInstructorDetails(instructorDetails);
			
			Session session = factory.getCurrentSession();
			
			
			session.beginTransaction();
		
			session.save(instructor);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}	
}
