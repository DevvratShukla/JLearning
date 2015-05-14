package io.github.devvratplus.java.concepts.classes;

public class UnderstandingClassesThatCannotBeInstantiated {

	public static void main(String[] args) {

		// you cannot instantiate an abstract class
		// OS os = new OS(); > This will throw an error
		OS.info(); // > calling its static method is possible

		// since Tizen extends OS
		// Tizen can call OS's methods
		Tizen a = new Tizen();
		a.setId(9);
		System.out.println("The value of ID is > " + a.getId());

		// you cannot instantiate a class who's constructor
		// is marked private
		// Unity u = new Unity(); > This will throw an error
		Unity.info();
		Unity.callTheConstructor();

	}

}

abstract class OS {
	private int id;

	public static void info() {
		System.out.println("I am defined in an abstract class, "
				+ "one who extends me can refer my non-static methods.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class Tizen extends OS {

}

class Unity {

	private int id;

	private Unity() {
		// Constructor marked private
		// This call cannot be instantiated.
		System.out.println("Hello, i am the constructor of Unity.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Static Methods

	public static void info() {
		System.out.println("Hello, I am Unity Class. "
				+ "I cannot be instantiated my constractor is marked private,"
				+ " but you can call my static methods.");
	}

	public static void callTheConstructor() {

		// This class can be only instantiated within the class itself
		new Unity();

	}

}