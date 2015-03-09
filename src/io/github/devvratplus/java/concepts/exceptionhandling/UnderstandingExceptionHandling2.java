package io.github.devvratplus.java.concepts.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnderstandingExceptionHandling2 {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "/files/readme.txt1");
		
		try {
			 openFile(file);
			 
		} catch (FileNotFoundException e) {
			System.out.println("File not found:" + file.toString());
			//printing more relevant error message than just stack trace 
		}
		
		System.out.println("Operation completed.");
	}

	public static void openFile(File file) throws FileNotFoundException{
		FileReader fr = new FileReader(file);
	}
}
