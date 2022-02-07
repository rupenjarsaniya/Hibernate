package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();	
		
		
//		=======================================One to one========================================
		
////		Creating quetions1
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is Java?");
//		
////		Creating answers1
//		Answer a1 = new Answer();
//		a1.setAnswer("Java is a programming language");
//		a1.setAnswerId(343);
//		q1.setAnswer(a1);
//		a1.setQuestion(q1);
//		
////		Creating quetions2
//		Question q2 = new Question();
//		q2.setQuestionId(242);
//		q2.setQuestion("What is Collection Framework?");
//		
////		Creating answers2
//		Answer a2 = new Answer();
//		a2.setAnswer("API to work with objects in java");
//		a2.setAnswerId(344);
//		q2.setAnswer(a2);
//		a2.setQuestion(q2);
//		
//		Session s = factory.openSession();
//		Transaction t = s.beginTransaction();
//		s.save(q1);
//		s.save(a1);
//		s.save(q2);
//		s.save(a2);
//		
////		Question a = s.load(Question.class, 1212);
////		System.out.println(a.getQuestion());
////		System.out.println(a.getAnswer());
//		
//		t.commit();
//		s.close();

//		=======================================END One to one========================================
		
		
		
		
		
		
		

		
//		=======================================One to many========================================
		
//		Creating quetions1
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		
//		Creating answers1
		Answer a1 = new Answer();
		a1.setAnswer("Java is a programming language");
		a1.setAnswerId(343);
		a1.setQuestion(q1);
		
//		Creating answers2
		Answer a2 = new Answer();
		a2.setAnswer("Java have many framework");
		a2.setAnswerId(344);
		a2.setQuestion(q1);
		
//		Creating answers1
		Answer a3 = new Answer();
		a3.setAnswer("Java is good");
		a3.setAnswerId(345);
		a3.setQuestion(q1);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswer(list);
		
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		
		//Get quetion and answer
//		Question question = s.load(Question.class, 1212);
//		System.out.println(question.getQuestion());
//		System.out.println(question.getQuestionId());
//		
//		for (Answer a : question.getAnswer_()) {
//			System.out.println(a.getAnswer());
//		}
		
		
		t.commit();
		s.close();

//		=======================================END One to many========================================	
		
		
	}

}
