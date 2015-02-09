package com.democms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class  GenericDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	public <E> E selectOneByGuid(Class<E> clazz, String guid) {
		return entityManager.find(clazz, guid);
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
