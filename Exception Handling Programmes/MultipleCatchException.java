package com.akshu.exception_handeling;

public class MultipleCatchException 
{
	public void multiCatch()
	{
		int a[] = new int[2];
		try
		{
			a[2] = Integer.parseInt("ASH");
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException  e)
		{
			
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) 
	{
		MultipleCatchException mc = new MultipleCatchException();
		
		mc.multiCatch();
	}

}
