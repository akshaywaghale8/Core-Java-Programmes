package com.akshu.fileHandeling;

import java.io.*;
import java.io.Serializable;
import java.util.Scanner;

public class StoreCustomerObject implements Serializable 
{
	public StoreCustomerObject() throws Exception
	{

		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fout = new FileOutputStream("D://LOVE//CustomerObject.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		
		//BufferedOutputStream bout = new BufferedOutputStream(oos);
		
		try(sc ; oos ; fout )
		{
			System.out.print("How many Customer you Want to store:");
			int numberOfCustomer = sc.nextInt();
			
			for(int i=1 ; i <= numberOfCustomer ; i++ )
			{
				var customerObject = (Customer)Customer.getCustomerObject();
				 
				oos.writeObject(customerObject);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
