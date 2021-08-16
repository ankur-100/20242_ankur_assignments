package com.sonata.Day5Assignment;

public class JointAcc extends Bank implements Inter1{
	String name2;
	JointAcc(int a,String b,double c,String d)
	{
		super(a,b,c);
		this.name2=d; 
	}
	
	@Override
	public double deposit(double d)
	{
		this.setAccBal(d+ this.getAccBal());
		return(this.getAccBal()+d);
	}

	@Override
	public double withdraw(double d) throws BankExc{
		if (this.getAccBal()> d)
		{
			this.setAccBal(this.getAccBal()-d);
			return (this.getAccBal()+d);
		}
		else 
			throw new BankExc("Insufficient Fund in Joint Account");
	}
	
	public void display()
	{
		System.out.println("Acc ID is " + this.getAccId() + ",Joint Acc Name 1 is " + this.getAccName() + "Joint Acc Name 2 is "+ this.name2+ ", Available Balance" + this.getAccBal());
	
	}
}
