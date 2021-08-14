package com.sonata.Day4Assignments;

import java.util.LinkedList;
import java.util.List;


public class EmployeeImpl implements EmployeeInt{
	List <Employee> e1 = new LinkedList<Employee>();
	
	@Override
	public void addEmployee(Employee x)
	{
		e1.add(x);
	}
	@Override
	public List<Employee> getEmployee() {
		e1.sort((Employee x1,Employee x2) -> x1.getEmpName().compareTo(x2.getEmpName()));
		
			return e1;
		}
	
	@Override
	public void deleteEmployee(Employee x)
	{
		e1.remove(x);
	}
	@Override
	public double yearSalary(Employee e1)
	{
		e1.setSal(e1.getSal()*12);
		return(e1.getSal());
	}
	@Override
	public double appSalary(Employee e1)
	{
		if (e1.getSal()<10000)
		{
			e1.setSal(e1.getSal()+5000);
			return(e1.getSal());
		}
		else
			return(e1.getSal());
		
	}
	

}
