package io.github.devvratplus.java.concepts.collections;

import java.util.HashMap;
import java.util.Map;

public class UnderstandingHashMaps {

	public static void main(String[] args) {
		
		/*
		 * hashmaps does not maintain order
		 * Maps cannot contain duplicate keys
		 */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//adding values to hashmap
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(5, "Five");
		hmap.put(8, "Eight");
		hmap.put(4, "Four");
		hmap.put(10, "One");
		hmap.put(10, "Ten"); // this overrides the previous value
		
		System.out.println(hmap.get(1)); // returns One
		System.out.println(hmap.get(10)); // returns ten
		System.out.println(hmap.get(11)); //returns null
		
		//Printing the hashmap
		System.out.println("\n---Printing the hashmap---");
		for(Map.Entry<Integer, String> entry : hmap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
