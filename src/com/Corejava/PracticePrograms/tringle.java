package com.Corejava.PracticePrograms;
//rows=5. stars= 5, spaces=5
public class tringle 
{	
		public static void main (String []args)
		{
			for(int row=1; row<=5; row++)
			{
				for(int space=5; space>=row; space--)
				{
					System.out.print(" ");
				}
				for(int star=1; star<=row; star++)
		 		{
		 			System.out.print("*");
		 		}
		 		
		 		System.out.println();
			}
			System.out.println();
			
		}



}
