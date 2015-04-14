package io.github.devvratplus.java.concepts.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UnderstandingVariousMaps {

	public static void main(String[] args) {
		/* 
		 * HashMap does not maintains the order in which the key-value 
		 * pair is added to it
		*/
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		/*
		 * LinkedHashMap maintains the order in which the key-value 
		 * pair is added to it
		 */
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		/*
		 * TreeMaps sorts the key-values pairs in natural order based
		 * on the key
		 */
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//Adding key-value pairs to the maps and printing them
		System.out.println("Printing hashMap >");
		testMap(hashMap);
		System.out.println("\nPrinting linkedHashMap");
		testMap(linkedHashMap);
		System.out.println("\nPrinting treeMap");
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map){
		
		map.put(9, "Nine");
		map.put(0, "Zero");
		map.put(5, "Five");
		map.put(4, "Four");
		map.put(8, "Eight");
		map.put(32, "ThirtyTwo");
		map.put(6, "six");
		map.put(11, "Eleven");
		
		printMap(map);
	}
	
	public static void printMap(Map<Integer, String> map){
		for(Integer key : map.keySet()){
			System.out.println(key + ":" + map.get(key));
		}
	}
}
