package edu.spring.mod3.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MethodAroundAdvisor implements MethodInterceptor {
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("before the execution of actul method");
		System.out.println("mthod to be executed>>>"+arg0.getMethod().getName());
		Object obj = arg0.proceed();
		System.out.println("method executed and result>>"+obj.toString());
		System.out.println("after the execution of actul method");
		return obj;
	}
}