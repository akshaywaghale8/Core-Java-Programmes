package com.akshu.fileHandeling;
import java.io.*;
public class FileHandling3
{
     public static void main(String s[]) throws IOException
     {         
		var fin = new FileInputStream("D:\\LOVE\\Hyderabad.txt");

		 try(fin)
		 {
			 int i = 0;
             while(true)
			 {
				 i = fin.read();
				 if(i==-1)
					 break;
				 System.out.print((char)i);
			 }

		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println();
     }
}
