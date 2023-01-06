package com.Corejava.PracticePrograms;

import java.util.Scanner;

public class ScannerClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the No");
		int f=sc.nextInt();
		int sum=0;
		while(f>0)
		{
		   sum=sum+f%10;
		   f=f/10;
		}
		System.out.println("sun of digits= "+sum);
	}

}
