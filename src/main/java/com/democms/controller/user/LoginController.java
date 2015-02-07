package com.democms.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userLogin")
public class LoginController {

	@RequestMapping("**")
	public String userLogin(){
		return "login";
	}	
	@RequestMapping("/test")
	public String userLogin2(){
		return "";
	}
}
