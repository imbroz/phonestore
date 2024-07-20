package com.bros.java.phonestore.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException{

	public ResourceNotFoundException(String resourceName, Integer id) {
		super(HttpStatus.NOT_FOUND,String.format("%s with id = %d is not found",resourceName, id));
		
	}

}
