package com.democms.dao.console;

import java.util.List;

import com.democms.dao.IGenericDao;
import com.democms.model.po.TUser;

public interface UserDao extends IGenericDao{

	List<TUser> selectUserListByEmail(String email);

}
