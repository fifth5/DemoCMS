package com.democms.controller.console;

import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import com.democms.service.content.BannerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static Logger logger = LogManager.getLogger(LoginController.class);
	
	@Resource
	private ConsoleLoginService consoleLoginServiceImpl;

	@Resource
	private BannerService bannerServiceImpl;

	@RequestMapping("**")
	public String consoleLoginPage(Model model){
		System.out.println(">>>>>>>>> ");


		model.addAttribute("system", "efadsfadsfas");
		return "loginPage";
	}
	
	
	@RequestMapping("/loginPage")
	public String loginPage(){
		return "loginPage";
	}
	

	@RequestMapping("/regesterPage")
	public  String regesterPage(){
		return "regesterPage";
	}

	@RequestMapping("/checkUser")
	@ResponseBody
	public Result checkUser(HttpServletRequest request, Model model, TUser user){
		Result result =  new Result();
		consoleLoginServiceImpl.checkUser(user,result);
		return result;
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model, TUser user) throws Exception {
		Result result =  new Result();
		consoleLoginServiceImpl.checkUser(user,result);

		model.addAttribute("result", result);

		if(result.getResult()){
			model.addAttribute("bannerList",bannerServiceImpl.selectBannerList());
			return "console/tiles/layout";
		}

		return "login";
	}

	@RequestMapping("/logout")
	public String logout(){
		return "loginPage";
	}
	
	
	@RequestMapping("/test")
	public String userLogin2(){
		return "";
	}
}
