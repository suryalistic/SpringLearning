package edu.surya.javafeatures;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java7Features {

	public static void main(String[] args) {
//		someFeatures("Two");
//		someFeatures("TWO");
//		someFeatures("1");
		
//		fileAutoCloseStream();
		
		pathtest();
	}

	public static void someFeatures(String type){
		Map<String, List<String>> map1 = new HashMap<>();
		
		switch (type) {
		case "ONE":
			System.out.println("One");
			break;
		case "TWO":
			System.out.println("Two");
		default:
			System.out.println("Dumb");
			break;
		}
	}
	
	public static void fileAutoCloseStream(){
		try(FileOutputStream fos = new FileOutputStream("some.txt");
				DataOutputStream dos = new DataOutputStream(fos);){
			dos.writeInt(10000000);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
		}
	}
	
	public static void pathtest(){
		Path path = Paths.get("/home/surya/development");
		System.out.println(path.getNameCount());
		System.out.println(path.getParent());
	}
}
