package com.rkm.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BismillahSpringRestController {

	
	public BismillahSpringRestController() {
		System.out
				.println("BismillahSpringRestController.BismillahSpringRestController() controller class ");
	}
	
	
	@RequestMapping("/springrest/greeting")
	public String getGreetingMsg() {
		
		String msg="in the name of allah the most beneficial and merciful";
		return msg;
		
	}
	
	
	
}
