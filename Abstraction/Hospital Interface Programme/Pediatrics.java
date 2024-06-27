package com.akshu.interface_demo;

public class Pediatrics implements HospitalInterface 
{
	private final double billamount = 60000;
		
		
		public double getBillamount() {
			return billamount;
		}
	
	@Override
	public void admitPatient(String patientName, Address address) 
	{
		System.out.println("Patient is Added into "+this.getClass());
		
	}

	@Override
	public void provideTreatment(String patientName) 
	{
		System.out.println(patientName+" is Treated for the "+this.getClass()+" Dieases");
	}

	@Override
	public void generateBill(String patientName, double amount) 
	{
		if(amount <  60000)
		{
			System.out.println("Please Pay the reamining amount of Rs. "+(60000-amount));
		}
		else if(amount > 60000)
		{
			System.out.println("Please Collect the reamining amount of Rs. "+(amount - 60000));
		}
		else 
		{
			System.out.println("Bill is clear \nGenerating Bill");
			System.out.println("Patient Name :- "+patientName+" Bill Amount :- RS.60,000");
		}
	}

}
