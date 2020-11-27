package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class School {
	
	@Autowired
	@Qualifier("hong")
	private Student person;
	private int grade;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}
	
	public Student getPerson() {
		return person;
	}
	public void setPerson(Student person) {
		this.person = person;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "\tperson=" + person + ", \tgrade=" + grade;
	}
	

	
}