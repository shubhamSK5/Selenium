package com.java.ScannerClass;

import java.util.Scanner;

public class Reverse_num {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int b,e,re=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		b=sc.nextInt();
		while(b>0)
		{
			e=b%10;
			re=re*10+e;
			b=b/10;
		}
		System.out.println("Reverse of the no= "+re);
		
	}

}
