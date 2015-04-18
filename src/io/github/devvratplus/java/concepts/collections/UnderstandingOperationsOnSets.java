package io.github.devvratplus.java.concepts.collections;

import java.awt.color.CMMException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingOperationsOnSets {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();

		Set<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Apple");
		hashSet1.add("Google");
		hashSet1.add("Tesla");
		hashSet1.add("Microsoft");
		
		Set<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Apple");
		hashSet2.add("ThoughtWorks");
		hashSet2.add("Google");

		// *******Operations on set********

		// Iteration on set - using for-each

		System.out.println("\nPrinting each element using for-each from hashSet1");
		for (String element : hashSet1) {
			System.out.println(element);
		}
		
		// Iterations on set - using iterators()
		Iterator<String> itr = hashSet2.iterator();
		System.out.println("\nPrinting each element using iterators() from hashSet2");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		// Does this hashSet contain a given element?
		System.out.println("\nDoes hashSet1 contain Apple? - "
				+ hashSet1.contains("Apple"));
		
		// Is the set empty?
		System.out.println("\nIs the hashSet empty? - " + hashSet.isEmpty());

		// What's the size of the set?
		System.out.println("\nWhats the size of hashSet1? - " + hashSet1.size());
		
		//Taking intersection of two sets
		Set<String> intersetionSet = new HashSet<String>(hashSet1);// passing hashSet1 
		intersetionSet.retainAll(hashSet2);
		
		System.out.println("\nintersetionSet of hashSet1 and hashSet2 is > " + intersetionSet);
		
		//Taking complement of two sets
		Set<String> complementSet = new HashSet<String>(hashSet1);// passing hashSet2
		complementSet.removeAll(hashSet2); // removes the common elements between hashSet1 and hashSet2
		
		System.out.println("\ncomplementSet of hashSet1 and hashSet2 > " + complementSet);

		
	}
}
