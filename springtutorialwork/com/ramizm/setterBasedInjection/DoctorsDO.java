package com.ramizm.setterBasedInjection;

public class DoctorsDO {
	
	public DoctorsDO()
	{
		System.out.println("DoctorsDO.DoctorsDO()");
	}
	
	public String doctorId;
	public String doctorName;
	public String getDoctorId() {
		System.out.println("DoctorsDO.getDoctorId()="+doctorId);
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		System.out.println("DoctorsDO.getDoctorName()="+doctorName);
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public void getDoctorsDbDetails()
	{
		System.out.println("DoctorsDO.getDoctorsDbDetails()");
		
		System.out.println("DoctorsDO.getDoctorsDbDetails() subclass function called.");
		
		
	}

}
