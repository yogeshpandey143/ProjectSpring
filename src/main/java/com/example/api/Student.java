package com.example.api;

public class Student {

	
	 private String  name;
	 private int age;
	 private double marks;
	 
	 
	 
	 
	 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	 
	 
	 
	
}
