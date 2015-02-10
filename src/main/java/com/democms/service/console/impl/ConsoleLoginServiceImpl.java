package com.democms.service.console.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.democms.dao.IGenericDao;
import com.democms.dao.console.UserDao;
import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.GenericService;
import com.democms.service.console.ConsoleLoginService;

@Service
public class ConsoleLoginServiceImpl extends GenericService implements ConsoleLoginService{
		
	@Resource
	private UserDao userDaoImpl;
	
	@Override
	public Result checkUser(){
		//TUser tuser  = userDaoImpl.selectOneByGuid(TUser.class, "2383c86a-b02d-11e4-88e0-8c89a5ecb19c");
		TUser user = new TUser();
		//user.setId("2383c86a-b02d-11e4-88e0-8c89a5ecb19c");
		//TUser tuser  = userDaoImpl.selectOneByEntity(TUser.class, user);
		
		List<TUser> userList = userDaoImpl.selectListByEntity(TUser.class);
		System.out.println(userList.size());
		return reslut;
	}

}
