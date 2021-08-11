package com.sonata;

public class Product {
	int prod_id;
	String pro_name;
	double pro_price;
	Product (int a,String pname, double pr)
	{
		this.prod_id=a;
		this.pro_name=pname;
		this.pro_price= pr;
	}
	double x;
	public double price_cal()
	{
		x =pro_price + pro_price*0.18;
		return x;
	}
	public void disp()
	{
		System.out.println(prod_id);
		System.out.println(pro_name);
		System.out.println(x);
	}

	public static void main(String[] args) {
		Product p1 = new Product(2,"Apple",375);
		p1.price_cal();
		p1.disp();
	}

}
