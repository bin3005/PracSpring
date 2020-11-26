package com.test04;

public class Developer {
	private Emp emp;
	private String dept;

	public Developer() {
		super();
	}

	public Developer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp+"\t부서 : "+dept;
	}

}
