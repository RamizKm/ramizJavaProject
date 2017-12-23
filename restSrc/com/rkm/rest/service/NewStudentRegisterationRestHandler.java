package com.rkm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.rkm.dto.NewStudentDto;


@Path("/NewStudentRegisterationRestHandler")
public class NewStudentRegisterationRestHandler {
	
	public NewStudentRegisterationRestHandler() {
		System.out
				.println("NewStudentRegisterationRestHandler.NewStudentRegisterationRestHandler() constructor call");
	}
	
	
	@Path("/registerStudent/{mobileNo}/{address}/{firstName}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_XHTML_XML,MediaType.APPLICATION_XML})
	public String registerStudent(@PathParam("mobileNo")String mobileNO,@PathParam("address")String address,@PathParam("firstName")String firstName) {
		System.out
				.println("NewStudentRegisterationRestHandler.registerStudent() started");
		
		System.out
				.println("NewStudentRegisterationRestHandler.registerStudent() mobile="+mobileNO+" address="+address);
		System.out
				.println("NewStudentRegisterationRestHandler.registerStudent() fistName="+firstName);
	
		NewStudentDto dto=new NewStudentDto();
		dto.setAddress(address);
		dto.setMobileNO(mobileNO);
		dto.setName(firstName);
		
		Gson gson=new Gson();
		System.out
				.println("NewStudentRegisterationRestHandler.registerStudent() afte conv="+gson.toJson(dto));
		
		return gson.toJson(dto);
		
	}
	
	/*
	 * 
	 * with requestParam it will give below error
	 * @RequestParam(name="firstName")String firstName
	 * SEVERE: The following errors and warnings have been detected with resource and/or provider classes:
  SEVERE: Missing dependency for method public java.lang.String com.rkm.rest.service.NewStudentRegisterationRestHandler.registerStudent(java.lang.String,java.lang.String,java.lang.S
tring) at parameter at index 0
  SEVERE: Missing dependency for method public java.lang.String com.rkm.rest.service.NewStudentRegisterationRestHandler.registerStudent(java.lang.String,java.lang.String,java.lang.S
tring) at parameter at index 1
  SEVERE: Missing dependency for method public java.lang.String com.rkm.rest.service.NewStudentRegisterationRestHandler.registerStudent(java.lang.String,java.lang.String,java.lang.S
tring) at parameter at index 2
  SEVERE: Method, public java.lang.String com.rkm.rest.service.NewStudentRegisterationRestHandler.registerStudent(java.lang.String,java.lang.String,java.lang.String), annotated with
	 * 
	 * 
	 * 
	 * 
	 */

}
