package com.sonata.Inheritance;

public class Truck extends Car {
	int weight;
	Truck (int a,double b,String c,int w)
	{
		super(a,b,c);
		this.weight=w;
	}
	public double getSalePrice() {
		if(weight >2000)
		{
			return(super.getSalePrice()-0.1*regularPrice);
		}
		else
		{
			return(super.getSalePrice()-0.2*regularPrice);
		}
			
	}

}
