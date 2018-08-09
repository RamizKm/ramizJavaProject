package com.rkm.rest.service;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.annotations.JsonAdapter;
import com.rkm.dto.FlatDto;


//you need to give colon other wise it will give bloew exception
/*
 * 
 *  com.rkm.rest.service package is given in web.xml for serlvetcontains for jersye servlet  servciesto scan all rest  services
 * 
 * 
 * 
 * exact exception =com.sun.jersey.api.container.ContainerException: The ResourceConfig instance does not contain any root resource classes. 
 */
@Path("/FirstRestService")
public class FirstRestService {
	
	@GET
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/getGreeting/")
	public String getGreeting() {
		
		return "Welcome to the world of rest services";
		
	} 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getFlatDetails")
	public String getFlatDetails() {
		
		FlatDto dt=new FlatDto();
		dt.setFlatNo("101");
		dt.setFloor("1");
		dt.setOwnerName("abc pqr");
		dt.setType("1bhk");
		
		return dt.toString();
		
	}
	
	@GET
	@Path("/getIdByPathParam/{name}")
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_XHTML_XML})
	public String getIdByPathParam(@PathParam("name")String name) {
		String output=name+"_01_pathparam_"+Calendar.getInstance().getTimeInMillis();
		System.out.println("FirstRestService.getIdByPathParam() name="+name +" output="+output);
		return output;
	}
	
	@GET
	@Path("/getIdbyQueryParam/")
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_XHTML_XML})
	public String getIdbyQueryParam(@QueryParam("name")String name) {
		String output=name+"_matrix_"+Calendar.getInstance().getTimeInMillis();
		System.out.println("FirstRestService.getIdByPathParam() name="+name +" output="+output);
		return output;
	}
	
	
	
	
	
	
}
