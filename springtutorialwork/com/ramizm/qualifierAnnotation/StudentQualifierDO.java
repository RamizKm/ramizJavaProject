package com.ramizm.qualifierAnnotation;

public class StudentQualifierDO {
	
	public String studnetId;
	public String studentName;
	public String getStudnetId() {
		System.out.println("StudentQualifierDO.getStudnetId()="+studnetId);
		return studnetId;
	}
	public void setStudnetId(String studnetId) {
		System.out.println("StudentQualifierDO.setStudnetId()="+this.studnetId);
		this.studnetId = studnetId;
	}
	public String getStudentName() {
		System.out.println("StudentQualifierDO.getStudentName()="+studentName);
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("StudentQualifierDO.setStudentName()="+this.studentName);
		this.studentName = studentName;
	}

}
