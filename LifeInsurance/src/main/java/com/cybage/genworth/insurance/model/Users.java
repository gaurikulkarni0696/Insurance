package com.cybage.genworth.insurance.model;

import org.springframework.stereotype.Component;

@Component
public class Users {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
