package com.democms.service.console.impl;

import com.democms.dao.user.UserDao;
import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import com.democms.system.platform.framework.service.GenericService;
import com.democms.system.platform.framework.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsoleLoginServiceImpl extends GenericService implements ConsoleLoginService{
		
	@Resource
	private UserDao userDaoImpl;
	
	@Override
	public void checkUser(TUser tUser, Result result){


		if(userDaoImpl.selectUserListByEmail(tUser.getEmail()).size() != 1){
			result.setMsgCode("用户名错误！");
			result.setResult(false);
			return;
		}

		if(!userDaoImpl.selectUserListByEmail(tUser.getEmail()).get(0).getPassword().equals(MD5Util.MD5(tUser.getPassword()))){
			result.setMsgCode("密码不正确！");
			result.setResult(false);
		}else {
			result.setResult(true);
			result.setMsgCode("登陆成功！");
		}

	}

}
