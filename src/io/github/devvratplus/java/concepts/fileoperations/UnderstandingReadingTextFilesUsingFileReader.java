package io.github.devvratplus.java.concepts.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UnderstandingReadingTextFilesUsingFileReader {
	
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") + "//files//readme.txt");
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
						
		} catch (FileNotFoundException e) {
			System.out.println("File not found @ " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read the txt file @ " + file.toString());
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close the file @ " + file.toString());
			} catch (Exception e) {
				// File was never opened
			}
		}
				
	}

}
