package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainPizza {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		p1.setPizzaId(1);
		p1.setPizzaName("Margerhita");
		
		Customer2 c1 = new Customer2();
		c1.setCus_name("ABC");
		c1.setCus_address("MG Road");
		c1.setCus_mobl(2873283);
		
		Order o1 = new Order();
		o1.setOrder_id(2);
		o1.setOrder_desc("2 x Margerhita");
		
		Payment q1 = new Payment();
		q1.setPay_amt(500);
		q1.setOrd(o1);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(c1);
		s1.save(q1);
		s1.getTransaction().commit();
		
		s1.close();
		
		

	}

}
