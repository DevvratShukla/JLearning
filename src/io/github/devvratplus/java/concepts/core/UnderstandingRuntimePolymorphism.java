package io.github.devvratplus.java.concepts.core;

public class UnderstandingRuntimePolymorphism {
	/*
	 * Runtime polymorphism or Dynamic Method Dispatch is a process in which a
	 * call to an overridden method is resolved at runtime rather than
	 * compile-time.
	 * 
	 * In this process, an overridden method is called through the reference
	 * variable of a superclass. The determination of the method to be called is
	 * based on the object being referred to by the reference variable.
	 */
	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank hdfc = new HDFC();
	}

}

class Bank {
	float rateOfInterest() {
		return 9.5F;
	}
}

class SBI extends Bank {
	float rateOfInterest() {
		return 9.0F;
	}
}

class ICICI extends Bank {

	@Override
	float rateOfInterest() {
		return super.rateOfInterest();
	}

}

class HDFC extends Bank {

	@Override
	float rateOfInterest() {
		return 10.5F;
	}

}