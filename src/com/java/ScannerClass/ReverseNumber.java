package com.java.ScannerClass;

import java.util.Scanner;

public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a, r, rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		a=sc.nextInt();
		while(a>0)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		
		System.out.println("Reverse of the No: "+rev);
		
		
	}

}
