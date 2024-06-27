package com.akshu.exception_handeling;

public class KeyboardResource implements AutoCloseable 
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("KeyboardResource are closed");

	}

}
