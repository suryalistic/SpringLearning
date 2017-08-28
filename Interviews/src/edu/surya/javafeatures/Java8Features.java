package edu.surya.javafeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Java8Features {
//	public static void main(String args[]){
//		System.out.println(randomString(-229985452) + " " + randomString(-147909649));
//	}
//
//	public static String randomString(int i)
//	{ 
//		Random ran = new Random(i);   
//		StringBuilder sb = new StringBuilder(); 
//		while (true)   
//		{        
//			int k = ran.nextInt(27);       
//			if (k == 0)        
//				break;       
//			sb.append((char)('`' + k));   
//		} 
//		return sb.toString();
//	}
	
	public static void main(String args[]){
		
		//lambda		
		DummyInterface s3 = (s1, s2) -> {System.out.println(s1+s2);return (s1+s2);};
		s3.summ("surya ", "vojjala");
		
		
		
		//lambda with onus on object 
		List<Integer> ints = Arrays.asList(1,2,4,10);
		ints.forEach((Integer e) -> System.out.println(e));
		
		//mthod reference 
		DummyInterface2 d2 = System.out::println;
		d2.nonn("dummy string");
		
		
	}
	
	@FunctionalInterface
	private interface DummyInterface{
		String summ(String s1,String s2);
	}
	
	@FunctionalInterface
	private interface DummyInterface2{
		void nonn(String  s1);
	}
}