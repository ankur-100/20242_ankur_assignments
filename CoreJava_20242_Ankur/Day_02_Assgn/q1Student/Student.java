package com.sonata;

public class Student {
	int stdId;
	String stdName;
	int stdClass;
	Student(){};
	Student (int a,String s, int c)
	{
		this.stdId=a;
		this.stdName= s;
		this.stdClass= c;
	}
	public void display()
	{
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);
	}

}
