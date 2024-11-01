package com.nit.department.exception;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nit.department.model.Error;

@ControllerAdvice
public class GlobalExceptionAdvice {

	@ExceptionHandler(value = DepartmentNotFoundException.class)
	public ResponseEntity<Error> handleDepartmentNotFoundException(DepartmentNotFoundException ex) {
		Error error = new Error();
		error.setErroMessage(ex.getMessage());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		error.setDateOfError(LocalDate.now().format(formatter));
		error.setTimeOfError(LocalTime.now().toString());
		return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	}
}
