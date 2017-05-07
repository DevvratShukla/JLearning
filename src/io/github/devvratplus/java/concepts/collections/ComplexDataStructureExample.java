package io.github.devvratplus.java.concepts.collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructureExample {

	public static void main(String[] args) {
		String[] vehicles = { "Ambulance", "Helicopter", "Boat" };
		String[][] drivers = { 
				{ "Bob", "mike", "shaun" },
				{ "jason", "tim", "liam" }, 
				{ "jack", "dominiq", "han" } 
				};
		
		Map<String, Set<String>> driverDetails = new HashMap<String, Set<String>>();
		int j = 0;
		for (String vehicle : vehicles) {
			Set<String> driverlist = new LinkedHashSet<String>();
			for (int i = 0; i < drivers[j].length; i++) {
				driverlist.add(drivers[j][i]);
			}
			j++;
			driverDetails.put(vehicle, driverlist);
		}

		// printing the values
		for (String key : driverDetails.keySet()) {
			System.out.print("The values for key " + key + " is >");
			for (String value : driverDetails.get(key)) {
				System.out.print(" " + value + " :");
			}
			System.out.println();
		}

	}
}
