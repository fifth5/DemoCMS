package com.democms.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
public @interface TypeAnnotation {

	public String viriableField() default "hello world";
}
