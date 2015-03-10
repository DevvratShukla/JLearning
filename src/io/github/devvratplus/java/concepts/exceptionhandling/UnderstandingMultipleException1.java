package io.github.devvratplus.java.concepts.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class UnderstandingMultipleException1 {

	public static void main(String[] args) throws ParseException {
		TestException te1 = new TestException();

		// Handling exception using try/catch
		try {
			te1.run("io");
		} catch (IOException e) {
			System.out.println("Caught IOException");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Caught Parse  Exception");
			e.printStackTrace();
		}

		TestException te2 = new TestException();

		// Handling exception using try/multi-catch introduced in Java 7
		try {
			te2.run("pars");
		} catch (IOException | ParseException e) {
			System.out.println("Caught in multi-catch block");
			e.printStackTrace();
		}

		TestException te3 = new TestException();

		// Handling exception using the parent class Excepti
		try {
			te3.run("io");
		} catch (Exception e) {
			System.out.println("Caught through parent class exception");
			e.printStackTrace();
		}

		TestException te4 = new TestException();
		try {
			te4.run("io");
		} catch (FileNotFoundException e) {
			// child class in the hierarchy of exception should be listed first
			System.out.println("Caught FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Caught IOException");
			e.printStackTrace();
		}
	}

}

class TestException {

	public void run(String excp) throws IOException, ParseException {

		if (excp == "io") {
			throw new IOException();
		} else if (excp == "fnfe") {
			throw new FileNotFoundException();
		} else if (excp == "pars") {
			throw new ParseException("Error @", 3);
		}
	}
}
