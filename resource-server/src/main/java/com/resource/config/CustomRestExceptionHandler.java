package com.resource.config;

import java.nio.file.AccessDeniedException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(value = {AccessDeniedException.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		
		return new ResponseEntity<Object>(
		         "Acces denied Exception", HttpStatus.FORBIDDEN);
	 }
}
