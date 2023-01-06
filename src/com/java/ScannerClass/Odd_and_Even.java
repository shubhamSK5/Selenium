package com.java.ScannerClass;

import java.util.Scanner;

public class Odd_and_Even {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		
		
	}

}
