package com.sonata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class TestStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
	
		
		/*Query q1 = sess.getNamedQuery("getStudent2.byName");
		List<Student2> stud = (List<Student2>)q1.list();
		sess.getTransaction().commit();
		sess.close();
		for(Student2 s : stud)
		{
			System.out.println(s.getStud_name());
		}*/
		
		/*Query q1 = sess.getNamedQuery("equalMarks");
		List<Student2> stud = (List<Student2>)q1.list();
		sess.getTransaction().commit();
		sess.close();
		for(Student2 s : stud)
		{
			System.out.println(s.getStud_name() + s.getStud_id());
		}*/
		
		/*Criteria criteria = sess.createCriteria(Student2.class);
		criteria.add(Restrictions.between("marks", 80, 90));
		List<Student2> st = (List<Student2>)criteria.list();
		for(Student2 u : st)
		{
			System.out.println(u.getStud_id());
			System.out.println(u.getStud_name());
		}*/
		
		Criteria criteria = sess.createCriteria(Student2.class);
		criteria.add(Restrictions.like("stud_name", "s%"));
		List<Student2> st = (List<Student2>)criteria.list();
		for(Student2 u : st)
		{
			System.out.println(u.getStud_id());
			System.out.println(u.getStud_name());
		}
		
		
		
		
		
		
	}

}
