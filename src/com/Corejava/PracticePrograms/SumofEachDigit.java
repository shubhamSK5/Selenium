package com.Corejava.PracticePrograms;

public class SumofEachDigit {

	public static void main(String[] args) 
	{
		int i=879;
		int sum=0;
		while(i>0)
		{
			sum=sum+i%10;
			i=i/10;	
		}
		
		System.out.println(i);
		System.out.println(sum);
		
	}

}