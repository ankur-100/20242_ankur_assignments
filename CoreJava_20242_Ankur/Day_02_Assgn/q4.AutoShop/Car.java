package com.sonata.Inheritance;

public class Car {
	int speed;
	double regularPrice;
	String color;
	
	public double getSalePrice()
	{
		return(regularPrice);
	}
	Car (int s,double rp, String clr)
	{
		this.speed =s;
		this.regularPrice= rp;
		this.color = clr;
	}

}
