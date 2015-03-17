package io.github.devvratplus.java.concepts.algorithms;

public class UnderstandingRecursion {
	public static void main(String[] args){
		int value = 0;
		
		calculate(value);
		System.out.println("Factorial of " +  value + " is " + factorial(value));
		
	}
	
	// recursive method: may lead to stack overflow error
	public static void calculate(int value){
		System.out.println(value);
		
		if(value <= 1){
			return;
		}
		
		calculate(value -1); 
	
	}
	
	public static int factorial(int value){
		
		if(value <= 1){
			return 1;
		}
		
		return factorial(value -1)*value;

	}

}
