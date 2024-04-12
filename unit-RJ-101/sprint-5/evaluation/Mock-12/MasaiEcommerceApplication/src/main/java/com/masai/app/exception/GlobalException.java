package com.masai.app.exception;

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


		@ExceptionHandler(Exception.class)
		public ResponseEntity<MyErrorDetails> commonExceptionHandler(Exception exception, WebRequest req){
			
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
		public ResponseEntity<MyErrorDetails> validationExceptionHandler(MethodArgumentNotValidException exception){
			
			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(exception.getBindingResult().getFieldError().getDefaultMessage());
			
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
			
		}
		
		
		
		@ExceptionHandler(UserNotFoundException.class)
		public ResponseEntity<MyErrorDetails> userNotFoundExceptionHandler(UserNotFoundException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		
		@ExceptionHandler(ProductNotFoundException.class)
		public ResponseEntity<MyErrorDetails> productNotFoundExceptionHandler(ProductNotFoundException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		
		@ExceptionHandler(OrderNotFoundException.class)
		public ResponseEntity<MyErrorDetails> orderNotFoundExceptionHandler(OrderNotFoundException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
	
}
