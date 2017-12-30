package com.ramizm.springJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public class studentDOJdbcDoWrapper implements org.springframework.jdbc.core.RowMapper<StudentJdbcDO>{

	@Override
	public StudentJdbcDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("studentDOJdbcDoWrapper.mapRow() rownum"+rowNum);
	StudentJdbcDO studentdo=new StudentJdbcDO();
	studentdo.setStudentId(rs.getString("studentId"));
	studentdo.setStudentName(rs.getString("studentName"));
	System.out.println("studentDOJdbcDoWrapper.mapRow() studentdo="+studentdo);
		
		
		return studentdo;
	}
	
	
	public studentDOJdbcDoWrapper()
	{
		super();
		System.out.println("studentDOJdbcDoWrapper.studentDOJdbcDoWrapper()");
	}

}
