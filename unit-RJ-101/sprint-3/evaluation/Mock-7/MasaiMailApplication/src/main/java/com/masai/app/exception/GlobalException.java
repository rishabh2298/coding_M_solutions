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
		
		
		

		// log-in exception handler
		@ExceptionHandler(LogInException.class)
		public ResponseEntity<MyErrorDetails> logInExceptionHandler(LogInException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		
		

		// User exception handler
		@ExceptionHandler(UserNotFoundException.class)
		public ResponseEntity<MyErrorDetails> userNotFoundExceptionHandler(UserNotFoundException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		

		// Email exception handler
		@ExceptionHandler(MailNotFoundException.class)
		public ResponseEntity<MyErrorDetails> mailNotFoundExceptionHandler(MailNotFoundException exception, WebRequest req){

			MyErrorDetails errorDetails = new MyErrorDetails();
			
			errorDetails.setDateTime(LocalDateTime.now());
			errorDetails.setMessage(exception.getMessage());
			errorDetails.setDescription(req.getDescription(false));
			
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
			
		}
		
		
		
		

}
