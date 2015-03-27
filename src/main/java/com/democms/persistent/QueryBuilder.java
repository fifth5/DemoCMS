package com.democms.persistent;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.democms.model.po.TUser;





public class QueryBuilder<E> {
	

	private  Class<E> classType;

	private EntityManager entityManager;
	private CriteriaQuery<E> criteriaQuery;
	private Predicate predicate ;
	
	public QueryBuilder(Class<E> clazz){
		setClassType(clazz);
		criteriaQuery = entityManager.getCriteriaBuilder().createQuery(classType);
		Root<E> root = criteriaQuery.from(classType);
		criteriaQuery.select(root);
	}

	public Class<E> getClassType() {
		return classType;
	}

	public void setClassType(Class<E> classType) {
		this.classType = classType;
	}
	

	/**
	 * ==================================================
	 * 
	 * 
	 * 
	 * ==================================================
	 */
	
	
	public List<E> selectList(Predicate condition){	
		criteriaQuery.where(condition);	
		TypedQuery<E> typedQuery = entityManager.createQuery(criteriaQuery);
		return typedQuery.getResultList();
	}
	
}
