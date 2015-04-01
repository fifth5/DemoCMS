package com.democms.dao.user.impl;


import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.democms.dao.user.UserDao;
import com.democms.model.po.*;
import com.democms.system.platform.framework.dao.GenericDaoImpl;
import com.democms.system.platform.framework.jpa.Query;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	
	
	private static Logger logger = LogManager.getLogger(UserDaoImpl.class);
	
	@Override
	public List<TUser> selectUserListByEmail(String email){

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TUser> criteriaQuery = criteriaBuilder.createQuery(TUser.class);			
		Root<TUser> user = criteriaQuery.from(TUser.class);		
		criteriaQuery.select(user);
		
		Predicate condition = criteriaBuilder.equal(user.get(TUser_.email), email);		
		criteriaQuery.where(condition);
		
		TypedQuery<TUser> typedQuery = entityManager.createQuery(criteriaQuery);
		List<TUser> result = typedQuery.getResultList();

		return result;
	
	}
	
	@Override
	public List<TUser> queryUserListByEmail(String email){
		 Query query = 	this.getQuery(TUser.class);
		 //query.eq(TUser_.email, email);
		 System.out.println(this.selectAll(TUser.class).get(1).getEmail());
		 logger.error("hello world");
		 return this.selectList(query);
	}

}
