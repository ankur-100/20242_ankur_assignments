package com.sonata.Day5Assignmetq3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class ProductMain {
	public static List<Product> prod_filter() {
		return ProductDB.getProduct().stream().filter(prod -> prod.getPid()>20).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List <Product> products = ProductDB.getProduct();
		
		System.out.println("Sort Ascending order of price: ");
		products
		.stream()
		.sorted((o1,o2) -> (int)(o1.getPrice()-o2.getPrice()))
		.forEach(System.out::println);
		
		
		System.out.println("Sort Descending order of price:");
		products
		.stream()
		.sorted((o1,o2) -> (int)(o2.getPrice()-o1.getPrice()))
		.forEach(System.out::println);
		
		System.out.println("Products Filtered by ID:" + prod_filter());
		
		Product max = products.stream().max((p1,p2) -> (int)(p1.getPrice()-p2.getPrice())).get();
		System.out.println("Product having Maximum price: " + max.toString());

	}

}
