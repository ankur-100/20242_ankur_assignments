package com.sonata.Day3Assignments;

public class Staff extends EmployeeAbst{
	private String title;
	private double sal;
	Address obj1;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public double calculateSalary()
	{
		sal= basic+0.18*basic;
		return sal;
	}
	@Override
	public String toString() {
		return "Staff [title=" + title + ", sal=" + sal + ", obj=" + obj + ", empID=" + empID + ", empName=" + empName
				+ "]";
	}
	public void disp()
	{
	System.out.println(obj1);
	}
	
	
	

}
