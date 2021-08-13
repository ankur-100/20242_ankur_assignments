package com.sonata.Day3Assignments;

public class Developer extends Manager{
	Developer (int a,String b,double c)
	{
		super(a,b,c);
	}
	@Override
	public void salCal(int hra,int da)
	{
		this.empSal=hra+da+this.empSal;
	}
}
