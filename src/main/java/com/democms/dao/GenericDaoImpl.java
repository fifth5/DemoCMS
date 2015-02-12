package com.democms.dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.democms.persistent.QueryBuilder;


public abstract class  GenericDaoImpl implements IGenericDao{
	protected CriteriaBuilder criteriaBuilder ;
	
	@PersistenceContext
	protected EntityManager entityManager;
	//@Resource
	//protected EntityManagerFactory entityManagerFactory;

	
	public GenericDaoImpl(){
		
	}
	
	public <E> E selectOneByGuid(Class<E> clazz, String guid) {
		return entityManager.find(clazz, guid);
	}
	
	@Override
	public <E> List<E> selectList(Class<E> clazz /*, Object[] objs*/){
		criteriaBuilder = entityManager.getCriteriaBuilder();	
		CriteriaQuery<E> criteriaQuery = criteriaBuilder.createQuery(clazz);
		
		Root<E> root = criteriaQuery.from(clazz);
		criteriaQuery.select(root);
		
		//Predicate condition = criteriaBuilder.equal(root.get("guid"),"16cea83c-b02d-11e4-88e0-8c89a5ecb19c");
		//criteriaQuery.where(condition);
			
		TypedQuery<E> typedQuery = entityManager.createQuery(criteriaQuery);
		List<E> results = typedQuery.getResultList();
		return results;
	}

	public <E> E insert(E entity){
		 entityManager.persist(entity);
		 return entity;
	}
	
	public <E> E update(E entity){
		entityManager.merge(entity);
		return entity;
	}
	
	public <E> boolean delete(E entity){
		entityManager.remove(entity);
		return true;
	}
	
	public List<?> selectQueryString(String qlString, HashMap<String, Object> params){	
		Query query = entityManager.createQuery(qlString);
		
		//query.setParameter(params);
		return query.getResultList();
	}
	
	public <E> List<E> selectList(QueryBuilder<E> queryBuilder){
		criteriaBuilder = entityManager.getCriteriaBuilder();	
		CriteriaQuery<E> criteriaQuery = criteriaBuilder.createQuery(queryBuilder.getClazz());
		
		Root<E> root = criteriaQuery.from(queryBuilder.getClazz());
		criteriaQuery.select(root);
		
		queryBuilder.setPredicate(root, criteriaBuilder);
		
		criteriaQuery.where(queryBuilder.getPredicate());
			
		TypedQuery<E> typedQuery = entityManager.createQuery(criteriaQuery);
		List<E> results = typedQuery.getResultList();
		
		return results;
	}
}
