package com.rkm.rest.service;

import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("SimpleAjaxStringService")
public class SimpleAjaxStringService {
	
	public SimpleAjaxStringService() {
		System.out.println("SimpleAjaxStringService.SimpleAjaxStringService()");
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	public String getResponse() {
		System.out.println("SimpleAjaxStringService.getResponse()");
		return "ajax response from  SimpleAjaxStringService with date="+new Date();
	}

}
