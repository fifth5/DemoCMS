package com.democms.dao.console.impl;


import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.democms.dao.GenericDaoImpl;
import com.democms.dao.console.UserDao;
import com.democms.model.po.TUser;
import com.democms.model.po.TUser_;

@Repository
public class UserDaoImpl extends GenericDaoImpl implements UserDao{

	@Override
	public List<TUser> selectUserListByEmail(String email){

		//QueryBuilder<TUser> queryBuilder = new QueryBuilder<TUser>(TUser.class);
		/*CriteriaQuery<TUser> criteriaQuery = null;
		
		
		Predicate condition = null;
		return this.selectList(TUser.class);*/
		//queryBuilder.selectList(condition);
		//queryBuilder.selectOne;
	
		CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<TUser> criteriaQuery = criteriaBuilder.createQuery(TUser.class);	
		
		Root<TUser> user = criteriaQuery.from(TUser.class);
		
		//EntityType<TUser> user_ = user.getModel();
		
		criteriaQuery.select(user);
		
		Predicate condition = criteriaBuilder.equal(user.get(TUser_.guid), "16cea83c-b02d-11e4-88e0-8c89a5ecb19c");		
		//Predicate condition = criteriaBuilder.equal(user.get("guid"),"16cea83c-b02d-11e4-88e0-8c89a5ecb19c");
		criteriaQuery.where(condition);
		//System.out.println(">>>>>>>>>>>>>>>>>" + TUser_.guid);
		
		TypedQuery<TUser> typedQuery = entityManager.createQuery(criteriaQuery);
		List<TUser> result = typedQuery.getResultList();
		System.out.println(result.get(0).getUsername());

		
		return result;
	
	}


}
