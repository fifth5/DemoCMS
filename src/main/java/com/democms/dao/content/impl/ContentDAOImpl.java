package com.democms.dao.content.impl;

import com.democms.dao.content.BannerDAO;
import com.democms.dao.content.ContentDAO;
import com.democms.model.po.TArticle;
import com.democms.model.po.TBanner;
import com.democms.system.platform.framework.dao.GenericDaoImpl;
import com.democms.system.platform.framework.jpa.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContentDAOImpl extends GenericDaoImpl implements ContentDAO {

	@Override
	public TArticle insertArticle(TArticle article) throws Exception{
		return this.insert(article);
	}
	
	@Override
	public List<TArticle> selectArticleList(){
		Query query = this.getQuery(TArticle.class);
		return this.selectList(query);
	}
	
}
