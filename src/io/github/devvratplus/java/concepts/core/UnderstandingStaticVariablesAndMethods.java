package io.github.devvratplus.java.concepts.core;

public class UnderstandingStaticVariablesAndMethods {
	
	/*
	 * What is Static
	 * 
	 * Static is a Non Access Modifier. 
	 * 
	 * Static keyword can be applied on
	 * 
	 * Method Variable Class nested within another Class Initialization Block
	 */
	static{System.out.println("static block is invoked");}  
	public static void main(String[] args) {

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.showName();
		thing2.showName();
		
		Thing.showDescription(); //calling the static methods i.e. by using their class name
		Thing.showInfo();

		// Initializing name and description
		thing1.name = "Ana";
		thing2.name = "Eve";
		Thing.description = "I am a static variable.";

		thing1.showName();
		thing2.showName();
		
		Thing.showDescription(); //calling the static methods i.e. by using their class name
		Thing.showInfo();
	}

}

class Thing {
	public String name;
	public static String description;
	private static String function;
	
	// static initializer
	// Initializes the static variables
	static{
		function = "I am a thing, i do something.";
	}
	
	public void showName(){
		System.out.println(Thing.description + name);
		//non static methods can call static variables
		showInfo(); 
		// you can call a static method from an non-static method
		// But not vice-versa
	}
	
	public static void showInfo(){
		System.out.println("I am a static Method");
	    //static methods cannot make a call to non-static variables 
		//i.e instance variables
	}
	
	public static void showDescription(){
		System.out.println(description + " " + function);
	}

}