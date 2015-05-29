package com.democms.dao.user.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.democms.dao.user.UserDao;
import com.democms.model.po.TUser;
import com.democms.model.po.TUser_;
import com.democms.system.platform.framework.dao.GenericDaoImpl;
import com.democms.system.platform.framework.jpa.Query;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	@Override
	public List<TUser> selectUserListByEmail(String email){
		 Query query = 	this.getQuery(TUser.class);
		 query.eq(TUser_.email, email); 
		 return this.selectList(query);
	}

}
