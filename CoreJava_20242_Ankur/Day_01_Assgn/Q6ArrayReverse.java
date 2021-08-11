package com.sonata;

public class ArrayReverse {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= new int[9];
		for(int i=0;i<a.length;i++)
		{
			b[a.length-i-1]= a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+ " ");
		}
		
	}
}
