package com.democms.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

//@Component
public class PersistenceTool {

	public static  EntityManagerFactory factory = null;
	
	public static void main(String args[]){
	
	}
	
	public PersistenceTool(){
		System.out.println("PersistenceTool Init>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		PersistenceTool.factory =  Persistence.createEntityManagerFactory("demodb"); 
	}

}
