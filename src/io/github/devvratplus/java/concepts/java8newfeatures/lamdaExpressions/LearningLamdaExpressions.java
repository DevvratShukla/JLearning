package io.github.devvratplus.java.concepts.java8newfeatures.lamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LearningLamdaExpressions {

	public static void main(String[] args) {

		A refA;
		B refB;
		C refC;
		D refD;
		
		System.out.println("\nPrinting methodA:");
		refA = () -> System.out.println("Hello");
		refA.methodA();

		System.out.println("\nPrinting methodB:");
		refB =  str -> System.out.println(str);
		refB.methodB("Hello World!");
		
		System.out.println("\nPrinting methodC:");
		refC = (start, end) -> {
			for(int i = start ; i< end ; i++){
				System.out.println(i);
			}
		};
		refC.methodC(1, 9);
		
		System.out.println("\nPrinting methodD:");
		refD = list -> list.forEach( i -> System.out.println(i));
		refD.methodD(Arrays.asList(1,2,3,4,5));

	}

}

// interface with a single method is called functional interface
interface A {
	public void methodA();
}

interface B {
	public void methodB(String str);
}

interface C {
	public void methodC(int start, int end);
}

interface D {
	public void methodD(List<Integer> list);

}