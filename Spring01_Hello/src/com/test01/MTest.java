package com.test01;

import org.springframework.context.annotation.Bean;

public class MTest {

	public static void main(String[] args) {
		MessageBean bean = new MessageBean();
		bean.sayHello("Spring");
	}

}
