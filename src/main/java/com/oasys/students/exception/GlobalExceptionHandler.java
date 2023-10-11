package com.oasys.students.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object>AgeHandle(AgeNotFoundException a) {
		return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);
		
	}

}
