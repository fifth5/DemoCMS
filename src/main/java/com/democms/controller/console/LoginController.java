package com.democms.controller.console;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.service.console.ConsoleLoginService;


@Controller
@RequestMapping("/console")
public class LoginController {
	
	@Resource
	private ConsoleLoginService consoleLoginServiceImpl;

	@RequestMapping("**")
	public String consoleLoginPage(){
		return "login";
	}	
	
	@RequestMapping("/login")
	public String login(){
		consoleLoginServiceImpl.checkUser();
		return "console/dashboard";	
	}
	
	
	@RequestMapping("/test")
	public String userLogin2(){
		return "";
	}
}
