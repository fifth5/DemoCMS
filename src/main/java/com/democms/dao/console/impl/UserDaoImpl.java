package com.democms.dao.console.impl;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.springframework.stereotype.Repository;

import com.democms.dao.GenericDaoImpl;
import com.democms.dao.console.UserDao;
import com.democms.model.po.TUser;
import com.democms.persistent.QueryBuilder;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	@Override
	public List<TUser> selectUserListByEmail(String email){

		QueryBuilder<TUser> queryBuilder = new QueryBuilder<TUser>(TUser.class);
	

		
		return this.selectList(queryBuilder);		
	}


}
