package com.akshu.exception_handeling;

import java.util.Scanner;

public class InvalidAadharException extends ArithmeticException
{
	public InvalidAadharException()
	{
		
	}
	
	public InvalidAadharException(String massage)
	{
		super(massage);
	}
	
	public static void validateAdharNumber(String adharNo)
	{
		try 
		{
			if(adharNo.length() != 12)
			{
				throw new InvalidAadharException("Invalid Adhar Number");
			}
			else
			{
				System.out.println("Valid Adhar Number.");
			}
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a Adhar number: ");
		String adharNo = sc.next();
		
		validateAdharNumber(adharNo);
		
		sc.close();
		
	}

}
