package io.github.devvratplus.java.concepts.core;

public class UnderstandingStrings {
	public static void main(String[] args) {

		String str = "My Name is Slim Shady";

		System.out.println("Length of the string is:" + str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('m')+1);
		System.out.println(str.contains("is"));
		System.out.println(str.indexOf("Slim"));
		
	}
}
