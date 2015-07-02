package com.democms.system.platform.framework.util;

import javax.servlet.ServletResponse;
import javax.servlet.Filter;
import javax.servlet.ServletException;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.FilterChain;
import java.io.IOException;

public class CharacterConvert implements Filter {
	private FilterConfig filterConfig = null;
	private String encoding = null;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		
		
		this.encoding = filterConfig.getInitParameter("encoding");
	}

	public void destroy() {
		this.filterConfig = null;
		this.encoding = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

	
		String encoding = selectEncoding(request);
		if (encoding != null)
		{
			System.out.println(">>>>>>>>>>>>>>>>" + encoding);
			request.setCharacterEncoding(encoding);
		}
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}

	private String selectEncoding(ServletRequest request) {
		return (this.encoding);
	}
}