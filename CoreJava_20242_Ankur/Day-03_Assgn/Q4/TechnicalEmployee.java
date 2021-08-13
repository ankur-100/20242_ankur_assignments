package com.sonata.Day3Assignments;

public class TechnicalEmployee extends EmployeeAbst{
	private String techskill;
	private double sal;
	Address obj;
	public String getTechskill() {
		return techskill;
	}

	public void setTechskill(String techskill) {
		this.techskill = techskill;
	}
	@Override
	public double calculateSalary()
	{
		sal= basic+0.12*basic;
		return sal;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [techskill=" + techskill + ", sal=" + sal + ", obj=" + obj + ", empID=" + empID
				+ ", empName=" + empName + "]";
	}

	

}
