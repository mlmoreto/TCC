package br.edu.ifsp.arq.sice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login/fazer-login")
	public String entrar() {
		return "login/fazer-login";
	} 
}
