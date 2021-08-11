package com.sonata.Inheritance;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;
	Ford (int a, double b, String c,int yr, int mfdsc)
	{
		super(a,b,c);
		this.year=yr;
		this.manufacturerDiscount= mfdsc;
		
	}
	public double getSalePrice()
	{
		return(super.getSalePrice()-manufacturerDiscount);
	}

}
