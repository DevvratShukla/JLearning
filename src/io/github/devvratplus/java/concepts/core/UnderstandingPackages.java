package io.github.devvratplus.java.concepts.core;

import io.github.devvratplus.java.concepts.packages.FirstClass;
import io.github.devvratplus.java.concepts.packages.SecondClass;

public class UnderstandingPackages {

	public static void main(String[] args) {

		FirstClass fc1 = new FirstClass();
		SecondClass sc1 = new SecondClass();
		
		/*
		 * These classes are located inside package 
		 * io.github.devvratplus.java.concepts.packages
		 * so we need to import this package to be able
		 * to call these classes
		 * import io.github.devvratplus.java.concepts.packages
		 * 
		 * Ideally packages should be universally unique
		 * so that you can distribute your classs
		 * */
	}

}
