package com.sonata.Day4Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

class MyComparator implements Comparator<Employee>{
	public int compare(Employee x1,Employee x2) {
		if(x1.getEmpName().compareTo(x2.getEmpName())!=0)
		{
			return 0;
		}
		else
			return 1;
			
			
	}
}
public class UserEmployee {
	

	public static void main(String[] args) throws DuplicateEmployeeID{
		Employee a = new Employee(101, "Ankur", 21323);
		Employee b = new Employee(102, "Ramesh", 9223);
		Employee c = new Employee(103,"Suresh", 49223);
		Employee d = new Employee(104,"Mahesh", 7223);
		Employee e = new Employee(105,"Ganesh", 13223);
		EmployeeImpl e1 = new EmployeeImpl();
		e1.addEmployee(a);
		e1.addEmployee(b);
		e1.addEmployee(c);
		e1.addEmployee(d);
		e1.addEmployee(e);
		e1.appSalary(a);
		e1.appSalary(b);
		e1.appSalary(c);
		e1.appSalary(d);
		e1.appSalary(e);
		e1.yearSalary(a);
		e1.yearSalary(b);
		e1.yearSalary(c);
		e1.yearSalary(d);
		e1.yearSalary(e);
		System.out.println(e1.getEmployee());
		e1.deleteEmployee(a);
		e1.deleteEmployee(d);
		System.out.println(e1.getEmployee());
	}

}
