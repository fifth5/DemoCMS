package com.democms.dao.content;

import java.util.List;

import com.democms.model.po.TBanner;

public interface BannerDAO {

	TBanner insertBanner(TBanner banner) throws Exception;

	List<TBanner> selectBannerList();

}
