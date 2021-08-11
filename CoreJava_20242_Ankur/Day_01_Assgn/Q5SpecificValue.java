package com.sonata;

public class SpecificValue {
	public static void main(String args[])
	{
		int a[]= {3,4,3,2,7,8,24,43};
		int  x= 43;
		boolean b=false;
		for(int y: a)
		{
			if(x==y)
			{
				b=true;
				break;
			}
		}
		System.out.println(b);
		
	}

}
