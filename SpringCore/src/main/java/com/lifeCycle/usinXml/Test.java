package com.lifeCycle.usinXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String []args) {
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/lifeCycle/usinXml/NewC.xml");
		//Samosa s = (Samosa)con.getBean("s1");
		//System.out.println(s);
		con.registerShutdownHook();
		Example exam=(Example) con.getBean("exam");
		System.out.println(exam);
		
	}
}
