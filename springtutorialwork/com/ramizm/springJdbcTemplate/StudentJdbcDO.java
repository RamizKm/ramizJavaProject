package com.ramizm.springJdbcTemplate;

public class StudentJdbcDO {

	public String studentId;
	public String studentName;
	public String getStudentId() {
		System.out.println("StudentJdbcDAO.getStudentId()="+studentId);
		return studentId;
	}
	public void setStudentId(String studentId) {
		System.out.println("StudentJdbcDAO.setStudentId()="+studentId);
		this.studentId = studentId;
	}
	public String getStudentName() {
		System.out.println("StudentJdbcDAO.getStudentName()="+studentName);
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("StudentJdbcDAO.setStudentName()="+studentName);
	}
	@Override
	public String toString() {
		return "StudentJdbcDO [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}
