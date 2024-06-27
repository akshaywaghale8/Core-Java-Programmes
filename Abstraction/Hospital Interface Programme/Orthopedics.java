package com.akshu.interface_demo;

public class Orthopedics implements HospitalInterface 
{

	private final double billamount = 30000;
	
	
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
		if(amount <  30000)
		{
			System.out.println("Please Pay the reamining amount of Rs. "+(30000-amount));
		}
		else if(amount > 30000)
		{
			System.out.println("Please Collect the reamining amount of Rs. "+(amount - 30000));
		}
		else 
		{
			System.out.println("Bill is clear \nGenerating Bill");
			System.out.println("Patient Name :- "+patientName+" Bill Amount :- RS.30,000");
		}
	}


}
