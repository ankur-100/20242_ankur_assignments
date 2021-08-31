package com.sonata.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Login;
import com.sonata.Reposit.LoginRepository;

@RestController
public class LoginController {
	
	Optional <Login> l1;
	
	@Autowired
	private LoginRepository log;
	
	@GetMapping("/login")
	public List<Login> getLoginDetails()
	{
		return log.findAll();
	}

}
