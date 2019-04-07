package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnException {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
		FileInputStream file = new FileInputStream("sdf");
		
		Thread.sleep(2000);
	}

}
