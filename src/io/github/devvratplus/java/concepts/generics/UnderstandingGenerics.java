package io.github.devvratplus.java.concepts.generics;

import java.util.ArrayList;

public class UnderstandingGenerics {

		public static void main(String[] args) {

			// before java 5
			//way ArrayList was created
			
			ArrayList list = new ArrayList();
			list.add("Apple");
			list.add("Banana");
			list.add("Grapes");
			
			// when generics were introduced
			// Parameterized class concept
			//Generic class is a class that can work with other objects
			// you can specify what type of objects its can work with
			// when u instantiate the class
			
			ArrayList<String> arrayListOfString = new ArrayList<String>();
			arrayListOfString.add("Cat");
			arrayListOfString.add("Dog");
			arrayListOfString.add("Elephant");
			
			//printing values from list
			
			String lv1 = (String) list.get(1);
			// since we did not specify which type of list it is
			// we need to downcast it to Strings as get returns string
			// this was the old way of creating ArrayList
			
			String lsv1 = arrayListOfString.get(1);
			
			System.out.println(lv1);
			System.out.println(lsv1);
			
			// Java 7 style of creating arrayList
			ArrayList<Animal> ala = new ArrayList<>();
		}

	}

	class Animal{
		
	}
