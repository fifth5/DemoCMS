package com.democms.dao.content.impl;

import org.springframework.stereotype.Repository;

import com.democms.dao.content.BannerDAO;
import com.democms.model.po.TBanner;
import com.democms.system.platform.framework.dao.GenericDaoImpl;

@Repository
public class BannerDAOImpl extends GenericDaoImpl implements BannerDAO{

	@Override
	public TBanner insertBanner(TBanner banner){
		return this.insert(banner);
	}
	
	
}
