package com.akshu.interface_demo;

public interface HospitalInterface
{
	void admitPatient(String patientName, Address address);
	void provideTreatment(String patientName);
	void generateBill(String patientName, double amount);
	double getBillamount();
	

}
