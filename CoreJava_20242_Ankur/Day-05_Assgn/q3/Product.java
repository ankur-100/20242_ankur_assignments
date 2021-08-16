package com.sonata.Day5Assignmetq3;

public class Product {
	
	private int pid;
	private String pname;
	private int price;
	
	Product (int a,String b,int c)
	{
		this.pid=a;
		this.pname=b;
		this.price=c;
		
		
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

}
