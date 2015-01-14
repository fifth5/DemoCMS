package com.democms.service.test.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.democms.dao.TestDAO;
import com.democms.service.test.TestService;

@Component("testServiceImpl")
public class TestServiceImpl implements TestService{


	@Resource(name="testDAO")
	private TestDAO testDAO;
	
	@Override
	public void testSpringService(){
		System.out.println("hello spring service");
		testDAO.testDao();
	}

}
