package com.sonata.Day3Assignments;

public class Triangle implements Shape{
	double h,b,area;
	Triangle(int a,int b)
	{
		this.h=a;
		this.b=b;
	}
	@Override
	public void area()
	{
		area=0.5*b*h;
		System.out.println("Area of Triangle =" + area);
	}
	
}
