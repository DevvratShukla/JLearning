package io.github.devvratplus.java.concepts.collections;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

	// before java 5 the way ArrayList was created
		
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		// when generics were introduced
		// Parameterized class concept
		//Generic class is a class that can work with other objects
		// you can specify what type of objects its can work with
		// when u instantiate the class
		
	// after java 5 way of creating an ArrayList
		
		ArrayList<String> arrayListOfString = new ArrayList<String>();
		arrayListOfString.add("Cat");
		arrayListOfString.add("Dog");
		arrayListOfString.add("Elephant");
		
		//printing values from list
		System.out.println(arrayListOfString);
		
		String lv1 = (String) list.get(1);
		// since we did not specify which type of list it is
		// we need to downcast it to Strings as get returns string
		// this was the old way of creating ArrayList
		
		String lsv1 = arrayListOfString.get(1);
		
		System.out.println(lv1);
		System.out.println(lsv1);
		
		// Printing from the list
		System.out.println("Iteration #1 >");
		
		for(int i = 0;i<arrayListOfString.size();i++){
			System.out.println(arrayListOfString.get(i));
		}
		
		
	// Java 7 style of creating arrayList
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Animal("Cat"));
		animalList.add(new Animal("Dog"));
		animalList.add(new Animal("Elephant"));
		animalList.add(new Animal("Lion"));
		
		// Printing the Animal list
		System.out.println("Itegration #2 >");
		
		for(Animal animal: animalList){
			System.out.println(animal);
		}
		
		
		//Removing Items from the list//
		//removing items from the end is quick
		animalList.remove(animalList.size() -1);
		
		//removing items from the start is slow
		animalList.remove(0);
		
		//Calling via the List interface...
		
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(1);
		
	}

}

class Animal{
	
	private String name;
	
	Animal(String name){
		this.name=name;
	}
	
	public String toString(){
		return name;
		
	}
}
