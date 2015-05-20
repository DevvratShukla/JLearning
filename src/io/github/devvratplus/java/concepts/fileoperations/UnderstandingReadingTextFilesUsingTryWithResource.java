package io.github.devvratplus.java.concepts.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UnderstandingReadingTextFilesUsingTryWithResource {

	public static void main(String[] args){
		File file = new File(System.getProperty("user.dir") + "//files//readme.txt");
		
		// Introduced in Java 7
		// Try With Resources 
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
				System.out.println("Unable to find the file @ " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read the file @ " + file.toString());
			e.printStackTrace();
		}
		
		// using try with resources you do not need to close the bufferedreader/FileReader
	}
}
