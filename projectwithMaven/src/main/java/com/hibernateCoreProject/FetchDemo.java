package com.hibernateCoreProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		
		


        Configuration cfg = new  Configuration();
        cfg.configure("NewHiberCfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
    //  Student student =(Student)  session.get(Student.class, 102);
      Student student =(Student)  session.load(Student.class, 102);
//      System.out.println(student.getCity());
        System.out.println(student);
        session.close();
        factory.close();
       
	}

}
