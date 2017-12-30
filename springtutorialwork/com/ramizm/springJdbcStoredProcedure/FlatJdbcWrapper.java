package com.ramizm.springJdbcStoredProcedure;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.ramizm.singleTonScope.FlatDO;

public class FlatJdbcWrapper implements org.springframework.jdbc.core.RowMapper<FlatJdbcDO>{

	@Override
	public FlatJdbcDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("studentDOJdbcDoWrapper.mapRow() rownum"+rowNum);
		FlatJdbcDO studentdo=new FlatJdbcDO();
	
		studentdo.setFlatId(rs.getString("flatid"));
		studentdo.setFlatOwner(rs.getString("flatowner"));
		studentdo.setSocietyId(rs.getString("societyid"));
		System.out.println("FlatJdbcWrapper.mapRow() flatdo="+studentdo);
		
	System.out.println("studentDOJdbcDoWrapper.mapRow() studentdo="+studentdo);
		
		
		return studentdo;
	}
	
	
	public FlatJdbcWrapper()
	{
		super();
		System.out.println("FlatJdbcWrapper.FlatJdbcWrapper()");
	}

}
