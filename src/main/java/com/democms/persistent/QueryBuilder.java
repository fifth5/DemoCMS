package com.democms.persistent;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;




public class QueryBuilder<E> {

	private Class<E> clazz;
	private Predicate predicate;
	
	public  void from(Class<E> clazz){
		this.clazz = clazz;
	}
	
	public Class<E> getClazz(){
		return  this.clazz;
	}
	
	public void setPredicate(Predicate predicate){
		this.predicate = predicate;
	}
	
	public Predicate getPredicate(){
		return this.predicate;
	}
	
	
	
	public void setPredicate(Root<E> root, CriteriaBuilder criteriaBuilder){
		this.predicate = criteriaBuilder.equal(root.get("guid"),"16cea83c-b02d-11e4-88e0-8c89a5ecb19c");
	}
}
