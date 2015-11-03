package com.democms.controller.content;

import com.democms.model.po.TArticle;
import com.democms.service.content.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

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
		return "redirect:/console/articleBoard";
	}


	@RequestMapping("/{articleId}/articleUpdate")
	public String articleUpdate(@PathVariable(value = "articleId") String articleId,Model model,TArticle article) throws Exception {
		TArticle entity = articleServiceImpl.selectOneArticleById(articleId);
		entity.setEditTime(new Date());
		entity.setContent(article.getContent());
		entity.setTitle(article.getTitle());
		articleServiceImpl.updateArticle(entity);
		return "redirect:/console/articleBoard";
	}


}
