package com.democms.dao.content;

import com.democms.model.po.TArticle;
import com.democms.model.po.TBanner;

import java.util.List;

public interface ArticleDAO {

	TArticle insertArticle(TArticle article) throws Exception;

	TArticle updateArticle(TArticle article) throws Exception;

	List<TArticle> selectArticleList();

	TArticle selectArticleById(String articleId);
}
