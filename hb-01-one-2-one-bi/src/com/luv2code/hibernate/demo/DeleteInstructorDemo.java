package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 2);
			System.out.println("found: " + instructor);
			if(instructor != null) {
				// cascade: will also delete details!
				session.delete(instructor);
			}
			
			session.getTransaction().commit();
			System.out.println("DONE!");
		}
		finally {
			factory.close();
		}
	
	}

}
