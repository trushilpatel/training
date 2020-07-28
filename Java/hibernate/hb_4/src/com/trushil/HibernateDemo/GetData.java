package com.trushil.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Reviews.class)
								.buildSessionFactory();
		
		try {
			
			// Create Instructor and InstructorDetails object
//			Instructor instructor = new Instructor("Trushil", "Patel", "trushilpatel@gmail.com");
//			InstructorDetail instructorDetails = new InstructorDetail("Not available","Codding");
//			Course course = new Course("Algorithms");
//			Reviews reviews = new Reviews("Nothing to say just awesome course");
//			course.setInstructor(instructor);
//			course.setReviews(reviews);
//			instructorDetails.setInstructor(instructor);
//			instructor.setInstructorDetail(instructorDetails);
//			instructor.setCourses(course);
//			
//			System.out.println(instructor);
//			System.out.println(instructor.getCourses());
//			System.out.println(instructor.getInstructorDetail());
			
			Session session = factory.getCurrentSession();
			Course course;
			
			session.beginTransaction();
		
			course = session.get(Course.class, 1);
			Instructor i = session.get(Instructor.class, 1);
			System.out.println(i);
			System.out.println(i.getCourses());
			System.out.println(i.getInstructorDetail());
			
			System.out.println(course);
			System.out.println(course.getReviews());
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}	
}
