package com.democms.wallet.democontroller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.service.test.TestService;


@Controller
@RequestMapping("/springIocServlet")
public class TestServlet  {
	 

	@Resource(name="testServiceImpl")
	private TestService testServiceImpl;


	@RequestMapping("/*")
	public String initSpringIocServlet(){
		System.out.println("this is a spring ioc test servlet");
		testServiceImpl.testSpringService();

		return "/";
	}

	private static final long serialVersionUID = -5506486156132070256L;

	public TestServlet() {
        super();
   	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello world do get");
		//ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());  
	     //TestService testServiceImpl = (TestService)applicationContext.getBean("testServiceImpl");
		//TestService testServiceImpl = new TestServiceImpl();
		testServiceImpl.testSpringService();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello world do post");
	}



}
