package com.cybage.genworth.insurance.exception;
/**
*
* @author Jeevan
*/  
public class LifeInsuranceNotFoundException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public LifeInsuranceNotFoundException(String errorMessage) {
		super(errorMessage); //calling constructor Parent RunTime
		//this.errorMessage = errorMessage;
	}
	
	public LifeInsuranceNotFoundException(String errorMessage, Throwable throwable) {
		super(errorMessage,throwable); //calling constructor Parent RunTime
		//this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
