package com.rkm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.rkm.dto.NewStudentDto;


@Path("/ListStudentDEtailsRestHandler")
public class ListStudentDEtailsRestHandler {
	
	@GET
	@Path("getAllStudentDteails/{schooldId}/")
	public String getAllStudentDteails(@PathParam("schooldId")String schooldId) {
		String st=null;
		
		System.out
				.println("ListStudentDEtailsRestHandler.getAllStudentDteails() schoolid="+schooldId);
		NewStudentDto nst=new NewStudentDto();
		nst.setAddress("kop");
		nst.setMobileNO("112233");
		nst.setName("nst");
		
		NewStudentDto nstt=new NewStudentDto();
		nstt.setAddress("pun");
		nstt.setMobileNO("9955");
		nstt.setName("nstt");
		
		
		NewStudentDto nstr=new NewStudentDto();
		nstr.setAddress("mum");
		nstr.setMobileNO("443322");
		nstr.setName("nstr");
		nstr.setParentName("nstr-pn");
		
		NewStudentDto[] stra=new NewStudentDto[] {nst,nstt,nstr};
		
		Gson gson=new Gson();
		JsonArray jsar=new JsonArray();
		
		System.out
				.println("ListStudentDEtailsRestHandler.getAllStudentDteails()");
		System.out.println(gson.toJson(stra));
		
		
		
		
	
		
		
		return gson.toJson(stra).toString();
		
	}

}
