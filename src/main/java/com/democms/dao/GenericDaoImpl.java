package com.democms.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public abstract class  GenericDaoImpl implements IGenericDao{
	@PersistenceContext
	protected EntityManager entityManager;
	//@Resource
	//protected EntityManagerFactory entityManagerFactory;

	private CriteriaBuilder criteriaBuilder;
	
	public GenericDaoImpl(){
		
	}
	
	public <E> E selectOneByGuid(Class<E> clazz, String guid) {
		return entityManager.find(clazz, guid);
	}
	
	public <E> List<E> selectListByEntity(Class<E> clazz) {
		this.criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<E> cQuery = criteriaBuilder.createQuery(clazz);
		Root<E> entity = cQuery.from(clazz);
		cQuery.select(entity);
		TypedQuery<E> typedQuery = entityManager.createQuery(cQuery);
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
