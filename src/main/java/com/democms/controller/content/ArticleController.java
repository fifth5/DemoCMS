package com.democms.controller.content;

import com.democms.model.po.TArticle;
import com.democms.model.po.TBanner;
import com.democms.service.content.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/content/article")
public class ArticleController {

	@Resource
	private ArticleService ArticleServiceImpl;
	
	@RequestMapping("/articleList")
	public void selectArticleList(Model model) throws Exception{
		ArticleServiceImpl.selectArticleList();
	}
	
	@RequestMapping("/articleInsert")
	public String insertArticle(TArticle article,Model model) throws Exception {
		ArticleServiceImpl.insertArticle(article);
        return "/console/articleBoard";
	}

	@RequestMapping("/articleUpdate")
	public void updateArticle(TArticle article,Model model) throws Exception{
		ArticleServiceImpl.updateArticle(article);
	}

	@RequestMapping("/article")
	public void queryArticleById(String articleId, Model model){
		ArticleServiceImpl.selectOneArticleById(articleId);
	}
	
}
