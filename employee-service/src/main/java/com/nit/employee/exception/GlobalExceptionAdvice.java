package com.nit.employee.exception;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.nit.employee.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionAdvice {

	@ExceptionHandler(value = EmployeeNotFoundException.class )
	public ResponseEntity<Error> handleEmployeeNotFoundException(EmployeeNotFoundException ex){
		Error error = new Error();
		error.setErroMessage(ex.getMessage());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		error.setDateOfError(LocalDate.now().format(formatter));
		error.setTimeOfError(LocalTime.now().toString());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
