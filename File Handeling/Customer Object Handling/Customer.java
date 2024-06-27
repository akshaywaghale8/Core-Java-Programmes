package com.akshu.fileHandeling;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable
{
	private Integer customerId;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerId, String customerName, Double customerBill) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	public static Customer getCustomerObject()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer Id: ");
		Integer customerId = sc.nextInt();
		
		System.out.print("Enter Customer Name: ");
		String customerName = sc.nextLine();
		customerName = sc.nextLine();
		
		System.out.print("Enter Customer Bill: ");
		Double customerBill = sc.nextDouble();
		
		return new Customer(customerId, customerName, customerBill);
		
	}

	public void setCustomerId(Integer customerId) 
	{
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public void setCustomerBill(Double customerBill) 
	{
		this.customerBill = customerBill;
	}

	public Integer getCustomerId() 
	{
		return customerId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public Double getCustomerBill() 
	{
		return customerBill;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
}
