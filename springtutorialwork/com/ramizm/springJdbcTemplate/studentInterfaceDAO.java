package com.ramizm.springJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public interface studentInterfaceDAO {

	//interfaces do not have contructors...
	/*public studentInterfaceDAO()
	{
		System.out.println("studentInterfaceDAO.studentInterfaceDAO()");
	}*/
	
	public void setDataSource(DataSource ds);
	public void createStudent(String studentId,String studentName);
	
	public StudentJdbcDO getStudentDetails(String studentId);
	public List getListofStudent();
	public void delete(String studentId);
	public void updateStudent(String studentId,String studentName);
	
	
}
