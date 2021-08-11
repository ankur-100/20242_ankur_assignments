package com.sonata.Inheritance;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s1 = new Sedan(150,1250000,"White",21);
		System.out.println("Sale Price of sedan is " +s1.getSalePrice());
		Ford f1 = new Ford(120,550000,"Black",2010,50000);
		System.out.println("Sale Price of ford f1 is " +f1.getSalePrice());
		Ford f2 = new Ford(100,375000,"Silver",2006,35000);
		System.out.println("Sale Price of ford f2 is "+f2.getSalePrice());
		Car c1 = new Car(170,1450000,"Red");
		System.out.println("Sale Price of car is "+c1.getSalePrice());
		
		

	}

}
