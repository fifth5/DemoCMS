package com.democms.dao.test.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Repository;

import com.democms.dao.test.TestDAO;
import com.democms.model.po.TUser;

@Repository
public class TestDAOImpl implements TestDAO{
	
	@Resource
	private EntityManagerFactory factory;

	@Override
	public void printDBInfo(){ 
		System.out.println("DemoCMS DAO>>>>>>>>>>>>>>");
        EntityManager em = factory.createEntityManager();
        TUser person = em.find(TUser.class,"a0c2edf7-9a2b-11e4-9ca2-8c89a5ecb19c"); 
        System.out.println(person.getUsername());  
        em.close();  
	}
}
