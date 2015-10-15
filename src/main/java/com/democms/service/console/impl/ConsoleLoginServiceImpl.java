package com.democms.service.console.impl;

import com.democms.dao.user.UserDao;
import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import com.democms.system.platform.framework.service.GenericService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsoleLoginServiceImpl extends GenericService implements ConsoleLoginService{
		
	@Resource
	private UserDao userDaoImpl;
	
	@Override
	public Result checkUser(TUser tUser){

		Result reslut = null;

		if(userDaoImpl.selectUserListByEmail(tUser.getEmail()).size() != 1){
			reslut.setMsgCode("用户名错误！");
			return reslut;
		}

		if(userDaoImpl.selectUserListByEmail(tUser.getEmail()).get(0).getPassword().equals(tUser.getPassword())){

		}




		return reslut;
	}

}
