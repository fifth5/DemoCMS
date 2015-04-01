package com.democms.dao.console;

import java.util.List;

import com.democms.model.po.TUser;
import com.democms.system.platform.framework.jpa.IGenericDao;

public interface UserDao extends IGenericDao{

	List<TUser> selectUserListByEmail(String email);

	List<TUser> queryUserListByEmail(String email);

}
