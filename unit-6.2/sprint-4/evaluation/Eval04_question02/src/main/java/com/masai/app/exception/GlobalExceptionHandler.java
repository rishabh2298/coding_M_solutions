package com.masai.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> productExceptionHandler(ProductException productException){
		
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(), productException.getMessage());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<MyErrorDetails> runtimeExceptionHandler(RuntimeException runtimeException){
		
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(), runtimeException.getMessage());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noExceptionHandler(NoHandlerFoundException exception){
		
		MyErrorDetails errorDetails = new MyErrorDetails(LocalDateTime.now(), "Error in Uri or Url");
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> validationErrorHandler(MethodArgumentNotValidException exception){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setLocalDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		
	}
	
}







