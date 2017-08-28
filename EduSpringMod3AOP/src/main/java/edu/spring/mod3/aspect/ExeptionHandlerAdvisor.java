package edu.spring.mod3.aspect;

import org.springframework.aop.ThrowsAdvice;

public class ExeptionHandlerAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception e){
		System.out.println("Exception handled in ExeptionHandlerAdvisor>>>"+e.getMessage());
	}
}
		