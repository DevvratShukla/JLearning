package io.github.devvratplus.java.concepts.core;

public class UnderstandingForLoop {

	public static void main(String[] args) {
		forLoop();
		
	}

	/**
	 * <b>Here is the system details <br>
	 * for (initialization; termination;increment) { statement(s) } </b>
	 * <br><br>
	 * When using this version of the for statement, keep in mind that:
	 * <br>
	 * The initialization expression initializes the loop; it's executed
	 * once, as the loop begins.<br> When the termination expression evaluates
	 * to false, the loop terminates. <br>The increment expression is invoked
	 * after each iteration through the loop; it is perfectly acceptable for
	 * this expression to increment or decrement a value.
	 */
	public static void forLoop(){
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value if i is " + i);
		}

		// This starts printing from i=0 to i=10
		
		
	}
	
}
