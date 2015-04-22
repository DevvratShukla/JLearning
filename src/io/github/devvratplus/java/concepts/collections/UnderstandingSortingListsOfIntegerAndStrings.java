package io.github.devvratplus.java.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnderstandingSortingListsOfIntegerAndStrings {
	
	public static void main(String[] args){
		
		//*****Sorting List of Strings*****
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Mer"); 
		listOfStrings.add("Venu");
		listOfStrings.add("Earth");
		listOfStrings.add("Mars");
		listOfStrings.add("Jupiter");
		listOfStrings.add("Saturn");
		listOfStrings.add("Neptuney");
		listOfStrings.add("Plutonics");
		
		System.out.println("List before sort > \n" + listOfStrings);
		Collections.sort(listOfStrings);
		System.out.println("\nList after sort > \n" + listOfStrings);
		
		//Sorting based on the logic defined in the StringLenghComparator
		Collections.sort(listOfStrings, new StringLengthComparator());
		System.out.println("\nList after sort based on StringLenghComparator > \n");
		for(String item : listOfStrings){
			System.out.println(item);
		}
		

		//Sorting based on the logic defined in the AlphabeticalComparator
		Collections.sort(listOfStrings, new AlphabeticalComparator());
		System.out.println("\nList after sort based on AlphabeticalComparator > \n");
		for(String item : listOfStrings){
			System.out.println(item);
		}
		
		//Sorting based on the logic defined in the ReverseAlphabeticalComparator
		Collections.sort(listOfStrings, new ReverseAlphabeticalComparator());
		System.out.println("\nList after sort based on ReverseAlphabeticalComparator > \n");
		for(String item : listOfStrings){
			System.out.println(item);
		}
		
		//*****Sorting List of Integers*****
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(34);
		listOfInteger.add(5);
		listOfInteger.add(99);
		listOfInteger.add(3);
		listOfInteger.add(56);
		listOfInteger.add(78);
		listOfInteger.add(1);
		
		System.out.println("\nList before sort > \n" + listOfInteger);
		Collections.sort(listOfInteger);
		System.out.println("\nList after sort > \n" + listOfInteger);
		
		//Sorting numbers in descending order
		Collections.sort(listOfInteger, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		System.out.println("\nList after descending sort > \n" + listOfInteger);
		
	}

}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2){
			return 1;
		} else if (len1 < len2){
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		if(o1.charAt(0) > o2.charAt(0)){
			return 1;
		} else if (o1.charAt(0) < o2.charAt(0)){
			return -1;
		}
		return 0;
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}