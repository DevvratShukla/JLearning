package coreConceptsInJava;

public class UnderstandingConstructors {

	public static void main(String[] args) {
		new Machine(); //invoking the constructor
		new Machine("Evo");
		new Machine("Hello", 45);
	}

}

class Machine {
	private String name;
	
	//constructor is a method which is called every time a class is instantiated
	//constructor doesn't have any return type
	//constructor has the same name as that of the class
	//constructor starts with a upper case same name as that of the class
	//constructor is used for initialization of instance variable
	//One constructor can call another constructor, just that constructor to be called
	//should be the first statement of the calling constructor
	Machine(){
		name="Ana";
		System.out.println("first constructor running!");
	}
	
	Machine(String name){
		this.name = name;
		System.out.println("second constructor running! " + name);
	}
	
	Machine(String greet, int code){
		this(); //calling the constructor Machine() 
		System.out.println("third constructor running! " + greet + " " + name + " " + code);
	}
}
