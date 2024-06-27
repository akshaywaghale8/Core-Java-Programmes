package com.akshu.exception_handeling;



public class MyAutoClosable implements AutoCloseable
{
	
	public void display(String str)
	{
		if(str == null)
		{
			throw new RuntimeException();
		}
		else
		{
			System.out.println("Yeh, I don't have exception \n"+str);
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		MyAutoClosable m = new MyAutoClosable();
		try(m)
		{
			m.display(null);
		}

		catch(RuntimeException e)
		{
			m.display("Ash");
		}
		
	}

	@Override
	public void close() throws Exception 
	{
		// TODO Auto-generated method stub
		
	}

	

	
	

}
