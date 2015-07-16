package com.democms.system.platform.framework.util;

import com.democms.model.po.TBanner;
import com.democms.system.platform.framework.spring.InitialData;

import java.util.List;

/**
 * Created by Simon on 2015/7/16.
 */
public class PageData {
    public static List<TBanner> bannerList = InitialData.bannerList;

    public static List<TBanner> getBannerList(){
        if(bannerList == null){
            bannerList = InitialData.bannerList;
        }
        return  bannerList;
    }

}
