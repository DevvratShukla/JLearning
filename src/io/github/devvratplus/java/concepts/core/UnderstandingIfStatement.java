package io.github.devvratplus.java.concepts.core;

public class UnderstandingIfStatement {

	public static void main(String[] args) {

		checkIf(4,5);
		checkIf(5,10);
		checkIf(10,10);

	}

	public static void checkIf(int a, int b){
		
		if (a < b){
		System.out.println("True, " + a + " is less than " + b);	
		} else if(a > b) {
			System.out.println("True, " + a + " is greater than " + b);
		} else {
			System.out.println("True, " + a + " is equal to " + b);
		}
		
	}
	
}
