package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/ApplicationContext.xml");
		
		Engineer emp1 = factory.getBean("lee1", Engineer.class);
		Developer emp2 = factory.getBean("kim1", Developer.class);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
