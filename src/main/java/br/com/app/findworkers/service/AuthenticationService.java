package br.com.app.findworkers.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationService {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String authenticate(){
		return "ok";
	}
}
