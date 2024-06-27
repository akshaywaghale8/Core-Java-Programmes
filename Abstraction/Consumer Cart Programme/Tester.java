package com.akshu.interface_demo;

import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Supplier<CartItem> cartItem = () -> {
			
			System.out.print("Enter Item Name : ");
			String itemName = sc.next();
			
			System.out.print("Enter Item price : ");
			double itemPrice = sc.nextDouble();
			
			System.out.print("Enter Item Quantity : ");
			int itemQuantity = sc.nextInt();
			
			return new CartItem(itemName, itemPrice, itemQuantity);	
		};
		
		CartItem item1 = cartItem.get();
		CartItem item2 = cartItem.get();
		//CartItem item3 = cartItem.get();
		
		ShoppingCart cart1 = new ShoppingCart(item1);
		
		ShoppingCart cart2 = new ShoppingCart(item1);
		
		cart1.accept(item1);
		
		cart2.accept(item2);
		
		cart1.calculateDiscount(cart1);
		
		cart2.calculateDiscount(cart2);
		
		
		
		
		
	}

}
