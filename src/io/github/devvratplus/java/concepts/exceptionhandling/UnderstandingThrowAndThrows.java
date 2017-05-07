package io.github.devvratplus.java.concepts.exceptionhandling;

public class UnderstandingThrowAndThrows {

	public static void main(String[] args) {
		try {
			testIt();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Java throw keyword is used to explicitly throw an exception. Java throws
	 * keyword is used to declare an exception.
	 * 
	 * Throw is used within the method. Throws is used with the method
	 * signature.
	 * 
	 * @throws MyException
	 */
	public static void testIt() throws MyException {
		throw new MyException("My Custom Exception is thrown.");

	}

}

/**
 * Declared a custom exception.
 * 
 */
class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
}