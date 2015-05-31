package com.democms.dao.user;

import java.util.List;

import com.democms.model.po.TUser;
import com.democms.system.platform.framework.dao.IGenericDao;

public interface UserDao extends IGenericDao{

	List<TUser> selectUserListByEmail(String email);

	void insertUser(TUser user) throws Exception;

}
