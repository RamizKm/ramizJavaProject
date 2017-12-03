package com.rkm.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/ListRestService")
public class ListRestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getCityNames")
	public List<String> getCityNames() {
		System.out.println("ListRestService.getCityNames() started");
		List<String> asList=new ArrayList<String>();
		asList.add("pune");
		asList.add("kolhapur");
		asList.add("sangli");
		asList.add("satara");
		asList.add("koregaon");
		System.out.println("ListRestService.getCityNames() aslist="+asList);
		return asList;
		
		
		
		
	}
	
	@GET
	@Path("/testBothGetPost")
	public String testBothGetPost() {
		return "will not work";
		/*
		 * 
		 * if both element are present.it will give exception.
		 * rest service can have only one method designator.
ov 23, 2017 7:31:19 PM com.sun.jersey.spi.inject.Errors processErrorMessages
EVERE: The following errors and warnings have been detected with resource and/or provider classes:
 SEVERE: A (sub-)resource method, public java.lang.String com.rkm.rest.service.ListRestService.testBothGetPost(), should have only one HTTP method designator. It currently has the
ollowing designators defined: [@javax.ws.rs.GET(), @javax.ws.rs.POST()]
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}

}
