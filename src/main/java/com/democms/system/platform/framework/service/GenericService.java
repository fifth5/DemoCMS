package com.democms.system.platform.framework.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor=java.lang.Exception.class)
public abstract class GenericService {
}
