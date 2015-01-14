package com.democms.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	@RequestMapping("/init")
	public String testControllerInit(){
		System.out.println("this is spring mvc init controller");
		return "/";
	}
	

}
