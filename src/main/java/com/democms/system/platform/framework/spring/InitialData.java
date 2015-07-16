package com.democms.system.platform.framework.spring;

import com.democms.model.po.TBanner;
import com.democms.service.content.BannerService;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Simon on 2015/7/16.
 */
public class InitialData implements InitializingBean {

    @Resource
    private  BannerService bannerServiceImpl;

    public static List<TBanner> bannerList = null;

    @Override
    public void afterPropertiesSet() throws Exception {
        bannerList = bannerServiceImpl.selectBannerList();
    }

}

