package edu.spring.mod3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopAspectAdvisor {
	@Before("execution(* edu.spring.mod3.service.*.*(..))")
	public void logging(JoinPoint joinpoint){
		System.out.println("AopAspectAdvisor>>logging>>"+joinpoint.getSignature());
	}
}
