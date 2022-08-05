package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController extends RuntimeException {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(value = ResourceNotFoundException.class)
	   public ResponseEntity<Object> exception(ResourceNotFoundException exception) {
	      return new ResponseEntity<>("Resource not found", HttpStatus.NOT_FOUND);
	}

}
