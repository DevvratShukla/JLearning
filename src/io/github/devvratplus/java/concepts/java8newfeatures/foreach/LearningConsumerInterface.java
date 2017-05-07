package io.github.devvratplus.java.concepts.java8newfeatures.foreach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class LearningConsumerInterface {

	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,1,2,3,4,5);
		Set<Integer> set = new HashSet<Integer>(list);	
		
		// bacause forEach expects an object that implements the consumer interface
		Consumer<Integer> c = i -> System.out.println(i);
		
		System.out.println("Printing the list > ");
		list.forEach(c);
		
		System.out.println("Printing the set > ");
		set.forEach(c);
		
	}
	
}
