package com.cybage.genworth.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cybage.genworth.insurance.model.Users;

@RestController
public class UsersController {

	@Autowired
	private Users user;

	@GetMapping("/test")
	public String getData() {
		return "jeevan";
	}

}
