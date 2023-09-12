package com.example.FashionStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.FashionStore.Entity.Login;
import com.example.FashionStore.Service.LoginService;


@RestController
public class LoginController {

	@Autowired
	LoginService loginservice;
	

	@GetMapping("login")
	public Login login(@RequestHeader String email, @RequestHeader String password) {

		return loginservice.login(email, password);
	}

}
