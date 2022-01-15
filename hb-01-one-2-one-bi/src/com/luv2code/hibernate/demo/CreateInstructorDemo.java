package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			Instructor instructor = new Instructor("Madhu", "Patel", "madhu@gmail.com");
			InstructorDetail instructorDetail = new InstructorDetail("http://www.madhu_p.com/youtube", "Lov 2 music!");
			instructor.setInstructorDetail(instructorDetail);
			
			
			session.beginTransaction();
			
			// Because of cascade details will be saved also
			session.save(instructor);	
			
			session.getTransaction().commit();
			System.out.println("DONE!");
		}
		finally {
			factory.close();
		}
	
	}

}
