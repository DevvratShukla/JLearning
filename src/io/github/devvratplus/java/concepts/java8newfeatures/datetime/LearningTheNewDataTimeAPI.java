package io.github.devvratplus.java.concepts.java8newfeatures.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LearningTheNewDataTimeAPI {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Date > " + today);
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd MMM uuuu");
		
		System.out.println("Formatted Date > " + today.format(dtf).toString());
		System.out.println("Today's date > " + today.getDayOfMonth());
		System.out.println("Month > " + today.getMonth().toString());
		System.out.println("Year > " + today.getYear());
		
		LocalTime localtime = LocalTime.now();
		LocalTime london = LocalTime.now(ZoneId.of("UTC+00:00"));
		
		System.out.println("Time is now >" + localtime);
		System.out.print("Time in london is > " + london);
	}
}
