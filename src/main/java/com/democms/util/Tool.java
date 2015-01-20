package com.democms.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class Tool {

	public static  EntityManagerFactory factory = null;
	
	public static void main(String args[]){
		System.out.println("hello world");
	}
	
	public Tool(){
		System.out.println("tool init>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		this.factory =  Persistence.createEntityManagerFactory("demodb"); 
	}

}
