package com.akshu.exception_handeling;

import java.util.Scanner;

class Bank
{
	int balance;
	
	public Bank(int balance)
	{
		this.balance = balance;
	}
	
	public  void withdraw(int amount) throws Exception 
	{
		
			if(amount > balance)
			{
				throw new LowBalanceException("Insuffient Balance To Withdraw");
			}
			else 
			{
				balance -= amount;
				System.out.println("RS."+amount+ " Withdraw from your bank");
			}
	}
	
	public void checkBalance()
	{
		System.out.println("Available Balnace : RS."+balance);
		
	}
	
}
public class LowBalanceException extends Exception
{
	public LowBalanceException()
	{
		
	}
	
	public LowBalanceException(String messege)
	{
		super(messege);
	}
	
	

	public static void main(String[] args) throws Exception 
	{
		Bank b1 = new Bank(10000);
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter amount to withdraw: ");
			int amount = sc.nextInt();
			b1.withdraw(amount);
			b1.checkBalance();
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
			
		}
		

	}

}
