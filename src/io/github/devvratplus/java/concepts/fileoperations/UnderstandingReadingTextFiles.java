package io.github.devvratplus.java.concepts.fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnderstandingReadingTextFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		File textFile = new File(System.getProperty("user.dir") + "/files/readme.txt");
		
		Scanner in = new Scanner(textFile);
		StringBuilder sb = new StringBuilder();
		
		while(in.hasNextLine()){
			sb.append(in.nextLine() + "\n");			
		}
		
		System.out.println(sb);
				
		in.close();
	}

}
