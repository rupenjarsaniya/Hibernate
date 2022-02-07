package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class firstcache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
		//By Default Cache
		Student student = session.get(Student.class, 107);
		System.out.println(student);
		
		System.out.println("Working Something...");
		
		Student student1 = session.get(Student.class, 107);
		System.out.println(student1);
		
		System.out.println(session.contains(student));
		
		
		
		
		
		
		session.close();
		factory.close();
	}
}