package com.sonata;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.Empid = 123;
		e1.Empname = "adam";
		e1.empsal= 3242.24;
		e1.display();
		Employee e2 = new Employee();
		e2 = e1;
		e2.display();

	}

}
