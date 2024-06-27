package com.akshu.fileHandeling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class RetrieveCustomerObject implements Serializable
{
	public RetrieveCustomerObject() throws Exception
	{
		FileInputStream fin = new FileInputStream("D://LOVE//CustomerObject.txt");
		
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		try(fin ; oin)
		{
			while(true)
			{
				System.out.println(oin.readObject()); 
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
