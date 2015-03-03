package coreConceptsInJava;

public class UnderstandingStaticVariablesAndMethods {

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
		Thing.DESCRIPTION = "I am a static variable ";

		thing1.showName();
		thing2.showName();
		
		Thing.showDescription(); //calling the static methods i.e. by using their class name
		Thing.showInfo();
	}

}

class Thing {
	public String name;
	public static String DESCRIPTION;
	
	public void showName(){
		System.out.println(Thing.DESCRIPTION + name);
		//non static methods can call static variables
	}
	
	public static void showInfo(){
		System.out.println("I am a static Method");
	    //static methods cannot make a call to non-static variables 
		//i.e instance variables
	}
	
	public static void showDescription(){
		System.out.println(Thing.DESCRIPTION);
	}

}