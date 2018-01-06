package com.ramizm.springjdbc.clob;

import java.security.SecureRandom;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClobApp {

	public static void main(String[] args) throws SQLException {
		System.out.println("SpringClobApp.main() started");
		String relpath="springtutorialwork/com/ramizm/springJdbcTemplate/springJdbcTemplate.xml";
		
		
		SecureRandom sr=new SecureRandom();
		int nextint=sr.nextInt();
		
		if(nextint <0) {
			nextint=nextint*(-1);
		}
		
		StudentDto dt=new StudentDto();
		dt.setStdId(String.valueOf(nextint));
		dt.setStdFName("testfir"+dt.getStdId());
		dt.setStdMName("mname");
		dt.setStdLname("lname");
		dt.setStdParentMobNo("8097805728");
		dt.setStddob("2018-01-05");
		ApplicationContext ap=new FileSystemXmlApplicationContext(relpath);
		StudentClobHandler cd=(StudentClobHandler) ap.getBean("StudentClobHandler");
		System.out.println("SpringClobApp.main() dt="+dt);
		cd.createClobEntry(dt);
		
	}
	
	
	
}
