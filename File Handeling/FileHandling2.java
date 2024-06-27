package com.akshu.fileHandeling;

import java.io.*;

public class FileHandling2
{
     public static void main(String args[]) throws IOException
     {
		var fout = new FileOutputStream("D:\\LOVE\\Hyderabad.txt");
        try(fout)
         {
         String s = "Hyd is a popular IT City in India";
		 byte b[] = s.getBytes();

		 fout.write(b);

		 System.out.println("Success....");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
     }
}
