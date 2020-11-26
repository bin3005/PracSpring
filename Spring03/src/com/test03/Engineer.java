package com.test03;



public class Engineer extends Emp{
	private String dept;

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t부서: "+dept;
	}
	
	
}
