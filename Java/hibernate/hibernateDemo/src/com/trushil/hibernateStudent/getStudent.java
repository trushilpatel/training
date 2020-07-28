package com.trushil.hibernateStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class getStudent {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			Student s = new Student();
			s.setId(1);
			session.beginTransaction();
			Student my = session.get(Student.class, s.getId());
			System.out.println(my);
			
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
