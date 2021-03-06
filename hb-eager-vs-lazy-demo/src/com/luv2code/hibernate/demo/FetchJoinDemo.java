package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();

			// Hibernate with HQL
			Query<Instructor> query = session.createQuery("select i from Instructor i "
					+ "JOIN FETCH i.courses "
					+ "where i.id=:theInstructorId", Instructor.class);
			
			// Set parameter on query
			query.setParameter("theInstructorId", 1);
			
			Instructor instructor = query.getSingleResult();
			
			System.out.println("l2c " + instructor);
			
			session.getTransaction().commit();
			
			System.out.println("\n session committed! \n");
			
			System.out.println("l2c " + instructor.getCourses());

			System.out.println("DONE!");
		}
		finally {
			session.close();
			factory.close();
		}
	
	}

}
