package com.democms.controller.content;

import com.democms.model.po.TArticle;
import com.democms.service.content.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/content/article")
public class ArticleController {

	@Resource
	private ArticleService articleServiceImpl;

	@RequestMapping("/articleBoard")
	public String articleBoard(Model model){
		model.addAttribute("artcileList", articleServiceImpl.selectArticleList());
		return "/console/articleBoard";
	}
	
	@RequestMapping("/articleList")
	public void selectArticleList(Model model) throws Exception{
		articleServiceImpl.selectArticleList();
	}
	
	@RequestMapping("/articleInsert")
	public String insertArticle(TArticle article,Model model) throws Exception {
		articleServiceImpl.insertArticle(article);
        return "/console/articleInsert";
	}

	@RequestMapping("/articleUpdate")
	public void updateArticle(TArticle article,Model model) throws Exception{
		articleServiceImpl.updateArticle(article);
	}

	@RequestMapping("/article")
	public void queryArticleById(String articleId, Model model){
		articleServiceImpl.selectOneArticleById(articleId);
	}
	
}