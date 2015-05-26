package com.poptrip;


public class MyFinallize 
{
	protected test myTest;
	
	public MyFinallize() 
	{
		myTest = new test(38);
		System.out.println("MyFinallize class is initializing!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyFinallize my = new MyFinallize ();
		System.out.println(my.myTest.getMyAge ());
		my = null;
		System.gc();
	}
	
	public void finalize ()
	{
		System.out.println("The deconstruct is called");
	}

}
