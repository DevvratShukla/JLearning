package io.github.devvratplus.java.concepts.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparingLinkedListAndArrayList {

	public static void main(String[] args) {
		
		/*
		 * Array list managers array internally
		 * [0][1][2][3][4][5].....[n]
		 * Once the initially created array is full a new
		 * array is created and the contents of the old array
		 * are copied to the new array
		 * 
		 * Linked lists consists of elements where each
		 * element has a reference to the previous and next
		 * element
		 * [0]<->[1]<->[2]<->[3]<->[4]<-...->[n]
		 * 
		 * Use ArrayList when u have to add elements to the end/middle
		 * Use LinkedList when you have to add elements to the start
		 * 
		 */

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		setUpTheList(linkedList);
		setUpTheList(arrayList);
		System.out.println("---Adding to the start of the list---");
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());
		addToStartPerf("ArrayList", arrayList);
		addToStartPerf("LinkedList", linkedList);
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());

		setUpTheList(linkedList);
		setUpTheList(arrayList);
		System.out.println("\n---Adding to the middle of the list---");
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());
		addToMiddlePerf("ArrayList", arrayList);
		addToMiddlePerf("LinkedList", linkedList);
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());
		
		setUpTheList(linkedList);
		setUpTheList(arrayList);
		System.out.println("\n---Adding to the end of the list---");
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());
		addToEndPerf("ArrayList", arrayList);
		addToEndPerf("LinkedList", linkedList);
		System.out.println("Size of arrayList: " + arrayList.size()
				+ " | Size of linkedList: " + linkedList.size());
	}

	private static void setUpTheList(List<Integer> list) {
		list.clear();
		// filling up the lists
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

	}

	private static void addToStartPerf(String type, List<Integer> list) {

		// adding elements at the start of the list
		long start = System.currentTimeMillis();

		for (int i = 1; i < 1E5; i++) {
			list.add(0, i);
		}

		long stop = System.currentTimeMillis();
		System.out.println("Time taken: " + (stop - start) + " ms by " + type);

	}

	private static void addToMiddlePerf(String type, List<Integer> list) {

		// adding elements at the middle of the list
		long start = System.currentTimeMillis();

		for (int i = 1; i < 1E5; i++) {
			list.add((list.size()/2), i);
		}

		long stop = System.currentTimeMillis();
		System.out.println("Time taken: " + (stop - start) + " ms by " + type);

	}

	private static void addToEndPerf(String type, List<Integer> list) {

		// adding elements at the end of the list
		long start = System.currentTimeMillis();

		for (int i = 1; i < 1E5; i++) {
			list.add(list.size(),i);
		}

		long stop = System.currentTimeMillis();
		System.out.println("Time taken: " + (stop - start) + " ms by " + type);

	}

}
