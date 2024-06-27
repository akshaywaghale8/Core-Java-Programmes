package Abstarction;

public class Shape 
{
	public Shape() {
		
	}
	
	public static Shape randshape() 
	{
		switch((int)(Math.random()*3))
		{
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			default:{
				System.out.println("default message");
				return new Shape();
			}
		}
	}
	
	public void draw()
	{
		System.out.println("shape draw");
	}
	
	public void erase()
	{
		System.out.println("shape erase");
	}
	
}
