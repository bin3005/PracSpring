package com.edu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.entity.Shape;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/edu/main/applicationContext.xml");
		
		Shape rect = factory.getBean("rectangle", Shape.class);
		Shape tri = factory.getBean("triangle", Shape.class);
		
		rect.viewSize();
		tri.viewSize();
	}

}
