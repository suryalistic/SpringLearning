package edu.spring.mod3.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdvisor implements MethodBeforeAdvice {
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(">>>>executing methodbeforeadvisor>>MethodBeforeAdvisor.before.");
	}
}