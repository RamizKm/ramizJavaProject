package com.ramizm.MultipleSpringUtil;
import java.security.SecureRandom;
import java.util.Random;


public class PrimaryKeyUtil {


	public static int getPk() {
		SecureRandom secure = new SecureRandom();
		Random rd = new Random();
		int check = secure.nextInt();
		System.out.println("VendorCustomerApp.getPk() check=" + check);

		if (check < 0) {
			System.out.println("VendorCustomerApp.getPk() making it postive");
			check = (-1) * check;
		}
		
		rd.nextInt();
		return check;
	}
	
	public PrimaryKeyUtil()
	{
		System.out.println("PrimaryKeyUtil.PrimaryKeyUtil()");
	}

	public static String getStringPk()
	{
		int result=getPk();
		System.out.println("PrimaryKeyUtil.getStringPk() result="+result);
	return	String.valueOf(result);
		
	}
	
	
}
