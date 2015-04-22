package io.github.devvratplus.java.concepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnderstandingSortingListsOfArbitraryObjects {

	public static void main(String[] args) {

		List<Cat> catsList = new ArrayList<Cat>();
		catsList.add(new Cat(6, "Molly"));
		catsList.add(new Cat(2, "Lucy"));
		catsList.add(new Cat(9, "Zikpah"));
		catsList.add(new Cat(7, "Roman"));
		catsList.add(new Cat(12, "Sandra"));

		System.out.println(catsList);
		Collections.sort(catsList, new Comparator<Cat>() {

			@Override
			public int compare(Cat c1, Cat c2) {
				if (c1.getYearsOld() > c2.getYearsOld()) {
					return 1;
				} else if (c1.getYearsOld() < c2.getYearsOld()) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(catsList);

	}
}

class Cat {
	private int yearsOld;
	private String petName;

	public Cat(int yearsOld, String petName) {
		this.yearsOld = yearsOld;
		this.petName = petName;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String toString() {
		return yearsOld + " : " + petName;

	}
}