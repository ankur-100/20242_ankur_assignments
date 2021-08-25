package com.sonata;

import javax.persistence.Entity;

@Entity
public class CurrentAcc extends Bank{
	
	private double deposit;
	private double withdraw;
	

	

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double deps(double dep)
	{
		return (this.getBal()+ dep);
	}
	
	public double withdraw()
	{
		return (this.getBal() - withdraw);
	}

}
