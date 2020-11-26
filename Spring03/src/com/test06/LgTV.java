package com.test06;

public class LgTV implements TV {

	public LgTV() {
		System.out.println("LgTv 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("lgTV on");
	}

	@Override
	public void powerOff() {
	
		System.out.println("lgTv off");
	}

	@Override
	public void volUp() {
		System.out.println("lgTv vol up");
	}

	@Override
	public void volDown() {
		System.out.println("LGtv vol down");
	}

}
