package com.democms.controller.test;

import javax.annotation.Resource;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.log4j.Logger;
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
	 //static Logger logger = Logger.getLogger(TestController.class.getName());
	 private Logger logger = LogManager.getLogger(TestController.class.getName());  
	@RequestMapping("/initTestPrint")
	public String testDBPrint(){
		logger.error("test  log4j" );
		
		DBJpaTestServiceImpl.printDBInfoServiceMethod();
		return "/";
	}

}
