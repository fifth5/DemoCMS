package com.democms.service.content;

import com.democms.model.po.TArticle;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ArticleService {


	@Transactional
	TArticle insertArticle(TArticle article) throws Exception;

	@Transactional
	TArticle updateArticle(TArticle article) throws Exception;

	List<TArticle> selectArticleList();

	TArticle selectOneArticleById(String ArticleId);
}
