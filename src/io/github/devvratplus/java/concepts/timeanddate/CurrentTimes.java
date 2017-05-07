package io.github.devvratplus.java.concepts.timeanddate;

import java.util.Calendar;

public class CurrentTimes {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//
		System.out.println("Current Year is : " + now.get(Calendar.YEAR));
		// month start from 0 to 11
		System.out.println("Current Month is : " + (now.get(Calendar.MONTH) + 1));
		System.out.println("Current Date is : " + now.get(Calendar.DATE));
		
	}
}
