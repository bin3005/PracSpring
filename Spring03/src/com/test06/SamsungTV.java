package com.test06;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("삼성티비 생성");
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
		System.out.println("samsungTv vol up");
	}

	@Override
	public void volDown() {
		System.out.println("samsungTV vol Down");
	}

}
