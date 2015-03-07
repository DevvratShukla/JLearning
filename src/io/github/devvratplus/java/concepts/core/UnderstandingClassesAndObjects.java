package io.github.devvratplus.java.concepts.core;

public class UnderstandingClassesAndObjects {

	public static void main(String[] args) {

		//Initializing person1
		Person person1 = new Person();
		person1.name = "James Bond";
		person1.age = 51;

		//Initializing person2
		Person person2 = new Person();
		person2.name = "Jason Bourn";
		person2.age = 45;
		
		System.out.println(person1.name + " " + person1.age + " Says " + person1.sayHello()); 
		//calling method sayHello from person class
		System.out.println(person2.name + " " + person2.age + " Says " + person2.sayHello());

		person1.introduction(); //calling method introduction from person class
		person2.introduction();
	}
}

class Person {

	// Classes may contain instance variables and methods
	// Instance variables start with a lower case
	// methods name start with a lower case

	// Instance variables represents the data/state of an object
	String name;
	int age;

	String sayHello() {
		return "Hello!";
	}

	void introduction() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}