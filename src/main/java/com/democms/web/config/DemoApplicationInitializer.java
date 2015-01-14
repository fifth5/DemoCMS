package com.democms.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class DemoApplicationInitializer /*implements WebApplicationInitializer*/{

//	@Override
//	public void onStartup(ServletContext arg0) throws ServletException {
//		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//
//		rootContext.register(DefaultAppConfig.class);
//
//		appContext.addListener(new ContextLoaderListener(rootContext));
//
//		ServletRegistration.Dynamic dispatcher = appContext.addServlet(
//
//		"dispatcher", new DispatcherServlet(rootContext));
//
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
//	}

}
