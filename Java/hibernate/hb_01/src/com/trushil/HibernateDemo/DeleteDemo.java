package com.trushil.HibernateDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		try {


			Session session = factory.getCurrentSession();

			session.beginTransaction();

			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
			System.out.println("hello world ");
//			System.out.println(instructorDetail + " " + instructorDetail.getInstructor());
			session.delete(instructorDetail);
		
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
