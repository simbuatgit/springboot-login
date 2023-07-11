package com.ms.springboot.loginapp.controller;

import com.ms.springboot.loginapp.model.Login;
import com.ms.springboot.loginapp.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class LoginController {
	@Autowired
	private EmployeeRepository employeeRepository;


	@PostMapping("/login")
	public Object checkLogin( @RequestBody Login login) {
		return employeeRepository.isValidUser(login);
	}

	@GetMapping("/test")
	public Boolean checkLogin() {
		return Boolean.TRUE;
	}
}
