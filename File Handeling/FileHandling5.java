package com.akshu.fileHandeling;
import java.io.*;
public class FileHandling5
{
     public static void main(String args[]) throws IOException
     {
			var fin = new FileInputStream("D://LOVE//Hyderabad.txt");

			var f1 = new FileOutputStream("D://LOVE\\a1.txt");  
			var f2 = new FileOutputStream("D://LOVE\\b1.txt");
			var f3 = new FileOutputStream("D://LOVE\\c1.txt"); 
			
			var bout = new ByteArrayOutputStream(); 

			try(fin; f1; f2; f3; bout)
		    {
             int i;
			while((i = fin.read()) != -1)
            {
               bout.write((byte)i); //writing tha data to ByteArrayOutputStream
            }

           bout.writeTo(f1);
           bout.writeTo(f2);
		   bout.writeTo(f3);
		   
           bout.flush();  //clear the buffer for reusing of ByteArrayOutputStream
           System.out.println("Success");
			}
			catch(IOException e)
		    {
				e.printStackTrace();
		    }
     }
}
