package com.democms.service.content;

import java.util.List;

import com.democms.model.po.TBanner;

public interface BannerService {

	TBanner insertBanner(TBanner banner) throws Exception;

	List<TBanner> selectBannerList() throws Exception;

}
