package com.sonata.Day5Assignmetq3;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
	public static List<Product>getProduct () {
		List<Product> l1 = new ArrayList();
		l1.add(new Product(12,"prd1",250));
		l1.add(new Product(14,"prd1",550));
		l1.add(new Product(24,"prd1",1200));
		l1.add(new Product(19,"prd1",800));
		l1.add(new Product(47,"prd1",120));
		return l1;
		
	}

}
