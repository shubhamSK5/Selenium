package com.Corejava.PracticePrograms;

public class Parent {
	public void method()
	{
		System.out.println("public method calling");
	}
	protected void method2()
	{
		System.out.println("protected method calling");
	}
	void method3()
	{
		System.out.println("default method calling");
	}
	private void method4()
	{
		System.out.println("private method calling");
	}
	public static void main(String[] args) 
	{
		Parent p= new Parent();
		p.method();
		p.method2();
		p.method3();
		p.method4();
	}

}
