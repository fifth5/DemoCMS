package com.democms.controller.console;

import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/console")
public class LoginController {
	
	private static Logger logger = LogManager.getLogger(LoginController.class);
	
	@Resource
	private ConsoleLoginService consoleLoginServiceImpl;

	@RequestMapping("**")
	public String consoleLoginPage(Model model){
		System.out.println(">>>>>>>>> ");


		model.addAttribute("system", "efadsfadsfas");
		return "login";
	}
	
	
	@RequestMapping("/loginPage")
	public String loginPage(){
		return "loginPage";
	}
	
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model, TUser user){
		consoleLoginServiceImpl.checkUser(user);
		return "console/dashboard";	
	}
	
	
	@RequestMapping("/test")
	public String userLogin2(){
		return "";
	}
}
