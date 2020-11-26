package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/ApplicationContext.xml");
		
		Emp e1 = factory.getBean("engineer", Emp.class);
		Emp e2 = factory.getBean("developer", Emp.class);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
