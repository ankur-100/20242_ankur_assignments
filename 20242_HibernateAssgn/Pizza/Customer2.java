package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer2 {
	@Id
	private int cust_id;
	private String cus_name;
	private String cus_address;
	private double cus_mobl;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getCus_address() {
		return cus_address;
	}
	public void setCus_address(String cus_address) {
		this.cus_address = cus_address;
	}
	public double getCus_mobl() {
		return cus_mobl;
	}
	public void setCus_mobl(double cus_mobl) {
		this.cus_mobl = cus_mobl;
	}
	

}
