package com.democms.dao;

import java.util.List;

public interface IGenericDao {
	public <E> E selectOneByGuid(Class<E> clazz, String guid) ;
	
	public <E> List<E> selectListByEntity(Class<E> clazz);
		
	public <E> E insert(E entity);
	
	public <E> E update(E entity);
	
	public <E> boolean delete(E entity);
}
