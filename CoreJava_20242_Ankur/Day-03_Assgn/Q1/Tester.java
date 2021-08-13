package com.sonata.Day3Assignments;

public class Tester extends Employee{
	Tester(int a,String b,double c){
		super(a,b,c);
		
	}
	@Override
	public void salCal(int hra,int da)
	{
		this.empSal=0.75*hra+da+this.empSal;
	}
}
