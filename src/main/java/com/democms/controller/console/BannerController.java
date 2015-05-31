package com.democms.controller.console;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.model.po.TBanner;
import com.democms.service.content.BannerService;


@Controller
@RequestMapping("/console/banner")
public class BannerController {

	@Resource
	private BannerService bannerServiceImpl;
	
	@RequestMapping("**")
	public String toBannerManage(){
		return "console/banner";
	}
	
	
	@RequestMapping("/bannerInsert")
	public void bannerInsert(Model model, TBanner banner){
		try {
			bannerServiceImpl.insertBanner(banner);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
