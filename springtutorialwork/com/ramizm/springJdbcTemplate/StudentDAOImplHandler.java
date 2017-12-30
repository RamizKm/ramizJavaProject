package com.ramizm.springJdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImplHandler implements studentInterfaceDAO{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void createStudent(String studentId, String studentName) {
		System.out.println("StudentDAOImplHandler.createStudent()");
		
		System.out.println("StudentDAOImplHandler.createStudent() studentId="+studentId);
		System.out.println("StudentDAOImplHandler.createStudent() studentname="+studentName);
		String createQuery="insert into studentJdbc(studentId,studentName) values(?,?)";
		try {
		//int result=	jdbcTemplate.update(createQuery, studentId,studentName);
		//System.out.println("StudentDAOImplHandler.createStudent() result="+result	);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

	public DataSource getDataSource() {
		System.out.println("StudentDAOImplHandler.getDataSource() datasource="+dataSource);
		return dataSource;
	}

	@Override
	public void delete(String studentId) {
		// TODO Auto-generated method stub
		System.out.println("StudentDAOImplHandler.delete() studnetid="+studentId);
		String deltequery="delete  from studentjdbc where studentid=?";
		int result=jdbcTemplate.update(deltequery,studentId);
		System.out.println("StudentDAOImplHandler.delete() reuslt="+result);
	}

	@Override
	public List getListofStudent() {
		System.out.println("StudentDAOImplHandler.getListofStudent()");
		// TODO Auto-generated method stub
		String listStudents="select * from studentjdbc";
		List<StudentJdbcDO> list=(List)jdbcTemplate.query(listStudents, new studentDOJdbcDoWrapper());
		
		System.out.println("StudentDAOImplHandler.getListofStudent() list="+list);
		return list;
	}

	@Override
	public StudentJdbcDO getStudentDetails(String studentId) {
		// TODO Auto-generated method stub
	System.out.println("StudentDAOImplHandler.getStudentDetails()");
	
	String retrieveQuery="select * from studentJdbc where studentId=?";
StudentJdbcDO studendo=jdbcTemplate.queryForObject(retrieveQuery, new Object[]{studentId},new studentDOJdbcDoWrapper());
	
	
	System.out.println("StudentDAOImplHandler.getStudentDetails()");
		return studendo;
	}

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		
		this.dataSource=ds;
		System.out.println("StudentDAOImplHandler.setDataSource() ds="+ds);
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
		System.out.println("StudentDAOImplHandler.setDataSource()");
		
		
	Connection con = null;
	try {
		con = ds.getConnection();
		System.out.println("StudentDAOImplHandler.setDataSource() con="+con);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		Properties prop=con.getClientInfo();
		System.out.println("StudentDAOImplHandler.setDataSource() prop="+prop+"\t size="+prop.size());
		
		
		Set keysetit=prop.keySet();
		Iterator it=keysetit.iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			Object value=prop.get(key);
			System.out.println("StudentDAOImplHandler.setDataSource() key="+key+"\t value="+value);
			
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("StudentDAOImplHandler.setDataSource()");
		System.out.println("StudentDAOImplHandler.setDataSource() jdbctemplate="+this.jdbcTemplate);
	}

	@Override
	public void updateStudent(String studentId, String studentName) {
		// TODO Auto-generated method stub
		System.out.println("StudentDAOImplHandler.updateStudent()");
System.out.println("StudentDAOImplHandler.updateStudent()");
		
		System.out.println("StudentDAOImplHandler.updateStudent() studentId="+studentId);
		System.out.println("StudentDAOImplHandler.updateStudent() studentname="+studentName);
		String createQuery="update  studentJdbc set  studentName=? where studentId=? ";
		
	int result=	jdbcTemplate.update(createQuery, studentId,studentName);
		System.out.println("StudentDAOImplHandler.updateStudent() result="+result	);
		System.out.println("StudentDAOImplHandler.updateStudent()");
	}

}
