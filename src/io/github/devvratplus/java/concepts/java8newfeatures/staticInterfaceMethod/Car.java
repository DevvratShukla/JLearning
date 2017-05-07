package io.github.devvratplus.java.concepts.java8newfeatures.staticInterfaceMethod;

public class Car {

	public void about(){
		Sedan.about();
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.about();
	}
}

interface Sedan {
	
	static void about(){
		System.out.println("It's a sedan!");
	}
}