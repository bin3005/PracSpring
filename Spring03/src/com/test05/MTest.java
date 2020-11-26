package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		Developer lee = factory.getBean("lee1", Developer.class);
		Engineer kim = factory.getBean("kim1", Engineer.class);
		
		System.out.println(lee);
		System.out.println(kim);
	}

}
