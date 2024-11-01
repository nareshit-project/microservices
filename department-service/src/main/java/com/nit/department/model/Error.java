package com.nit.department.model;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {
	private String erroMessage;
	private String dateOfError;
	private String timeOfError;
}
