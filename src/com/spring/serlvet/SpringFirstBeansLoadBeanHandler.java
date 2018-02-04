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
        System.out.println("SpringFirstBeansLoadBeanHandler.SpringFirstBeansLoadBeanHandler() started");
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
		
	WebApplicationContext abc=WebApplicationContextUtils.findWebApplicationContext(this.getServletContext());
		System.out.println("SpringFirstBeansLoadBeanHandler.doPost() abc="+abc);
		String[] benasloaded=ap.getBeanDefinitionNames();
		System.out.println("SpringFirstBeansLoadBeanHandler.doPost() count="+benasloaded.length);
		for(String nm:benasloaded) {
			System.out.println("SpringFirstBeansLoadBeanHandler.doPost() nm="+nm);
		}
		
		
		 benasloaded=abc.getBeanDefinitionNames();
		System.out.println("SpringFirstBeansLoadBeanHandler.doPost() count="+benasloaded.length);
		for(String nm:benasloaded) {
			System.out.println("SpringFirstBeansLoadBeanHandler.doPost() nm="+nm);
		}
		
		
		
	}

}
