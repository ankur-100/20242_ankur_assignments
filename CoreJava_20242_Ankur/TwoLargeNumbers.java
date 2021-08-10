package com.sonata;

public class TwoLargeNumbers {
	public static void main(String args[])
	{
		int a[] = {1,2,3,3,13,4,9,3,1,6,3,6,3,2,7,2,7,4,1,2,13,13,9,9};
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
		System.out.println(a[0]);
		int y=1;
		while(a[y]==a[y-1])
		{
			y++;
		}
		System.out.println(a[y]);
	}

}
