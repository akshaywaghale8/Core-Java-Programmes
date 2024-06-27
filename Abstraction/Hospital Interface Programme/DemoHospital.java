package com.akshu.interface_demo;

import java.util.Scanner;
import java.util.function.Supplier;

public class DemoHospital {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		HospitalInterface pediatrics = new Pediatrics();
		HospitalInterface orthopedics = new Orthopedics();
		HospitalInterface cardiology = new Cardiology();
	
		
		Supplier<Patient> patient = ()-> {
			System.out.println("Enter patient Name :");
			String name = sc.next();
			return new Patient(name);
		};
		
		Patient p1 =  patient.get();
		
		p1.toAdmitPatient(cardiology);
		p1.reciveTreatment(cardiology);
		p1.generateBill(cardiology);
		

	}

}
