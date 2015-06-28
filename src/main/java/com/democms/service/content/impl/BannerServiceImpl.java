package com.democms.service.content.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.democms.dao.content.BannerDAO;
import com.democms.dao.user.UserDao;
import com.democms.model.po.TBanner;
import com.democms.model.po.TUser;
import com.democms.service.content.BannerService;
import com.democms.system.platform.framework.util.SpringPropertyResourceReader;


@Service
@Transactional
public class BannerServiceImpl implements BannerService {

	@Resource
	private BannerDAO bannerDAOImpl;
	@Resource
	private UserDao userDaoImpl;
	
	@Override
	@Transactional//(rollbackFor=java.lang.Exception.class)
	public TBanner insertBanner(TBanner banner) throws Exception{		

		TUser user = new TUser();
		bannerDAOImpl.insertBanner(banner);
		String ssss = SpringPropertyResourceReader.getProperty("mysql.version");
		System.out.println(">>>>>>"+ssss);
		userDaoImpl.insertUser(user);
		return null;
	}
}
