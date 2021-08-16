package com.sonata.Day5Assignment;

public class BankMain {

	public static void main(String[] args) throws BankExc {
		SavingAccount s1 = new SavingAccount(1231,"Ankur",75000);
		s1.withdraw(50000);
		s1.display();
		
		CurrentAccount c1 = new CurrentAccount(1223,"xyz",55000);
		c1.deposit(15000);
		c1.withdraw(4000);
		c1.display();
		
		JointAcc j1 = new JointAcc(1224,"abc",90000,"def");
		j1.deposit(20000);
		j1.withdraw(91000);
		j1.display();
	}
 
}
