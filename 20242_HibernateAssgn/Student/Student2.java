package com.sonata;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
//@NamedNativeQuery(name = "getStudent2.byName", query = "Select * from Student2 order by marks desc limit 1", resultClass = Student2.class)
@NamedNativeQuery(name = "equalMarks", query = "Select a.*,b.* from Student2 a ,Student2 b WHERE a.stud_id <> b.stud_id and a.marks=b.marks", resultClass = Student2.class)
public class Student2 {
	@Id
	private int stud_id;
	private String stud_name;
	private int marks;
	
	@Embedded
	public School_Details sch;
	
	public School_Details getSch() {
		return sch;
	}
	public void setSch(School_Details sch) {
		this.sch = sch;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
