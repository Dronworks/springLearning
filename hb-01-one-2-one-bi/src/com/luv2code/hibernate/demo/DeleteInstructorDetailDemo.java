package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorDetailDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			// Get the instructor detail object
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 4);
			
			// Print the instructor detail
			System.out.println(instructorDetail);
			
			// Print the associated instructor
			System.out.println(instructorDetail.getInstructor());
			
			// To delete without cascade need to break bi directional!
			instructorDetail.getInstructor().setInstructorDetail(null);

			System.out.println("Deleting instructor detail");
			session.delete(instructorDetail);
			
			session.getTransaction().commit();
			System.out.println("DONE!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	
	}

}
