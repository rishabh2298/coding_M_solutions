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
	
	
	// common exception Handler 
		@ExceptionHandler(Exception.class)
		public ResponseEntity<MyErrorDetails> allCommonExceptionHandler(Exception exception, WebRequest req){
			
			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
				
		}
		
		
		
		// to handler wrong uri
		
		@ExceptionHandler(NoHandlerFoundException.class)
		public ResponseEntity<MyErrorDetails> methodNotFoundExceptionHandler(NoHandlerFoundException exception, WebRequest req){
			
			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY); 
			
		}
		
		
		
		

		// for wrong validation handler
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<MyErrorDetails> validationExceptionHandler(MethodArgumentNotValidException exception){
			
			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(exception.getBindingResult().getFieldError().getDefaultMessage());
			
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
			
		}
		
		
		// for cabuser exception
		@ExceptionHandler(CabUserNotFoundException.class)
		public ResponseEntity<MyErrorDetails> cabUserNotFoundExceptionHandler(CabUserNotFoundException exception, WebRequest req){
			
			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		
		// for cabDriver exception
				@ExceptionHandler(CabDriverNotFoundException.class)
				public ResponseEntity<MyErrorDetails> cabDriverNotFoundExceptionHandler(CabDriverNotFoundException exception, WebRequest req){
					
					MyErrorDetails errorDetails = new MyErrorDetails();
					
					errorDetails.setDateTime(LocalDateTime.now());
					errorDetails.setMessage(exception.getMessage());
					errorDetails.setDescription(req.getDescription(false));
					
					return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
					
				}
		
		
		
		

}
