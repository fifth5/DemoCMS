package com.democms.service.console.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.democms.dao.user.UserDao;
import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import com.democms.system.platform.framework.dao.IGenericDao;
import com.democms.system.platform.framework.service.GenericService;

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
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("guid", "16cea83c-b02d-11e4-88e0-8c89a5ecb19c");
		//List<TUser> userList = userDaoImpl.selectList(TUser.class);
		List<TUser> userList = userDaoImpl.queryUserListByEmail("zzt-01@163.com");
		System.out.println(userList.size());
		return reslut;
	}

}
