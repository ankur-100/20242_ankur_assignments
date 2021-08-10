package com.sonata;

public class ReplaceVowels {
	public static void main(String args[])
	{
		String s= "I live in India";
		String t= s.toLowerCase();
		char ch[]= t.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]== 'e' || ch[i]=='o' || ch[i]== 'i' || ch[i]== 'u')
			{
				ch[i]= '$';
			}
		}
		System.out.println(ch);
		
	}

}
