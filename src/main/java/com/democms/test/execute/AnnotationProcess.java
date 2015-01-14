package com.democms.test.execute;

import java.lang.reflect.*;

import com.democms.test.annotation.FieldAnnotation;


public class AnnotationProcess {

	public static void getAnnoInfo(Class<?> clazz){
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields){
			if(field.isAnnotationPresent(FieldAnnotation.class)){
				FieldAnnotation f = field.getAnnotation(FieldAnnotation.class);
				String fvalue = f.value();
				System.out.println(fvalue);
			}
		}
	}
	
	public static void main(String[] args){
		AnnotationProcess.getAnnoInfo(AnnotationExecute.class);
	}
}
