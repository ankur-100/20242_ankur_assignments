package com.sonata.Day5Assignment;

public class SavingAccount extends Bank implements Inter1{
	SavingAccount (int a,String b,double c)
	{
		super(a,b,c);
	} 
	
	@Override
	public double deposit(double d)
	{
		this.setAccBal(d+ this.getAccBal());
		return (this.getAccBal()+d);
	}
	
	@Override
	public double withdraw(double e) throws BankExc
	{
		if(e<this.getAccBal())
		{
			this.setAccBal(this.getAccBal()-e);
			return (this.getAccBal()-e);
		}
		else
			throw new BankExc("Insufficient Funds");
	}
	public void display()
	{
		System.out.println("Acc ID is " + this.getAccId() + ",Acc Name is " + this.getAccName() + ", Available Balance" + this.getAccBal());
	}

}
