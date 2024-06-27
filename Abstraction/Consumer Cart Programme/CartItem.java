package com.akshu.interface_demo;

public class CartItem  
{
	private String name;
	private double price;
	private int quantity;
	
	public CartItem(String name, double price, int quantity) 
	{
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getTotalPrice()
	{
		double totalPrice = price * quantity ;
		
		return totalPrice;
	}

	@Override
	public String toString() 
	{
		return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	public String getName() 
	{
		return name;
	}


	public double getPrice() 
	{
		return price;
	}	

}
