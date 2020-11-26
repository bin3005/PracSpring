package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/ApplicationContext.xml");
		Emp lee = factory.getBean("lee", Emp.class);
		Emp moon = factory.getBean("moon", Emp.class);
		
		System.out.println(lee);
		System.out.println(moon);
	}
}
