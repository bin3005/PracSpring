package com.test06;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("samsungTV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("samsungTV on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsungTV off");
	}

	@Override
	public void volUp() {
		System.out.println("samsungTV volume up");
	}

	@Override
	public void volDown() {
		System.out.println("samsungTV volume down");

	}

}
