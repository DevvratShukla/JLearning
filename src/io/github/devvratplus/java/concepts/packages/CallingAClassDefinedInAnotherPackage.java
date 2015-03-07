package io.github.devvratplus.java.concepts.packages;

import io.github.devvratplus.java.concepts.accessmodifiers.PublicClass;
import io.github.devvratplus.java.concepts.accessmodifiers.SomeClass;

public class CallingAClassDefinedInAnotherPackage {
	
	public static void main(String[] args) {

		PublicClass pc = new PublicClass();
		// printing the private IV value through getter method
		System.out.println(pc.getName()); 
		//System.out.println(pc.type); not visible in another package
		System.out.println(PublicClass.ID);
		//System.out.println(PublicClass.day); not visible in another package
		
		//Wont work - name is private
		//System.out.println(plant.name);
		
		SomeClass sc = new SomeClass();
		sc.setName("Freddy");
		System.out.println(sc.getName());
		//System.out.println(sc.type); not visible in another package
		System.out.println(SomeClass.ID);
		//System.out.println(SomeClass.day); not visible in another package
		
		
		// leaving private IV everything else is visible
		// to a sub class
		// SomeOtherClass is a subclass of PublicClass in this package
		SomeOtherClass soc = new SomeOtherClass();
		sc.setName("Freddy");
		System.out.println(soc.getName());
		//System.out.println(soc.type); not visible in another package
		System.out.println(SomeOtherClass.ID);
		//System.out.println(SomeOtherClass.day); not visible in another package
	}

}
