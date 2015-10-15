package com.democms.dao.user.impl;

import com.democms.dao.user.UserDao;
import com.democms.model.po.TUser;
import com.democms.model.po.TUser_;
import com.democms.system.platform.framework.dao.GenericDaoImpl;
import com.democms.system.platform.framework.jpa.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	@Override
	public List<TUser> selectUserListByEmail(String email){
		 Query query = 	this.getQuery(TUser.class);
		 query.eq(TUser_.email, email); 
		 return this.selectList(query);
	}
	
	@Override
	public void insertUser(TUser user) throws Exception{
		user.setUsername("Test");
		this.entityManager.persist(user);
		throw new Exception("exception user");
	}

}
