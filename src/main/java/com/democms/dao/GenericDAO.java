package com.democms.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.dao.support.DaoSupport;


public class  GenericDAO extends DaoSupport{

	@Resource
	private EntityManagerFactory factory;
	
	private EntityManager entityManager;
	
	public GenericDAO(){
		this.entityManager = factory.createEntityManager();
	}
	
	public Object select(Class clazz,String guid){
		return  entityManager.find(clazz.getClass(), guid);
	}

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}
	
	/*
	public void insert(Object enetity);
	public void delete();
	public void update();	
	public void select();
	public void selectOne();
	public void selectList();
	*/
}
