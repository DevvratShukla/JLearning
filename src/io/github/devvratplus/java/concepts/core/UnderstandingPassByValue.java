package io.github.devvratplus.java.concepts.core;

public class UnderstandingPassByValue {

	public static void main(String[] args) {

		int value = 9;
		System.out.println("1. value is " + value); // value = 9
		show(value);
		System.out.println("4. value is " + value); // value = 9
		System.out.println();

		A a = new A("apple", 12);
		System.out.println("1. a is " + a); // a is A [ id=12, name=apple]
		show(a);
		System.out.println("6. a is " + a); // a is A [ id=12, name=Anger]
	}

	public static void show(int value) {
		// passing by value, passing a copy of the value here
		
		System.out.println("2. value is " + value); // value = 9
		value = 1;
		System.out.println("3. value is " + value); // value = 1
	}

	public static void show(A a) { 
		// passing by value, passing a copy of the object's address here
		
		System.out.println("2. a is " + a);// a is A [ id=12, name=apple]
		a.setName("Anger");
		System.out.println("3. a is " + a); // a is A [ id=12, name=Anger]
		A b = new A("appricot", 16);
		a = b;
		System.out.println("4. a is " + a); // a is A [ id=16, name=apricot]
		a.setName("Angel");
		System.out.println("5. a is " + a); // a is A [ id=16, name=Angel]
	}
}

class A {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	A(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
}