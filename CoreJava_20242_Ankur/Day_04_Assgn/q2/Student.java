package com.sonata.Day4Assignments_2;

public class Student {
	int id;
	String name;
	int marks;
	int age;
	Student (int a,String b,int c,int d)
	{
		this.id=a;
		this.name=b;
		this.marks=c;
		this.age=d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	

}
