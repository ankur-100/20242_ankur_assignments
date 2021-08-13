package com.sonata.Day3Assignments;

public class Employee {
	int empId;
	String empName;
	double empSal;
	Employee(int a,String b,double c)
	{
		this.empId=a;
		this.empName=b;
		this.empSal=c;
	}
	public void salCal(int hra,int all)
	{
		this.empSal=this.empSal;
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}
}
