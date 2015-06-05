package com.democms.dao.content.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.democms.dao.content.BannerDAO;
import com.democms.model.po.TBanner;
import com.democms.system.platform.framework.dao.GenericDaoImpl;

@Repository
public class BannerDAOImpl extends GenericDaoImpl implements BannerDAO{

	@Override
	public void insertBanner(TBanner banner) throws Exception{
		banner.setBannerName("test");
		banner.setBannerViewName("testViewName");
		//banner.setGuid(1000);
		//this.entityManagerFactory.createEntityManager().refresh(banner);
		//this.entityManagerFactory.createEntityManager().persist(banner);

			this.entityManager.persist(banner);
			System.out.println("hello world");
			
			//throw new Exception("exception");

		
	}
	
	
}
