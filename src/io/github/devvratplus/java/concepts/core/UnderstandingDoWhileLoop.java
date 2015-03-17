package io.github.devvratplus.java.concepts.core;

import java.util.Scanner;

public class UnderstandingDoWhileLoop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int value;
		
		do{
			System.out.print("Enter a number > ");
			 value = input.nextInt();
		} while(value!=5);
		
		System.out.println("Got 5!");
	}

}
