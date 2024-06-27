package com.akshu.exception_handeling;

import java.util.Scanner;

public class InvalidCharacerException extends Exception
{
	public InvalidCharacerException()
	{
		
	}
	
	public InvalidCharacerException(String messege)
	{
		super(messege);
	}

	public static void main(String[] args) throws InvalidCharacerException
	{
		Scanner sc = new Scanner(System.in);
		
		
		try (sc)
		{
			System.out.println("Enter Voles only:-");
			char ch = sc.next().toLowerCase().charAt(0);
			
			
				if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
				{
					System.out.print(ch);
				}
				else
				{
					throw new InvalidCharacerException("this program takes vowels only.");
				}
			
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		

	}

}
