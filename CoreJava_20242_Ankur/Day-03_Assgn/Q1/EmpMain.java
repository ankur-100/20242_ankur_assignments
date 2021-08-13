package com.sonata.Day3Assignments;

public class EmpMain {

	public static void main(String[] args) {
		Manager m1 = new Manager(12,"asdf",60000);
		m1.salCal(10000, 5000);
		m1.display();
		Developer d1 = new Developer(11,"ahdf",50000);
		d1.salCal(10000, 5000);
		d1.display();
		Tester t1 = new Tester(10,"agdf",40000);
		t1.salCal(10000, 5000);
		t1.display();

	}

}
