package com.sonata.Day5Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class FileRead {
	public synchronized static void read()
	{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("E:\\Testing.txt"));
			System.out.println(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(br!= null)
					br.close();
			} catch(IOException ex) {
				ex.printStackTrace();
			
			}
		}
	}

	public static void main(String[] args) {
		FileRead.read();

	}

}
