package io.github.devvratplus.java.concepts.java8newfeatures.foreach;

import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LearningforEach {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		// ------- External loops --------
		
		System.out.println("---basic---");
		// basic for loop
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("---advance---");
		// advance for
		for(int i : list){
			System.out.println(i);
		}
		
		// ------- Internal loop--------
		System.out.println("---foreach---");
		// foreach
		list.forEach(i -> System.out.println(i)); //Lamda expression
	}

}
