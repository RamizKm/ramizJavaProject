package com.ramizm.springjdbc.clob;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.BlobStringType;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.xstream.XStreamMarshaller;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Clob;
import com.mysql.jdbc.PreparedStatement;
import com.thoughtworks.xstream.XStream;

public class StudentClobHandler {
	
	DataSource datasource;
	JdbcTemplate jdbcTemplate;
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		System.out.println("StudentClobHandler.setDatasource() ds="+datasource);
		this.datasource = datasource;
		this.jdbcTemplate=new JdbcTemplate(datasource);
		System.out.println("StudentClobHandler.setDatasource() jdbctemplate="+jdbcTemplate);
	}
	
	
	public void createClobEntry(StudentDto dto) throws SQLException {
	XStream xs=new XStream();
	String xml=xs.toXML(dto);
	 Connection con=null;
	try {

		
 con=	datasource.getConnection();
	String insertsql="insert into studentxml values(?,?,?,?,?);";
 	PreparedStatement pst=(PreparedStatement) con.prepareStatement(insertsql);
 	pst.setString(1, dto.getStdId());
 	pst.setString(2, dto.getStdFName()+""+dto.getStdLname()+""+dto.getStdMName());
 	pst.setString(3, dto.getStddob());
 	pst.setObject(4, xml);
 	
 	pst.setString(5, xml);
 
 	
 	
 	
 	pst.execute();
 	System.out.println("StudentClobHandler.createClobEntry() after executing");
 	
	}finally {
 	con.close();
 
	}	
 
	}
	

}
