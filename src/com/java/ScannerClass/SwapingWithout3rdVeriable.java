package com.java.ScannerClass;

import java.util.Scanner;

public class SwapingWithout3rdVeriable {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a: ");  //5
		a=sc.nextInt();
		System.out.println("Enter value of b: ");  //6
		b=sc.nextInt(); 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		
	}

}
