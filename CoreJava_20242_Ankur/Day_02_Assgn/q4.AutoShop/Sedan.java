package com.sonata.Inheritance;

public class Sedan extends Car {
	int length;

	Sedan (int a,double b,String c,int len)
	{
		super(a,b,c);
		this.length=len;
	}
	public double getSalePrice() {
		if(length>20)
		{
			return(super.getSalePrice()-0.05*regularPrice);
		}
		else
		{
			return(super.getSalePrice()-0.1*regularPrice);
		}
			
	}

}
