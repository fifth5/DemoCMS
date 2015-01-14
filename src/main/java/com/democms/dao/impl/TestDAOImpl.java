package com.democms.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.democms.dao.TestDAO;

@Component("testDAO")
public class TestDAOImpl implements TestDAO{

	@Override
	public void testDao(){
		System.out.println("this is a test dao");
	}
}
