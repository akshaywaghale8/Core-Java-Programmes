package Abstarction;

import java.util.Scanner;

public class Bread extends Food {
	String type;
	public Bread(double proteins, double fats,double carbs) {
		tastyScore = 8;
		type = "non-vegetarian";
		
	}

	@Override
	public void getMacroNutrients() {
		System.out.println(" A slice of bread has"+this.proteins+" gms of protein,"+this.fats+"gms of fats and"+this.carbs+"gms of carbohydrates.");
		
	}
	
	public static Food getFoodobject() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food Name : ");
		String name = sc.next();
		
		System.out.print("Enter food Type : ");
		 String type = sc.next();
		 

		 System.out.print("Enter food Microbes : ");
			double microbes = sc.nextDouble();
		
		 System.out.print("Enter food Test : ");
				double test = sc.nextDouble();
				
		return new Bread(4.0, 1.1, microbes);		
			
	}
	

}
