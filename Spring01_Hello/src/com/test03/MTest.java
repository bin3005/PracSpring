package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		//기존방식
		//0.
		//Resource res = new FileSystemResource("src/com/test03/beans.xml");
		//Resource res = new ClassPathResource("com/test03/beans.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
		//사용하지 않는다.
		
		
		///1.
		ApplicationContext factory =new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//ApplicationContext: 오브젝트 생성, 관계설정, 만들어지는 방식, 자동생성등 많은 일을 한다.
		//					  BeanFactory(DI 기본사항을 제공하는 가장 단순한 컨테이너, bean을 생성하고 분배)를 상속,
		
		MessageBean bean = (MessageBean)factory.getBean("english");
		
		bean.sayHello("Spring");
		
		bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("스프링");
	}

}
