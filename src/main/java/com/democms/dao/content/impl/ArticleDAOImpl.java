package com.democms.dao.content.impl;

import com.democms.dao.content.ArticleDAO;
import com.democms.model.po.TArticle;
import com.democms.model.po.TArticle_;
import com.democms.system.platform.framework.dao.GenericDaoImpl;
import com.democms.system.platform.framework.jpa.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOImpl extends GenericDaoImpl implements ArticleDAO {

	@Override
	public TArticle insertArticle(TArticle article) throws Exception{
		return this.insert(article);
	}

    @Override
    public TArticle updateArticle(TArticle article) throws Exception{
        return this.update(article);
    }

	@Override
	public List<TArticle> selectArticleList(){
		Query query = this.getQuery(TArticle.class);
		query.addOrder("insertTime","desc");
		query.addOrder("editTime","desc");
		return this.selectList(query);
	}

    @Override
	public TArticle selectArticleById(String articleId){
		Query query = this.getQuery(TArticle.class);
        query.eq(TArticle_.guid, articleId);
		return this.selectOne(query);
	}
	
}
