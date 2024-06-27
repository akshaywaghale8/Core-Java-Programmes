package com.akshu.exception_handeling;

public class ExceptionDemo 
{
	 public void checkExceptionArithmetic()
	{
		try 
		{
			int num1 = 30 ;
			int num2 = 0 ;
			int operation = num1 / num2 ;
			
		System.out.println("result : "+operation);	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You shouldn't deivide a number by zero");
		}
	}
	
	public void checkExceptionArray()
	{
		try
		{
			int a[] = new int[50];
			a[51] = 20 ;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds");
		}
	}
	
	public void checkExceptionNumberFormat()
	{
		try
		{
			int num = Integer.parseInt("xyz");
			System.out.println(num);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception Occured");
		}
	}
	
	public void checkExceptionString()
	{
		try
		{
			String str = "Hello World";
			
			System.out.println(str.length());
			
			char c = str.charAt(0);
			
			c = str.charAt(40);
			
			System.out.println(c);
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index Out Of bound Exception !");
		}
	}
	
	public void checkExceptionNullPointer()
	{
		try
		{
			String str = null ;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception ");
		}
	}
	

	
	public static void main(String[] args) 
	{
		ExceptionDemo ed =new ExceptionDemo();
		
		ed.checkExceptionArithmetic();
		
		ed.checkExceptionArray();
		
		ed.checkExceptionNumberFormat();
		
		ed.checkExceptionString();
		
		ed.checkExceptionNullPointer();
	}
	
}
