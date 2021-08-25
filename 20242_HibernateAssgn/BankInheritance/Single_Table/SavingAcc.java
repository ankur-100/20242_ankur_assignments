package com.sonata;

import javax.persistence.Entity;

@Entity
public class SavingAcc extends Bank{
	private double depo;


	public double getDepo() {
		return depo;
	}


	public void setDepo(double depo) {
		this.depo = depo;
	}


	public double deps()
	{
		return (this.getBal()+ depo);
	}

}
