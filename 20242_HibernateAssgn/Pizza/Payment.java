package com.sonata;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private int pay_amt;
	
	@Embedded
	public Order ord;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getPay_amt() {
		return pay_amt;
	}

	public void setPay_amt(int pay_amt) {
		this.pay_amt = pay_amt;
	}

	public Order getOrd() {
		return ord;
	}

	public void setOrd(Order ord) {
		this.ord = ord;
	}
	
	

}
