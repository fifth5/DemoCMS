package com.democms.dao.console.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.democms.dao.GenericDaoImpl;
import com.democms.dao.console.UserDao;
import com.democms.model.po.TUser;
import com.democms.persistent.QueryBuilder;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	@Override
	public List<TUser> selectUserListByEmail(String email){

		QueryBuilder<TUser> queryBuilder = new QueryBuilder<TUser>();
		queryBuilder.from(TUser.class);
	
	
		
		/*
		 * 1.queryfrom(tuser);
		 * 2.condition.equal(col,value)
		 * 3.where.morethan(col,value)
		 * 4.where.lessthan
		 *  like in
		 *  or and 
		 *  order
		 *  limit
		 *  
		 *  
		 *  queryBuilder.from(TUser.class);
		 *  condition.query().morethan;
		 *  
		 *  queryBuilder.and();
		 *  queryBuilder.or();
		 *  queryBuilder.order();
		 *  
		 */
		
		return this.selectList(queryBuilder);
	}
}
