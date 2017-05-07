package io.github.devvratplus.java.concepts.java8newfeatures.defaultInterfaceMethod;

public class SplitAC extends WindowAC implements AirConditioner {

	/*
	 * Here class and Interface have the same method implemented.
	 */
	public static void main(String[] args) {
		SplitAC ac1 = new SplitAC();
		ac1.start(); // This will be called from the class, class method have
						// higher priority
		ac1.stop();
	}
}

abstract class WindowAC {

	public void start() {
		System.out.println("AC started..");
	}
}

interface AirConditioner {
	default public void start() {
		System.out.println("AirConditioner started..");
	}

	default public void stop() {
		System.out.println("AirConditioner Stopped..");
	}

}