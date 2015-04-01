package com.democms.system.platform.framework.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



@SuppressWarnings("unchecked")
public abstract class  GenericDaoImpl implements IGenericDao{

	@PersistenceContext
	protected EntityManager entityManager;
	//@Resource
	//protected EntityManagerFactory entityManagerFactory;


	public <E> E selectOneByGuid(Class<E> clazz, String guid) {
		return entityManager.find(clazz, guid);
	}
	
	@Override
	public <E> List<E> selectAll(Class<E> clazz){
		return entityManager.createQuery(getQuery(clazz).newCriteriaQuery()).getResultList();
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
	
	
	public <E extends Serializable> List<E> selectList(Query query) {
        return entityManager.createQuery(query.newCriteriaQuery()).getResultList();
    }
	
	protected Query getQuery(Class<?> clazz){
		return Query.forClass(clazz, entityManager);	
	}
}
