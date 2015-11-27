package com.democms.controller.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.system.platform.framework.controller.GenericController;

@Controller
@RequestMapping("/")
public class HomeController extends GenericController {


	@RequestMapping("/contactPage")
	public String toContactPage(){
		return "contact";
	}
	
	@RequestMapping("/aboutPage")
	public String toAboutPage(){
		return "about";
	}
	
}
