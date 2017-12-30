package com.ramizm.springJdbcStoredProcedure;

import javax.sql.DataSource;
import java.util.List;

public interface FlatInterfaceDAO {

	//interfaces do not have contructors...
	/*public studentInterfaceDAO()
	{
		System.out.println("studentInterfaceDAO.studentInterfaceDAO()");
	}*/
	
	public void setDataSource(DataSource ds);
	public void createStudent(String studentId,String studentName);
	
	public FlatJdbcDO getflatdetails(String studentId);
	public List getListofFlats();
	public void delete(String studentId);
	public void updateStudent(String studentId,String studentName);
	
	
}
