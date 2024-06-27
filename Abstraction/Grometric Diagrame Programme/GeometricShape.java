package Abstarction;

public class GeometricShape 
{
	protected String shapeType;
	protected double area;
	
	public GeometricShape() {
	
		shapeType = "Reactangle";
		area = 0;
	}
	
	public double computeArea(double value1, double value2)
	{
		return area;
	}
	
	public void show()
	{
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "GeometricShape [shapeType=" + shapeType + ", area=" + area + "]";
	}
	
}
