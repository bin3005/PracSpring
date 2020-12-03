package com.test04;

public class Woman implements Person {

	@Override
	public String classWork() {
		System.out.println("컴퓨터를 켜서 뉴스를 본다.");
		return "스프링";
	}
	
}
