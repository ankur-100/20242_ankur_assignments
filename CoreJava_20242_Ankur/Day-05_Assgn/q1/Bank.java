package com.sonata.Day5Assignment;

public class Bank {
	private int AccId;
	private String AccName;
	private double AccBal;
	
	Bank (int a,String b,double c)
	{
		this.AccId=a;
		this.AccName=b;
		this.AccBal=c;
		
	}
	public int getAccId() {
		return AccId;
	}
	public void setAccId(int accId) {
		AccId = accId;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getAccBal() {
		return AccBal;
	}
	public void setAccBal(double accBal) {
		AccBal = accBal;
	}
	
	

}
