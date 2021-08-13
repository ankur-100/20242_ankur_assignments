package com.sonata.Day3Assignments;

public class UsingPeople {

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setDoorno(10);
		a1.setStreet("Central Street");
		a1.setCity("New Delhi");
		a1.setPin(100101);
		TechnicalEmployee t1 = new TechnicalEmployee();
		t1.setEmpID(169);
		t1.setEmpName("alks");
		t1.setTechskill("Java");
		t1.setBasic(10000);
		t1.calculateSalary();
		System.out.println(t1);
		System.out.println(a1);
		
		Address a2 = new Address();
		a2.setDoorno(10);
		a2.setStreet("Richard's Street");
		a2.setCity("Delhi");
		a2.setPin(100021);
		Staff s1 = new Staff();
		s1.setEmpID(146);
		s1.setEmpName("aqxz");
		s1.setTitle("Security");
		s1.setBasic(9000);
		s1.calculateSalary();
		System.out.println(s1);
		System.out.println(a2);
	}

}
