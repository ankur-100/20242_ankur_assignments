package com.sonata;

public class SimpleProgram {
	public static void main(String args[]) {
		
		/* Array and For loop */
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b = 10,c=21;
		/* Data Types */
		float t=86.890f,y=896.68f;
		long r=54232,u=92772;
		
		/* Arithmetic Operation*/
		System.out.println(r+u);
		System.out.println(t-y);
		System.out.println(c%b);
		
		
		for(int x: a)
		{
			System.out.println(x*b+ x -b);
		}
		
		System.out.println();
		System.out.println(c%b);
		System.out.println("This is my first Program");
	}

}
