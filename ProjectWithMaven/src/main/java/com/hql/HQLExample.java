package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session s = factory.openSession();
//		HQL
		
//----------------------------------Get Student-------------------------------------		
		
//		String query = "from Student";
//		String query = "from Student where city='Ahmedabad'";
//		String query = "from Student where city=:cityname";
//		String query = "from Student where city=:cityname and name=:name";
		
//		Query q = s.createQuery(query);
//		q.setParameter("cityname", "Himmatnagar");
//		q.setParameter("name", "Kinal");
//		
//		List<Student> list = q.list();
//		
//		for(Student stu: list) {
//			System.out.println(stu.getName() + ":" + stu.getCity() + ":" + stu.getCerti());
//		}

		Transaction t = s.beginTransaction();
		
		
		
//----------------------------------Delete Student-------------------------------------
//		Query q2 = s.createQuery("delete from Student s where s.city=:cityname");
//		q2.setParameter("cityname", "Ahmedabad");
//		int result = q2.executeUpdate();
//		System.out.println(result);

		
		
//----------------------------------Update Student-------------------------------------
//		Query q3 = s.createQuery("update Student set city=:cityname where name=:name");
//		q3.setParameter("name", "Ankit");
//		q3.setParameter("cityname", "Ahmedabad");
//		int result1 = q3.executeUpdate();
//		System.out.println(result1);
		
		t.commit();

		
		
//----------------------------------Join-------------------------------------
		Query q4 = s.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answer as a");
		List<Object[]> list3 = q4.getResultList();
		
		for(Object[] arr: list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		s.close();
		factory.close();
	}
}
