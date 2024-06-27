package Abstarction;

public class FoodDemo
{
	public static void main(String[] args) 
	{
		Food bread = Bread.getFoodobject();
		
		Food egg = Egg.getFoodobject();
		
		bread.getMacroNutrients();
		
		egg.getMacroNutrients();
	}
}