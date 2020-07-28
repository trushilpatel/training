package com.trushil.hibernateStudent;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		try {
			
			Session s = factory.getCurrentSession();
			s.beginTransaction();

//			List<Student> students = s.createQuery("from Student").getResultList();
//
//			List<Student> students = s.createQuery("from Student s where s.lastName='Patel'").getResultList();
//
			List<Student> students = s.createQuery("from Student s where s.lastName='Patel' and s.firstName Like 'T%'").getResultList();
			
			
			students.forEach((stu) -> System.out.println(stu));
			
			s.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}
}
