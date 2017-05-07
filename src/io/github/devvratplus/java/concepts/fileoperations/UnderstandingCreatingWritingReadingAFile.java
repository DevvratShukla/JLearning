package io.github.devvratplus.java.concepts.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UnderstandingCreatingWritingReadingAFile {

	public static void main(String[] args) throws Exception {
				
		String fileLocation = System.getProperty("user.dir")
				+ "\\files\\CreateSomeRandomFile.txt";
		
		// Creating A file
		File file = new File(fileLocation);
		file.createNewFile();

		// Writing to a file
		FileWriter fileWriter = new FileWriter(fileLocation);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write("Hello World!");
		bufferedWriter.newLine();
		bufferedWriter.write("This file was last written by - Devvrat");
		bufferedWriter.flush();

		bufferedWriter.close();

		// Reading from a file
		FileReader fileReader = new FileReader(fileLocation);
		BufferedReader fileRead = new BufferedReader(fileReader);
		String reading = "";

		while ((reading = fileRead.readLine()) != null) {
			System.out.println(reading);
		}

		fileRead.close();
	}

}
