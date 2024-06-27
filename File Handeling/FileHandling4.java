package com.akshu.fileHandeling;
import java.io.*;
public class FileHandling4
{
     public static void main(String args[]) throws IOException
     {
         var f1 = new FileInputStream("D:\\LOVE\\Hyderabad.txt");
         var f2 = new FileInputStream("D:\\LOVE\\Hyderabad.txt");

         var s = new SequenceInputStream(f1,f2);

		 try(f1; f2; s)
		 {
         int i;
         while(true)
		 {
			  i = s.read();
			   if(i==-1)
				  break;
			  System.out.print((char)i);		 
		 }     
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
     } 
}
