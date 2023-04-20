package com.map;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("NewHiberCfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// create question object 
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is java?");
		
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is programming ");
		answer.setQuestion(q1);
		
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(342);
		answer1.setAnswer("with the help of java we can make software");
		answer1.setQuestion(q1);
		
		Answer answer2 = new Answer();
		answer2.setAnswerId(341);
		answer2.setAnswer("java is diferent type framework ");
		answer2.setQuestion(q1);
		
		List<Answer> list= new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		
		q1.setAnswer(list);
		
		//q1.setAnswer(answer);
		
		// new feild set
		/*
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("what is collection ?");
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("Api work with object in java ");
		answer1.setQuestion(q2);
		q2.setAnswer(answer);
		*/
		
		// session 
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		
		
		
		
		s.save(q1);
		//s.save(q1);
	//	s.save(q2);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
	//	s.save(answer1);
		
		
		Question q =(Question)s.get(Question.class, 1212);
		System.out.println(q.getQuestion());
		
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
		
		
		
		tx.commit();
		
		// fatching 
		/*
		Question newQ = (Question )s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		
		 newQ= s.get(Question.class, 242);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		*/
		s.close();
		
		factory.close();
	}
}
