package com.trushil.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateData {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		try {
			
			Session session = factory.getCurrentSession();
			
			Instructor instructor = new Instructor("Trushil","Patel","trushilpatel@outlook.com");
			InstructorDetail instructorDetail = new InstructorDetail("TP","codding");
			
			instructor.setInstructorDetail(instructorDetail);
			session.beginTransaction();
			System.out.println(instructor);
			System.out.println(instructorDetail.getInstructor());
			//session.save(instructor);
			instructorDetail = session.get(InstructorDetail.class, 1);
			System.out.println(instructorDetail);
			System.out.println(instructorDetail.getInstructor());
			session.close();
			System.out.println(instructorDetail.getInstructor().getInstructorDetail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}							
	
}
