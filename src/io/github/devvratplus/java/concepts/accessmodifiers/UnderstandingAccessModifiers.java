package io.github.devvratplus.java.concepts.accessmodifiers;

public class UnderstandingAccessModifiers {
	
	public static void main(String[] args) {

		PublicClass pc = new PublicClass();
		// printing the private IV value through getter method
		System.out.println(pc.getName()); 
		System.out.println(pc.type);
		System.out.println(PublicClass.ID);
		System.out.println(PublicClass.day);
		
		//Wont work - name is private
		//System.out.println(plant.name);
		
		// leaving private IV everything else is visible
		// to a sub class
		SomeClass sc = new SomeClass();
		sc.setName("Freddy");
		System.out.println(sc.getName());
		System.out.println(sc.type);
		System.out.println(SomeClass.ID);
		System.out.println(SomeClass.day);
	}

}
