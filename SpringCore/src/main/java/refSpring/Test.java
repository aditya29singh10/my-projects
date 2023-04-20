package refSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("refSpring/NewRef.xml");
		
	/*	B temp =(B) context.getBean("bref");
		System.out.println(temp.getY());
	*/
		
		A temp = (A) context.getBean("ref1");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
	}

}
