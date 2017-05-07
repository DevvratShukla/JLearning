package io.github.devvratplus.java.concepts.core;

public class UnderstandingCreatingObjectsViaClassForName {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		Object o = Class.forName(
				"io.github.devvratplus.java.concepts.core.SomeClass").newInstance();
		System.out.println(o);

		SomeClass sc = (SomeClass)o;
		System.out.println(sc);
	}

}

class SomeClass {
	private String name;

	public SomeClass() {
		name = "SomeClass";
	}

	public String toString() {
		return name;
	}
}