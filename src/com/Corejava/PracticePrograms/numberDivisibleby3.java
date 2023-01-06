package com.Corejava.PracticePrograms;

import java.util.Date;

public class numberDivisibleby3 {

	public static void main(String[] args)
	{
      Date d= new Date();
      System.out.println(d);
      
      for (int i=1; i<=100; i++)
      {
    	  
    	   if (i%3==0 )
    	   {
    		   System.out.println(i);
    	   }
    	   if (i%9==0)
    	   {
    		   System.out.println(i);
    	   }
      }
	}

}
