package com.democms.service.content.impl;


import com.democms.dao.content.ArticleDAO;
import com.democms.model.po.TArticle;
import com.democms.service.content.ArticleService;
import com.democms.system.platform.framework.service.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class ArticleServiceImpl extends GenericService implements ArticleService {

	@Resource
	private ArticleDAO articleDAOImpl;

	@Override
	@Transactional
	public TArticle insertArticle(TArticle article) throws Exception {
		article.setDeleted(0);
		article.setInsertTime(new Date());
		article.setEditTime(new Date());
		return articleDAOImpl.insertArticle(article);
	}

	@Override
	@Transactional
	public TArticle updateArticle(TArticle article) throws Exception {
		return articleDAOImpl.updateArticle(article);
	}

	@Override
	public List<TArticle> selectArticleList(){
		return articleDAOImpl.selectArticleList();
	}

	@Override
	public TArticle selectOneArticleById(String ArticleId){
		return articleDAOImpl.selectArticleById(ArticleId);
	}

}
