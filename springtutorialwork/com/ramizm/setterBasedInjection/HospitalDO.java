package com.ramizm.setterBasedInjection;

public class HospitalDO {
	
	public HospitalDO()
	{
		System.out.println("HospitalDO.HospitalDO() started.");
	}
//a setter method inject dependency;
	private DoctorsDO doctorContent;
	public DoctorsDO getDoctorContent() {
		System.out.println("HospitalDO.getDoctorContent()="+this.doctorContent);
		return doctorContent;
	}
	public void setDoctorContent(DoctorsDO doctorContent) {
		this.doctorContent = doctorContent;
		System.out.println("HospitalDO.setDoctorContent()="+this.doctorContent);
	}
	
	
	public void getDoctorDetailsCheck()
	{
		System.out.println("HospitalDO.getDoctorDetailsCheck() statted...");
		System.out.println("HospitalDO.getDoctorDetailsCheck()rfamiz is checking the files...slsidldlsdldl");
		doctorContent.getDoctorsDbDetails();
		
	}
	
}
