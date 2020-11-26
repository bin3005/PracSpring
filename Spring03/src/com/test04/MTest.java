package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/ApplicationContext.xml");
		Developer leesh = factory.getBean("leesh", Developer.class);
		Engineer kimdh = factory.getBean("kimdh", Engineer.class);
		
		System.out.println(leesh);
		System.out.println(kimdh);
	}
}
