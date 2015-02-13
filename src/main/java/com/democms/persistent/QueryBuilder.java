package com.democms.persistent;





public class QueryBuilder<E> {
	

	private  Class<E> classType;

	
	public QueryBuilder(Class<E> clazz){
		setClassType(clazz);
	}


	public Class<E> getClassType() {
		return classType;
	}


	public void setClassType(Class<E> classType) {
		this.classType = classType;
	}
}
