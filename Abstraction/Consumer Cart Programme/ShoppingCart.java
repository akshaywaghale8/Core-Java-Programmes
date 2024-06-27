package com.akshu.interface_demo;

public class ShoppingCart implements Consumer
{
	private CartItem cartItems;
	
	public ShoppingCart()
	{
		
	}
	
	
	public CartItem getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItem cartItems) {
		this.cartItems = cartItems;
	}


	public ShoppingCart(CartItem items) 
	{
		super();
		this.cartItems = items;
	}
	
	public void addToCart(CartItem item)
	{
		this.cartItems = item ;	
	}


	@Override
	public String toString() 
	{
		return "ShoppingCart [items=" + cartItems + "]";
	}

	@Override
	public double calculateDiscount(ShoppingCart sc) 
	{
		//try {
			if(sc.cartItems.getPrice()>1000000 )
			{
				System.out.println("You Get 10% off");
				System.out.println("New Parice is "+(cartItems.getTotalPrice()*0.9));
				return ( cartItems.getTotalPrice() * 0.1);
			}
			else 
			{
				System.out.println("You got No Disscount");
				return 0;
			}
		//}
		
		/* finally {
			System.out.println("your cart is empty");
		}
		*/
	}

	@Override
	public void accept(CartItem sc) 
	{
		System.out.println(sc.getName() +" Added to cart.");
	}

}
