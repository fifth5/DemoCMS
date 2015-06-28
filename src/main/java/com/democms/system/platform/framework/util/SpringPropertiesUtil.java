package com.democms.system.platform.framework.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Deprecated
public class SpringPropertiesUtil implements ApplicationContextAware {

	public static final String KEY = "propertyConfigurer";
    private static ApplicationContext applicationContext;
    
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringPropertiesUtil.applicationContext = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
	
	public static String getStringProperty(String keyName) {
		//CustomizedPropertyPlaceholderConfigurer cp = (CustomizedPropertyPlaceholderConfigurer) applicationContext.getBean(KEY);
        //return cp.getProperty(keyName).toString();
        return CustomizedPropertyPlaceholderConfigurer.getProperty(keyName).toString();
    }
	
	public static int getIntProperty(String keyName){
		//CustomizedPropertyPlaceholderConfigurer cp = (CustomizedPropertyPlaceholderConfigurer) applicationContext.getBean(KEY);
        //return Integer.parseInt(cp.getProperty(keyName).toString());
		return Integer.parseInt(CustomizedPropertyPlaceholderConfigurer.getProperty(keyName).toString());
	}
	
    public static double getDoubleProperty(String keyName) {
        //CustomizedPropertyPlaceholderConfigurer cp = (CustomizedPropertyPlaceholderConfigurer) applicationContext.getBean(KEY);
        //return Double.parseDouble(cp.getProperty(keyName).toString());
    	return Double.parseDouble(CustomizedPropertyPlaceholderConfigurer.getProperty(keyName).toString());
    }

}
