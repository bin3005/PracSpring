package com.test06;

import org.springframework.stereotype.Component;

import com.test06.Person;

@Component
public class Woman implements Person{
	@Override
	public void classWork() {
		System.out.println("컴퓨터를 켜서 뉴스롤 본다.");
	}
}
