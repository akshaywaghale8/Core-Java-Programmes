package com.akshu.fileHandeling;

import java.util.Scanner;

public class CustomerMainDemo 
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			StoreCustomerObject storeCustomerObject = new StoreCustomerObject();
			
			RetrieveCustomerObject readCutomerObject = new RetrieveCustomerObject();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
				System.out.println("Success........");
		
	}

}
