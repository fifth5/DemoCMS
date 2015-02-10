package com.democms.controller.console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/console")
public class LoginController {

	@RequestMapping("**")
	public String consoleLoginPage(){
		return "login";
	}	
	
	@RequestMapping("/login")
	public String login(){
		return "console/dashboard";	
	}
	
	
	@RequestMapping("/test")
	public String userLogin2(){
		return "";
	}
}
