package com.democms.wallet.log4j2;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.AbstractLookup;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin( name = "log4j2Configss", category = StrLookup.CATEGORY)
public class Log4j2Config extends AbstractLookup /*implements StrLookup*/ {

//	@Override
//	public String lookup(String key) {
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		return "hello world";
//	}

	@Override
	public String lookup(LogEvent event, String key) {
		return "hello world";
	}

}
