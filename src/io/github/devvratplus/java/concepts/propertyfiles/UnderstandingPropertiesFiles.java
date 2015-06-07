package io.github.devvratplus.java.concepts.propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UnderstandingPropertiesFiles {
	
	final static String EMPLOYEE_PROPERTIES = System.getProperty("user.dir")
			+ "//files//Employee.properties";
	
	public static void main(String[] args) throws IOException {

		/*
		 * .properties is a file extension for files mainly used in Java related
		 * technologies to store the configurable parameters of an application.
		 * They can also be used for storing strings for Internationalization
		 * and localization; these are known as Property Resource Bundles.
		 * 
		 * Properties are configuration values managed as key/value pairs. In
		 * each pair, the key and value are both String values.
		 */

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(EMPLOYEE_PROPERTIES);
		prop.load(fis);

		// printing the value assigned to the keys
		System.out.println("Name > " + prop.getProperty("name"));
		System.out.println("Email > " + prop.getProperty("email"));
		System.out.println("Phone > " + prop.getProperty("phone"));
		System.out.println("Age > " + prop.getProperty("age"));

		System.out.println("Undefined key > " + prop.getProperty("new"));
		// if the property is not available output is null
		// use hash to comment lines in property file

		// overriding and setting values in the properties file
		prop.setProperty("new", "Hello");
		System.out.println("Undefined key set throught setProperty > "
				+ prop.getProperty("new"));

		// verifying whether a key exists or not
		System.out.println("Does key 'name' exists in the property file? > "
				+ prop.containsKey("name"));
		System.out.println("Does key 'city' exists in the property file? > "
				+ prop.containsKey("city"));

		// verifying whether a value exists or not
		System.out
				.println("Does any key has value assigned as 'Tony Stark' in the property file? > "
						+ prop.containsValue("Tony Stark"));
		System.out
				.println("Does any key has value assigned as 'Mumbai' in the property file? > "
						+ prop.containsKey("Mumbai"));

		// Put a property if absent in the prop. file
		prop.putIfAbsent("country", "India");

		// Check whether a property has a value set or not
		// if not then set a default value for it.
		if (prop.containsKey("unset"))
			if (prop.getProperty("unset").equals("")) {
				prop.setProperty("unset", "default");
			}

		// toString returns the key value pairs defined in the properties file
		System.out
				.println("List of key value pairs defined in the properties file >");
		System.out.println(prop.toString());
	}
}
