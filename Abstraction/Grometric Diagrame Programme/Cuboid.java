package Abstarction;

public class Cuboid extends Reactangle {
	private double height;
	
	public Cuboid()
	{
		height = 15;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double computeArea(double width, double length, double height)
	{
		
		this.height = height;
		
		area = super.computeArea(width, length);
		area = area * height; 
		return area;
	}
	
	public void show()
	{
		super.show();
		System.out.println("height = " +height);
	}

	
	

}
