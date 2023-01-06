package com.java.ScannerClass;

import java.util.Scanner;

public class OddEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the No: ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is EVEN");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		
		
	}

}
