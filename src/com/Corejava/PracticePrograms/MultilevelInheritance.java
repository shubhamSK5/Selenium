package com.Corejava.PracticePrograms;
class child1
{
 public void fst()
 {
	 System.out.println("singleLevel");
 }
}
 class child2 extends child1
 {
	 public void addition()
	 {
		 int a=20,b=30;
		 System.out.println(a+b);
	 }
 }

public class MultilevelInheritance extends child2{

	public static void main(String[] args) 
	{
		MultilevelInheritance m=new MultilevelInheritance();
        m.fst();
        m.addition();
        
	}

}
