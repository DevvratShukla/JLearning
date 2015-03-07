package io.github.devvratplus.java.concepts.core;

public class UnderstandingArraysOfStrings {

	public static void main(String[] args) {

		String text = null; //Way to Initialize a string
		System.out.println(text);
		
		//Way 1. Creating and initializing a String array
		String[] greetings = new String[3];
		
		System.out.println("***Before Initializing***");
		System.out.println(greetings[0]);
		System.out.println(greetings[1]);
		System.out.println(greetings[2]);
		
		//Initialing the string array
		greetings[0] = "hello";
		greetings[1] = "hastalavista";
		greetings[2] = "sayonara";	
		
		System.out.println("***After Initializing***");
		for(int i=0;i<greetings.length;i++){
			System.out.println(greetings[i]);
		}
		
		//Way 2. Creating and initializing a String array

		String[] fruits = {"Apple", "Banana", "Kiwi", "Strawberry", "Papaya"};
		
		//traversing the string array using for-each loop
		System.out.println("***Array initialed at creation***");
		for(String fruit : fruits){
			System.out.println(fruit);
		}
		
	}

}
