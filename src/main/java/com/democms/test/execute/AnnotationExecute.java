package com.democms.test.execute;

import java.lang.reflect.Method;

import com.democms.test.annotation.FieldAnnotation;
import com.democms.test.annotation.TypeAnnotation;

public class AnnotationExecute {
	
	@FieldAnnotation("ss")
	public String viriableField ;
	
	public String getViriableField() {
		return viriableField;
	}

	public void setViriableField(String viriableField) {
		this.viriableField = viriableField;
	}

	public static void main(String args[]){
		AnnotationExecute a = new  AnnotationExecute();
		System.out.println(a.viriableField);
	}
}
