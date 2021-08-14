package com.sonata.Day4Assignments_2;

import java.util.ArrayList;
import java.util.List;
public class StudentMain {

	public static void main(String[] args) {
		List <Student> s1 = new ArrayList<Student>();
		s1.add(new Student(1,"Ankur",93,21));
		s1.add(new Student(2,"Ram",90,23));
		s1.add(new Student(3,"Jon",85,24));
		s1.add(new Student(4,"Fred",98,21));
		s1.add(new Student(5,"Shyam",80,20));
		
		//lambda sorting by marks
		s1.sort((Student x1,Student x2)-> x2.getMarks()-x1.getMarks());
		System.out.println("After sorting by Marks" + s1);
		
		//lambda sorting by age
		s1.sort((Student t1,Student t2) -> t2.getAge()-t1.getAge());
		System.out.println("After sorting by age" + s1);
		
		//lambda sorting by student name using compareto
		s1.sort((Student q1,Student q2) -> q2.getName().compareTo(q1.getName()));
		System.out.println("After sorting by Name" + s1);
		
		//lambda sorting by ID
		s1.sort((Student t1,Student t2) -> t2.getId()-t1.getId());
		System.out.println("After sorting by ID Number" + s1);
		
	}

}
