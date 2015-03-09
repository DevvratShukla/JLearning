package io.github.devvratplus.java.concepts.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnderstandingExceptionHandling1 {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "/files/readme.txt1");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Operation completed.");
	}

}
