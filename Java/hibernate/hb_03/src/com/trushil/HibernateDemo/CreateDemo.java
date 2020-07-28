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
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		try {
			// Create Instructor and InstructorDetails object
			Instructor instructor = new Instructor("Trushil", "Patel", "trushilpatel@gmail.com");
			InstructorDetail instructorDetails = new InstructorDetail("Not available","Codding");
			Course course = new Course("Algorithms");
			course.setInstructor(instructor);
			instructorDetails.setInstructor(instructor);
			instructor.setInstructorDetail(instructorDetails);
			instructor.setCourses(course);
			
			System.out.println(instructor);
			System.out.println(instructor.getCourses());
			System.out.println(instructor.getInstructorDetail());
			
			Session session = factory.getCurrentSession();
			
			
			session.beginTransaction();
		
			session.save(course);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}	
}
