package com.sonata.Day3Assignments;

public class Circle implements Shape{
	double rad,area;
	Circle(int a)
	{
		this.rad=a;
	}
	@Override
	public void area()
	{
		area=3.14*rad*rad;
		System.out.println("Area of Circle =" + area);
	}
}
