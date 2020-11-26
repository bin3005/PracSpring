package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/Beans.xml");
		
		Developer lee = factory.getBean("leeys", Developer.class);
		Engineer kim = factory.getBean("kimhs", Engineer.class);
		
		System.out.println(lee);
		System.out.println(kim);
		
	}
}
