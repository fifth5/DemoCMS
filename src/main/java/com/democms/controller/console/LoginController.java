package com.democms.controller.console;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.service.console.ConsoleLoginService;


@Controller
@RequestMapping("/console")
public class LoginController {
	
	private static Logger logger = LogManager.getLogger(LoginController.class);
	
	@Resource
	private ConsoleLoginService consoleLoginServiceImpl;

	@RequestMapping("**")
	public String consoleLoginPage(Model model){
		
		model.addAttribute("system", "efadsfadsfas");
		return "login";
	}
	
	
	@RequestMapping("/loginPage")
	public String loginPage(){
		return "loginPage";
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
