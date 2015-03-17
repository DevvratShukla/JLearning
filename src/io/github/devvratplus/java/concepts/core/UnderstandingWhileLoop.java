package io.github.devvratplus.java.concepts.core;

public class UnderstandingWhileLoop {

	public static void main(String[] args) {

		factorialOf(4); // this method prints the factorial using while loop
		
	}

	public static void factorialOf(int value){
		
		int facto = 1;
		
		while(value >= 1){ // while value is greater than equal to 1 then go inside loop
			facto *= value;
			value--;
		}
		
		System.out.println("Factorial is " +  facto);
	}
	
}
