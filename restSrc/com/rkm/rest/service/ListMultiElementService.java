package com.rkm.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ListMultiElementService")
public class ListMultiElementService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getCityList")
	public List<String> getCityList() {
		List<String> all=new ArrayList<String>();
		
		all.add("vadgaon");
		all.add("mumbai");
		all.add("pune");
		all.add("satara");
		all.add("sangli");
		System.out.println("ListMultiElementService.getCityList() all="+all);
		return all;
		
	}
	
	
	
}
