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


	// for all common exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> allExceptionHandler(Exception exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
		
	}
	
	
	
	// for wrong uri entered
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
		
	
	
	// for user class
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MyErrorDetails> userNotFoundExceptionHandler(UserNotFoundException exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	
	
	// police class exception
	@ExceptionHandler(PoliceNotFoundException.class)
	public ResponseEntity<MyErrorDetails> policeNotFoundExceptionHandler(PoliceNotFoundException exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		
	}
	
	
	
	// policeStation not found exception handler
	@ExceptionHandler(PoliceStationNotFoundException.class)
	public ResponseEntity<MyErrorDetails> policeStationNotFoundExceptionHandler(PoliceStationNotFoundException exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		
	}
	
	
	
	
	// FIR exception handler
	@ExceptionHandler(FIRNotFoundException.class)
	public ResponseEntity<MyErrorDetails> firNotFoundExceptionHandler(FIRNotFoundException exception, WebRequest req){

		MyErrorDetails errorDetails = new MyErrorDetails();
		
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

