package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankMain {

	public static void main(String[] args) {
		
		CurrentAcc c1 = new CurrentAcc();
		c1.setAccId(1);
		c1.setAccName("ABCD");
		c1.setBal(20000);
		c1.setWithdraw(5000);
		c1.setDeposit(6000);
		
		SavingAcc s1 = new SavingAcc();
		s1.setAccId(2);
		s1.setAccName("XSER");
		s1.setBal(25000);
		s1.setDepo(7000);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session a1 = factory.openSession();
		a1.beginTransaction();
		a1.save(c1);
		a1.save(s1);
		a1.getTransaction().commit();
		a1.close();

	}

}
