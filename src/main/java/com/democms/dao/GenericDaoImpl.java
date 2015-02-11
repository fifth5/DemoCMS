package com.democms.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public abstract class  GenericDaoImpl implements IGenericDao{
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
	public <E> List<E> selectListByEntity(Class<E> clazz, HashMap<String,Object> params) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<E> criteriaQuery = criteriaBuilder.createQuery(clazz);
		Root<E> root = criteriaQuery.from(clazz);
		criteriaQuery.select(root);
		
		Iterator<String> iter = params.keySet().iterator();
		while(iter.hasNext()){
            String key = (String) iter.next();  
            Object value = params.get(key); 
    		Predicate condition = criteriaBuilder.equal(root.get(key), value);
    		criteriaQuery.where(condition);
		}
		
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
}
