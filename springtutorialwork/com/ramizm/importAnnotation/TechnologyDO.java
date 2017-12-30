package com.ramizm.importAnnotation;

public class TechnologyDO {

	
	public String techId;
	public String techName;
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		System.out.println("TechnologyDO.setTechId()");
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		System.out.println("TechnologyDO.setTechName()");
		this.techName = techName;
	}
	
	public static void main(String[] args) {
		System.out.println("TechnologyDO.main()");
		
		TechnologyDO tc=new TechnologyDO();
		System.out.println("TechnologyDO.main() tc="+tc);
	}
	
}
