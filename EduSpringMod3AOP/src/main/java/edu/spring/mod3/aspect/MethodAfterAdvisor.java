package edu.spring.mod3.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfterAdvisor implements AfterReturningAdvice {
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("MethodAfterAdvisor>afterReturning Begin");
		System.out.println("metod>>"+arg1.getName());
		System.out.println("metod>>"+arg1.getParameterCount());
		System.out.println("Object[] arg2>>"+arg2);
		System.out.println("Object arg3>>"+arg3);
		System.out.println("MethodAfterAdvisor>afterReturning End");
	}
}