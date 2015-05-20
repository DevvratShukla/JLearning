package io.github.devvratplus.java.concepts.core;

public class UnderstandingTernaryOperator {

	/*
	 * Java ternary operator let's you assign a value to a variable based on
	 * a boolean expression (either a boolean field, or a statement that
	 * evaluates to a boolean result). e.g.
	 * 
	 * result = testCondition ? value1 : value2
	 * 
	 * "If testCondition is true, assign the value of value1 to result;
	 * otherwise, assign the value of value2 to result."
	 */

	public static void main(String[] args) {

		int a = 11, b = 27, abs = -1;
		int c;

		// min example
		c = (a < b ? a : b);
		System.out.println("The min of " + a + " and " + b + " is > " + c);
		
		//max example
		c = ( a > b ? a : b);
		System.out.println("The max of " + a + " and " + b + " is > " + c);
		
		// absolute value
		c = (abs > 0 ? abs : -abs);
		System.out.println("The absolute value of " + abs + " is > " + c);
		
		// example using the ternary operator on the rhs, in a string
		int x = 5;
		String out = "There "
				+ (x > 1 ? " are " + x + " cookies" : "is one cookie")
				+ " in the jar.";
		System.out.println(out);

		/*
		 * Here's his first example, where he showed that the ternary operator
		 * can be used to avoid replicating a call to a function with a lot of
		 * parameters:
		 * 
		 * myFunc( (COND ? defaultValue : getMyFuncParameter()) );
		 */

	}
	
}
