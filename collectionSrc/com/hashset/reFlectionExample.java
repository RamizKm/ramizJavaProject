package com.hashset;

public class reFlectionExample {
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<?> cp=PersonDto.class.getClass();
		Object dto=(PersonDto) cp.newInstance();
		System.out.println(dto.getClass().getName());
		
		//persondto is not having any constructor.
		
	
		
	}
	
	
	

}
