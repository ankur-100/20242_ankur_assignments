package com.sonata;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(12,"Ram",4);
		Student s2 = new Student();
		s2.stdId=10;
		s2.stdName="Shyam";
		s2.stdClass=6;
		s1.display();
		s2.display();

	}

}
