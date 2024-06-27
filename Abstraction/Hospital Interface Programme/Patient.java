package com.akshu.interface_demo;

import java.util.Scanner;
import java.util.function.Supplier;

public class Patient 
{
	private String patientName ;
	private Address address;
	
	Scanner sc = new Scanner (System.in);
	
	public Patient(String patientName ) 
	{
		super();
		Supplier<Address> address = ()->{
			System.out.println("Enter Street name :");
			String street = sc.next();
			System.out.println("Enter City name :");
			String city = sc.next();
			System.out.println("Enter State name :");
			String state = sc.next();
			System.out.println("Enter zipCode :");
			int zipCode = sc.nextInt();
			return new Address(street, city, state, zipCode);
		};
		this.patientName = patientName;
		this.address = address.get();
	}
	
	public void toAdmitPatient(HospitalInterface hospitalInterfce)
	{
		hospitalInterfce.admitPatient(patientName, address);
	}
	
	public void reciveTreatment(HospitalInterface hospitalInterfce)
	{
		hospitalInterfce.provideTreatment(patientName);
	}
	
	public void generateBill(HospitalInterface hospitalInterfce)
	{
		System.out.println("total Amount to pay : RS."+hospitalInterfce.getBillamount());
		System.out.println("Enter amount to pay: ");
		double amount =sc.nextInt();
		hospitalInterfce.generateBill(patientName, amount);
	}
	
	

	
}
