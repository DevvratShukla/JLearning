package io.github.devvratplus.java.concepts.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UnderstandingIterators {
	
	public static void main(String[] args) {
		
		LinkedList<String> linklist = new LinkedList<String>();
		linklist.add("Hello");
		linklist.add("Hi");
		linklist.add("Bye");
		linklist.add("Chai");
		
		// helps to iterate over elements in a collections
		Iterator<String> it = linklist.iterator();
		String value = null;
		
		// helpful in matching and removing values while
		// iterating
		while(it.hasNext()){
			value = it.next();
			System.out.println(value);
			
			if(value.equals("Chai")){
				it.remove();
			}
		}
		// this cannot be done with foreach
		// it can only be used for printing the
		// elements
		
		it = linklist.iterator();
		System.out.println("\nPrinting value again..");
		// printing the list
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
