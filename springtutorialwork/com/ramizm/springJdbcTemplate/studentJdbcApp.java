package com.ramizm.springJdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ramizm.MultipleSpringUtil.PrimaryKeyUtil;
import com.ramizm.qualifierAnnotation.CollegeDO;

public class studentJdbcApp {
	
	public static String filename="D:/RAMIZ_WORK/Spring_Tutorial_App/src/com/ramizm/springJdbcTemplate/springJdbcTemplate.xml";
	public static String relPath="springtutorialwork/com/ramizm/springJdbcTemplate/springJdbcTemplate.xml";
	public studentJdbcApp()
	{
		System.out.println("studentJdbcApp.studentJdbcApp()");
	}
	public static void main(String[] args) {
		System.out.println("studentJdbcApp.main()");
		System.out.println("studentJdbcApp.main() started..");
		System.out.println("CollectionInjectionApp.main() started.");
		ApplicationContext app=new FileSystemXmlApplicationContext(relPath);
		StudentDAOImplHandler hrdo=(StudentDAOImplHandler)app.getBean("studentJdbcdao");
		System.out.println("studentJdbcApp.main() hrdo="+hrdo);
		
		//hrdo.getStudentDetails("91307");
		PrimaryKeyUtil pk=new PrimaryKeyUtil();
		hrdo.createStudent(pk.getStringPk(), "shabaj momin");
		
	//	hrdo.updateStudent("91307", "ramiz amdocs momin");
		
java.util.List student=		hrdo.getListofStudent();
		System.out.println("studentJdbcApp.main() studentlist="+student);
		String idc=null;
		String secondkey=null;
	
		for(int i=0;i<student.size();i++)
		{
			 idc=((StudentJdbcDO)student.get(i)).getStudentId();
			 
			 if(idc!=null)
			 {
				 secondkey=((StudentJdbcDO)student.get(i+1)).getStudentId();
				 break;
			 }
			 break;
			
		}
		//if no found ,it throws exception.....
		hrdo.getStudentDetails(secondkey);
		hrdo.updateStudent(secondkey, "ramiz amdocs momin");
		
		
	//	hrdo.delete(idc);
		
		
		//system@//localhost:1521/bismillahora
	}
	
	
	public void createStudent()
	{
		
	}
	
/*	 29, 2013 3:15:43 PM org.springframework.beans.factory.support.DefaultListableBeanFactory destroySingletons
	 INFO: Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@aa46bba: defining beans [dataSource,studentJdbcdao]; root of factory hierarchy
	 Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'studentJdbcdao' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\springJdbcTemplate\springJdbcTemplate.xml]: Cannot resolve reference to bean 'dataSource' while setting bean property 'dataSource'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in file [D:\RAMIZ_WORK\Spring_Tutorial_App\src\com\ramizm\springJdbcTemplate\springJdbcTemplate.xml]: Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid property 'dataSourceName' of bean class [org.springframework.jdbc.datasource.DriverManagerDataSource]: Bean property 'dataSourceName' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
	 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:329)
	 	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:107)
	 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1387)
	 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1128)
	 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:519)
	 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:458)
	 	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:295)
	 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:223)
	 	at org.*/
	
/*	studentDOJdbcDoWrapper.studentDOJdbcDoWrapper()
	Exception in thread "main" org.springframework.dao.EmptyResultDataAccessException: Incorrect result size: expected 1, actual 0
		at org.springframework.dao.support.DataAccessUtils.requiredSingleResult(DataAccessUtils.java:71)
		at org.springframework.jdbc.core.JdbcTemplate.queryForObject(JdbcTemplate.java:732)
		at com.ramizm.springJdbcTemplate.StudentDAOImplHandler.getStudentDetails(StudentDAOImplHandler.java:66)
		at com.ramizm.springJdbcTemplate.studentJdbcApp.main(studentJdbcApp.java:26)
*/
}
