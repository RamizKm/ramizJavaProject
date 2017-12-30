package com.ramizm.springJdbcStoredProcedure;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class FlatDAOImplHandler implements FlatInterfaceDAO	{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public void createStudent(String studentId, String studentName) {
		System.out.println("StudentDAOImplHandler.createStudent()");
		
		System.out.println("StudentDAOImplHandler.createStudent() studentId="+studentId);
		System.out.println("StudentDAOImplHandler.createStudent() studentname="+studentName);
		String createQuery="insert into studentJdbc(studentId,studentName) values(?,?)";
		
	int result=	jdbcTemplate.update(createQuery, studentId,studentName);
		System.out.println("StudentDAOImplHandler.createStudent() result="+result	);
		
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
	public List getListofFlats() {
	//	System.out.println("StudentDAOImplHandler.getListofStudent()");
		// TODO Auto-generated method stub
		
		
		System.out.println("FlatDAOImplHandler.getListofFlats()");
		SimpleJdbcCall newJdbc=new SimpleJdbcCall(this.dataSource);
		newJdbc=newJdbc.withProcedureName("giveFlatLIst");
		
		System.out.println("FlatDAOImplHandler.getListofFlats() listnewjdb="+newJdbc.getCallString());
		SqlParameterSource insqlparam=new MapSqlParameterSource("inputflatid","rkdkd");
		
		System.out.println("FlatDAOImplHandler.getListofFlats() inparam="+newJdbc.getCallString()+"\t dkd="+newJdbc.getInParameterNames());
		
		Map<String, Object> mapResult=newJdbc.execute(insqlparam);
		
		
		String owner=(String) mapResult.get("outflatowner");
		System.out.println("FlatDAOImplHandler.getListofFlats() owner="+owner);
		
		//System.out.println("StudentDAOImplHandler.getListofStudent() list="+list);
		return null;
		
	}

	@Override
	public FlatJdbcDO getflatdetails(String studentId) {
		// TODO Auto-generated method stub
	System.out.println("StudentDAOImplHandler.getStudentDetails()");
	System.out.println("FlatDAOImplHandler.getflatdetails() studentid="+studentId);
	FlatJdbcDO flatdo=new FlatJdbcDO();
	SqlParameterSource sqlParam=new MapSqlParameterSource().addValue("inputflatid", studentId);
	System.out.println("FlatDAOImplHandler.getflatdetails() sqlpraram="+sqlParam);
	Map<String, Object> mapObject=this.simpleJdbcCall.execute(sqlParam);
	System.out.println("FlatDAOImplHandler.getflatdetails() mapobject="+mapObject);
	String flatowner=(String)mapObject.get("OUTFLATOWNER");
	//it is case senseitve,it iwll igve emtp yreulst
	String societyId=(String)mapObject.get("outsocietyid");
	System.out.println("FlatDAOImplHandler.getflatdetails() flatowner="+flatowner);
	System.out.println("FlatDAOImplHandler.getflatdetails() soceity oid="+societyId);
	flatdo.setFlatOwner(flatowner);
	flatdo.setSocietyId(societyId);
	
	
	
	System.out.println("StudentDAOImplHandler.getStudentDetails() flatdo="+flatdo);
	return flatdo;
	}

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		
		this.dataSource=ds;
		System.out.println("StudentDAOImplHandler.setDataSource() ds="+ds);
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
		System.out.println("StudentDAOImplHandler.setDataSource()");
		//without procedure name it will throw exception.
/*		entDAOImplHandler.setDataSource()
		StudentDAOImplHandler.setDataSource() jdbctemplate=org.springframework.jdbc.core.JdbcTemplate@b2cfc7e
		FlatStoredProcedureApp.main() came to end
		StudentDAOImplHandler.getStudentDetails()
		FlatDAOImplHandler.getflatdetails() studentid=g3
		FlatJdbcDO.FlatJdbcDO()
		Exception in thread "main" org.springframework.dao.InvalidDataAccessApiUsageException: Procedure or Function name is required
			at org.springframework.jdbc.core.simple.AbstractJdbcCall.compile(AbstractJdbcCall.java:267)
			at org.springframework.jdbc.core.simple.AbstractJdbcCall.checkCompiled(AbstractJdbcCall.java:333)
			at org.springframework.jdbc.core.simple.AbstractJdbcCall.doExecute(AbstractJdbcCall.java:348)*/
		this.simpleJdbcCall=new SimpleJdbcCall(this.dataSource).withProcedureName("testSpringExample");
		System.out.println("FlatDAOImplHandler.setDataSource() simplejdbccall="+simpleJdbcCall);
		
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
