package com.example.SDP3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {
	
@RequestMapping("register")	
	public String register(HttpServletRequest req) {
		return "Register.html";
	}

	
}
