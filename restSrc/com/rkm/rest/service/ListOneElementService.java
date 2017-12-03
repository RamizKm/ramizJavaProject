package com.rkm.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ListOneElementService")
public class ListOneElementService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getOneString")
	public List<String>getOneString() {
		List<String> al=new ArrayList<String>();
		al.add("kolhapur");
		return al;
		
	}

}
