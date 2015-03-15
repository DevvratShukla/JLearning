package io.github.devvratplus.java.concepts.core;

import java.util.Scanner;

public class UnderstandingSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the command(start/stop/restart/deploy): ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started..");
			break;
		case "stop":
			System.out.println("Machine stopped..");
			break;
		case "restart":
			System.out.println("Machine restarted..");
			break;
		case "deploy":
			System.out.println("Machine deployed..");
			break;
		default:
			System.out.println("Please enter a valid input");
		}
	}
}
