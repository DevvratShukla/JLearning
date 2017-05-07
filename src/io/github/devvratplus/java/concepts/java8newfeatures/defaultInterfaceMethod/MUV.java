package io.github.devvratplus.java.concepts.java8newfeatures.defaultInterfaceMethod;

public class MUV implements Hachback, SUV {

	/*
	 * In this example one class implements two interface having same method
	 * definition and implementation.
	 */
	@Override
	public void checkDifferentailLocking() {
		SUV.super.checkDifferentailLocking();
	}

	@Override
	public void enabletractionControll() {
		System.out.println("Traction controll enabled.");
	}

	@Override
	public void getHoursePower() {
		SUV.super.getHoursePower();
	}

	public static void main(String[] args) {
		MUV car1 = new MUV();
		car1.checkDifferentailLocking();
		car1.checkABS();
		car1.checkGroundClearance();
		car1.getHoursePower();
	}
}

interface SUV {

	default public void checkDifferentailLocking() {
		System.out.println("Differentail locking working fine.");
	}

	default public void checkGroundClearance() {
		System.out.println("Ground clearance is as per SUV standards.");
	}

	public void enabletractionControll();

	default public void getHoursePower() {
		System.out.println("150 PSI");
	}

}

interface Hachback {

	default public void checkDifferentailLocking() {
		System.out.println("Differential locking unavailable!");
	}

	default public void checkABS() {
		System.out.println("ABS working fine.");
	}

	public void enabletractionControll();

	public void getHoursePower();
}
