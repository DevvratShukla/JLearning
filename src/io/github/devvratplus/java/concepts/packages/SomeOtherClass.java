package io.github.devvratplus.java.concepts.packages;

import io.github.devvratplus.java.concepts.accessmodifiers.PublicClass;

public class SomeOtherClass extends PublicClass{

	SomeOtherClass() {
		System.out.println();
		System.out.println("Inside SomeOtherClass constructor >");
		System.out.println("------");
		System.out.println(this.type);
		System.out.println(this.ID);
		System.out.println(this.getName());
		//System.out.println(this.day);wont work as day is a default modifier 
		System.out.println("------");
	}

}
