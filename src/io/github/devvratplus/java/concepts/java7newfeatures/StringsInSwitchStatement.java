package io.github.devvratplus.java.concepts.java7newfeatures;

public class StringsInSwitchStatement {

	public static void main(String[] args) {

		for (CalendarMonths month : CalendarMonths.values()) {
			System.out.println(month.name() + " : "
					+ noOfDaysInTheMonth(month.name(), 2012));
		}

	}

	/**
	 * This method uses the strings in switch statement 
	 * feature introduced in Java 7
	 * <br>Note: Strings used in case statement are 
	 * case sensitive
	 * @param month
	 * @param year
	 * @return int
	 */
	private static int noOfDaysInTheMonth(String month, int year) {
		switch (month) {
		case "JANUARY":
		case "MARCH":
		case "MAY":
		case "JULY":
		case "AUGUST":
		case "OCTOBER":
		case "DECEMBER":
			return 31;

		case "APRIL":
		case "JUNE":
		case "SEPTEMBER":
		case "NOVEMBER":
			return 30;

		case "FEBRUARY":
			if ((year % 4) == 0)
				return 29;
			else
				return 28;

		default:
			return 0;
		}
	}
}

enum CalendarMonths {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVERMBER, DECEMBER
}