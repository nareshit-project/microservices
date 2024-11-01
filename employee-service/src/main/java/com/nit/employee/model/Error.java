package com.nit.employee.model;

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
