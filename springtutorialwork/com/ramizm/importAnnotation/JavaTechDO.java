package com.ramizm.importAnnotation;

public class JavaTechDO {
	
	public String techId;
	public String techName;
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		System.out.println("JavaTechDO.setTechId()");
		this.techId = techId;
	}
	public String getTechName() {
		System.out.println("JavaTechDO.getTechName()");
		return techName;
	}
	public void setTechName(String techName) {
		System.out.println("JavaTechDO.setTechName()");
		this.techName = techName;
	}
	@Override
	public String toString() {
		return "JavaTechDO [techId=" + techId + ", techName=" + techName + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("JavaTechDO.main()");
		
		JavaTechDO jdt=new JavaTechDO();
		System.out.println("JavaTechDO.main() jdt="+jdt);
	}
	

}
