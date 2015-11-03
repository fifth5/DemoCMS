package com.democms.controller.console;

import com.democms.model.domain.Result;
import com.democms.model.po.TUser;
import com.democms.service.console.ConsoleLoginService;
import com.democms.service.content.ArticleService;
import com.democms.service.content.BannerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by FIFTH on 2015/10/17.
 */
@Controller
@RequestMapping("/console")
public class ConsoleController {

    private static Logger logger = LogManager.getLogger(LoginController.class);

    @Resource
    private ConsoleLoginService consoleLoginServiceImpl;

    @Resource
    private BannerService bannerServiceImpl;

    @Resource
    private ArticleService articleServiceImpl;

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
            return "console.default";
        }

        return "login";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "loginPage";
    }

    @RequestMapping("/dashboard")
    public String dashBoard(){
        return "console.default";
    }

    @RequestMapping("/bannerBoard")
    public String bannerBoard(HttpServletRequest request, Model model){
        try {
            model.addAttribute("bannerList",bannerServiceImpl.selectBannerList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "console/bannerBoard";
    }

    @RequestMapping("/bannerInsertPage")
    public String bannerInsertPage(HttpServletRequest request, Model model){
        return "console/bannerInsert";
    }

    @RequestMapping("/articleBoard")
    public String articleBoard(HttpServletRequest request,Model model){
        try {
            model.addAttribute("articleList",articleServiceImpl.selectArticleList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "console/articleBoard";
    }

    @RequestMapping("/articleInsertPage")
    public String articleInsertPage(HttpServletRequest request,Model model){
        return "console/articleInsert";
    }

    @RequestMapping("/{articleId}/articleUpdatePage")
    public String articleUpdatePage(@PathVariable(value = "articleId") String articleId,Model model){
        model.addAttribute("article",articleServiceImpl.selectOneArticleById(articleId));
        return "console/articleUpdate";
    }

}
