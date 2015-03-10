package io.github.devvratplus.java.concepts.exceptionhandling;

public class UnderstandingKindsOfExceptions {

	public static void main(String[] args)  {

	/*
	 * There are two kinds of exceptions
	 * 1. Runtime Exception > Exception from which a program cannot recover from
	 * is Runtime Exception. Thus it is very unlikely that you could handle it proactively
	 * 2. Checked Exceptions > Exceptions you are forced to handle
	 */
		
		//Example of checked exception
		try {
			Thread.sleep(111); // throws InterruptedException which we need to handle
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} 
		
		//Example of runtime exception
		try {
			String text = null;
			System.out.println(text.length());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		//Example of runtime exception
		try {
			String[] starry = {"hello", "hi", "Cherios"};
			System.out.println(starry[3]);
		} catch (RuntimeException e1) {
			e1.printStackTrace();
		}
		
		//Example of runtime exception
		try {
			int value =7;
			value+=1;
			value /=0; // java.lang.ArithmeticException: / by zero
			//Execution stops here
			System.out.println(value);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
				
	}

}
