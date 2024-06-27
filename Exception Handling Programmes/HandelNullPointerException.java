package com.akshu.exception_handeling;

public class HandelNullPointerException 
{
	public void display(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		
		HandelNullPointerException h = null ;
		
		if(h == null)
		{
			h = new HandelNullPointerException();
			h.display("Akshay");
		}
		else 
		{
			h.display("chal be");
		}
		
	}
}
