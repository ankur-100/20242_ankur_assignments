package com.sonata.Day5Assignment;

public class CurrentAccount extends Bank implements Inter1{
	CurrentAccount(int a,String b,double c)
	{
		super(a,b,c);
	}
	public double deposit(double d)
	{
		this.setAccBal(d+ this.getAccBal());
		return(this.getAccBal()+d);
	}
	public double withdraw(double d) throws BankExc
	{
		
		if(d>this.getAccBal())
		{
			throw new BankExc("Insufficient Funds");
		} 
		else
		{
			this.setAccBal(this.getAccBal()-d);
			return (this.getAccBal()-d);
		}
	}
	public void display()
	{
		System.out.println("Acc ID is " + this.getAccId() + ",Acc Name is " + this.getAccName() + ", Available Balance" + this.getAccBal());
	
	}
	

}
