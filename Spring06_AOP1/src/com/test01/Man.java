package com.test01;

public class Man {
	public void classWork() {
		System.out.println("출석카드를 찍는다.");
		
		try {
			System.out.println("컴퓨터를 켜서 한컴타자연습을 한다.");
		} catch (Exception e) {
			System.out.println("쉬는 날이었다.");
			e.printStackTrace();
		}finally {
			System.out.println("집에간다.");
		}
	}
}
