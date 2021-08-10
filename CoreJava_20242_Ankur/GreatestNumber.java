package com.sonata;

public class GreatestNumber {
	public static void main(String args[])
	{
	int a = 12;
	int b = 25;
	int c = 89;
	
	if( a>b && a>c)
	{
		System.out.println(a);
	}
	else if ( b>c && b>a)
	{
		System.out.println(b);
	}
	else
		System.out.println(c);

}
}
