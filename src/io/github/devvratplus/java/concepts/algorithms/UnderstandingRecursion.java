package io.github.devvratplus.java.concepts.algorithms;

public class UnderstandingRecursion {
	public static void main(String[] args){
		int value = 4;
		
		calculate(value);
	}
	
	public static void calculate(int value){
		System.out.println(value);
		
		calculate(value); // This may lead to stack overflow error
	}

}
