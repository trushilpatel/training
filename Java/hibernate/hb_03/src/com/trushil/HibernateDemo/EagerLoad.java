package com.trushil.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLoad {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		try {
			// Create Instructor and InstructorDetails object
			Course course;

			Session session = factory.getCurrentSession();

			session.beginTransaction();
			course = session.get(Course.class, 15);
			System.out.println("hello kem chho");
			System.out.println(course.getInstructor());
			System.out.println("Nothing to show");
			session.getTransaction().commit();

			session.close();
			
			System.out.println(course);
			System.out.println(course.getInstructor());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
