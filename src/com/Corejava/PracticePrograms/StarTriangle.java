package com.Corejava.PracticePrograms;
//     *
//    **
//   ***
//  ****
// *****
//******
// row=6,space=6 star=6;

import java.util.Date;

public class StarTriangle {
	public static void main(String[] args) 
	{
		
		Date d= new Date();
	    System.out.println(d);
	 	for(int row=1; row<=6; row++)
	 	{
	 		for(int space=6; space>=row; space--)
	 		{
	 			System.out.print(" ");
	 		}
	 		for(int star=1; star<=row; star++)
	 		{
	 			System.out.print("*");
	 		}
	 		System.out.println();
	 	}
	}

}
