package com.usingcons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext con=	new ClassPathXmlApplicationContext("com/usingcons/NewC.xml");
	Person p = (Person) con.getBean("person");
	
	System.out.println(p);
	Adition ad = (Adition) con.getBean("add");
	
	ad.doSum();
	
	}

}