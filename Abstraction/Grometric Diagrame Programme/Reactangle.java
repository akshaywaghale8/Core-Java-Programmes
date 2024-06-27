package Abstarction;

public class Reactangle extends GeometricShape 
{
	private double width;
	private double length;
	
	public Reactangle () {
		width =10;
		length =10;
	}
	
	public double computeArea(double width, double length)
	{
		this.width = width;
		this.length =length;
		area = length * width;
		return area;
	}

	public void show()
	{
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Reactangle [width=" + width + ", length=" + length + " Area of reactangle = " +area+ "]";
	}
	
	

}
