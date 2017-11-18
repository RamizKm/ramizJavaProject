package com.rkm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
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
	
}
