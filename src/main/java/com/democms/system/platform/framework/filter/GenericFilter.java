package com.democms.system.platform.framework.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.democms.model.pojo.SystemInfo;

public class GenericFilter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	
		SystemInfo system = new SystemInfo();
		String path = request.getServerName()+":"+request.getServerPort()+request.getContextPath();
		system.setRootPath(path);
		system.setPath(request.getContextPath());
		System.out.print(system.getRootPath());
		request.setAttribute("system",system);
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	
	}

}
