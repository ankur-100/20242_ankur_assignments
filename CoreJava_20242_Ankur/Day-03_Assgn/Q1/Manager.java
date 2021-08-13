package com.sonata.Day3Assignments;

public class Manager extends Employee{
	Manager (int a,String b,double c)
	{
		super(a,b,c);
	}
	@Override
	public void salCal(int hra,int all)
	{
		this.empSal=hra+1.5*all+this.empSal;
	}

}
