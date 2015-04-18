package io.github.devvratplus.java.concepts.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnderstandingSets {

	public static void main(String[] args) {
		/**
		 * Unlike Lists set contain only unique items, 
		 * duplicates are not allowed
		 * 
		 * HashSet doesn't maintain any order
		 */
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Apple");
		hashSet.add("Google");
		hashSet.add("Tesla");
		hashSet.add("Microsoft");

		// adding duplicate items
		hashSet.add("Apple");
		hashSet.add("Google");

		System.out.println(hashSet);

		/**
		 * Linked HashSet remembers the order in which the items were added
		 */
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Google");
		linkedHashSet.add("Tesla");
		linkedHashSet.add("Microsoft");
		linkedHashSet.add("Facebook");
		linkedHashSet.add("Yahoo");

		System.out.println(linkedHashSet);

		/**
		 * TreeSet sorts the items in the natural order
		 */
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Apple");
		treeSet.add("Google");
		treeSet.add("Tesla");
		treeSet.add("Microsoft");
		treeSet.add("Facebook");
		treeSet.add("Yahoo");

		System.out.println(treeSet);

	}

}
