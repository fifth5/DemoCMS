package com.democms.service.console;

import com.democms.model.domain.Result;
import com.democms.model.po.TUser;

public interface ConsoleLoginService {

	void checkUser(TUser user,Result result);

}
