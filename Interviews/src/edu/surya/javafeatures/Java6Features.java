package edu.surya.javafeatures;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Java6Features {

	public static void main(String[] args) {
		Java6Features j6f = new Java6Features();
		Class<?> j6fc = j6f.getClass();
		try {
			Method mOne = j6fc.getMethod("methodOne", null);
			mOne.invoke(j6f, args);
		} catch (NoSuchMethodException |SecurityException |IllegalAccessException 
				|IllegalArgumentException |InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public void methodOne(){
		System.out.println("this is method1");
	}
	
}
