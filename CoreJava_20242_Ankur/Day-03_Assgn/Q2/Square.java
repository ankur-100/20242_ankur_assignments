package com.sonata.Day3Assignments;

public class Square implements Shape{
	int side,area;
	Square(int a)
	{
		this.side=a;
	}
	@Override
	public void area()
	{
		area=side * side;
		System.out.println("Area of Square =" + area);
	}
}
