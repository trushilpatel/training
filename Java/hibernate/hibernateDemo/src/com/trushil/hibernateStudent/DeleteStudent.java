package com.trushil.hibernateStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {

			Session s = factory.getCurrentSession();
			s.beginTransaction();

//			s.createQuery("update Student set email='nothing@gmail.com'");
			Student stud = s.get(Student.class, 2);
			
			s.delete(stud);
			s.createQuery("delete from Student where id=2");
			s.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
