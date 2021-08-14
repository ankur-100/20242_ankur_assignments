package com.sonata.Day4Assignments;

public class Employee {
	private int eId;
	private String empName;
	private int Annsal;
	
	Employee (int a,String b,int c){
		this.eId=a;
		this.empName=b;
		this.Annsal=c;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return Annsal;
	}
	public void setSal(int sal) {
		this.Annsal = sal;
	}
	@Override
	public String toString() {
		return "Employee [Employee ID=" + eId + ", Name=" + empName + ", Annual Salary=" + Annsal + "]";
	}
	
	

}
