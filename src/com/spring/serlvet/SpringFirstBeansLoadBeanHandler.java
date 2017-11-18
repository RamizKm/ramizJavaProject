package com.spring.serlvet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.spring.beans.SimpleSpringFirstBean;
import com.spring.beans.SpringSchoolBean;

/**
 * Servlet implementation class SpringFirstBeansLoadBeanHandler
 */
public class SpringFirstBeansLoadBeanHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpringFirstBeansLoadBeanHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		WebApplicationContext ap=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		SimpleSpringFirstBean scb=null;
	try {
		System.out.println("SpringFirstBeansLoadBeanHandler.doPost() ab="+ap);
		scb=(SimpleSpringFirstBean) ap.getBean("SimpleSpringFirstBean");
	}catch(Exception e) {
		e.printStackTrace();
	}
	SpringSchoolBean ssc=(SpringSchoolBean) ap.getBean("SpringSchoolBean");
	System.out.println("ssc="+ssc);
		
		System.out.println("SpringFirstBeansLoadBeanHandler.doPost() scb="+scb);
		System.out.println("dtails="+scb.getDetails()+" name="+scb.getName());
		
		PrintWriter pw=response.getWriter();
		pw.write("details="+scb.getDetails()+" name="+scb.getName());
	}

}
