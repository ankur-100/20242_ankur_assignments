package com.sonata.Day3Assignments;

public class CustomExc{
	int empId;
	String empName;
	double empSal;
	CustomExc(int a,String b,double c)
	{
		this.empId=a;
		this.empName=b;
		this.empSal=c;
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(empName);
	}

	public static void main(String[] args) throws MyException{
		CustomExc c1 = new CustomExc(10,"AQZ",15000);
		if(c1.empSal*12 < 100000)
			throw new MyException ("Annual Salary <100000");
		else
			System.out.println(c1.empSal + ",AnnSal=" + c1.empSal*12);
		CustomExc c2 = new CustomExc(10,"AQZ",8000);
		if(c2.empSal*12 < 100000)
			throw new MyException ("Annual Salary <100000");
		else
			System.out.println(c2.empSal + ",AnnSal=" + c2.empSal*12);

	}

}
