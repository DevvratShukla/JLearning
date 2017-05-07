package io.github.devvratplus.java.concepts.java8newfeatures.defaultInterfaceMethod;

public class OverridingObjectClassMethod implements _A{

	public static void main(String[] args) {
		
	}
	
	// You can override Object class methods in the class
	public boolean equals(Object o){
		return false;
	}
}

interface _A{
	
	/*
	 * This will give error as you cannot override object class methods in Interface
	 * 
	 * default boolean equals(Object o){
		return false;
	}*/
}