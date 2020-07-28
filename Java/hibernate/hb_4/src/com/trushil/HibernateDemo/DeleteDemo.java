package com.trushil.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		try {
			// Create Instructor and InstructorDetails object
			Course course ;

			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			course = session.get(Course.class, 10);
			System.out.println(course.getInstructor());
			//session.save(instructor);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
