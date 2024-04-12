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

	
	@ExceptionHandler(AddressException.class)
	public ResponseEntity<MyErrorDetails> tutorialExceptionHandler(AddressException te, WebRequest req){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(te.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> commentExceptionHandler(StudentException exception, WebRequest req){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}
	
	
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> allExceptionHandler(Exception exception, WebRequest req){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> methodNotFoundExceptionHandler(NoHandlerFoundException exception, WebRequest req){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> validationExceptionHandler(MethodArgumentNotValidException exception, WebRequest req){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}
	
	
}
