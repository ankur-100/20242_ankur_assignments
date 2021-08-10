package com.sonata;

public class DuplicateValues {
	public static void main(String args[])
	{
		int a[]= {1,2,3,3,13,4,9,3,1,6,3,6,3,2,7,2,7,4,1,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[j]>a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
					
			}
		}
		int ctr=0;
		int t_ctr=0;
		for(int k=0;k<a.length-1;k++)
		{
			while(a[k+1]==a[k] && k!= a.length-2)
			{
				t_ctr++;
				k++;
			}
			if(t_ctr>0)
				System.out.println("Duplicate values present for " + a[k] + " in array.");
		}
		
		
	}

}
