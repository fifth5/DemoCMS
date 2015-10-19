package com.democms.dao.content;

import com.democms.model.po.TArticle;
import com.democms.model.po.TBanner;

import java.util.List;

public interface ContentDAO {

	TArticle insertArticle(TArticle article) throws Exception;

	List<TArticle> selectArticleList();
}
