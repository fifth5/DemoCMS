package com.democms.controller.content;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.democms.service.content.BannerService;

@Controller
@RequestMapping("/content/banner")
public class BannerController {

	@Resource
	private BannerService bannerServiceImpl;
	
	@RequestMapping("/bannerList")
	public void selectBannerList(Model model) throws Exception{
		model.addAttribute("bannerList", bannerServiceImpl.selectBannerList());
	}
	
}
