package com.akshu.fileHandeling;

import java.io.*;  
public class FileHandling1 
	{
		public static void main(String[] args) 
		{
			try 
				{
					File f = new File("D:\\LOVE\\India.txt");

                    if(f.exists())
					{
						System.out.println("File is existing");
					}
					else
					{
						System.out.println("File is not existing");
					}

					if (f.createNewFile())
					   {
						 System.out.println("File created: " + f.getName());
                       }
					   else  
						{
                             System.out.println("File is already existing....");
                         }								  
                  }
				  catch (IOException e)
                 {
					System.err.println(e);
				} 
		}
}

