package com.test06;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LGTV 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LGTV on");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV off");
		
	}

	@Override
	public void volUp() {
		System.out.println("LGTV volume on");

	}

	@Override
	public void volDown() {
		System.out.println("LGTV volume down");
		
	}

}
