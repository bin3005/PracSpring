package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/ApplicationContext.xml");
		AbstractTest today = factory.getBean("singleton", AbstractTest.class);
		System.out.println("오늘은 "+today.dayInfo()+"입니다.");
	}
}
