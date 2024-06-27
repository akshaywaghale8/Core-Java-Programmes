package com.akshu.exception_handeling;

public class StackOverFlowErrorDemo 
{
	public void display()
	{
		System.out.println("I am StackOverFlow ");
		display();
	}
	
	public static void main(String[] args) 
	{
		StackOverFlowErrorDemo stkof = new StackOverFlowErrorDemo();
		
		stkof.display();
	}

}
