package com.democms.system.platform.framework.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import com.democms.system.platform.framework.jpa.Query;



@SuppressWarnings("unchecked")
public abstract class  GenericDaoImpl implements IGenericDao{

	@PersistenceContext
	protected EntityManager entityManager;
	@Resource
	protected EntityManagerFactory entityManagerFactory;


	public <E> E selectOneByGuid(Class<E> clazz, String guid) {
		return entityManager.find(clazz, guid);
	}
	
	@Override
	public <E> List<E> selectAll(Class<E> clazz){
		return entityManager.createQuery(getQuery(clazz).newCriteriaQuery()).getResultList();
	}

	public <E> E insert(E entity){
//		try{
//			entity.getClass().getMethod("setGuid", String.class).invoke(entity,  java.util.UUID.randomUUID().toString());				
//		}catch(Exception e){
//			
//		}
		entityManager.refresh(entity);
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
	
	
	public <E extends Serializable> List<E> selectList(Query query) {
        return entityManager.createQuery(query.newCriteriaQuery()).getResultList();
    }
	
	protected Query getQuery(Class<?> clazz){
		return Query.forClass(clazz, entityManager);	
	}
}
