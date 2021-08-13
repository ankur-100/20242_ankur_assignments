package com.sonata.Day3Assignments;

public class Rectangle implements Shape{
	int len,width,area;
	Rectangle(int a,int b)
	{
		this.len=a;
		this.width=b;
	}
	@Override
	public void area()
	{
		area=len*width;
		System.out.println("Area of Rectangle =" + area);
	}
	

}
