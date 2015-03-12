package io.github.devvratplus.java.concepts.fileoperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UnderstandingWritingFilesUsingTryWithResources {

	public static void main(String[] args){
		
		File file = new File(System.getProperty("user.dir") + "//files//writeme.txt");
		
		// Introduced in Java 7
		// Try With Resources 
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			bw.write("Hey how are you mate!");
			bw.newLine();
			bw.write("What's going on? Where are you these days?");
			
		} catch (IOException e) {
			System.out.println("Unable to write to the file @ " + file.toString());
		} 
		
		//using try with resources you do not need to close the bufferedWriter
	}
}
