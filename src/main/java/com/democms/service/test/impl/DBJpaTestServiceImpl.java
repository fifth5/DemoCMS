package com.democms.service.test.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.democms.dao.test.TestDAO;
import com.democms.service.test.DBJpaTestService;


@Service
public class DBJpaTestServiceImpl implements DBJpaTestService {
	
	@Resource
	private TestDAO testDAOImpl;

	@Override
	public void printDBInfoServiceMethod(){
		testDAOImpl.printDBInfo();
	}
}
