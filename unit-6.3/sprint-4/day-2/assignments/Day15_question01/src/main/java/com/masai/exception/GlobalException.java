package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalException {

	// user defined exception handler
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<MyErrorDetails> BookExceptionHandler(EmployeeNotFoundException be, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(be.getMessage());
		errorDetails.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}

	
	
	// all exception handler
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(Exception exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDetails(req.getDescription(true));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}

	
	
	// uri exception Handler
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> NoHandlerFoundExceptionHandler(NoHandlerFoundException nhfe, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(nhfe.getMessage());
		errorDetails.setDetails(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}

	
	
	// validation exception handler
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDetails(exception.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}

	
}
