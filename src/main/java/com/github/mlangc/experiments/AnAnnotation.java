package com.github.mlangc.experiments;

public @interface AnAnnotation {
	Class<?> value1() default Integer.class;
	Class<?> value2() default Integer.class;
	int value3() default 42;
}
