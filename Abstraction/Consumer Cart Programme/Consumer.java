package com.akshu.interface_demo;

public interface Consumer 
{
	double calculateDiscount(ShoppingCart sc);
	void accept(CartItem sc);
}
