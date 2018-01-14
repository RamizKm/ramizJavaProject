package com.ramizm.springJdbcStoredProcedure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FlatStoredProcedureApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springJdbcStoredProcedure/springJdbcStoredProcedure.xml";
	
	public static String relpath="springtutorialwork/com/ramizm/springJdbcStoredProcedure/springJdbcStoredProcedure.xml";
	
	public static void main(String[] args) {
		System.out.println("FlatStoredProcedureApp.main() started...");
		
		ApplicationContext app=new FileSystemXmlApplicationContext(relpath);
		FlatDAOImplHandler hrdo=(FlatDAOImplHandler)app.getBean("flatdaoimpl");
		System.out.println("FlatStoredProcedureApp.main() came to end");
		hrdo.getflatdetails("g6");
		hrdo.getListofFlats();
	}
/*
	FlatJdbcDO.FlatJdbcDO()
	Exception in thread "main" org.springframework.dao.InvalidDataAccessApiUsageException: Procedure or Function name is required
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.compile(AbstractJdbcCall.java:267)
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.checkCompiled(AbstractJdbcCall.java:333)
		at org.springframework.jdbc.core.simple.AbstractJdbcCall.doExecute(AbstractJdbcCall.java:348)*/
	
}

/*
 * Error when procedure is not present
 * 
 	at org.springframework.jdbc.core.simple.AbstractJdbcCall.executeCallInternal(AbstractJdbcCall.java:403)
	at org.springframework.jdbc.core.simple.AbstractJdbcCall.doExecute(AbstractJdbcCall.java:363)
	at org.springframework.jdbc.core.simple.SimpleJdbcCall.execute(SimpleJdbcCall.java:197)
	at com.ramizm.springJdbcStoredProcedure.FlatDAOImplHandler.getflatdetails(FlatDAOImplHandler.java)
	at com.ramizm.springJdbcStoredProcedure.FlatStoredProcedureApp.main(FlatStoredProcedureApp.java)
Caused by: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: PROCEDURE test.testspringexample does not exist
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	at java.lang.reflect.Constructor.newInstance(Unknown Source)
	at com.mysql.jdbc.Util.handleNewInstance(Util.java:377)
	at com.mysql.jdbc.Util.getInstance(Util.java:360)
	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:978)
 * 
 */
