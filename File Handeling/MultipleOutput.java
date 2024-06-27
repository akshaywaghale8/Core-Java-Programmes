package com.akshu.fileHandeling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class MultipleOutput 
{

	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fout1 = new FileOutputStream("D://LOVE//a1.txt");
		
		FileOutputStream fout2 = new FileOutputStream("D://LOVE//a2.txt");
		
		FileOutputStream fout3 = new FileOutputStream("D://LOVE//a3.txt");
		 
		ByteArrayOutputStream bArrayOut = new ByteArrayOutputStream();
		
		try(fout1; fout2 ;fout3 ; bArrayOut)
		{
			String str =  "Today Sun Shinning feeling Like a Heaven";
			byte[] b = str.getBytes();
			bArrayOut.write(b);
			
			bArrayOut.writeTo(fout1);
			bArrayOut.writeTo(fout1);
			bArrayOut.writeTo(fout1);
			
			bArrayOut.flush();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
		System.out.println("Success........");
	}

}
