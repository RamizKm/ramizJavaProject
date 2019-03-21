package com.rkm.springRest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/FirstSpringRestService")
public class FirstSpringRestService {

	
	public String getHelloMsg() {
		
		String result="welcome to world of spring rest";
		System.out.println("FirstSpringRestService.getHelloMsg() result="+result);
		return result;
	}
	
	
	private SchoolDO getSchoolDetails(@RequestParam("id") String id) {
		
		System.out.println("FirstSpringRestService.getSchoolDetails() id="+id);
		SchoolDO dto=new SchoolDO();
		dto.setSchooldId(id);
		dto.setAddress("vadgaon kolhapur");
		dto.setName("english school");
		dto.setType("SECONDARY");
		
		System.out.println("FirstSpringRestService.getSchoolDetails() dto="+dto);
		return dto;
	}
	
	
	public FirstSpringRestService() {
		System.out.println("FirstSpringRestService.FirstSpringRestService()");
		System.out.println("enclosing_type.enclosing_method() constructor");
	}
}
