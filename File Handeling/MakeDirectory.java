package com.akshu.fileHandeling;

import java.io.File;

public class MakeDirectory 
{
	public static void main(String[] args) throws Exception 
	{
		
		try
		{
			var file = new File("D://LOVE");
			
			if(file.exists())
			{
				System.out.println("Available");
			}
			else
			{
				if(file.mkdir())
				{
					System.out.println("made");
				}
					
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		System.out.println("Success....");
		
	}
}