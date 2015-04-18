package io.github.devvratplus.java.concepts.collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UsingCustomObjectsInSetsAndAsKeysInMaps {
	
	public static void main(String[] args){
		
		//Creating a map and adding Person1 objects as keys
		Map<Person1, Integer> hashMap1 = new LinkedHashMap<Person1, Integer>();
		hashMap1.put(new Person1(1, "bonobo"), 1);
		hashMap1.put(new Person1(2, "diplo"), 2);
		hashMap1.put(new Person1(3, "skrillex"), 3);
		hashMap1.put(new Person1(2, "diplo"), 4); // duplicate key
		hashMap1.put(new Person1(4, "deadmou5"), 3);
		
		//Printing the map
		System.out.println("Here are the details from the hashMap1 >");
		for(Person1 person: hashMap1.keySet()){
			System.out.println(person); // this prints even the objects having same data
		}
		
		//Creating a set and adding Person1 objects to it
		Set<Person1> hashSet1 = new LinkedHashSet<Person1>();
		hashSet1.add(new Person1(1, "bonobo"));
		hashSet1.add(new Person1(2, "diplo"));
		hashSet1.add(new Person1(3, "skrillex"));
		hashSet1.add(new Person1(2, "diplo")); // duplicate item
		hashSet1.add(new Person1(4, "deadmou5"));
		
		//Printing the set
		System.out.println("\nHere are the details from the hashSet1 > ");
		System.out.println(hashSet1); // this prints even the objects having same data
		
		//Creating a map and adding Person2 objects as keys
		Map<Person2, Integer> hashMap2 = new LinkedHashMap<Person2, Integer>();
		hashMap2.put(new Person2(1, "bonobo"), 1);
		hashMap2.put(new Person2(2, "diplo"), 2);
		hashMap2.put(new Person2(3, "skrillex"), 3);
		hashMap2.put(new Person2(2, "diplo"), 4); // duplicate key
		hashMap2.put(new Person2(4, "deadmou5"), 3);
		
		//Printing the map
		System.out.println("\nHere are the details from the hashMap2 >");
		for(Person2 person: hashMap2.keySet()){
			System.out.println(person); // this doesn't print the objects having same data
		}
		
		//Creating a set and adding Person2 objects to it
		Set<Person2> hashSet2 = new LinkedHashSet<Person2>();
		hashSet2.add(new Person2(1, "bonobo"));
		hashSet2.add(new Person2(2, "diplo"));
		hashSet2.add(new Person2(3, "skrillex"));
		hashSet2.add(new Person2(2, "diplo")); // duplicate item
		hashSet2.add(new Person2(4, "deadmou5"));
		
		//Printing the set
		System.out.println("\nHere are the details from the hashSet2 > ");
		System.out.println(hashSet2); // this doesn't print the objects having same data
	}

}

// hashCode() and equals() are not overridden in this class
class Person1{
	
	private int ID;
	private String name;
	
	Person1(int ID, String name){
		this.ID = ID;
		this.name = name;
		
	}
	
	public int getID(){
		return this.ID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return "{" + ID + ":" + name + "}";
	}
}

// hashCode() and equals() are overridden in this class
class Person2{
	
	private int ID;
	private String name;
	
	Person2(int ID, String name){
		this.ID = ID;
		this.name = name;
		
	}
	
	public int getID(){
		return this.ID;
	}
	
	public String getName(){
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String toString(){
		return "{" + ID + ":" + name + "}";
	}
}