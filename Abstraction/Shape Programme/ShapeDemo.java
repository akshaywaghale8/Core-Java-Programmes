package Abstarction;

public class ShapeDemo
{
	public static void main(String[] args) 
	{
		Shape shape = Shape.randshape() ;
		shape.draw();
		shape.erase();
	}

}
