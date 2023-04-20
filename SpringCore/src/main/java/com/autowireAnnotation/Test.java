package com.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext con =	new ClassPathXmlApplicationContext("com/autowireAnnotation/NewC.xml");
	
	Emp em = con.getBean("emp1", Emp.class);
	System.out.println(em);
	}

}
