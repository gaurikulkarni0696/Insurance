package com.cybage.genworth.insurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LifeInsuranceHandlerException {

	@ExceptionHandler(value = { LifeInsuranceNotFoundException.class })
	public ResponseEntity<Object> handleLifeInsurance(LifeInsuranceNotFoundException lifeInsuranceNotFoundException) {

		LifeInsuranceException lifeInsuranceException = new LifeInsuranceException(
				lifeInsuranceNotFoundException.getMessage(), lifeInsuranceNotFoundException.getCause(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(lifeInsuranceException, HttpStatus.NOT_FOUND);
	}
}
