package io.github.devvratplus.java.concepts.collections;

import java.util.LinkedList;

public class UnderstandingLinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> carList = new LinkedList<String>();
		LinkedList<String> phoneList = new LinkedList<String>();
		
		//Adding elements to the carlist
		carList.add("Honda");
		carList.add("Suzuki");
		carList.add("Ford");
		carList.add("Volkswagen");
		carList.add(1, "Hummer");
		
		//Adding elements to the phoenList
		phoneList.add("iphone");
		phoneList.add("Sony Experia");
		phoneList.add("Samsung Note");
		phoneList.add("OnePlus One");
		phoneList.add("iphone");
		
		// printing elements from the carlist
		printcarList(carList);

		//printing elements from the phoneList
		printphoneList(phoneList);
		
		//Removing from the carList
		carList.remove(0);
		
		//Removing from the phoneList
		phoneList.removeFirstOccurrence("iphone");
		
		printcarList(carList);
		printphoneList(phoneList);
	}
	
	private static void printcarList(LinkedList<String> carList) {
		System.out.println("\nPrinting from car list >");
		for (int i = 0; i < carList.size(); i++) {
			System.out.println(carList.get(i));
		}

	}

	private static void printphoneList(LinkedList<String> phoneList){
		System.out.println("\nPrinting from phone list >");
		for(String phone: phoneList){
			System.out.println(phone);
		}
	}
}
