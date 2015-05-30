package com.democms.service.content.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.democms.dao.content.BannerDAO;
import com.democms.model.po.TBanner;
import com.democms.service.content.BannerService;


@Service
@Transactional
public class BannerServiceImpl implements BannerService {

	@Resource
	private BannerDAO bannerDAOImpl;
	
	@Override
	public TBanner insertBanner(TBanner banner){		
		return bannerDAOImpl.insertBanner(banner);	
	}
}
