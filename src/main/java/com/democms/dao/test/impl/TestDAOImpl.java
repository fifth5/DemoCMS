package com.democms.dao.test.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Repository;

import com.democms.dao.test.TestDAO;
import com.democms.model.po.TUser;
import com.democms.system.platform.framework.dao.GenericDaoImpl;

@Repository
public class TestDAOImpl extends GenericDaoImpl implements TestDAO{

	@Override
	public void printDBInfo(){ 
      TUser person = this.selectOneByGuid(TUser.class,"2383c86a-b02d-11e4-88e0-8c89a5ecb19c"); 
      System.out.println(person.getUsername());
	}
}
