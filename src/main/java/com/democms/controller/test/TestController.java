package com.democms.controller.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.service.test.DBJpaTestService;


@Controller
public class TestController {
	
	@Resource
	private DBJpaTestService DBJpaTestServiceImpl;
	
	@RequestMapping("/init")
	public String testControllerInit(){
		System.out.println("this is spring mvc init controller");
		return "/";
	}
	
	@RequestMapping("/initTestPrint")
	public String testDBPrint(){
		DBJpaTestServiceImpl.printDBInfoServiceMethod();
		return "/";
	}

}
